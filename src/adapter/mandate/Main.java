package adapter.mandate;

import javax.mail.Address;
import javax.mail.Folder;
import javax.mail.MessagingException;
import javax.mail.Store;
import javax.mail.URLName;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Main {
	public static void main(String[] args) throws MessagingException {
		CustomMessage cm = new CustomMessage();
		
		System.out.println(cm.getCustomSubject());
		System.out.println(cm.getCustomContent());
		
	}
}
