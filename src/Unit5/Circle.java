package Unit5;

public class Circle {
    private int x,y;
    private double radius;

    //default constructor
    public Circle(){
        x=0;
        y=0;
        radius=1;
    }
    //general purpose constructor
    public Circle(int a, int b, double r) {
        x=a;
        y=b;
        radius=r;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public boolean isInCircle(int m, int n){
        return Math.sqrt(Math.pow(m-x, 2)+Math.pow(n-y,2)) < radius;
    }
    public void translation(int dx, int dy){
        x += dx;
        y += dy;
    }
    public void scale(double factor){
        radius *= factor;

    }
    public int getX() {return x;}
    public void setX(int x){this.x=x;}
    public int getY(){return y;}
    public void setY(int y){this.y=y;}
    public double getRadius(){return radius;}
    public void setRadius(double radius){this.radius=radius;}

    public static void main(String[] args) {
        Circle unitCircle = new Circle();//unit circle
        Circle c = new Circle(5,6,10);

        System.out.println(unitCircle.getArea());
        System.out.println(c.getArea());

        System.out.println("The position of circle 2 is: x= "
                +c.getX()+" y= "+c.getY());
        c.translation(-5, 3);
        System.out.println("The position of circle 2 is: x= "+c.getX()+" y= "+c.getY());

        double oldR = c.getRadius();
        c.scale(5);
        double newR = c.getRadius();
        System.out.println("Radius before scaling was: " + oldR+" radius after scaling is: "+newR);
    }

}
