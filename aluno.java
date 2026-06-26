
package projetoAluno;

public class aluno {
    private String nome;
    private double nota1;
    private double nota2;

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }


    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String verificarAprovacao() {
        if (calcularMedia() >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}


