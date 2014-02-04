package  wsyumi.utils;

import org.springframework.mail.SimpleMailMessage;

public class MailMessageUtil {
	public static SimpleMailMessage getSimpleMailMessage(String from, String to) {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom(from);
		simpleMailMessage.setTo(to);
		return simpleMailMessage;
	}
}
