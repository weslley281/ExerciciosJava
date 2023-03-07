package EstruturasDeControle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        double grade = entry.nextDouble();

        if (grade > 10 || grade < 0){
            System.out.println("Invalid Grade");
        } else if (grade >= 8.1) {
            System.out.println("Very Good Work");
        } else if (grade >= 7.1) {
            System.out.println("Good work");
        } else if (grade >= 6.1) {
            System.out.println("It's enough");
        } else if (grade >= 5.1) {
            System.out.println("You can do better");
        } else if (grade >= 4.1) {
            System.out.println("You should be ashamed");
        } else if (grade >= 3.1) {
            System.out.println("you should really be doing this");
        } else if(grade >= 0) {
            System.out.println("nothing to say");
        }else {
            System.out.println("invalid grade");
        }

        entry.close();
    }
}
