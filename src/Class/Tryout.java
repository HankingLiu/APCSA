package Class;
import java.util.Scanner;
public class Tryout {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1= scanner.nextInt();
//        int num2 = 3232;
//        int num3 = 8577;
//        int num4 = 9233;
        if (num1 % 12==1 && num1%23==1 && num1%31==1){
            System.out.println("True");
        } else {
            System.out.println("num1 is not true");

        }

    }
}
