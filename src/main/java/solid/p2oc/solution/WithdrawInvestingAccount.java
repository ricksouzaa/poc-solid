package solid.p2oc.solution;

public class WithdrawInvestingAccount extends WithdrawAccount {
  @Override
  public void withdraw(double value, String account) {
    System.out.println("withdraw investing account");
  }
}
