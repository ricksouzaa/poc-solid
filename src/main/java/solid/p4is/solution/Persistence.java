package solid.p4is.solution;

public interface Persistence<T> {
  T save(T entity);
}
