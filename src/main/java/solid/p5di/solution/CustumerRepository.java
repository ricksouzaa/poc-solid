package solid.p5di.solution;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustumerRepository implements Repository<Costumer> {
  @Override
  public void add(Costumer costumer) throws SQLException {
    try (
      Connection conn = DriverManager.getConnection("url");
      PreparedStatement ps = conn.prepareStatement("INSERT INTO costumer VALUES(?,?,?,?,?)");
    ) {
      ps.setString(1, costumer.getName());
      ps.setString(2, costumer.getEmail().getAddress());
      ps.setString(3, costumer.getPhone().getNumber());
      ps.setDate(4, Date.valueOf(costumer.getBirthday()));
      ps.setString(5, costumer.getRegistration().getCode());

      ps.executeUpdate();
    }
  }
}
