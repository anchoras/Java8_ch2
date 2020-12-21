/*
    This program's purpose is showing
    table of logical interactions in Java
*/

class LogicalOpTable {
    public static void main(String args[]) {
        boolean p, q;
        int pANDq, pORq, pXORq, NOp, pi, qi;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;
        q = true;
        if (true) {
            if (q) {
                qi = 1;
            }
            else {
                qi = 0;
            }

            if (p&q) {
                pANDq = 1;
            }
            else {
                pANDq = 0;
            }
           
            if (p|q) {
                pORq = 1;
            }
            else {
                pORq = 0;
            }
            
            if (p^q) {
                pXORq = 1;
            }
            else {
                pXORq = 0;
            }

            if (!p) {
                NOp = 1;
                pi = 0;
            }
            else {
                NOp = 0;
                pi = 1;
            }
        }
        System.out.print(pi + "\t" + qi + "\t");
        System.out.print(pANDq + "\t" + pORq + "\t");
        System.out.println(pXORq + "\t" + NOp);

        p = true;
        q = false;
        if (true) {
            if (q) {
                qi = 1;
            }
            else {
                qi = 0;
            }

            if (p&q) {
                pANDq = 1;
            }
            else {
                pANDq = 0;
            }
           
            if (p|q) {
                pORq = 1;
            }
            else {
                pORq = 0;
            }
            
            if (p^q) {
                pXORq = 1;
            }
            else {
                pXORq = 0;
            }

            if (!p) {
                NOp = 1;
                pi = 0;
            }
            else {
                NOp = 0;
                pi = 1;
            }
        }
        System.out.print(pi + "\t" + qi + "\t");
        System.out.print(pANDq + "\t" + pORq + "\t");
        System.out.println(pXORq + "\t" + NOp);

        p = false;
        q = true;
        if (true) {
            if (q) {
                qi = 1;
            }
            else {
                qi = 0;
            }

            if (p&q) {
                pANDq = 1;
            }
            else {
                pANDq = 0;
            }
           
            if (p|q) {
                pORq = 1;
            }
            else {
                pORq = 0;
            }
            
            if (p^q) {
                pXORq = 1;
            }
            else {
                pXORq = 0;
            }

            if (!p) {
                NOp = 1;
                pi = 0;
            }
            else {
                NOp = 0;
                pi = 1;
            }
        }
        System.out.print(pi + "\t" + qi + "\t");
        System.out.print(pANDq + "\t" + pORq + "\t");
        System.out.println(pXORq + "\t" + NOp);

        p = false;
        q = false;
        if (true) {
            if (q) {
                qi = 1;
            }
            else {
                qi = 0;
            }

            if (p&q) {
                pANDq = 1;
            }
            else {
                pANDq = 0;
            }
           
            if (p|q) {
                pORq = 1;
            }
            else {
                pORq = 0;
            }
            
            if (p^q) {
                pXORq = 1;
            }
            else {
                pXORq = 0;
            }

            if (!p) {
                NOp = 1;
                pi = 0;
            }
            else {
                NOp = 0;
                pi = 1;
            }
        }
        System.out.print(pi + "\t" + qi + "\t");
        System.out.print(pANDq + "\t" + pORq + "\t");
        System.out.println(pXORq + "\t" + NOp);
    }
}