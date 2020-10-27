package Bank;

// CC - 50 reais de inicio, 12 reais de mensalidade
// CP - 150 reais de inicio, 20 reais de mensalidade

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

  public void openAccount(String accountType, String owner) {
    if (accountType == "CC") {
      this.accountNumber = accountCounter + 1;
      this.setaccountType(accountType);
      this.setbalance(50);
      this.setowner(owner);
      this.setStatus(true);

      this.accountCounter = accountCounter + 1;
    } else {
      this.accountNumber = accountCounter + 1;
      this.setaccountType(accountType);
      this.setbalance(150);
      this.setowner(owner);
      this.setStatus(true);

      this.accountCounter = accountCounter + 1;
    }
  }

  public void closeAccount() {
    if (getbalance() > 0) {
      System.out.println("Você não pode fechar sua conta pois tem " + getbalance() + " disponível.");
    } else if (getbalance() < 0) {
      System.out.println("Você não pode fechar sua conta pois tem " + getbalance() + " de dividendo.");
    } else {
      System.out.println("Sua conta foi fechada.");
    }
  }

  public void putMoney(float value) {
    if (isStatus() == true) {
      this.setbalance(getbalance() + value);
      System.out.println("");
      System.out.println("Você depositou R$" + value);
      System.out.println("Seu saldo atual é de R$" + getbalance());
      System.out.println("");
    }
  }

  public void getMoney(float value) {
    if (isStatus() == true && getbalance() >= value) {
      this.setbalance(getbalance() - value);
      System.out.println("");
      System.out.println("Você sacou R$" + value);
      System.out.println("Seu saldo atual é de R$" + getbalance());
      System.out.println("");
    } else {
      System.out.println("Não foi possível sacar o valor informado. Confira o status da sua conta e seu saldo");
    }
  }

  public void monthlyPayment() {
    if (this.getaccountType() == "CC") {
      this.setbalance(getbalance() - 12);
      System.out.println("");
      System.out.println("Sua mensalidade foi paga. Seu saldo atual é de R$" + getbalance());
    } else {
      this.setbalance(getbalance() - 20);
      System.out.println("");
      System.out.println("Sua mensalidade foi paga. Seu saldo atual é de R$" + getbalance());
    }
  }

  public ContaCorrente() {
    this.setStatus(false);
    this.setbalance(0);
  }

  public void accountStatus() {
    System.out.println("====== Olá " + this.getowner() + "! Informações sobre sua conta ======");
    System.out.println("Número da conta: " + this.getaccountNumber());
    System.out.println("Sua conta é do tipo: " + this.getaccountType());
    System.out.println("Seu saldo atual é: R$" + this.getbalance());
    System.out.println("O status da sua conta é: " + this.isStatus());
  }

  public static void main(String[] args) {
    System.out.println("====== Criação de conta corrente ======");

    ContaCorrente c1 = new ContaCorrente();

    c1.openAccount("CC", "Guilherme Illescas");

    c1.accountStatus();
    
    c1.getMoney(12);
    
    c1.putMoney(12);

    c1.monthlyPayment();

    c1.closeAccount();

    c1.getMoney(38);

    c1.closeAccount();

    c1.getMoney(38);

  }
}
