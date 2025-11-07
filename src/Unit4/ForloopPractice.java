package Unit4;

public class ForloopPractice {
    public static void main(String[] args) {
        //print 5 even integers
        System.out.print("Evens: ");
        for(int i=0; i<5; i++){
            System.out.println(2*i+" ");//2, 4, 6, 8, 10 nth term? 2n-1

        }
        System.out.print("\nOdds: ");
        for(int i=1;i<=5;i++){
            System.out.println(2*i-1);
        }
        //calculate a sum of arithmetic series
        int sum = 0;
        for(int i = 1; i <= 5; i++){
            sum += 2 * i;
        }
        System.out.print(sum);

        String text = "euidjxncuvfyggggheg";
        //count how many g's we have
        int counter = 0;
        for(int i=0;i<text.length();i++){
            if(text.substring(i,i+1).equals("g")){
                counter ++;
            }
        }
        System.out.println("we have "+counter+" g's");


        //print each 4th character of AIDHFHVIFHGUCAOWEIJNDJ
        String str = "AIDHFHVIFHGUCAOWEIJNDJ";
        for(int i=3;i<str.length();i+=4){
            System.out.println(str.substring(i,i+1));
        }

        //print a string in reversed order
        //ABCD -> DCBA

        String str1 = "ABCD";
        String reversed = "";
        for(int i = str1.length()-1;i >=0;i--){
            reversed += str1.substring(i,i+1);
        }
        System.out.println(reversed);

        //nested loop
        int height = 5;
        //*
        //**
        //***
        //****
        //*****
        for(int row = 1; row <=5; row ++){
            String line= "";
            for(int column = 1; column <= row; column ++){
                System.out.print("*");
            }//inner loop
            System.out.println();
        }
    }
}
