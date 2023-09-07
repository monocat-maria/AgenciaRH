package app;

import gestao.Funcionario;
import java.util.Scanner;

public class AgenciaRH {

    public static void main(String[] args) {
       /*permita que o usuário informe dados para até dez funcionários, 
        questionando o tipo (assalariado/horista) e lendo os dados necessários. 
        Mantenha-os em uma única lista independentemente se são assalariados 
        ou horistas.*/
       String cpf_funcionario;
       String endereco_funcionario;
       String setor_funcionario;
       char confirmacao = 's';
       
       Funcionario[] funcionarios = new Funcionario[10];
       
       Scanner input = new Scanner(System.in);
       
       do{
           System.out.println("\t--Agência RH--");
           System.out.println("Infome os dados do funcionário (10):");
           System.out.println("Informe CPF:");
           cpf_funcionario = input.next();
           System.out.println("Informe o endereço:");
           endereco_funcionario = input.next();
           System.out.println("Informe o setor de trabalho:");
           setor_funcionario = input.next();
        
           System.out.println("Informar novo funcionario? s/n");
           confirmacao = input.next().charAt(0);
           
       }while(confirmacao == 's');
        
       
    }
    
}
