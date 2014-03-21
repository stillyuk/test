package graduation.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author jiangyukun
 * @since 2014-03-21 10:48
 */
public class RedirectFilter implements Filter {
	Log logger = LogFactory.getLog(RedirectFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		String mobile = httpRequest.getParameter("m");
		String clientRecogition = httpRequest.getHeader("user-agent");
		RequestDispatcher dispatcher = null;
		if ((mobile != null && mobile.equals("m")) || clientRecogition.matches(".+Mobile.+")) {
			dispatcher = request.getRequestDispatcher(httpRequest.getServletPath() + ".mobile");
		} else {
			dispatcher = request.getRequestDispatcher(httpRequest.getServletPath() + ".do");
		}
		dispatcher.forward(httpRequest, httpResponse);
	}

	@Override
	public void destroy() {
	}
}
