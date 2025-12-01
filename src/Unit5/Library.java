package Unit5;

public class Library {
    public static void main(String[] args) {
//        Book b = new Book (); //title=null, author=null, year=0
//        //default values for all types
//        //boolean -> false
//        //int -> 0
//        //double -> 0.0
//        //any reference String Scanner, etc. -> null
//        System.out.println(b.title + b.author+b.year);
//        b.title="Title";
//        b.author="hk";
//        b.year=1996;
//        System.out.println(b.title + b.author+b.year);
//
//        b.year=2020;
//        System.out.println(b.title + b.author+b.year);

        Book b = new Book ("Special Relativity", "John Locke", 2028);
        System.out.println(b.getTitle());
        System.out.println(b.getAuthor());
        System.out.println(b.getYear());

        b.setYear(294929);
        System.out.println(b.getTitle());
        System.out.println(b.getAuthor());
        System.out.println(b.getYear());

    }
}
