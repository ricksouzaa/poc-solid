package solid.p5di.solution;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailService implements EmailSender {
  @Override
  public void send(String to, String subject, String message) throws EmailException {
    Email email = new SimpleEmail();

    email.setHostName("smtp.googlemail.com");
    email.setSmtpPort(465);
    email.setAuthenticator(new DefaultAuthenticator("username", "password"));
    email.setFrom("user@gmail.com");
    email.addTo(to);
    email.setSubject(subject);
    email.setMsg(message);

    email.send();
  }
}
