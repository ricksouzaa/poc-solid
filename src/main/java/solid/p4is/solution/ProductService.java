package solid.p4is.solution;

public class ProductService implements Validator, Persistence<Product> {
  @Override
  public Product save(Product entity) {
    // save product
    return null;
  }

  @Override
  public boolean isValid() {
    // validate
    return false;
  }
}
