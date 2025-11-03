package Unit3;
import java.util.Scanner;
public class BaseballPlayer extends Athlete {
    private String position;
    private double AVG;
    private int HR;
    private int RBI;

    public BaseballPlayer()
    {
        super();
        position = "Pitcher";
        AVG = 0.388;
        HR = 184;
        RBI = 219;
    }
    public BaseballPlayer(String sPosition, double sAVG, int sHR, int sRBI){
        super();
        position = sPosition;
        AVG = sAVG;
        HR = sHR;
        RBI = sRBI;
    }

    public void shout(){
        System.out.println("I am an athlete!");
        System.out.println("I am a baseball player!");
    }

    public static void main(String[] args) {
        BaseballPlayer b1 = new BaseballPlayer();
        System.out.println(b1.getName());
        b1.changeName("Trout");
        System.out.println(b1.getName());
        b1.shout();

    }


}
