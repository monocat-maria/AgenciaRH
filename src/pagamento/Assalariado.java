package pagamento;

import gestao.Funcionario;
import gestao.Salario;


public class Assalariado extends Funcionario implements Salario {
    
    private double  salario_mes;
    
    public Assalariado() {
    }

    public Assalariado(double salario_mes, String cpf, String endereco, String setor, String telefone) {
        super(cpf, endereco, setor, telefone);
        this.salario_mes = salario_mes;
    }

    public double getSalario_mes() {
        return salario_mes;
    }

    public void setSalario_mes(double salario_mes) {
        this.salario_mes = salario_mes;
    }

    @Override
    public double calcularAumento(double salario, double aumento, double valorAumento, double totalSalario) {
        aumento = (valorAumento * salario) / 100;
        totalSalario = aumento + salario;
        return totalSalario;
    }

    @Override
    public double calcularSalarioTotal(double horas, double valorHora, double totalSalarioHora) {     
        return totalSalarioHora;
    }

    @Override
    public double calcularSalarioTotal(double salarioMes, double totalSalario) {
        totalSalario = salarioMes;
        return totalSalario;
    }
}
