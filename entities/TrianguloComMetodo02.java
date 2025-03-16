package entities;

public class TrianguloComMetodo02 {
    // a, b, c = serve para representar os lados dos triângulos
    public double a;
    public double b;
    public double c;

    // A função não irá receber parâmetros. Irá ficar "()", pois para calcular a área do triângulo, essa função não precisa receber nenhum dado além dos dados que estão contidos na classe (a, b, c)
    public double area() {
        double p = (a + b + c) / 2.0;
        double resultado = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return resultado;
    }
}