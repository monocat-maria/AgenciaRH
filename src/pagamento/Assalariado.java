package pagamento;

import gestao.Funcionario;


public class Assalariado extends Funcionario {
    private double salario_mes_ass;
    private double total_salario_mes_ass;

    public Assalariado() {
    }

    public Assalariado(double salario_mes_ass, double total_salario_mes_ass, String cpf, String endereco, String setor, String telefone) {
        super(cpf, endereco, setor, telefone);
        this.salario_mes_ass = salario_mes_ass;
        this.total_salario_mes_ass = total_salario_mes_ass;
    }

    public double getSalario_mes_ass() {
        return salario_mes_ass;
    }

    public double getTotal_salario_mes_ass() {
        return total_salario_mes_ass;
    }

    public void setSalario_mes_ass(double salario_mes_ass) {
        this.salario_mes_ass = salario_mes_ass;
    }

    public void setTotal_salario_mes_ass(double total_salario_mes_ass) {
        this.total_salario_mes_ass = total_salario_mes_ass;
    } 
}
