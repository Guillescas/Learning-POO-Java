package Introduction;

public class Caneta {
  public String modelo;
  public String cor;
  private float ponta;
  protected int carga;
  protected boolean tampada;

  public void status() {
    System.out.println("==== Sobre a caneta ====");
    System.out.println("Modelo: " + this.getModelo());
    System.out.println("Caneta na cor " + this.cor);
    System.out.println("Pomta: " + this.getPonta());
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

 public int getCarga() {
   return carga;
 }

 public void setCarga(int carga) {
   this.carga = carga;
 }

 public String getCor() {
   return cor;
 }

 public void setCor(String cor) {
   this.cor = cor;
 }

 public String getModelo() {
   return modelo;
 }

 public void setModelo(String modelo) {
   this.modelo = modelo;
 }

 public float getPonta() {
   return ponta;
 }

 public void setPonta(float ponta) {
   this.ponta = ponta;
 }

 public boolean isTampada() {
   return tampada;
 }

 public void setTampada(boolean tampada) {
   this.tampada = tampada;
 }

  public Caneta(String modelo, String cor, float ponta) {
    this.modelo = modelo;
    this.cor = cor;
    this.ponta = ponta;
    this.setTampada(true);
    this.cor = "Azul";
  }
}