
package Utilities;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class VerificationCodeUtility {

    public static String generateVerificationCode() {
        return String.valueOf((int) (Math.random() * 10000)); 
    }

    public static void sendVerificationCode(String toEmail, String verificationCode) {
        final String fromEmail = "aemtracorps2024@gmail.com";
        final String password = "aemtracorpsoop2024";

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // Use appropriate SMTP server
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("Verification Code");
            message.setText("Your verification code is: " + verificationCode);

            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
