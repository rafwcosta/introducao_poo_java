package entities;

public class DadosDoProduto02 {
    public String nome;
    public double preco;
    public int quantidade;

    public double ValorTotalEmEstoque() {
            return preco * quantidade;
    }

    public void AdicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void RemoverProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    // Saída do programa
    public String toString() {
        return nome 
        + ", R$ " 
        + String.format("%.2f", preco) 
        + ", " 
        + quantidade 
        + " unidades, total: R$ " 
        + String.format("%.2f", ValorTotalEmEstoque());
    }
}