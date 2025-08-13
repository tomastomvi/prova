package exer2;

public class hospede {
    String nome ;
    String dataChekin;
    double valortotal;


    void Estadia(double valor, int dias) {
        valortotal = valor * dias;
    }

    void exibir_info() {
        System.out.println("------------------- Informações do Hóspede: ------------------- ");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Check-in: " + dataChekin);
        System.out.println("Valor Total: " + valortotal);
    }
}
