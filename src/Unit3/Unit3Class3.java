package Unit3;
import java.util.Scanner;

public class Unit3Class3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month: ");
        int m = sc.nextInt();
        System.out.println("Enter day: ");
        int d = sc.nextInt();
        System.out.println("Enter year: ");
        int y = sc.nextInt();
        System.out.println(dayofWeek(m,d,y));
//        int n1 = (int) (Math.random()*10);
//        int n2 = (int) (Math.random()*10);
//        if (n1<n2){
//            System.out.println("What is " + n2 + "-" + n1 + "?");
//            int studentAnswer = sc.nextInt();
//            int answer = n2-n1;
//            if (studentAnswer==answer){
//                System.out.println("You are correct!");
//            } else {
//                System.out.println("You are wrong");
//            }
//        }
//        else if (n1>n2){
//            System.out.println("What is " + n1 + "-" + n2+" ?");
//            int studentAnswer2 = sc.nextInt();
//            int answer2 = n1-n2;
//            if (studentAnswer2 == answer2){
//                System.out.println("You are correct!");
//            } else {
//                System.out.println("You are Wrong!");
//            }
//        }
    }
    public static String dayofWeek(int m, int d, int y){
        int y0 = (int) y-(14-m)/12;
        int x0 = (int) y0 + y0/4 - y0/100 + y0/400;
        int m0 = (int) m + 12 * ((14-m)/12)-2;
        int D = (d+x0+31*m0/12)%7;
        if (D==0){
            System.out.println("Today is Sunday");
        }
        if (D==1){
            System.out.println("Today is Monday");
        }
        if(D==2){
            System.out.println("Today is Tuesday");
        }
        if(D==3){
            System.out.println("Today is Wednesday");
        }
        if(D==4){
            System.out.println("Today is Thursday");
        }
        if(D==5){
            System.out.println("Today is Friday");
        }
        if (D==6){
            System.out.println("Today is Saturday");
        }
        return "";
    }
}
