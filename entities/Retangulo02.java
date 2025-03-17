package entities;

public class Retangulo02 {
    // Reperesentações de altura e largura do retângulo
    public double altura;
    public double largura;

    // Cálculos da área
    public double area() {
        return altura * largura;
    }

    // Cálculos do perímetro
    public double perimetro() {
        return 2 * (altura + largura);
    }

    // Cálculos da diagonal
    public double diagonal() {
        return Math.sqrt((altura * altura) + (largura * largura));
    }
}