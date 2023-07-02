package fundamentos;

public class notacaoPonto {
    public static void main(String[] args) {
        double a = 2.3;
        String texto = "aaabbbccc";
        texto = texto.toUpperCase();
        texto = texto.replace("A", "x");
        texto = texto.concat("!!!");

        System.out.println(texto);
    }
}
