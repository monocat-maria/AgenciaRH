package app;

import gestao.Funcionario;
import java.util.Scanner;
import pagamento.Assalariado;
import pagamento.Horista;

public class AgenciaRH {

    public static void main(String[] args) {
       /*permita que o usuário informe dados para até dez funcionários, 
        questionando o tipo (assalariado/horista) e lendo os dados necessários. 
        Mantenha-os em uma única lista independentemente se são assalariados 
        ou horistas.*/
       String cpf_funcionario;
       String endereco_funcionario;
       String setor_funcionario;
       String telefone_funcionario;
       
       double salario_hora_hst;
       double total_hora_hst = 0;
       
       double salario_mes_ass;
       double total_mes_ass = 0;
       
       char confirmacao = 's';
       int i = 3;
       String opcao;
  
       
       Scanner input = new Scanner(System.in);
       
       do{
           System.out.println("\t--Agência RH--");
           System.out.println("Infome os dados do funcionário (" + i + " cadastros restantes):" );
           System.out.println("Informe CPF:");
           cpf_funcionario = input.next();
           System.out.println("Informe o endereço:");
           endereco_funcionario = input.next();
           System.out.println("Informe o setor de trabalho:");
           setor_funcionario = input.next();
           System.out.println("Informe o telefone:");
           telefone_funcionario = input.next();
           
           System.out.println("Escolha tipo de funcionário: A - Assalariado / H - Horista");
           opcao = input.next();
           
           switch(opcao){
               case "H","h":                   
                   System.out.println("Informe o salário por hora:");
                   salario_hora_hst = input.nextDouble();
                   Funcionario funcionarioHst = new Assalariado(salario_hora_hst,total_hora_hst,cpf_funcionario,endereco_funcionario,setor_funcionario,telefone_funcionario); 
                   i--;
                   break;
               case "A","a":
                   System.out.println("Informe o salário por hora:");
                   salario_mes_ass = input.nextDouble();
                   Funcionario funcionarioAsd = new Assalariado(salario_mes_ass,total_mes_ass,cpf_funcionario,endereco_funcionario,setor_funcionario,telefone_funcionario);
                   i--;
                   break;                          
               default:
                   System.out.println("Opção inválida.");
           }
           
           if(confirmacao == 's' && i > 0){
               System.out.println("Informar novo funcionario? s/n");
           confirmacao = input.next().charAt(0);
           }else{
               System.out.println("Informar novo funcionario? s/n");
               confirmacao = input.next().charAt(0);
               System.out.println("Limite de cadastro ultrapassado.");
           }          
       }while(confirmacao == 's' && i > 0);
        
       
    }
    
}
