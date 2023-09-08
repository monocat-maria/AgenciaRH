package pagamento;

import gestao.Funcionario;


public class Assalariado extends Funcionario {
    private double salario_mes;
    private double total_salario_mes;

    public Assalariado() {
    }

    public Assalariado(double salario_mes, double total_salario_mes, String cpf, String endereco, String setor, String telefone) {
        super(cpf, endereco, setor, telefone);
        this.salario_mes = salario_mes;
        this.total_salario_mes = total_salario_mes;
    }

    public double getSalario_mes() {
        return salario_mes;
    }

    public double getTotal_salario_mes() {
        return total_salario_mes;
    }

    public void setSalario_mes(double salario_mes) {
        this.salario_mes = salario_mes;
    }

    public void setTotal_salario_mes(double total_salario_mes) {
        this.total_salario_mes = total_salario_mes;
    } 
}
