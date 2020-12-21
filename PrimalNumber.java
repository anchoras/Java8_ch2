/*
    Program for searching for primal numbers
*/

class PrimalNumber {
    public static void main (String args[]) {
        
        int numberOfPrimals = 0;
        System.out.println("Primal numbers in setted diapason are: ");

        for (int numberBeeingTested = 2; numberBeeingTested <= 100; numberBeeingTested++) {
            //int numberBeeingTested = 2;
            //System.out.print("numberBeeingTested is: " + numberBeeingTested + '\n');

            boolean doingMore = true, printOut = true;
            int numberOfDivisors =  0;
            int divisorOrNot = 2;
            while (doingMore) {
            //for (int i = 2; i <= numberBeeingTested; i++) {
                
                int restedPart = numberBeeingTested % divisorOrNot;
                //System.out.print("numberBeeingTested is: [2]" + numberBeeingTested + '\n');
                //System.out.print("restedPart is: " + restedPart + '\n');
                if (restedPart == 0) {
                    numberOfDivisors = numberOfDivisors + 1;
                    //System.out.print("numberOfDivisors is: " + numberOfDivisors + '\n');
                    if (numberBeeingTested == divisorOrNot * divisorOrNot) {
                        numberOfDivisors = numberOfDivisors + 1;
                    }
                }

                if (numberOfDivisors > 2) {
                    doingMore = false;
                    printOut = false;
                    //System.out.print("number of divisors is more than 2" + '\n');
                }

                if (divisorOrNot == numberBeeingTested) {
                    doingMore = false;
                    //printOut = false;
                    //System.out.print("How we even got there?" + '\n');
                }
                else if (divisorOrNot > numberBeeingTested) {
                    System.out.println("ERROR: testing number range was exceeded!");
                    printOut = false;
                }
                divisorOrNot++;
                //System.out.print("divisorOrNot is: " + divisorOrNot + '\n' + '\n');
            }
            
            if (printOut) {
                numberOfPrimals++;
                System.out.print(numberBeeingTested + " is a primal number" + '\n');
            }
            else {
                //System.out.print(numberBeeingTested + " is NOT a primal number" + '\n');
            }
        }

        if (numberOfPrimals == 0) {
            System.out.println("Ooops... There is no primal number spotted in this diapason");
        }
        else {
            System.out.println("Total number of primal numbers in diapason is: " + numberOfPrimals);
        }
    }
}