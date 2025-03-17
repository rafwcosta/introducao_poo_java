package entities;

public class DadosDoProduto01 {
    public String nome;
    public double preco;
    public int quantidade;

    public double ValorTotalEmEstoque() {
        return preco * quantidade;
    }

    // O atributo e o argumento (o que está entre parênteses) se chama "quantidade", como diferenciar um do outro?
    // this = auto referência para o objeto, para acessar o atributo da classe
    public void AdicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void RemoverProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    // Para imprimir na tela
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