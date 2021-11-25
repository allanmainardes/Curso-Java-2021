package exercicios.classe;

public class DesafioPrimeiroTrauma {

    int a = 3; //fazer o código funcionar sem mexer nessa linha.
    static int b = 4;
    public static void main(String[] args) {
        /*não conseguimos acessar a variável a diretamente mesmo sendo atributo da classe*/
        //System.out.println(a);
        //duas formas de resolver:

        //primeira forma
        DesafioPrimeiroTrauma d = new DesafioPrimeiroTrauma();
        System.out.println(d.a);
        //segunda forma
        System.out.println(b);
    }
}
