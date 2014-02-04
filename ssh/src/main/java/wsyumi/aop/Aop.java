package  wsyumi.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import wsyumi.utils.MailMessageUtil;


public class Aop {

	@Autowired
	private JavaMailSender javaMailSender;

	Logger logger = LogManager.getLogger();


	public void pointcut() {}


	public void testing() {
		logger.info("testing...");
	}


	public void sendMail(Exception ex) {
		SimpleMailMessage message = MailMessageUtil.getSimpleMailMessage("x31001333@163.com",
				"191295604@qq.com");
		message.setSubject("我的异常");
		message.setText("thinking...");
		javaMailSender.send(message);
	}
}
