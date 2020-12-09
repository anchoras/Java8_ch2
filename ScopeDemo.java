/*
    ScopeDemo
    demonstration of scopes
*/

class ScopeDemo {
    public static void main (String args[]) {
        int x;  //available for entire 'main' area

        x = 10;
        if (x == 10) {  //starting new area
            int y = 20;
            //both 'x' and 'y' are availavle in this block
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100;    //Error! 'y' is not available in this block
        // but 'x' is available still
        System.out.println("x is " + x);
    }
}