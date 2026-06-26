import java.util.Scanner;
public class temperatura {
public static void main(String[] args) {

Scanner leia = new Scanner(System.in);

String resposta;
float celsius, fahrenheit;

System.out.println("digite a temperatura em celsius: ");
celsius = leia.nextFloat();
fahrenheit = (celsius * 9+160)/5;
System.out.println("a temperatura em fahrenheit é: " + fahrenheit);
System.out.println("===================================");

while (true){
    System.err.println("deseja continuar? (s/n)");
    resposta = leia.next(). toUpperCase();

    if(resposta.equals("N") ){
        break;
    }
System.out.println("===================================");
System.out.println("digite a temperatura em celsius: ");
celsius = leia.nextFloat();
fahrenheit = (celsius * 9+160)/5;
System.out.println("a temperatura em fahrenheit é: " + fahrenheit);
    System.out.println("===================================");




}
System.out.println("===================================");
System.out.println("programa encerrado!");

    }
}
