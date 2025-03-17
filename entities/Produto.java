package entities;

public class Produto {
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

    public String toString() {
        return "Nome: " + nome + ", preço: R$" + String.format("%.2f", preco) + ", quantidade: " + quantidade + ", valor total: R$" + String.format("%.2f", ValorTotalEmEstoque());
    }
}