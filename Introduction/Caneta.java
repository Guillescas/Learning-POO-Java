package Introduction;

public class Caneta {
  public String modelo;
  public String cor;
  private float ponta;
  protected int carga;
  protected boolean tampada;

  public void status() {
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Caneta na cor " + this.cor);
    System.out.println("Pomta: " + this.ponta);
    System.out.println("Carga: " + this.carga);
    System.out.println("Tampada? " + this.tampada);
  }

  public void rabiscar() {
    if (this.tampada == true) {
      System.out.println("Erro: Uma caneta não pode rabiscar enquanto estiver tampada");
    } else {
      System.out.println("Estou rabiscando! :)");
    }
  }

  protected void tampar() {
    this.tampada = true;
  }

  protected void destampar() {
    this.tampada = false;
  }
}