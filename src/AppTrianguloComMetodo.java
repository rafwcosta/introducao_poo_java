// Criar um programa que tenha 2 triângulos. O usuário precisará digitar os 3 lados de cada um dos triângulos, para descobrir sua área. Ao final do programa, deverá imprimir na tela o triângulo que tem a maior área, se é o X ou Y.
// Esse programa em específico, iremos criar um método para calcular a área, que serve para obtermos os benefícios de reaproveitamento e delegação

import java.util.Locale;
import java.util.Scanner;
import entities.TrianguloComMetodo01;

public class AppTrianguloComMetodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Declaração das variáveis, do tipo/objeto "Triangulo02".
        TrianguloComMetodo01 x, y;
        x = new TrianguloComMetodo01(); // Para se usar o objeto "Triangulo02", deve-se instanciar/criar a classe desse objeto usando o comando "new"
        y = new TrianguloComMetodo01(); // Para se usar o objeto "Triangulo02", deve-se instanciar/criar a classe desse objeto usando o comando "new"

        // Entradas
        System.out.println("Digite os valores do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite os valores do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // Cálculos
        double areaX = x.area();
        double areaY = y.area();

        // Saídas
        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        // Declaração de estrutura condicional, utilizando if-else
        if (areaX > areaY) {
            System.out.println("Maior área: X");
        }
        else {
            System.out.println("Maior área: Y");
        }

        sc.close();
    }
}