package funcionario;

public class atividade4 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(0, 0);

        System.out.println(funcionario);
        System.out.println("Salário total: " + funcionario.calcularSalario());

        if (funcionario.getValorDoDia() == 0 || funcionario.getDiasTrabalhados() == 0) {
            System.out.println("Valor do dia e dias trabalhados devem ter valores positivos.");
        }
    }
}