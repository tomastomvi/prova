package exer1;

public class cliente {
    String nome;
    String email;
    String telefone;
    double totalcompras;

    void  registrarcompras(double  valor) {
      totalcompras += valor;

    }
    void exibir_info(){
        System.out.println("------------------- Informações do Cliente: ------------------- ");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Total de Compras: " + totalcompras);
    }
}
