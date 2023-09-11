package gestao;

public class Funcionario {
    private String cpf;
    private String endereco;
    private String setor;
    private String telefone;


   
    public Funcionario(){        
    }

    public Funcionario(String cpf, String endereco, String setor, String telefone) {
        this.cpf = cpf;
        this.endereco = endereco;
        this.setor = setor;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSetor() {
        return setor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
