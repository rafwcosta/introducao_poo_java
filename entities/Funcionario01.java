package entities;

public class Funcionario01 {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double SalarioLiquido() {
        return salarioBruto - imposto;
    }

    public double AumentarSalario(double porcentagem) {
        return salarioBruto += salarioBruto * porcentagem / 100.0; 
    }

    public String toString() {
        return nome + ", R$ " + String.format("%.2f", SalarioLiquido());
    }
}