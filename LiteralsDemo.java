/*
    trying out literals
    Seriously: just trying
*/


class LiteralsDemo {
    public static void main (String args[]) {
        int a = 0b1101010110;
        int b = 012314;
        int c = 456;
        int d = 0x141D12;
        System.out.println("a in binary is: " + Integer.toBinaryString(a));
        System.out.printf("b in octo is: %o", b);   System.out.println();
        System.out.println("c from decimal to decimal is: " + c);
        System.out.println("d from hex to decimal is: " + d);  
        System.out.println("\u5666");
    }
}