/*
 Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário.
*/

package revisoes;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class DadosDoFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Declaração das variáveis do objeto
        Funcionario funcionario = new Funcionario();

        // Entradas
        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        // Saída
        System.out.println();
        System.out.println(funcionario);
        System.out.println();

        // Entrada
        System.out.print("Qual a porcentagem do aumento de salário?: ");
        double porcentagem = sc.nextDouble();
        funcionario.AumentoSalarial(porcentagem);

        // Saída
        System.out.println();
        System.out.println("Dados atualizados:");
        System.out.println(funcionario);
        System.out.println();

        sc.close();
    }
}