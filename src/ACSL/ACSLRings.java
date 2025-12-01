package ACSL;
import java.util.Arrays;
import java.util.Scanner;
public class ACSLRings {
    public static int getScore(String toss){
        if (toss.equals("A")||toss.equals("R")) return 1;
        if (toss.equals("O") || toss.equals("G")) return 3;
        if(toss.equals("B")) return 6;

        if(toss.equals("AO")) return 1+3+1;
        if(toss.equals("OB")) return 3+6+1;
        if(toss.equals("BG")) return 6+3+1;
        if(toss.equals("GR")) return 3+1+1;

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] p1=sc.nextLine().split(" ");
        String[] p2 = sc.nextLine().split(" ");
        String[] p3 = sc.nextLine().split("");

        int s1=0, s2=0, s3=0;

        for (String t:p1)s1+= getScore(t);
        for(String t:p2) s2+= getScore(t);
        for(String t:p3) s3 += getScore(t);

        int[] scores = {s1,s2,s3};

        Arrays.sort(scores);

        System.out.println(scores[2]+" "+scores[1]+" "+scores[0]);
    }
}
