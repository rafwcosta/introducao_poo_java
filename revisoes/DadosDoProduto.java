/* 
 Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:
    > Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
    > Realizar uma entrada no estoque e mostrar novamente os dados do produto
    > Realizar uma saída no estoque e mostrar novamente os dados do produto
*/

package revisoes;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class DadosDoProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Declaração das variáveis do objeto
        Produto produto = new Produto();

        // Entradas
        System.out.print("Nome do produto: ");
        produto.nome = sc.nextLine();
        System.out.print("Preço do produto: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade do produto: ");
        produto.quantidade = sc.nextInt();

        // Saída
        System.out.println();
        System.out.println("Dados do produto: " + produto);
        System.out.println();

        // Entrada
        System.out.print("Insira a quantidade de produtos a serem adicionados ao estoque: ");
        int quantidade = sc.nextInt();
        produto.AdicionarProdutos(quantidade);

        // Saída
        System.out.println("Dados atualizados: " + produto);
        System.out.println();

        // Entrada
        System.out.print("Insira a quantidade de produtos a serem removidos ao estoque: ");
        quantidade = sc.nextInt();
        produto.RemoverProdutos(quantidade);

        // Saída
        System.out.println("Dados atualizados: " + produto);
        System.out.println();

        sc.close();
    }
}