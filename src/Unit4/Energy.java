package Unit4;
import java.util.Scanner;
public class Energy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        // keep reading numbers until no more input
        while (sc.hasNextInt()) {
            int use = sc.nextInt();
            double bill = 0;

            if (use <= 150) {
                bill = use * 0.5;
            } else if (use <= 400) {
                bill = 150 * 0.5 + (use - 150) * 0.8;
            } else {
                bill = 150 * 0.5 + 250 * 0.8 + (use - 400) * 1.2;
            }

            total += bill;
        }

        System.out.printf("%.2f", total);



    }
}
