package Unit4;
import java.util.Scanner;
public class ACSLtiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 4 starting numbers for the rows (it has to be single digits and space seperated");
        int[] rows = new int[4];
        for (int i=0;i<4;i++){
            rows[i]=sc.nextInt();
        }
        sc.nextLine(); //to consume leftover newlines

        System.out.println("Enter the tiles (has to be two digit numbers and space separated");
        String [] tileStrings =sc.nextLine().split(" ");

        int totalDiscardSum = 0;
        int lastRowUsed = -1;
        boolean doubleTileLast = false;

        for(String tileStr : tileStrings){
            int a = tileStr.charAt(0)-'0';
            int b = tileStr.charAt(1)-'0';
            boolean placed = false;

            for (int i =1;i<=4; i++){
                int rowIndex = (lastRowUsed +i)%4;

                if (doubleTileLast && rowIndex != lastRowUsed) continue;

                if (rows[rowIndex]==a){
                    rows[rowIndex] =b;
                    placed=true;
                    lastRowUsed=rowIndex;
                    doubleTileLast=(a==b);
                    break;
                }
            }
            if (!placed){
                totalDiscardSum += a+b;
            }
        }
        System.out.println("Sum of discarded tiles: "+totalDiscardSum);
    }
}
