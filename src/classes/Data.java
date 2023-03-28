package classes;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
        dia = 1;
        mes = 1;
        ano =1970;
    }

    Data(int Dia, int Mes, int Ano){
        dia = Dia;
        mes = Mes;
        ano = Ano;
    }

    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}
