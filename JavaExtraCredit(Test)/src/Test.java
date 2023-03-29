/*
Practice code for assembly language assignment
 */
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int gradeNum;
        String gradeLet = "";
        System.out.println("Please enter grade percentage (without percent sign): ");
        gradeNum = scan.nextInt();
        if (gradeNum >= 90) {
            gradeLet = "A";
        }
        else if (89 >= gradeNum || gradeNum >= 80) {
            gradeLet = "B";
        }
        else if (79 >= gradeNum || gradeNum >= 70) {
            gradeLet = "C";
        }
        else if (69 >= gradeNum || gradeNum >= 60) {
            gradeLet = "D";
        }
        else if (59 >= gradeNum || gradeNum >= 0) {
            gradeLet = "F";
        }
        System.out.println("Your letter grade is: " + gradeLet);
    }
}
