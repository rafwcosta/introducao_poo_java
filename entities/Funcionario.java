package entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    // Cálculo para salário líquido
    public double SalarioLiquido() {
        return salarioBruto - imposto;
    }

    // Cálculo para aumento do salarial, baseado na porcentagem do salário bruto
    public double AumentoSalarial(double porcentagem) {
        return salarioBruto += salarioBruto * porcentagem / 100.0;
    }
    
    // Saída do programa
    public String toString() {
        return "Nome: " + nome + " | Salário: R$ " + String.format("%.2f", SalarioLiquido());
    }
}