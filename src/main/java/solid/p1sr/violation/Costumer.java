package solid.p1sr.violation;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import static org.apache.commons.lang3.StringUtils.isBlank;

@Getter
@Setter
public class Costumer {

  private Long id;
  private String name;
  private String email;
  private String phoneNumber;
  private LocalDate birthday;
  private String registration;

  public String addCostumer(Costumer costumer) throws SQLException, EmailException {
    if (isBlank(costumer.getRegistration()) || costumer.getRegistration().length() != 11) {
      throw new IllegalArgumentException("Invalid registration");
    }
    if (isBlank(costumer.getName())) {
      throw new IllegalArgumentException("Invalid name");
    }
    if (isBlank(costumer.getEmail()) || !costumer.getEmail().contains("@")) {
      throw new IllegalArgumentException("Invalid email");
    }

    try (
      Connection conn = DriverManager.getConnection("url");
      PreparedStatement ps = conn.prepareStatement("INSERT INTO costumer VALUES(?,?,?,?,?)");
    ) {
      ps.setString(1, costumer.getName());
      ps.setString(2, costumer.getEmail());
      ps.setString(3, costumer.getPhoneNumber());
      ps.setDate(4, Date.valueOf(costumer.getBirthday()));
      ps.setString(5, costumer.getRegistration());

      ps.executeUpdate();
    }

    Email email = new SimpleEmail();
    email.setHostName("smtp.googlemail.com");
    email.setSmtpPort(465);
    email.setAuthenticator(new DefaultAuthenticator("username", "password"));
    email.setFrom("user@gmail.com");
    email.setSubject("TestMail");
    email.setMsg("This is a test mail ... :-)");
    email.addTo(costumer.getEmail());

    email.send();

    return "Sucessfully";
  }
}
