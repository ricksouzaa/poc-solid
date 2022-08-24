package solid.p4is.violation;

public class ProductService implements PersistenceService<Product> {
  @Override
  public boolean isValid() {
    // validate
    return false;
  }

  @Override
  public Product save(Product entity) {
    // persist product
    return null;
  }

  @Override
  public void sendEmail() {
    // send email
  }
}
