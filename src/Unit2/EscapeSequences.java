package Unit2;

import java.util.Scanner;

public class EscapeSequences {
    public static void main (String[] agrs){
        Scanner scanner = new Scanner (System.in);
//        String text2 = "Hello \"Java\"";//Hello "Java"
//        System.out.println(text2);
//
//        String path = "C:\\documents";
//        System.out.println(path);
//
//        System.out.println("Hello AP CS A \nJava");
//

        printName();
    }
    public static void printName(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); //full name Michael Benjamin Smith
        int firstspace = input.indexOf(" ");
        //System.out.println(firstspace);
        String firstName = input.substring(0, firstspace);
        System.out.println(firstName);

        //extract second name
        input = input.substring(firstspace + 1);
        int secondSpace = input.indexOf(" ");
        String secondName = input.substring(0, secondSpace);
        System.out.println(secondName);

        //extract last name
        String lastName = input.substring(secondSpace + 1);
        System.out.println(lastName);
    }
}
