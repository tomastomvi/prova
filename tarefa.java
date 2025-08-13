package exer3;

public class tarefa {
    String nome;
    String descricao;
    String prazo;
    String conclusão;


    void Status() {
        if (prazo  == conclusão) {
            System.out.println("Tarefa " + nome + " foi concluída em: " + conclusão); 
            
        }else{
            System.out.println("Tarefa " + nome + " está pendente.");
        }
    }
    void exibir_info() {
        System.out.println("------------------- Informações da Tarefa: ------------------- ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prazo: " + prazo);
    }
    







}
