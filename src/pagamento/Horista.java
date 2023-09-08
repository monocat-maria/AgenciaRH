package pagamento;

import gestao.Funcionario;


public class Horista extends Funcionario {
    private double salario_hora;
    private double total_salario_hora;

    public Horista() {
    }

    public Horista(double salario_hora, double total_salario_hora, String cpf, String endereco, String setor, String telefone) {
        super(cpf, endereco, setor, telefone);
        this.salario_hora = salario_hora;
        this.total_salario_hora = total_salario_hora;
    }

    public double getSalario_hora() {
        return salario_hora;
    }

    public double getTotal_salario_hora() {
        return total_salario_hora;
    }

    public void setSalario_hora(double salario_hora) {
        this.salario_hora = salario_hora;
    }

    public void setTotal_salario_hora(double total_salario_hora) {
        this.total_salario_hora = total_salario_hora;
    }
    
    
    
}
