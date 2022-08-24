package solid.p4is.violation;

public class CostumerService implements PersistenceService<Costumer> {
  @Override
  public boolean isValid() {
    // validate
    return false;
  }

  @Override
  public Costumer save(Costumer entity) {
    // persist costumer
    return null;
  }

  @Override
  public void sendEmail() {
    // send email;
  }
}
