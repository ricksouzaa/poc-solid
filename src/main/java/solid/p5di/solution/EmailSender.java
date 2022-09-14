package solid.p5di.solution;

import org.apache.commons.mail.EmailException;

public interface EmailSender {
  void send(String to, String subject, String message) throws EmailException;
}
