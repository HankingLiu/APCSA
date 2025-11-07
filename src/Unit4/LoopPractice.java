package Unit4;

public class LoopPractice {
    public static void main(String[] args) {
        //sum of integers from 1 to 100
//        int sum = sum(1, 100);
//        System.out.println(sum);
//        sum = sum(3, 7);
//        System.out.println(sum);
//        sum = sum(1912, 24891);
//        System.out.println(sum);
//        sum = sum(1912, 1);
//        System.out.println(sum);
//
//        System.out.println(divisible(1,20));
        System.out.println(sumOfDigits(1234));

    }

    public static void getDigits(int x) {
        while(x != 0) {
            int lastDigit = x % 10;
            System.out.println(lastDigit);
            x = x / 10;
        }
    }

    //write a functions that calculate a sum of all digits in a given number
    public static int sumOfDigits(int x) {
        int sum = 0;
        while(x != 0) {
            int lastDigit = x % 10;
            sum += lastDigit;
            x = x / 10;
        }
        return sum;
    }


    public static int sum(int first, int last) {
        if(first > last)
            return -1;

        int sum = 0;
        while(first <= last) {
            sum += first;
            first++;
        }
        return sum;
    }

    //determine how many numbers are divisible by 3
    //but not divisible by 5 between first and last
    public static int divisible(int first, int last) {
        int count = 0;
        while(first <= last) {
            if(first % 3 == 0 && first % 5 != 0){
                count++;
            }
            first++;//first -> last
        }
        return count;
    }
}
