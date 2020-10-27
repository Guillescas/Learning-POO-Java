package Bank;

// CC - 50 reais
// CP - 150 reais

public class ContaCorrente {
  private int accountCounter;

  public int accountNumber;
  protected String accountType;
  private String owner;
  private float balance;
  private boolean status;

  public String getowner() {
    return owner;
  }

  public void setowner(String owner) {
    this.owner = owner;
  }

  public int getaccountNumber() {
    return accountNumber;
  }

  public void setaccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public float getbalance() {
    return balance;
  }

  public void setbalance(float balance) {
    this.balance = balance;
  }

  public String getaccountType() {
    return accountType;
  }

  public void setaccountType(String accountType) {
    this.accountType = accountType;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public void abrirConta(String accountType, String owner) {
    if (accountType == "CC") {
      this.accountNumber = accountCounter + 1;
      this.balance = 50;
      this.owner = owner;
      this.setStatus(true);
    } else {
      this.accountNumber = accountCounter + 1;
      this.balance = 150;
      this.owner = owner;
      this.setStatus(true);
    }
  }
}
