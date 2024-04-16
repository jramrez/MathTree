/* Program Name: MathTree
 * Program Purpose: Create and solve a math expression within a binary tree
 * Created by: jramrez
 * Last edited By: jramrez 
 */

 import java.util.*;

public class Main {
    public static void main(String[] args) {
        MathBiney root;
        MathBiney current;
        Scanner scan = new Scanner(System.in);
        StringBuilder reverser = new StringBuilder(); //declaring a few variables
        
         // scanner starts here
        System.out.println("Enter a postfix expression to solve using a binary tree:");
        String input = scan.nextLine();
        reverser.append(input);
        reverser.reverse();
        input = reverser.toString();
        scan.close();

        // scanner is closed and reopened to scan what was inputted 
        scan = new Scanner(input);
        String currentSubString = "";
        scan.useDelimiter(" ");
        root = new MathBiney(scan.next(), null);
        current = root;
        while(scan.hasNext()) {
            currentSubString = scan.next();
            if (MathCheck.ifOperator(currentSubString)) {
                if (MathCheck.ifOperator((String)current.getValue())) {
                    if (current.getLeft() == null) {
                        current.setLeft(new MathBiney(currentSubString, current));
                    }
                    else {
                        current.setRight(new MathBiney(currentSubString, current));
                    }
                }
                else {

                }
            }
            else {
                if (MathCheck.ifOperator((String)current.getValue())) {
                    if (current.getLeft() == null) {
                        current.setLeft(new MathBiney(Double.parseDouble(currentSubString), current));
                    }
                    else {
                        current.setRight(new MathBiney(Double.parseDouble(currentSubString), current));
                    }
                }
            }
        }



        
        scan.close();
        System.out.println(root.solveTree());
    }
}