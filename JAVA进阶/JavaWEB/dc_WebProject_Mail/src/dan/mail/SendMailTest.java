package dan.mail;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class SendMailTest {

	public static void main(String[] args) throws AddressException, MessagingException {
		
		MailUtils.sendMail("mingmaf@isoftstone.com", "测试邮件","这是一封测试邮件");
		
		
	}
	
}
