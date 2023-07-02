package EstruturasDeControle;

public class For3 {
    public static void main(String[] args) {
        int i = 0;

        for (; i < 10; i++){
            System.out.println(i);
        }

        System.out.println(i);

        for (int j = 0; j < 10; j++){
            for (int a = 0; a < 10; a++){
                System.out.printf("[%d %d]\n", i , j);
            }
        }
    }
}
