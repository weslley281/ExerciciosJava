package EstruturasDeControle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
        String concept = "";

        System.out.print("What is the grade?");
        Scanner entry = new Scanner(System.in);
        int grade = entry.nextInt();

        switch (grade){
            case 10:
                concept = "A+";
                break;
            case 9:
                concept = "A";
                break;
            case 8:
                concept = "B+";
                break;
            case 7:
                concept = "B";
                break;
            case 6:
                concept = "C+";
                break;
            case 5:
                concept = "C";
                break;
            case 4:
                concept = "D+";
                break;
            case 3:
                concept = "D";
                break;
            case 2:
                concept = "E+";
                break;
            case 1:
                concept = "E";
                break;
            case 0:
                concept = "F";
                break;
            default:
                concept = "invalid concept";
        }

        System.out.println("The concept is " + concept);
        entry.close();
    }
}
