package solid.p4is.solution;

public class SegregationTest {

  public static void main(String[] args) {
    Validator validator = new ProductService();
    if (validator.isValid()) {
      // is valid;
    }

    EmailSender sender = new CostumerService();
    sender.sendEmail();
  }
}
