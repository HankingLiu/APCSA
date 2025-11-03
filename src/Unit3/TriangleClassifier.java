package Unit3;

public class TriangleClassifier {
    public static void main(String[] args) {
        System.out.println(classifyTriangle(3, 4, 5));
        System.out.println(classifyTriangle(5, 5, 5));
        System.out.println(classifyTriangle(2, 2, 5));
        System.out.println(classifyTriangle(5, 5, 8));
        System.out.println(classifyTriangle(6, 8, 10));


    }
    public static String classifyTriangle(int a, int b, int c){

        int a2 = a*a;
        int b2 = b*b;
        int c2 = c*c;
        if(a+b>c && a+c>b && b+c>a){
            if (a==b && b==c){
                if(a2+b2==c2){
                    return "This is a equilateral right triangle";
                } else if(a2+b2<c2){
                    return "This is a equilateral obtuse triangle";
                } else {
                    return "This is a equilateral acute triangle";
                }
            } else if (a==b || b==c || a==c){
                if(a2+b2==c2){
                    return "This is a isosceles right triangle";
                } else if(a2+b2<c2){
                    return "This is a  isosceles obtuse triangle";
                } else {
                    return "This is a isosceles acute triangle";
                }
            } else{
                if(a2+b2==c2){
                    return "This is a scalene right triangle";
                } else if(a2+b2<c2){
                    return "This is a scalene obtuse triangle";
                } else {
                    return "This is a scalene acute triangle";
                }
            }
        }
        else {
            return "This is not a valid triangle";
        }
    }
}
