package pagamento;

import gestao.Funcionario;


public class Assalariado extends Funcionario {
    private String salario_mes;
    private String total_salario_mes;

    public Assalariado() {
    }

    public Assalariado(String salario_mes, String total_salario_mes, String cpf, String endereco, String setor, String telefone) {
        super(cpf, endereco, setor, telefone);
        this.salario_mes = salario_mes;
        this.total_salario_mes = total_salario_mes;
    }

    public String getSalario_mes() {
        return salario_mes;
    }

    public String getTotal_salario_mes() {
        return total_salario_mes;
    }

    public void setSalario_mes(String salario_mes) {
        this.salario_mes = salario_mes;
    }

    public void setTotal_salario_mes(String total_salario_mes) {
        this.total_salario_mes = total_salario_mes;
    }
    
    
}
