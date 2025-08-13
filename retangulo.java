package exer6_b;

public class retangulo {
    double largura;
    double altura;
    double area;

    void calcularArea(){
        area = largura * altura;
    }

    void exibir(){
        System.out.println("---------------- aqui estar o os dados do retangulo ----------------");
        System.out.println("Area: " + area);
    }
}
