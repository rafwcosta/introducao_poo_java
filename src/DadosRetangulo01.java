import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo01;

public class DadosRetangulo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Declaração das variáveis do objeto
        Retangulo01 retangulo01 = new Retangulo01();

        // Entradas
        System.out.print("Altura: ");
        retangulo01.altura = sc.nextDouble();
        System.out.print("Largura: ");
        retangulo01.largura = sc.nextDouble();

        // Saídas
        System.out.printf("Área: %.2f%n", retangulo01.area());
        System.out.printf("Perímetro: %.2f%n", retangulo01.perimetro());
        System.out.printf("Diagonal: %.2f%n", retangulo01.diagonal());

        sc.close();
    }
}