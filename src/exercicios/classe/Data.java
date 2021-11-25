package exercicios.classe;

public class Data {
    int dia;
    int mes;
    int ano;
    Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public String dataFormatada(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    public String dataFormatada(int dia, int mes, int ano){
        return String.format("%d/%d/%d", dia, mes, ano);
    }

   public boolean dayIsValid(int day){
       int mes = this.getMes();
       boolean isValid = false;
       if( mes > 0 && mes <= 6 ){
           if(mes==2){
               if(day > 0 && day <= 28){
                   isValid = true;
               }
           }else if(mes%2 == 1){
               if(day > 0 && day <=31){
                   isValid = true;
               }
           }else if (mes%2 == 0){
               if(day > 0 && day <=30){
                   isValid = true;
               }
           }
       }else if( mes > 6 && mes <= 12){
           if(mes == 2){
               if(day > 0 && day <= 28){
                   isValid = true;
               }
           }else if(mes%2 == 0){
               if(day > 0 && day <=31){
                   isValid = true;
               }
           }else if (mes%2 == 1){
               if(day > 0 && day <=30){
                   isValid = true;
               }
           }
       }
       return isValid;

   }
   public boolean monthIsValid(int month){
       return month > 0 && month <= 12;
   }
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
