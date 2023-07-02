package classes;

public class ValorVsReferencia {
    public static void main(String[] args){
        double a = 2;
        double b = a;

        a++;
        b++;

        System.out.println(a + " " + b);

        Data data = new Data(1, 6, 22);
        Data data2 = data;

        data.dia = 31;
        data2.mes = 12;
        data.ano = 25;

        System.out.println(data.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());

        System.out.println("__________________________");

        voltarDataPadrao(data);

        System.out.println(data.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());
    }

    static void voltarDataPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
}
