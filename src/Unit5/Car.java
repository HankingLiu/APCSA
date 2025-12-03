package Unit5;

public class Car {
    public static final String BLACK = "Black";
    public static final String BLUE = "Blue";
    public static final String YELLOW = "Yellow";
    public static final String WHITE = "White";
    public static final String RED = "Red";

    private String color;
    private String model;
    private int year;
    private String vin;
    private static int totalCars = 0;

    public Car(String color, String model, int year, String vin){
        if(color.equals(BLACK)||color.equals(BLUE) || color.equals(YELLOW)||color.equals(WHITE)||color.equals(RED)){
            this.color=color;
        } else {
            this.color = BLACK;
        }
        if (year >= 1900){
            this.year=year;
        } else {
            System.out.println("enter a valid year");
            this.year=1900;
        }
        this.vin=vin;
        this.model=model;
        totalCars++;
    }
    public Car(String color, String model, int year){
        this(color, model, year, "Vin"+(totalCars+1));
    }
}

