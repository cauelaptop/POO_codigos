public class encapsulamento {

public String nome;
private double preco;

public encapsulamento (String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
}
public double getPreco() {
    return preco;
}
public void setPreco(double preco) {
    if (preco >= 0) {
    this.preco = preco;
}
}
public String toString() {
    return "Produto: " + nome + ", Preço: " + preco;
}
public static void main(String[] args) {
    encapsulamento p1 = new encapsulamento ("Notebook", 2500.00);
    System.out.println(p1);
    
    p1.setPreco(2300.00);
    System.out.println("Preço atualizado: " + p1.getPreco());
}
}