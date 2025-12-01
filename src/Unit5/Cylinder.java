package Unit5;

public class Cylinder {
    private Circle base;   // a Circle object
    private int height;    // cylinder height

    // Constructor: instantiate a Circle and set height
    public Cylinder(int x, int y, double r, int h) {
        base = new Circle(x, y, r);
        height = h;
    }

    // Returns the base area (area of the circle)
    public double getBaseArea() {
        return base.getArea();
    }

    // Returns the volume (base area × height)
    public double getVolume() {
        return getBaseArea() * height;
    }

    // Sets the height
    public void setHeight(int h) {
        height = h;
    }

    // Prints required string
    public void printCylinder() {
        System.out.println("Cylinder with a radius r = "
                + base.getRadius() + " and height h = " + height);
    }

    // Optional tester
    public static void main(String[] args) {
        Cylinder cy = new Cylinder(0, 0, 5.0, 10);

        cy.printCylinder();
        System.out.println("Base area = " + cy.getBaseArea());
        System.out.println("Volume = " + cy.getVolume());

        cy.setHeight(20);
        cy.printCylinder();
    }
}
