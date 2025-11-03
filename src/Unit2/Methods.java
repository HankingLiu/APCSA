package Unit2;

public class Methods {
    //Method overloading
    //Allows us to reuse the same method name for different functions/methods essentially doing the
    //same thing

    //it is a feature of programming languages
    //to create overloaded methods you should alter their signatures

    public static void main(String[] args){
        int x = add(3,4);
        double y = add(3,4.0);

        int a = Math.abs(-42);//returns int 42
        double b = Math.abs(-50.0);//returns double 50
        //these are two different abd() functions

        //int c = Math.pow(3,5); Does not work
        double c = Math.pow(3,5);

        //int d = Math.sqrt(4); Does not work
        double d = Math.sqrt(4);

        System.out.println(Math.random());

        double high = 20;
        double low = 3;
        double g = (high - low) * Math.random() + low;
        System.out.println(g);

        double k = (Math.random() - Math.random()) * Math.random() + Math.random();
        System.out.println(k);
        System.out.println(random(3, 100));

        //use casting to generate random integers
        int o = (int)(100*Math.random());//random integer 0 to 99 inclusive
        System.out.println(o);
        int u = (int)(100*Math.random()) + 4; //random integer 4 to 103 inclusive
        System.out.println(u);
        int hi = (int)(2*Math.random());
        System.out.println(hi);
        //random integer 0 or 1
    }
    public static int add(int x, int y){
        return x+y;
    }
    public static int add(int x, int y, int z){
        return x+y+z;
    }
    public static double add(double x, double y){ //those add with () are method signatures
        return x+y;
    }
    public static double random(int low, int high){
        return (high - low) * Math.random() + low;
    }
}
