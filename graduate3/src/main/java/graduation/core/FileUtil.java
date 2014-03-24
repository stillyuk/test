package graduation.core;

import java.io.File;

public class FileUtil {
	public static String FILE_UPLOAD_PATH = "D:" + File.separatorChar + "My Project File Dir";
	public static String FILE_DOWNLOAD_PATH = "D:" + File.separatorChar + "My Project File Dir";
	public static String FILE_USER_HOME = "D:" + File.separatorChar + "My Project File Dir";
	
	public static boolean mkUserDir(String username) {
		File dir = new File(FILE_USER_HOME + File.separatorChar + username);
		if (dir.exists()) {
			return false;
		}
		dir.mkdir();
		return true;
	}
}
