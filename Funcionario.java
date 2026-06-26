package funcionario;

public class Funcionario {

    private double valorDoDia;
    private int diasTrabalhados;

    public Funcionario(double valorDoDia, int diasTrabalhados) {
        this.valorDoDia = valorDoDia;
        this.diasTrabalhados = diasTrabalhados;
    }

    public double calcularSalario() {
        return valorDoDia * diasTrabalhados;
    }

    public double getValorDoDia() {
        return valorDoDia;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public String toString() {
        return "Funcionário, Valor do dia: " + valorDoDia +
               ", Dias trabalhados: " + diasTrabalhados;
    }
}