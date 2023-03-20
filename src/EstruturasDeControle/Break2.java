package EstruturasDeControle;

public class Break2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if (i == 1){
                    break;
                }
                System.out.printf("%d %d", i, j);
            }
            System.out.println();
        }
    }
}
