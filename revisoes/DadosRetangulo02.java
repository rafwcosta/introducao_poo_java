/*
 Fazer um programa para ler os valores da altura e largura de um retângulo. Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
 */

package revisoes;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo02;

public class DadosRetangulo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Declaração das variáveis dos objetos
        Retangulo02 retangulo = new Retangulo02();

        // Entradas
        System.out.print("Altura: ");
        retangulo.altura = sc.nextDouble();
        System.out.print("Largura: ");
        retangulo.largura = sc.nextDouble();

        // Saída
        System.out.printf("Área: %.2f%n", retangulo.area());
        System.out.printf("Perímetro: %.2f%n", retangulo.perimetro());
        System.out.printf("Diagonal: %.2f%n", retangulo.diagonal());

        sc.close();
    }
}