class CharArithDemo {
    public static void main (String args[]) {
        char ch, ch1;

        ch = 'X';
        ch1 = ch;
        System.out.println("ch has " + ch);

        ch++;
        System.out.println("now ch has " + ch);
        ch1++;
        ch1 = ++ch1;
        //ch = (ch2 - 1);
        System.out.println("++ch1 is " + ch1);

        ch = 90;
        System.out.println("now ch = 90 and its " + ch);
    }
}