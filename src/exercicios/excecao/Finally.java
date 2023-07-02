package excecao;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {

        System.out.print("Digite o dividendo: ");
        Scanner entrada = new Scanner(System.in);

        try{
            Integer dividendo = entrada.nextInt();
            System.out.println(7 / dividendo);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finalmente");
            entrada.close();
        }
        System.out.println("Fim!");
    }
}
