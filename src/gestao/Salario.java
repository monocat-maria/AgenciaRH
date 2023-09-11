package gestao;

/**
 *
 * @author monocat
 */
public interface Salario {
    public double calcularAumento(double salario, double aumento,double valorAumento, double totalSalario);
    public double calcularSalarioTotal(double horas,double valorHora,double totalSalarioHora);
    public double calcularSalarioTotal(double salarioMes,double totalSalario);
}
