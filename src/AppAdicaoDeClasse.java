// Programa com a utilização de orientação a objetos
// Criando uma classe com três atributos para representar melhor o triângulo

import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo;

public class AppAdicaoDeClasse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Criando variáveis X e Y, do tipo "Triangulo"
        Triangulo x, y;
        x = new Triangulo(); // Para que possa usar o objeto, precisa-se instanciar/criar, usando o comando "new"
        y = new Triangulo(); // Para que possa usar o objeto, precisa-se instanciar/criar, usando o comando "new"

        // Para ler o número inteiro e guardar nos objetos x e y, basta coloca um "." após o x ou y
        System.out.println("Entre com os valores de X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Entre com os valores de Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área: X");
        }
        else {
            System.out.println("Maior área: Y");
        }

        sc.close();
    }
}