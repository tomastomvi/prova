package exer6_a;

public class circulo {
    double raio;
    double area;
    double perimetro;
    double pi = 3.14;

    void calcularArea(double pi){
        area = pi * (raio * raio);
    }

    void calcularPerimetro(double pi){
        perimetro = 2 * pi * raio;
    }
    void exibir(){
        System.out.println("---------------- aqui estar o os dados do circulo ----------------");
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
