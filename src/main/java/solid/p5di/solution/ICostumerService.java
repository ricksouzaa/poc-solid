package solid.p5di.solution;

import org.apache.commons.mail.EmailException;

import java.sql.SQLException;

public interface ICostumerService {
  String addCostumer(Costumer costumer) throws SQLException, EmailException;
}
