package solid.p4is.violation;

public interface PersistenceService<T> {
  boolean isValid();

  T save(T entity);

  void sendEmail();
}
