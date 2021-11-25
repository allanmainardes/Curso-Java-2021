package exercicios.classe;

public class Produto {
 String nome;
 double preco;
 double desconto;

 double precoComDesconto(double preco, double desconto){
   return preco - (preco * desconto);
 }
}
