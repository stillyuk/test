package news;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.List;

public class News2Htm {
	public static void generate(List<News> news) {
		for (int i = 0; i < news.size(); i++) {
			String dir = new SimpleDateFormat("yyyy-MM-dd").format(news.get(i)
					.getNewsDate());
			String urlPath = "http://localhost:8080/z/news/show?id="
					+ news.get(i).getId() + "&dir=" + dir;
			URL url;
			try {
				url = new URL(urlPath);
				URLConnection connection = url.openConnection();
				connection.connect();
				HttpURLConnection httpURLConnection = (HttpURLConnection) connection;
				int httpResult = httpURLConnection.getResponseCode();
				if (httpResult != HttpURLConnection.HTTP_OK) {
					System.out.println("连接失败");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
