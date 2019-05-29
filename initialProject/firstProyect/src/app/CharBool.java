package app;

/**
 * CharBool
 */
public class CharBool {

    public static void main(String[] args) {

        // Width of 16 aka 2 bytes
        char cTemp = 'd';
        // You can use unicode in Java, by using "\" followed by the code.
        char cUnicode = '\u00AE';
        System.out.println(cTemp + " " + cUnicode);

        // No use of int values to assign.
        boolean bTemp = true;
        boolean bTemp2 = false;

        System.out.println(bTemp + " " + bTemp2);
    }
}