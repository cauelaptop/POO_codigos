public class atividade2 {
    private double saldo;

    public atividade2(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString() {
        return "conta bancária, Saldo: " + saldo;
    }

    public static void main(String[] args) {
        atividade2 conta = new atividade2(1000.00);
        System.out.println(conta);

        conta.depositar(500.00);
        System.out.println("Saldo após depósito: " + conta.getSaldo());

        conta.sacar(200.00);
        System.out.println("Saldo após saque: " + conta.getSaldo());
    }
}