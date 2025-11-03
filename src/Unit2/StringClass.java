package Unit2;

public class StringClass {
    public static void main(String[] args){
        String text = "Hello";
        String text1 = new String("Hello1");//constructor
        String text2 = "1" + 2;//cannot do 1+2, can also do "1+2"
        //casts int (or any primitive) to String if you have at least one String literal in the expression
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(1+3+"25");//429
        System.out.println("25"+3+1);//this is 2531 because java executes from left to right,
        //this is the same thing as"25"+"3"+"1"
        System.out.println("25" + (3+8));//because parenthesis force the algebraic expression
        //to be executed first
        System.out.println(1.3000000==1.3);
        String s1= new String("abc");
        String s2 = new String("abc");
        System.out.println(s1==s2); //this is false because each s1 and s2 has difference reference types
        //this is reference

        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3==s4);//true cuz primitive
        //method "equals" allows us to compare the actual content of String objects without
        //knowing anything about their memory location

        System.out.println("abc". equals("abc"));//true
        System.out.println(s1. equals(s2));//true

        //Strings are immutable-cannot modify/change
        //Two types of memory: stack and heap
        //Stack: primitives, int x=5, boolean B=true
        //Heap: string, scanner, student
        //String text = "abcd";
        //text = "cdef";


    }
}
