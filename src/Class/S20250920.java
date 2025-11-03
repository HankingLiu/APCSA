package Class;

public class S20250920 {
    public static void main(String[] args){
        System.out.println("Hello World");
        int result = add(1,1);
        Dog goofy = new Dog();
        System.out.println(goofy);
        System.out.println(goofy.getName());
        System.out.println(Dog.life);
        double pie = Math.PI;
        System.out.println(pie);
        goofy.setName("Snooby");
        System.out.println(goofy.getName());
    }
    public static int add(int x, int y){
        return x + y;
    }

}

