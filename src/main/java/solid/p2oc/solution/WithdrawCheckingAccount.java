package solid.p2oc.solution;

public class WithdrawCheckingAccount extends WithdrawAccount {
  @Override
  public void withdraw(double value, String account) {
    System.out.println("withdraw checking account");
  }
}
