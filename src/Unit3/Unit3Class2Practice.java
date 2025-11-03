package Unit3;
import java.util.Scanner;
public class Unit3Class2Practice {
    public static void main(String[] args){
        System.out.println(isValidUsername("STU_1234"));
        System.out.println(isValidUsername("STU124"));
        System.out.println(isValidUsername("STU_7891"));
        System.out.println(isValidUsername("stu_1234"));

        System.out.println(canDeliver(0,0,60,80));
        System.out.println(canDeliver(0,0,100,800));
        solveQuadraticEquations();

    }

    public static boolean isValidUsername(String username){
        //precondition: the input comes in a form string + 4 digits
        if(username.length() != 8)
            return false;
        //first four characters must be "STU_"
//        if(username.substring(0,4).equals("STU_")){
//            return true;
//        }
//        return false;
        return username.startsWith("STU_");

    }
    //question 3
    //(x2-x1) * (x2-x1)
    public static boolean canDeliver(double x1, double y1, double x2, double y2){
//        double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        //or
        double distanceSquared = Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2);
        double distance = Math.sqrt(distanceSquared);
        return distance <= 100;
//      return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2)) <=100;
//        if (distance<=100)
//            return true;
//        else
//            return false;

    }

    public static void solveQuadraticEquations(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");//entered in a line separated by spaces
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double discriminant = (Math.pow(b,2) - (4*a*c));
        if (discriminant>0){
            double root1 = (-b + Math.sqrt(discriminant)) / (2*a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2*a);
            System.out.println("The roots are: " + root1 + "and " + root2);
        } else if (discriminant == 0){
            double root = -b/(2*a);
            System.out.println("One root: "+root);
        } else {
            System.out.println("No real roots");

        }

//76-93 textbook


    }
}
