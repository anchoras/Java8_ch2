/*
    This program shows demo for division by modul
*/

class ModDemo {
    public static void main(String args[]) {
        int iresult, irem;
        double dresult, drem;
        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10.0 / 3.4;
        drem = 10.0 % 3.4;

        System.out.println("result and remind from division 10/3 is: " + iresult + " " + irem);
        System.out.println("result and remind from division 10.0/3.0 is: " + dresult + " " + drem);
    }
}