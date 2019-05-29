package app;

/**
 * FloatDouble
 */
public class FloatDouble {

    public static void main(String[] args) {
        // Java assumes int and double, so those you need not to cast. However others do have to be casted.
        
        // Float = Single precision && Double = Double precision (Twice the detail than the float)
        int iTemp = 10;

        // As with the long you should denote that it is a Float with an F or f at the end.
        // Same width as int
        // float fTemp = 5.23;
        // If I were to leave it like that I'd have an error, since what Java assumes. It thinks it's a double.
        float fTemp = 5F; // Correct way.
        // float fTemp2 = (float) (5.23); Not that recommended
        
        // As with the long you should denote that it is a Double with a D or d at the end.
        // Width of 64 bits aka 8 bytes
        double dTemp = 5D;
        System.out.println(iTemp + " " + fTemp + " " + dTemp);

        iTemp /= 2;
        fTemp /= 3;
        dTemp /= 3;
        System.out.println(iTemp + " " + fTemp + " " + dTemp);

        System.out.println("Tets");
        fTemp = 0.453_592_37F;
        short sTemp = 200;
        System.out.println("The pounds are: " + iTemp + "\nAnd in kg it is equal to: " + ((double) (sTemp * fTemp)));
    }
}