/* Program Name: MathTree
 * Program Purpose: Create and solve a math expression within a binary tree
 * Created by: jramrez
 * Last edited By: jramrez 
 */

public class Main {
    public static void main(String[] args) {
        MathBiney root = new MathBiney("+");
        MathBiney current = root;
        current.setLeft(new MathBiney("*"));
        current.setRight(new MathBiney(74.0));
        current = root.getLeft();
        current.setLeft(new MathBiney(20.0));
        current.setRight(new MathBiney(2.0));
        System.out.println(root.solveTree());
    }
}