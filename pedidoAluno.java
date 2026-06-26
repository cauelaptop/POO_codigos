package projetoAluno;

import java.util.Scanner;

public class pedidoAluno {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        aluno aluno = new aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(leia.nextLine());

        System.out.print("Digite a primeira nota: ");
        aluno.setNota1(leia.nextDouble());

        System.out.print("Digite a segunda nota: ");
        aluno.setNota2(leia.nextDouble());

        double media = aluno.calcularMedia();

        System.out.println("\nAluno: " + aluno.getNome());
        System.out.println("Média: " + media);
        System.out.println("Situação: " + aluno.verificarAprovacao());

        leia.close();
    }
}