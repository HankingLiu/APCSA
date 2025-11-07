package Unit4;
import java.util.Scanner;
public class IntroforLoopAssignment {

    public static void main(String[] args) {
        for(int i = 4; i <8; i++){
            System.out.print(i);
        }
        for(int i = 5; i>0; i--){
            System.out.println(i);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = sc.next();
        int counter = 0;
        for(int i=0;i<str.length();i++) {
            if (str.substring(i, i + 1).equals("e")) {
                counter++;
            }
        }
        System.out.println("We have: "+counter+" e's");



        int height = 4;
        for (int row = height; row >=1; row --){
            String line = "";
            for(int star = 1; star <= row; star++){
                line = line + "*";
            }
            System.out.println(line);
        }
    }

}
