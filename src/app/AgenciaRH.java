package app;

import java.util.Scanner;
import pagamento.Assalariado;
import pagamento.Horista;

public class AgenciaRH {

    public static void main(String[] args) {
       String cpf_funcionario;
       String endereco_funcionario;
       String setor_funcionario;
       String telefone_funcionario;
       
       double salario_hora_hst = 0;
       double horas_trabalhadas = 0;
       double salario_mes_ass;
 
       char confirmacao = 's';
       
       String opcao;
  
       Scanner input = new Scanner(System.in);
       
       Assalariado funcionarioA[] = new Assalariado[3];
       Horista funcionarioH[] = new Horista[3];
       for (int i = 0;i < 3;i++){
           funcionarioH[i] = new Horista(0,0,"","","","");
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
                   System.out.println("Informe as horas trabalhadas:");
                   horas_trabalhadas = input.nextDouble();    
                   funcionarioH[i] = new Horista(salario_hora_hst,horas_trabalhadas,cpf_funcionario,endereco_funcionario,setor_funcionario,telefone_funcionario);
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
                       + "\nSalário: R$" + funcionarioA[i].getSalario_mes() + " p/mês");
               System.out.println();
           }else if(!(funcionarioH[i].getCpf().equals(""))){
               System.out.println("Funcionário " + (i + 1 ) + "\n"
                       + "CPF:" + funcionarioH[i].getCpf()                 
                       + "\nEndereço:" + funcionarioH[i].getEndereco()
                       + "\nSetor:" + funcionarioH[i].getSetor()
                       + "\nTelefone:" + funcionarioH[i].getTelefone()
                       + "\nSalário: R$" + funcionarioH[i].getSalario_hora() + " p/hora");
               System.out.println();
           }                     
       }
        
       //Aplicando aumento
       
       
       
        System.out.println("Informar aumento para todos os  fucionários? s/n");
        confirmacao  = input.next().charAt(0);
        
        if(confirmacao == 's'){
            do{
                //armazenando salario antigo sem aumento
                double aumento_funcionario;
                double[] salario_anterior_a = new double[3];
                double[] salario_anterior_h = new double[3];
                
                for(i = 0;i < 3;i++){
                    salario_anterior_a [i] = funcionarioA[i].getSalario_mes();
                    salario_anterior_h [i] = funcionarioH[i].getSalario_hora();
                }
                
                System.out.println("Informe o valor do aumento para todos os funcionários(%):");
                aumento_funcionario = input.nextDouble();
                
                System.out.println("\t--Aumento de " + aumento_funcionario + "% para todos os funcionários--\n");
                
                for(i = 0; i < funcionarioA.length;i++){
                    if(!(funcionarioA[i].getCpf().equals(""))){
                        System.out.println("Funcionário " + (i + 1) + "\n"
                                + "\nSalário Anterior: R$" + salario_anterior_a[i] + " p/mês"
                                + "\nSalário Atual: R$" + funcionarioA[i].calcularAumento(funcionarioA[i].getSalario_mes(),0.0,aumento_funcionario, 0.0) + " p/mês");
                        System.out.println();
                    }else if(!(funcionarioH[i].getCpf().equals(""))){
                        System.out.println("Funcionário " + (i + 1) + "\n"
                                + "\nSalário Anterior: R$" + salario_anterior_h[i] + " p/hora"
                                + "\nSalário Atual: R$" + funcionarioH[i].calcularAumento(funcionarioH[i].getSalario_hora(),0.0,aumento_funcionario,0.0) + " p/hora");
                        System.out.println();
                    }                     
                }
                
                System.out.println("Informar outro aumento para todos os  fucionários? s/n");
                confirmacao  = input.next().charAt(0);
                
            }while(confirmacao == 's');
        }
        
        confirmacao = 's';
        System.out.println("Calcular salário total para todos os funcionários? s/n");
        confirmacao = input.next().charAt(0);
        
        if(confirmacao == 's'){
            for(i = 0;i < 3;i++){
                if(!(funcionarioA[i].getCpf().equals(""))){
                        System.out.println("Funcionário " + (i + 1) + "(Assalariado)\n"
                                + "\nSalário Total(mês): R$" + funcionarioA[i].calcularSalarioTotal(funcionarioA[i].getSalario_mes(),0) + " total p/mês");
                        System.out.println();
                    }else if(!(funcionarioH[i].getCpf().equals(""))){
                        System.out.println("Informe as horas trabalhadas do funcionário " + (i + 1));
                        System.out.println("\nFuncionário " + (i + 1) + "(Horista)\n"
                                + "Salário Total(mês): R$" + funcionarioH[i].calcularSalarioTotal(horas_trabalhadas,salario_hora_hst, salario_hora_hst) + " total p/mês");
                        System.out.println();
                    }
            }
        }
    }   

}
