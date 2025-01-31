
/*
 * *** Zach Kofira | Section 002 ***
 *
 * Homework # 1 (Programming Assignment). This Java class defines some basic
 * manipulation operations on Linked-Lists and Stacks.
 *
 * Additionally, there are two algorithm analysis methods where you need
 * to return a specified number as provided in comments of each method indicating
 * the complexity of the code shown. The testing routine will be looking for a
 * specific number returned.
 */

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int     assignmentScore = 0;
        boolean errorFlag = false;

        System.out.println("\nProgram testing driver starting  ...");

        /**************************************
         *
         * Testing of the LinkedList code.
         *
         ***************************************/


        HW1.LinkedList list1 = new HW1.LinkedList();

        // Insert the values
        list1.sortedInsert(1);
        list1.sortedInsert(2);
        list1.sortedInsert(3);
        list1.sortedInsert(4);
        list1.sortedInsert(1);
        list1.sortedInsert(2);
        list1.sortedInsert(3);
        list1.sortedInsert(4);
        list1.sortedInsert(9);
        list1.sortedInsert(100);
        list1.sortedInsert(35);

        // System.out.println("Starting Linked-Lists testing ...");
        // System.out.println("After initial insertions: " + list1);

        if ( ! list1.toString().equals("[1 1 2 2 3 3 4 4 9 35 100]") ) {
            System.out.println("ERROR 1: Linked-list test failed sorted insertions");
            errorFlag = true;
        }


        list1.removeElementsLT(8);  // remove items with a value less than 8
        if ( ! errorFlag && ! list1.toString().equals("[9 35 100]") ) {
            System.out.println("ERROR 2: Linked-list test failed removing elements LT");
            errorFlag = true;
        }


        list1.removeElement(35);  // remove items with a value of 35
        if ( ! errorFlag && ! list1.toString().equals("[9 100]") ) {
            System.out.println("ERROR 3: Linked-list test failed removing elements equal");
            errorFlag = true;
        }

        // Additional link-list tests
        HW1.LinkedList list2 = new HW1.LinkedList();

        list2.sortedInsert(1003);
        list2.sortedInsert(4004);
        list2.sortedInsert(05);
        list2.sortedInsert(5);
        list2.sortedInsert(59);
        list2.sortedInsert(995);
        list2.sortedInsert(5);

        if ( ! errorFlag && ! list2.toString().equals("[5 5 5 59 995 1003 4004]") ) {
            System.out.println("ERROR 4: Linked-list test failed sorted insertions");
            errorFlag = true;
        }

        list2.removeElement(35);  // remove items with a value of 35
        if ( ! errorFlag && ! list2.toString().equals("[5 5 5 59 995 1003 4004]") ) {
            System.out.println("ERROR 5: Linked-list test failed removing elements equal");
            errorFlag = true;
        }

        list2.removeElement(995);  // remove items with a value of 35
        if ( ! errorFlag && ! list2.toString().equals("[5 5 5 59 1003 4004]") ) {
            System.out.println("ERROR 6: Linked-list test failed removing elements equal");
            errorFlag = true;
        }


        list2.removeElementsLT(35);  // remove items with a value of 35
        if ( ! errorFlag && ! list2.toString().equals("[59 1003 4004]") ) {
            System.out.println("ERROR 7: Linked-list test failed removing elements LT");
            errorFlag = true;
        }

        /*
         * Score the Link-list portion (max points 25)
         */

        if ( ! errorFlag )
            assignmentScore += 25;
        else
            errorFlag = false;


        /**************************************
         *
         * Testing of isPalindrone code.
         *
         ***************************************/

        // System.out.println("Starting isPalindrone testing ...");

        if ( ! HW1.Stacks.isPalindrome("Was it a car or a cat I saw")) {
            System.out.println("ERROR 8: ispalindrome test failed");
            errorFlag = true;
        }

        if ( ! errorFlag && ! HW1.Stacks.isPalindrome("Race Car")) {
            System.out.println("ERROR 9: ispalindrome test failed");
            errorFlag = true;
        }

        if ( ! errorFlag && ! HW1.Stacks.isPalindrome("Never odd or even")) {
            System.out.println("ERROR 10: ispalindrome test failed");
            errorFlag = true;
        }

        if ( ! errorFlag && HW1.Stacks.isPalindrome("civic2")) {
            System.out.println("ERROR 11: ispalindrome test failed");
            errorFlag = true;
        }

        /*
         * Score the isPalindrome portion (max points 25)
         */

        if ( ! errorFlag )
            assignmentScore += 25;
        else
            errorFlag = false;


        /**************************************
         *
         * Testing of findLargestK code.
         *
         ***************************************/

        // System.out.println("Starting findLargestK testing ...");

        Stack<Integer> myStack = new Stack<>();
        myStack.push(5);
        myStack.push(3);
        myStack.push(1);
        myStack.push(4);
        myStack.push(1);

        // System.out.println(myStack);

        if ( HW1.Stacks.findLargestK(myStack, 1) != 4) {
            System.out.println("ERROR 12: findLargestk test failed");
            errorFlag = true;
        }

        if ( ! errorFlag && HW1.Stacks.findLargestK(myStack, 5) != 0) {
            System.out.println("ERROR 13: findLargestk test failed");
            errorFlag = true;
        }

        if ( ! errorFlag && HW1.Stacks.findLargestK(myStack, 4) != 3) {
            System.out.println("ERROR 14: findLargestk test failed");
            errorFlag = true;
        }

        /*
         * Score the findLargestK portion (max points 26)
         */

        if ( ! errorFlag )
            assignmentScore += 26;
        else
            errorFlag = false;


        /**************************************
         *
         * Testing of the algorithm analysis.
         *
         ***************************************/

        System.out.println("\nThe algorithm analysis testing skipped (12 points each, total 24 points) ...");

        if ( HW1.algorithmAnalysis1(5,5) != 3 ) {
            System.out.println("ERROR 15: algorithmAnalysis1 test failed");
            errorFlag = true;
        }

        if ( ! errorFlag )
            assignmentScore += 12;
        else
            errorFlag = false;

        if ( HW1.algorithmAnalysis2(2) != 2 ) {
            System.out.println("ERROR 16: algorithmAnalysis1 test failed");
            errorFlag = true;
        }

        if ( ! errorFlag )
            assignmentScore += 12;
        else
            errorFlag = false;

        System.out.println("\nTesting complete. Assignment 1 Score is: " + assignmentScore );
    }
}

