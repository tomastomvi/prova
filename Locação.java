package exer5;

public class Locação {
    String modelo;
    double valorDiaria;
    double valorTotal;
    int dias;

    void valorTotal() {
        valorTotal = valorDiaria * dias;
    }

    void exibir() {
        System.out.println("----------------- Locação de Veículo -----------------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Valor da diária: R$ " + valorDiaria);
        System.out.println("Valor total: R$ " + valorTotal);
    }
    
}
