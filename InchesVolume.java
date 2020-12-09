class InchesVolume {
    public static void main (String args[]) {
        /*long ci, im;
        im = 5280 * 12;
        ci = im * im * im;
        System.out.println("There are " + ci + " cubic inches in 1 cubic mile");
        */
        double x, y, z;
        x = 3.1;
        y = 4;
        z = Math.sqrt(x*x + y*y);

        System.out.println(x);
        System.out.println(y);
        System.out.println("Length of Hypotenuse is " + z);
    }
}