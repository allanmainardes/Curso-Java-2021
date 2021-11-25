package exercicios.classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Caneta";
        p1.preco = 1.50;


        Produto p2 = new Produto();
        p2.nome = "Teclado";
        p2.preco= 15.00;
        double precoDescontado1 = p1.precoComDesconto(p1.preco, p1.desconto);
        double precoDescontado2 = p2.precoComDesconto(p2.preco, p2.desconto);
        System.out.println("Produto:" + p1.nome + "\nValor: " + p1.preco + "\nDesconto: " + p1.desconto*100 + "%" + "\nTotal: " + precoDescontado1);
        System.out.println("Produto:" + p2.nome + "\nValor: " + p2.preco + "\nDesconto: " + p2.desconto*100 + "%" + "\nTotal: " + precoDescontado2);
    }
}
