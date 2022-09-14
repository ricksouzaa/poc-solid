package solid.p5di.solution;

import org.apache.commons.mail.EmailException;

import java.sql.SQLException;

public class CostumerService implements ICostumerService {

  private final Repository<Costumer> repository;
  private final EmailSender emailSender;

  public CostumerService(Repository<Costumer> repository, EmailSender emailSender) {
    this.repository = repository;
    this.emailSender = emailSender;
  }

  @Override
  public String addCostumer(Costumer costumer) throws SQLException, EmailException {
    if (costumer.isInvalid()) {
      return "Invalid";
    }

    repository.add(costumer);

    emailSender.send(costumer.getEmail().getAddress(), "Subject", "Costumer added successfully");

    return "Sucessfully";
  }
}
