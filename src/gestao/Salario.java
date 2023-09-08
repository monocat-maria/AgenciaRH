package gestao;

public abstract class Salario {
    double salario_hora;
    double total_salario_hora;
    
    public double getSalario_hora() {          
        return salario_hora;
    }

    public double getTotal_salario_hora() {          
        return total_salario_hora;
    }
    
   public double calcularSalario(int horas,double valor_hora, double totalSalario){
       return totalSalario;
   }
   
   public double calcularSalario(double totalSalario){  
       return totalSalario;
   }
   
   public double calcularAumento(double valorAumento,double totalSalario,double aumento,double totalAumento){
       return totalAumento;
   }
}
