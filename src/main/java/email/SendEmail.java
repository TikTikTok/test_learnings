package email;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmail {

    public static void main(String[] args) throws MessagingException {

        String to = "chandan.singh.in@outlook.com";
        String from = "chandan.singh.in@outlook.com";

        String host = "localhost";

        Properties properties = System.getProperties();

        properties.setProperty("mail.smtp.host",host);


        Session session = Session.getDefaultInstance(properties);

        MimeMessage mimeMessage = new MimeMessage(session);

        mimeMessage.setFrom(new InternetAddress(from));

        mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

        mimeMessage.setSubject(" Test Mail ");

        mimeMessage.setText(" Set Text ");

        Transport.send(mimeMessage);

        System.out.println(" Mail sent successfully ");

    }
}
