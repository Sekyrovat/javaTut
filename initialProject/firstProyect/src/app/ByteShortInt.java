package app;

/**
 * ByteShortInt
 */
public class ByteShortInt {

    public static void main(String[] args) {
        // Max 2_147_483_647 Min -2_147_483_648. Width of 32
        int iX = 10;
        int iY = iX/2;
        
        // Max 32767 Min -32768. Twice the size of a byte Width of 16
        short shortTest = 10;
        short newShort = (short) (shortTest/2);
        
        // Max 127 Min 128. Uses a quater of space of integer. Width of 8
        byte byteTest = 10;
        byte newByte = (byte) (byteTest/2);

        // Max 2^63-1 Min 2^63. Width of 64
        // The "L" at the end is to indicate a long value
        long longTest = 10L;
        long newLong = (long) (longTest/9L);

        System.out.println(iX + " " +  byteTest + " " + shortTest + " " + longTest);
        System.out.println(iY + " " + newByte + " " + newShort + " " + newLong);

        System.out.println("test");
        byte b1 = 10;
        short s1 = 20;
        int i1 = 50;
        long l1 = 5000 + (long) (10 * (int) (b1 + s1 + i1));
        // Same as
        // long l1 = 5000 + (10 * (b1 + s1 + i1));
        // Or
        // long l1 = (long) (5000 + (10 * (int) (b1 + s1 + i1)));
        System.out.println(l1);

    }
}