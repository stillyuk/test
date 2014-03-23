package graduation.core;

import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 * @author jiangyukun
 * @since 2014-03-22
 */
public class JavaMailUtil {
	private static Log logger = LogFactory.getLog(JavaMailUtil.class);

	private static JavaMailSender sender; 

	public JavaMailSender getSender() {
		return sender;
	}

	public static void setSender(JavaMailSender sender) {
		JavaMailUtil.sender = sender;
	}

	public static boolean send(String senderTo) {
		MimeMessage mailMessage = sender.createMimeMessage();
		try {
			MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage, true, "utf-8");
			messageHelper.setTo(senderTo);
			messageHelper.setFrom("x31001333@163.com");
			messageHelper.setSubject("邮箱验证");
			messageHelper.setText("<html><head></head><body><h1>hello!!chao.wang</h1></body></html>");
			sender.send(mailMessage);
			logger.warn("邮件发送成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}
