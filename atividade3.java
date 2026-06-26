public class atividade3{
    class salario {
        private double salario;

        public salario(double salario) {
            this.salario = salario;
        }

        public void aumentarSalario(double percentual) {
            if (percentual > 0) {
                salario += salario * (percentual / 100);
            }
        }

        public double getSalario() {
            return salario;
        }

        public String toString() {
            return "Salário: " + salario;
        }
    }
    public static void main(String[] args) {
        atividade3 atividade = new atividade3();
        salario funcionario = atividade.new salario(1000.00);
        System.out.println(funcionario);

        funcionario.aumentarSalario(10);
        System.out.println("Salário após aumento: " + funcionario.getSalario());
    }
}