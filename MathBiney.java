public class MathBiney {
    Object mathThing;
    MathBiney leftChild;
    MathBiney rightChild;

    public MathBiney(Double operand) {
        mathThing = operand;
        leftChild = null;
        rightChild = null;
    }

    public MathBiney(String operator) {
        mathThing = operator;
        leftChild = null;
        rightChild = null;
    }

    public void setLeft(MathBiney child) {
        leftChild = child;
    }

    public void setRight(MathBiney child) {
        rightChild = child;
    }

    public MathBiney getRight() {
        return rightChild;
    }
  
    public MathBiney getLeft() {
        return leftChild;
    }
  

    public Double solveTree() {
        if (mathThing.getClass() == Double.class) {
            return (Double)(mathThing);
        }
        else {
            return MathCheck.returnResult((String)(mathThing),leftChild.solveTree(),rightChild.solveTree());
        }
    }

}
