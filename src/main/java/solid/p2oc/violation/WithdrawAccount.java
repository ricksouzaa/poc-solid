package solid.p2oc.violation;

public class WithdrawAccount {

  public void withdraw(double value, String account, AccountType type) {
    if (type.equals(AccountType.CHECKING)) {
      System.out.println("withdraw checking account");
    } else if (type.equals(AccountType.SAVING)) {
      System.out.println("valid account birthday");
      System.out.println("withdraw saving account");
    }
  }

}
