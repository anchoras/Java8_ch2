/*
    program for demonstration of casting bewteen data types
*/

class CastDemo {
    public static void main (String args[]) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 1000.0;
        y = 13.0;
        i = (int) (x / y);  //casting double to int
        //System.out.println("Integer value of division x/y is: " + i);

        i = 100;
        b = (byte) i;
        //System.out.println("Value of b is: " + b);

        i = 257;
        b = (byte) i;
        //System.out.println("Value of b is: " + b);

        b = 8;
        ch = (char) b;
        //System.out.println("Value of ch is: " + ch);

        /*
        byte b1 = 9;
        short sh1 = 32100;
        int i1 = 123456789;
        long lo1 = 1234567890;
        System.out.println("Value of b1 is: " + b1);
        System.out.println("Value of sh1 is: " + sh1);
        System.out.println("Value of i1 is: " + i1);
        System.out.println("Value of lo1 is: " + lo1);

        sh1 = (short)i1;
        System.out.println("Value of new sh1 is: " + sh1);
        */

        float f1 = 13;
        double d1 = 1123.4567896;
        f1 = (float) d1;
        System.out.println("Value of f1 is: " + f1);
    }
}