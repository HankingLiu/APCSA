package Unit3;

public class CompoundBoolean {
    public static void main(String[] args) {
        int year = 2020;
        String color = "Black";
        String model = "Mercedes";

        //if year > 2010 and model is Mercedes and color is black register car

        if(year>2010 && color.equals("Black") && model.equals("Mercedes")){

                    System.out.println("The car is registered");
        } else {
            System.out.println("The car is not registered");
        }

    }
}
