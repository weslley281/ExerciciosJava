package fundamentos;

public class DesafioLogico {
    public static void main(String[] args) {
        Boolean trabalho1 = false;
        Boolean trabalho2 = false;

        if (trabalho1 && trabalho2){
            System.out.println("Comprar TV de 60 polegadas");
        } else if (trabalho1 || trabalho2) {
            System.out.println("Comprar TV de 32 polegadas");
        }else {
            System.out.println("Sem TV");
        }

        System.out.println(trabalho1 || trabalho2 ? "Comprar Sorvete" : "Sem Sorvete");
    }
}
