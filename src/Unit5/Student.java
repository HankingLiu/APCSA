package Unit5;

public class Student {
    private String name;
    private int id;
    private String grade;

    //your own default parameterless constructor
    public Student(){
        name = "default";
        id = 0;
    }
    public Student(String n, int i){
      name = n;
      id = i;
    }
    public Student(String n, int i, String g){
        this(n,i); //this is a reference to the object itself
        grade = g;
    }

    public String getName(){return name;}
    public void setName(String name) {this.name=name;}
    public int getId(){return id;}
    public void setId(int id) {this.id=id;}

    public static void main(String[] args) {
        Student st = new Student();
        Student st2 = new Student("John", 12345, "S3");
        System.out.println(st2.getName()+st2.getId());
    }
}
