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
    }
}
