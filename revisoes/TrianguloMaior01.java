// Criar um programa que tenha 2 triângulos. O usuário precisará digitar os 3 lados de cada um dos triângulos, para descobrir sua área e imprimir na tela. Ao final do programa, deverá imprimir na tela o triângulo que tem a maior área, se é o X ou Y.

package revisoes;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo03;

public class TrianguloMaior01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Declaração das variáveis dos objetos
        Triangulo03 x, y;
        x = new Triangulo03();
        y = new Triangulo03();

        // Entradas
        System.out.println("Insira os lados de X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Insira os lados de Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // Cálculos
        double areaX = x.area();
        double areaY = y.area();

        // Saídas
        System.out.printf("Área de X: %.2f%n", areaX);
        System.out.printf("Área de Y: %.2f%n", areaY);

        // Declaração da estrutura condicional, utilizando if-else
        if (areaX > areaY) {
            System.out.println("Maior área: X");
        }
        else {
            System.out.println("Maior área: Y");
        }

        sc.close();
    }
}