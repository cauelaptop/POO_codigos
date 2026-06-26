import java.util.Scanner;


class ClienteInvalidoException extends Exception {
    public ClienteInvalidoException(String mensagem) {
        super(mensagem);
    }
}


class LimiteCompraExcedidoException extends Exception {
    public LimiteCompraExcedidoException(String mensagem) {
        super(mensagem);
    }
}


class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

public class SistemaPedidos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.print("Quantidade de produtos: ");
            int quantidade = scanner.nextInt();

            System.out.print("Preço unitário do produto: ");
            double precoUnitario = scanner.nextDouble();

            System.out.print("Valor disponível no cartão: ");
            double saldoCartao = scanner.nextDouble();


            if (nome == null || nome.trim().length() < 3) {
                throw new ClienteInvalidoException(
                        "Erro: o nome do cliente deve possuir pelo menos 3 caracteres.");
            }


            if (quantidade <= 0) {
                throw new IllegalArgumentException(
                        "Erro: a quantidade de produtos deve ser maior que zero.");
            }


            if (precoUnitario <= 0) {
                throw new IllegalArgumentException(
                        "Erro: o preço do produto deve ser maior que zero.");
            }


            double valorTotal = quantidade * precoUnitario;


            if (valorTotal > 10000.00) {
                throw new LimiteCompraExcedidoException(
                        "Erro: o valor total da compra ultrapassa R$ 10.000,00.");
            }


            if (saldoCartao < valorTotal) {
                throw new SaldoInsuficienteException(
                        "Erro: saldo insuficiente no cartão para realizar a compra.");
            }


            System.out.println("\nPedido processado com sucesso!");
            System.out.println("Cliente: " + nome);
            System.out.println("Valor total da compra: R$ " + String.format("%.2f", valorTotal));
            System.out.println("Saldo restante: R$ " + String.format("%.2f", (saldoCartao - valorTotal)));

        } catch (ClienteInvalidoException |
                 LimiteCompraExcedidoException |
                 SaldoInsuficienteException e) {

            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } finally {
            scanner.close();
        }
    }
}