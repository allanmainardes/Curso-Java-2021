package exercicios.classe;

public class Produto {
 String nome;
 double preco;
 static double desconto = 0.25;

 Produto(){

 }
 Produto(String nomeInicial, double precoInicial){
  this.nome = nomeInicial;
  this.preco = precoInicial;
 }
 double precoComDesconto(double preco, double desconto){
   return preco - (preco * desconto);
 }
}
