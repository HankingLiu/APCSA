package Unit3;

public class Athlete {
    private String name;
    private int age;
    private double height;
    private double weight;
    static int salary = 600;

    public Athlete()
    {

        name = "ohtani";
        age = 25;
        height = 189;
        weight = 67;

    }

    public Athlete(String cName, int cAge, double cHeight, double cWeight){
        name = cName;
        age = cAge;
        height = cHeight;
        weight = cWeight;
    }

    public String getName()
    {
        return name;
    }

    public void changeName(String alterName)
    {
        name = alterName;
    }
    public void changeSalary(int newSalary){
        salary = newSalary;
    }
    public static void main(String[] args) {
        Athlete a1 = new Athlete();
        System.out.println(a1.getName());
        a1.changeName("Smith");
        System.out.println(a1.getName());
        System.out.println(a1.salary);
        a1.changeSalary(888);
        System.out.println(a1.salary);
    }

}
