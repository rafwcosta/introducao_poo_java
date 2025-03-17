import java.util.Locale;
import java.util.Scanner;
import entities.DadosDoProduto01;

public class Mercado01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Declaração das variáveis dos objetos
        DadosDoProduto01 dadosDoProduto01 = new DadosDoProduto01();

        // Entradas
        System.out.print("Nome do produto: ");
        dadosDoProduto01.nome = sc.nextLine();
        System.out.print("Preço: ");
        dadosDoProduto01.preco = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        dadosDoProduto01.quantidade= sc.nextInt();

        // Saídas
        System.out.println("Dados do produto: " + dadosDoProduto01);
        System.out.println();

        // Entradas
        System.out.print("Insira a quantidade de produtos a serem adicionados ao estoque: ");
        int quantidade = sc.nextInt();
        dadosDoProduto01.AdicionarProdutos(quantidade);

        // Saídas
        System.out.println();
        System.out.println("Dados atualizados: " + dadosDoProduto01);

        // Entradas
        System.out.print("Insira a quantidade de produtos a serem removidos ao estoque: ");
        quantidade = sc.nextInt();
        dadosDoProduto01.RemoverProdutos(quantidade);

        // Saídas
        System.out.println();
        System.out.println("Dados atualizados: " + dadosDoProduto01);

        sc.close();
    }
}