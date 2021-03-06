package graduation.webspring;

import graduation.core.FileUtil;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jiangyukun
 * @since 2014-03-14 18:25
 */
@Controller
@RequestMapping("/file")
@SessionAttributes("username")
public class FileController {
	protected Log logger = LogFactory.getLog(getClass());

	@RequestMapping("/upload")
	public ModelAndView upload() {
		return new ModelAndView("/file/upload");
	}

	@RequestMapping("/doUpload")
	public ModelAndView doUpload(@ModelAttribute("username") String username, MultipartFile file) {
		try {
			String DIR = FileUtil.FILE_DOWNLOAD_PATH + File.separatorChar + username;
			File path = new File(DIR);
			if (!path.exists()) {
				path.mkdir();
			}
			file.transferTo(new File(DIR + File.separatorChar + file.getOriginalFilename()));
		} catch (Exception e) {
		}
		return new ModelAndView("/file/uploadResult");
	}

	@RequestMapping("/download")
	public ResponseEntity<byte[]> download(String fileName) throws Exception {
		if (fileName == null)
			return null;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		headers.setContentDispositionFormData("attachment", fileName);
		String filePath = FileUtil.FILE_DOWNLOAD_PATH + File.separatorChar + fileName;
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(new File(filePath)), headers, HttpStatus.CREATED);
	}

	@RequestMapping("/showAllFiles")
	public ModelAndView showAllFiles(@ModelAttribute("username") String username) {
		File file = new File(FileUtil.FILE_DOWNLOAD_PATH + File.separatorChar + username);
		return new ModelAndView("/file/showAllFiles", "allFiles", file.exists() ? file.listFiles() : null);
	}
}
