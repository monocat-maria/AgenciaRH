package pagamento;

import gestao.Funcionario;

import gestao.Salario;


public class Horista extends Funcionario implements Salario {
    
    private double salario_hora;

    public Horista() {
    }

    public Horista(double salario_hora, String cpf, String endereco, String setor, String telefone) {
        super(cpf, endereco, setor, telefone);
        this.salario_hora = salario_hora;
    }

    public double getSalario_hora() {
        return salario_hora;
    }

    public void setSalario_hora(double salario_hora) {
        this.salario_hora = salario_hora;
    }
    
    @Override
    public double calcularAumento(double salario, double aumento, double valorAumento, double totalSalario) {
        aumento = (valorAumento * salario) / 100;
        totalSalario = aumento + salario;
        return totalSalario;
    }

    @Override
    public double calcularSalarioTotal(double salarioMes,double totalSalario) {
        return totalSalario;
    }

    @Override
    public double calcularSalarioTotal(double horas, double valorHora, double totalSalarioHora) {
        totalSalarioHora = horas * valorHora;
        return totalSalarioHora;
    }
}
