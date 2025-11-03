package Unit3;
import java.sql.SQLOutput;
import java.util.Scanner;
public class BooleanExpressions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        clientValidation(25, false);
        clientValidation(14, true);

        getGrade(98);
        rollDie(10,20);

    }
    public static int rollDie(int low, int high){
        return (int)((high-low + 1)*Math.random()) + low;
    }
    public static void playGame(){
        int die1 = rollDie(3,8);
        int die2 = rollDie(10,20);

        System.out.println("Score: " + (die1+die2));
        if (die1+die2 > 25){
            System.out.println("win");
        } else {
            System.out.println("Try again");
        }
    }
//
//    public static void rollDice(int low, int high){
//        int sum = (int) (Math.random() * (high - low) +1) + low;
//        System.out.println(sum);
//    }
//    public static void playGame(){
//        int firstDie = (int) (Math.random()*8)-3;
//        int secondDie = (int) (Math.random()*20)-10;
//        if (firstDie+secondDie > 25){
//            System.out.println("Win");
//        } else {
//            System.out.println("Try again");
//        }
//    }



    public static void getGrade(int percentage){
        //>=90 is A, >=8 is B, 70%-C, 60%-D, <60%-F
        if(percentage >= 90){
            System.out.println("Your grade is A");
        } else if(percentage >= 80){
            System.out.println("Your grade is B");
        } else if(percentage >=70){
            System.out.println("Your grade is C");
        } else if(percentage >=60){
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }

    }

    public static void clientValidation(int age, boolean isRegistered){
        if(age < 18){
            System.out.println("The age is less than 18");
        }
        if(!isRegistered){
            System.out.println("Please apply for registration first");
        }
    }

    public static void passwordValidation(Scanner sc){
        System.out.println("Enter password: ");
//        String text1 = "AP CS A";
        String text1 = sc.nextLine(); //reference 1
//        String text2 = "AP CS A";


        //we cannot do reference == another reference if we want to compare content
        System.out.println("Enter password again: ");
        String text2 = sc.nextLine(); //reference 2
        boolean equal = text1.equals(text2);

        //System.out.println(equal);
        if (equal){
            System.out.println("Password is validated");
        } else {
            System.out.println("Check your password");
        }
    }
}
