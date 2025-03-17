// Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida: Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque) - Realizar uma entrada no estoque e mostrar novamente os dados do produto - Realizar uma saída no estoque e mostrar novamente os dados do produto.

package revisoes;

import java.util.Locale;
import java.util.Scanner;
import entities.DadosDoProduto02;

public class Mercado02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Declarações das variáveis do objeto
        DadosDoProduto02 dadosDoProduto02 = new DadosDoProduto02();

        // Entradas
        System.out.print("Nome do produto: ");
        dadosDoProduto02.nome = sc.nextLine();
        System.out.print("Preco do produto: ");
        dadosDoProduto02.preco = sc.nextDouble();
        System.out.print("Quantidade do produto: ");
        dadosDoProduto02.quantidade = sc.nextInt();

        // Saídas
        System.out.println("Dados do produto: " + dadosDoProduto02);
        System.out.println();

        // Entradas
        System.out.print("Insira a quantidade de produtos a serem adicionados ao estoque: ");
        int quantidade = sc.nextInt();
        dadosDoProduto02.AdicionarProdutos(quantidade);

        // Saídas
        System.out.println("Dados do produto: " + dadosDoProduto02);
        System.out.println();

        // Entradas
        System.out.print("Insira a quantidade de produtos a serem removidos ao estoque: ");
        quantidade = sc.nextInt();
        dadosDoProduto02.RemoverProdutos(quantidade);

        // Saídas
        System.out.println("Dados do produto: " + dadosDoProduto02);
        System.out.println();

        sc.close();
    }
}