package app;

import gestao.Funcionario;
import java.util.Scanner;
import pagamento.Assalariado;
import pagamento.Horista;

public class AgenciaRH {

    public static void main(String[] args) {
       String cpf_funcionario;
       String endereco_funcionario;
       String setor_funcionario;
       String telefone_funcionario;
       
       double salario_hora_hst;
       double total_hora_hst = 0;
       
       double salario_mes_ass;
       double total_mes_ass = 0;
       
       char confirmacao = 's';
       int i = 0;
       String opcao;
  
       Scanner input = new Scanner(System.in);
       
       Funcionario[] funcionarioH = new Horista[3];
       Funcionario[] funcionarioA = new Assalariado[3];
       
       
       do{
           System.out.println("\t--Agência RH--");
           System.out.println("Infome os dados do funcionário (" + (3 - i)  + " cadastros restantes):" );
           
           System.out.println("Informe CPF:");
           cpf_funcionario = input.next();
           
           System.out.println("Informe o endereço:");
           endereco_funcionario = input.next();
           
           System.out.println("Informe o setor de trabalho:");
           setor_funcionario = input.next();
           
           System.out.println("Informe o telefone:");
           telefone_funcionario = input.next();
           
           System.out.println("Escolha tipo de funcionário: H - Horista / A - Assalariado");
           opcao = input.next();
           
           switch(opcao){
               case "H","h":                   
                   System.out.println("Informe o salário por hora:");
                   salario_hora_hst = input.nextDouble();                  
                   funcionarioH[i] = new Horista(salario_hora_hst,total_hora_hst,cpf_funcionario,endereco_funcionario,setor_funcionario,telefone_funcionario);
                   i++;
                   break;
               case "A","a":
                   System.out.println("Informe o salário por mês:");
                   salario_mes_ass = input.nextDouble();                  
                   funcionarioA[i] = new Assalariado(salario_mes_ass,total_mes_ass,cpf_funcionario,endereco_funcionario,setor_funcionario,telefone_funcionario);
                   i++;
                   break;                          
               default:
                   System.out.println("Opção inválida.");
           }
           
           if(confirmacao == 's' && i < 3){
               System.out.println("Informar novo funcionario? s/n");
           confirmacao = input.next().charAt(0);
           }else{
               System.out.println("Informar novo funcionario? s/n");
               confirmacao = input.next().charAt(0);
               System.out.println("Limite de cadastro ultrapassado.");
           }          
       }while(confirmacao == 's' && i < 3);
       
       System.out.println("\n\t--Funcionários Cadastrados--");
       for(i = 0; i < funcionarioH.length;i++){      
       System.out.println("Funcionário " + (i + 1) + "\n"
               + "CPF:" + funcionarioH[i].getCpf()
               + "\nEndereço:" + funcionarioH[i].getEndereco()
               + "\nSetor:" + funcionarioH[i].getSetor()
               + "\nTelefone:" + funcionarioH[i].getTelefone()
               +"\nPagamento p/hora:" + funcionarioH[i].getSalario_hora());
        System.out.println();
       }
        
       
        
       
    }
    
}
