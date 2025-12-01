package Unit4;

public class NestedLoopsLab {
    public static void main(String[] args) {
        System.out.println(countMatchingPairs("abcd efgh"));

        for (int i = 1;i<5;i++){
            for(int j = 1;j<=i;j++){
                System.out.println(i);
            }
            System.out.println();
        }
        System.out.println(countTriple("xaabbb"));
    }
    public static int countMatchingPairs(String word){
        int pairs = 0;
        for(int i = 0;i<word.length();i++){
            String current = word.substring(i,i+1);
            for (int j=i+1;j<word.length();j++){
                String next = word.substring(j,j+1);
                if (current.equals(next)){
                    pairs++;
                }
            }
        }
        return pairs;
    }
    public static int countTriple(String str){
        int triples = 0;
        for(int i = 0;i<str.length()-2;i++){
            String current = str.substring(i,i+1);
            int count = 0;
            for(int j = i;j<i+3;j++){
                String next = str.substring(j,j+1);
                if(current.equals(next)){
                    count++;
                }
            }
            if(count==2){
                triples++;
            }
        }
        return triples;
    }

}
//int pair = 0;
//        for (int i = 0;i<str.length();i++){ String current = str.substring(i,i+3);{
//        for(int j = i+1;j<str.length();j++){
//String next = str.substring(j,j+1);
//String last = str.substring(j,j+2);
//                if(current.equals(next)&&current.equals(last)){
//pair++;
//        }
//        }
//
//
//        }          }
//
//
//
//
//        return pair;

