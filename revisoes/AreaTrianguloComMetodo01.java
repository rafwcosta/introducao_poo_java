package revisoes;

import java.util.Scanner;
import entities.TrianguloComMetodo02;
import java.util.Locale;

public class AreaTrianguloComMetodo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Declaração de variáveis do objeto TrianguloComMetodo02
        TrianguloComMetodo02 x, y;
        x = new TrianguloComMetodo02();
        y = new TrianguloComMetodo02();

        // Entradas
        System.out.println("Digite os valores de X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite os valores de Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // Cálculos
        double areaX = x.area();
        double areaY = y.area();

        // Saídas
        System.out.printf("Área de X: %.4f%n", areaX);
        System.out.printf("Área de Y: %.4f%n", areaY);

        // Declaração da estrutura condicional if-else
        if (areaX > areaY) {
            System.out.println("Maior área: X");
        }
        else {
            System.out.println("Maior área: Y");
        }

        sc.close();
    }
}