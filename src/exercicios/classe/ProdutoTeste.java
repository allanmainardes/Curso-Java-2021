package exercicios.classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Caneta";
        p1.preco = 1.50;
        p1.desconto = 0.0;

        Produto p2 = new Produto();
        p2.nome = "Teclado";
        p2.preco= 15.00;
        p2.desconto = 0.10;
        double precoDescontado = p2.precoComDesconto(p2.preco, p2.desconto);
        System.out.println("Produto:" + p2.nome + "\nValor: " + p2.preco + "\nDesconto: " + p2.desconto*10 + "%" + "\nTotal: " + precoDescontado);
    }
}
