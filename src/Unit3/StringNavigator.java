package Unit3;

public class StringNavigator {
    public static void main(String[] args) {
        demoSubstring();
        demoIndexOf();

        System.out.println("\n=== Practice ===");
        System.out.println(extractTag("<key>value</key>"));        // expected "value"
        System.out.println(extractTag("<note>todo"));               // expected "" (no closing tag)

        System.out.println(maskWord("monochrome", "mono"));        // expected "****chrome"
        System.out.println(maskWord("analysis", "ly"));            // expected "ana**sis"
        System.out.println(maskWord("puzzle", "zz"));              // expected "pu**le"
        System.out.println(maskWord("binary", "xyz"));             // expected "binary" (not found)
    }

    private static void demoSubstring() {
        String sample = "Ticket#304A";
        System.out.println(sample.substring(0, 6));  // Ticket
        System.out.println(sample.substring(6));     // #304A
        // Reminder: upper bound is exclusive
    }

    private static void demoIndexOf() {
        String info = "name:Grace,year:1843";
        int colon = info.indexOf(":");
        int comma = info.indexOf(",");
        System.out.println(info.substring(colon + 1, comma)); // Grace

        int missing = info.indexOf("@");
        if (missing == -1) {
            System.out.println("No @ symbol found.");
        }
    }

    /**
     * TODO: extract the content between <tag> and </tag>.
     * Return an empty string if the ending tag is missing or positions are invalid.
     */
    public static String extractTag(String xmlLike) {
        int start = xmlLike.indexOf(">");
        int end = xmlLike.indexOf("</");

        if (start == -1 || end == -1 || end <= start) {
            // TODO: find the index of '>' and the index of "</", then use substring.
            return "";
        }

        return xmlLike.substring(start+1, end);
    }

    /**
     * TODO: replace the first occurrence of keyword with asterisks of the same length.
     * Return the original word if keyword is not found.
     */
    public static String maskWord(String word, String keyword) {
        int index = word.indexOf(keyword);
        if (index == -1){
            return word;
        }
        String stars = "*".repeat(keyword.length());
        return word.substring(0,index) + stars + word.substring(index + keyword.length());
        // TODO: combine indexOf with substring pieces to build the masked word.

    }
}
