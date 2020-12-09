// BoolDemo

// Demonstration of using boolean variables
class BoolDemo {
    public static void main (String args[]) {
        boolean b;
        b = false;
        System.out.println("Value for b is: " + b);
        b = true;
        System.out.println("Value for b is: " + b);

        if(b) System.out.println("This line is viewed");
        b = false;
        if(b) System.out.println("This line isn't viewed");

        System.out.println("The result of comparation 10>9 is: " + (10>9));
    }
}