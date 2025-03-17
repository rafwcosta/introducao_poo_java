/*
 Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Estudante para resolver este problema.
*/

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class NotasEstudante01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Declaração das variáveis do objeto
        Estudante estudante = new Estudante();

        // Entradas
        System.out.print("Nome do aluno: ");
        estudante.nome = sc.nextLine();
        System.out.println("Insira as 3 notas: ");
        estudante.notaUm = sc.nextDouble();
        estudante.notaDois = sc.nextDouble();
        estudante.notaTres = sc.nextDouble();

        // Saída
        System.out.printf("Nota final: %.2f%n", estudante.notaFinal());

        // Estrutura condicional if-else
        if (estudante.notaFinal() < 60.0) {
            System.out.println("Não aprovado!");
            System.out.printf("Pontos faltantes: %.2f%n", estudante.pontosFaltantes());
        }
        else {
            System.out.println("Parabéns, Você passou!");
        }

        sc.close();
    }
}