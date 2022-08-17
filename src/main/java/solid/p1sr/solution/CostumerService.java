package solid.p1sr.solution;

import org.apache.commons.mail.EmailException;

import java.sql.SQLException;

public class CostumerService {

  public String addCostumer(Costumer costumer) throws SQLException, EmailException {
    if (costumer.isInvalid()) {
      return "Invalid";
    }

    CostumerRepository repository = new CostumerRepository();

    repository.add(costumer);

    EmailService emailService = new EmailService();

    emailService.send(costumer.getEmail().getAddress(), "Subject", "Costumer added successfully");

    return "Sucessfully";
  }
}
