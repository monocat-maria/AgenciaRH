package app;

import gestao.Funcionario;
import java.util.Scanner;
import pagamento.Assalariado;
import pagamento.Horista;

public class AgenciaRH extends Funcionario {

    public static void main(String[] args) {
       String cpf_funcionario;
       String endereco_funcionario;
       String setor_funcionario;
       String telefone_funcionario;
       
       double salario_hora_hst;
       double salario_mes_ass;
 
       char confirmacao = 's';
       
       String opcao;
  
       Scanner input = new Scanner(System.in);
       
       Assalariado funcionarioA[] = new Assalariado[3];
       Horista funcionarioH[] = new Horista[3];
       for (int i = 0;i < 3;i++){
           funcionarioH[i] = new Horista(0,"","","","");
           funcionarioA[i] = new Assalariado(0,"","","","");
       }
       
       //resetando contador
       int i = 0;
       
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
                   funcionarioH[i] = new Horista(salario_hora_hst,cpf_funcionario,endereco_funcionario,setor_funcionario,telefone_funcionario);
                   i++;
                   break;
               case "A","a":
                   System.out.println("Informe o salário por mês:");
                   salario_mes_ass = input.nextDouble();                  
                   funcionarioA[i] = new Assalariado(salario_mes_ass,cpf_funcionario,endereco_funcionario,setor_funcionario,telefone_funcionario);
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
       
       //print
       System.out.println("\n\t--Funcionários Cadastrados--");      
       for(i = 0; i < funcionarioA.length;i++){
           
           if(!(funcionarioA[i].getCpf().equals(""))){
              System.out.println("Funcionário " + (i + 1) + "\n"
                       + "CPF:" + funcionarioA[i].getCpf()
                       + "\nEndereço:" + funcionarioA[i].getEndereco()
                       + "\nSetor:" + funcionarioA[i].getSetor()
                       + "\nTelefone:" + funcionarioA[i].getTelefone()
                       + "\nSalário:" + funcionarioA[i].getSalario_mes() + " p/mês");
               System.out.println();
           }else if(!(funcionarioH[i].getCpf().equals(""))){
               System.out.println("Funcionário " + (i + 1 ) + "\n"
                       + "CPF:" + funcionarioH[i].getCpf()                 
                       + "\nEndereço:" + funcionarioH[i].getEndereco()
                       + "\nSetor:" + funcionarioH[i].getSetor()
                       + "\nTelefone:" + funcionarioH[i].getTelefone()
                       + "\nSalário:" + funcionarioH[i].getSalario_hora() + " p/hora");
               System.out.println();
           }                     
       }      
    }   
}
