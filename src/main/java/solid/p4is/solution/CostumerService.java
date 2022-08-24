package solid.p4is.solution;

public class CostumerService implements Validator, Persistence<Costumer>, EmailSender {
  @Override
  public void sendEmail() {
    // send email
  }

  @Override
  public Costumer save(Costumer entity) {
    // save costumer
    return null;
  }

  @Override
  public boolean isValid() {
    // validate
    return false;
  }
}
