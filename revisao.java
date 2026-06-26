import java.util.Scanner;
public class revisao {
double salariovelho,salarionovo,porcentagem;
public void mostrarDados(){
salarionovo =  salariovelho+(salariovelho*porcentagem/100);
System.out.println("valor do aumento: "+salarionovo);

}

public static void main(String[] args) {
revisao x = new revisao();
Scanner scanner = new Scanner(System.in) ;


System.out.println("Digite o salário atual seu: ");
    x.salariovelho = scanner.nextDouble();

    System.out.println("Digite o valor do aumento que você terá: ");
    x.porcentagem = scanner.nextDouble();


        
x.mostrarDados();
scanner.close();
}

}
