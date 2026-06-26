import java.util.Scanner;

public class sistemabanco {

    private static final Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        sistemabanco sistema = new sistemabanco();
        sistema.new Conta();
    }

    public class Conta {

        private String usuario;
        private String senha;
        private double saldo;

        public Conta() {

            int opcao = 0;

            while(opcao != 3) {

                System.out.println("\n========= banco galinhus ========");

                System.out.println("1 - criar conta");
                System.out.println("2 - acessar conta");
                System.out.println("3 - sair");

                opcao = leia.nextInt();
                leia.nextLine();

                switch(opcao) {

                    case 1:

                        System.out.println("digite o nome do usuário");
                        this.usuario = leia.nextLine();

                        System.out.println("digite sua senha");
                        this.senha = leia.nextLine();

                        this.saldo = 0;

                        System.out.println("Conta criada!");
                        break;

                    case 2:

                        System.out.println("digite o nome do usuário");
                        String usuarioTemp = leia.nextLine();

                        System.out.println("digite sua senha");
                        String senhaTemp = leia.nextLine();

                        if(usuarioTemp.equals(this.usuario) && senhaTemp.equals(this.senha)) {

                            int opcaoConta = 0;

                            while(opcaoConta != 4) {

                                System.out.println("\n===== bem vindo " + this.usuario + " =====");

                                System.out.println("bem vindo " + this.usuario + "!");
                               

                                System.out.println("\ndeseja fazer qual ação?");
                                System.out.println("1 - depositar");
                                System.out.println("2 - sacar");
                                System.out.println("3 - ver saldo");
                                System.out.println("4 - sair da conta");

                                opcaoConta = leia.nextInt();

                                switch(opcaoConta) {

                                    case 1:

                                        System.out.println("quanto deseja depositar?");
                                        double deposito = leia.nextDouble();

                                        this.saldo += deposito;

                                        System.out.println("depósito realizado!");
                                        break;

                                    case 2:

                                        System.out.println("quanto deseja sacar?");
                                        double saque = leia.nextDouble();

                                        if(saque <= this.saldo) {

                                            this.saldo -= saque;

                                            System.out.println("saque realizado!");

                                        } else {

                                            System.out.println("saldo insuficiente!");
                                        }

                                        break;

                                    case 3:

                                        System.out.println("saldo atual: R$ " + this.saldo);
                                        break;

                                    case 4:

                                        System.out.println("saindo da conta...");
                                        break;

                                    default:

                                        System.out.println("opção inválida");
                                }
                            }

                        } else {

                            System.out.println("Usuário ou senha incorretos!");
                        }

                        break;

                    case 3:

                        System.out.println("saindo...");
                        break;

                    default:

                        System.out.println("opção inválida");
                }
            }
        }
    }
}