public class calculadora{

int num1, num2, escolha;

public void main(String[] args) {
    System.out.println("Digite o primeiro número: ");
    num1 = Integer.parseInt(System.console().readLine());
    System.out.println("Digite o segundo número: ");
    num2 = Integer.parseInt(System.console().readLine());
    System.out.println("Escolha a operação: 1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão 5- Sair");
    escolha = Integer.parseInt(System.console().readLine());

    switch (escolha) {
        case 1:
            System.out.println("Resultado: " + (num1 + num2));
            break;
        case 2:
            System.out.println("Resultado: " + (num1 - num2));
            break;
        case 3:
            System.out.println("Resultado: " + (num1 * num2));
            break;
        case 4:
            try {
                System.out.println("Resultado: " + (num1 / num2));
            } catch (ArithmeticException e) {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
            break;
        case 5:
            System.out.println("Saindo...");
            break;

        default:
            System.out.println("Opção inválida!");
            break;
        
    }
}
}