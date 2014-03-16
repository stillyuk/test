package graduation.webspring;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jiangyukun
 * @since 2014-03-14 18:25
 */
@Controller
@RequestMapping("/file")
public class FileController {
	protected Log logger = LogFactory.getLog(getClass());

	@RequestMapping("/upload")
	public ModelAndView upload(MultipartFile file) {
		try {
			String DIR = "D:" + File.separatorChar + "SPRING";
			File path = new File(DIR);
			if (!path.exists()) {
				path.mkdir();
			}
			file.transferTo(new File(DIR + File.separatorChar
					+ file.getOriginalFilename()));
		} catch (Exception e) {
		}
		return null;
	}

	@RequestMapping("/download")
	public ResponseEntity<byte[]> download() throws Exception {
		if (logger.isInfoEnabled()) {
			logger.info("download");
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		headers.setContentDispositionFormData("attachment", "jQuery.pptx");
		return new ResponseEntity<byte[]>(
				FileUtils.readFileToByteArray(new File("D:/SPRING/jQuery.pptx")),
				headers, HttpStatus.CREATED);
	}
}
