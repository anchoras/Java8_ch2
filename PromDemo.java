/*
    Program demonstrate nececity or unnececity
    of casting between data types in Java
*/

class PromDemo {
    public static void main(String args[]) {
        byte b;
        int i;

        b = 10;
        i = b * b;

        b = (byte) (b * b);

        System.out.println("i and b: " + i + " " + b + "\n");

        char ch1 = 'a', ch2 = 'y', ch3;
        ch3 = (char) ((ch2 + ch1)/2);
        System.out.println("ch1: " + ch1 + " ch2: " + ch2 + " ch3: " + ch3);

        int ch1int, ch2int, ch3int;
        ch1int = (int)ch1;
        ch2int = (int)ch2;
        ch3int = (int)ch3;
        System.out.println("ch1 code is: " + ch1int + "  ch2 code is: " + ch2int + "  ch3 code is: " + ch3int);
    }
}