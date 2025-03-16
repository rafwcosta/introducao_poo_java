// Criar um programa que tenha 2 triângulos. O usuário precisará digitar os 3 lados de cada um dos triângulos, para descobrir sua área. Ao final do programa, deverá imprimir na tela o triângulo que tem a maior área, se é o X ou Y.


package revisoes;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo02;

public class AreaTrianguloMaior02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Declaração das variáveis, do tipo/objeto "Triangulo02".
        Triangulo02 x, y;
        x = new Triangulo02(); // Para se usar o objeto "Triangulo02", deve-se instanciar/criar a classe desse objeto usando o comando "new"
        y = new Triangulo02(); // Para se usar o objeto "Triangulo02", deve-se instanciar/criar a classe desse objeto usando o comando "new"

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
        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

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