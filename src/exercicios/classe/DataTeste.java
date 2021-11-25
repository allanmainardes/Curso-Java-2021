package exercicios.classe;

public class DataTeste {
    public void testeDia(int dia, Data data){
        if(data.dayIsValid(dia)){
            data.dia = dia;
        }else{
            System.out.println("Data invalida");
        }
    }
    public static void main(String[] args) {
        Data hoje = new Data();
        hoje.dia = 23;
        hoje.mes = 11;
        hoje.ano = 2021;

        Data amanha = new Data();
        amanha.dia = 24;
        amanha.mes = 5;
        amanha.ano = 2021;

        amanha.dayIsValid(24);

        System.out.println(hoje.dataFormatada());
        System.out.println(amanha.dataFormatada(amanha.dia, amanha.mes, amanha.ano));

        // Desafio data
        // criar construtor sem parametro que deixa a data 1/1/1970 e construtor passando parametros
        System.out.println("\nDesafio data: ");
        Data desafio1 = new Data();
        Data desafio2 = new Data(25,9,1997);
        System.out.println(desafio1.dataFormatada());
        System.out.println(desafio2.dataFormatada());
    }
}
