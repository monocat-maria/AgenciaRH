package pagamento;

import gestao.Funcionario;


public class Horista extends Funcionario {
    private double salario_hst;
    private double total_salario_hst;

    public Horista() {
    }

    public Horista(double salario_hst, double total_salario_hst, String cpf, String endereco, String setor, String telefone) {
        super(cpf, endereco, setor, telefone);
        this.salario_hst = salario_hst;
        this.total_salario_hst = total_salario_hst;
    }

    public double getSalario_hst() {
        return salario_hst;
    }

    public double getTotal_salario_hst() {
        return total_salario_hst;
    }

    public void setSalario_hst(double salario_hst) {
        this.salario_hst = salario_hst;
    }

    public void setTotal_salario_hst(double total_salario_hst) {
        this.total_salario_hst = total_salario_hst;
    }
}
