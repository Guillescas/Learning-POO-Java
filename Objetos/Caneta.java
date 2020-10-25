package Objetos;

public class Caneta {
  String modelo;
  String cor;
  float ponta;
  int carga;
  boolean tampada;

  void status() {
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Caneta na cor " + this.cor);
    System.out.println("Pomta: " + this.ponta);
    System.out.println("Carga: " + this.carga);
    System.out.println("Tampada? " + this.tampada);
  }

  void rabiscar() {
    if (this.tampada == true) {
      System.out.println("Erro: Uma caneta não pode rabiscar enquanto estiver tampada");
    } else {
      System.out.println("Estou rabiscando! :)");
    }
  }

  void tampar() {
    this.tampada = true;
  }

  void destampar() {
    this.tampada = false;
  }
}