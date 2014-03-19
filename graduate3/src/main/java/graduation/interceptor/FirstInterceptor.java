package graduation.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class FirstInterceptor extends HandlerInterceptorAdapter {
	protected Log logger = LogFactory.getLog(FirstInterceptor.class);

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		return true;
	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		HttpSession session = request.getSession();
		if (modelAndView.getModelMap().get("username") != null) {
			session.setAttribute("username", modelAndView.getModelMap().get("username"));
		}
		String servletPath = request.getServletPath();
		if ((servletPath.equals("/user/home") || servletPath.equals("/group/add"))
				&& session.getAttribute("username") == null) {
			modelAndView.setViewName("redirect:/user/login");;
		}
	}
}
