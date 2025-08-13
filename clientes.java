package exer4;

public class clientes {
    String nome;
    String cpf;
    String email;
    int num_conta;
    double saldo;

    void registrarDeposito(double valor) {
        saldo += valor;
    }

    void registrarSaque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    void registrartransferencia(double valor, clientes destinatario) {
        if (valor <= saldo) {
            saldo -= valor;
            destinatario.registrarDeposito(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    void exibir_info() {
        System.out.println("------------------- Informações do Cliente: ------------------- ");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Número da Conta: " + num_conta);
        System.out.println("Saldo: " + saldo);
    }

}
