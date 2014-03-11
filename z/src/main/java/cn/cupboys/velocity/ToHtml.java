package cn.cupboys.velocity;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

@SuppressWarnings("serial")
public class ToHtml extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext sc = getServletContext();
		String file_name = request.getParameter("fileName");
		String url = "/" + file_name + ".jsp";
		Calendar cal = Calendar.getInstance();
		String name = file_name + ".htm";
		RequestDispatcher rd = sc.getRequestDispatcher(url);
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		final PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
		HttpServletResponse rep = new HttpServletResponseWrapper(response) {
			public PrintWriter getWriter() {
				return pw;
			}
		};
		rd.include(request, rep);
		pw.flush();
		String s = sc.getRealPath("/") + cal.get(Calendar.YEAR)
				+ String.format("%02d", cal.get(Calendar.MONTH) + 1)
				+ String.format("%02d", cal.get(Calendar.DATE));
		File dir = new File(s);
		String htmlPath = null;
		if (name.equalsIgnoreCase("index.htm")) {
			htmlPath = sc.getRealPath("/") + "index.htm";
		} else  {
			htmlPath = s + File.separatorChar + Math.round(Math.random() * 100000) + ".htm";
		}
		System.out.println(htmlPath);
		if (!dir.exists()) {
			dir.mkdir();
		}
		FileOutputStream fos = new FileOutputStream(htmlPath);
		os.writeTo(fos);
		fos.close();
		PrintWriter out = response.getWriter();
		out.print("ok");
	}
}
