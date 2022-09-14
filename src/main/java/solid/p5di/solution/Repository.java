package solid.p5di.solution;

import java.sql.SQLException;

public interface Repository<E> {
  void add(E entity) throws SQLException;
}
