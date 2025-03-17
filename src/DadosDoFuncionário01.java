import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario01;

public class DadosDoFuncionário01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Declaração das variáveis do objeto
        Funcionario01 funcionario = new Funcionario01();

        // Entradas
        System.out.print("Nome do funcionário: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        // Saída
        System.out.println();
        System.out.println("Funcionário: " + funcionario);
        System.out.println();

        // Entrada
        System.out.print("Qual a porcentagem para aumento do salário?: ");
        double porcentagem = sc.nextDouble();
        funcionario.AumentarSalario(porcentagem);

        // Saída
        System.out.println();
        System.out.println("Dados atualizados: " + funcionario);


        sc.close();
    }
}