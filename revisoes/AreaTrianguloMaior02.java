// Crie um programa que tenha 2 triângulos. O usuário deve digitar os 3 lados de cada um dos dois triângulo e fazer o cálculo para descobrir qual  dos dois triângulos é maior

package revisoes;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo03;

public class AreaTrianguloMaior02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Criação das variáveis X e Y, do tipo/objeto "Triangulo03"
        Triangulo03 x, y;
        x = new Triangulo03();
        y = new Triangulo03();

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
        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        // Criação da estrutura condicional, utilizando if-else
        if (areaX > areaY) {
            System.out.println("Maior área: X");
        }
        else {
            System.out.println("Maior área: Y");
        }

        sc.close();
    }
}