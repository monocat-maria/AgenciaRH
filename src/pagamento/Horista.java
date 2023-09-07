package pagamento;

import gestao.Funcionario;


public class Horista extends Funcionario {
    private String salario_hora;
    private String total_salario_hora;

    public Horista() {
    }

    public Horista(String salario_hora, String total_salario_hora, String cpf, String endereco, String setor, String telefone) {
        super(cpf, endereco, setor, telefone);
        this.salario_hora = salario_hora;
        this.total_salario_hora = total_salario_hora;
    }

    public String getSalario_hora() {
        return salario_hora;
    }

    public String getTotal_salario_hora() {
        return total_salario_hora;
    }

    public void setSalario_hora(String salario_hora) {
        this.salario_hora = salario_hora;
    }

    public void setTotal_salario_hora(String total_salario_hora) {
        this.total_salario_hora = total_salario_hora;
    }
}
