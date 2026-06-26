import java.util.Scanner;

public class codigo {
    Scanner leia = new Scanner(System.in);
    String modelo;
    double distanciapercorrida, combustivelgasto;

    public void definircarro() {
        System.out.println("Digite o modelo do carro: ");
        modelo = leia.nextLine();
        System.out.println("Digite a distância percorrida: ");
        distanciapercorrida = leia.nextDouble();
        System.out.println("Digite o combustível gasto: ");
        combustivelgasto = leia.nextDouble();
    }

    public void calcularconsumo() {
        double consumo;
        consumo = distanciapercorrida / combustivelgasto;
        System.out.println("O consumo do carro é: " + consumo);
    }

    public static void main(String[] args) {
        codigo x = new codigo();
        x.definircarro();
        x.calcularconsumo();
    }
}
