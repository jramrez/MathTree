public class MathBiney {
    private Object mathThing;
    private MathBiney leftChild;
    private MathBiney rightChild;
    private MathBiney parent;

    public MathBiney(Double operand, MathBiney parent) {
        mathThing = operand;
        leftChild = null;
        rightChild = null;
        this.parent = parent;
    }

    public MathBiney(String operator, MathBiney parent) {
        mathThing = operator;
        leftChild = null;
        rightChild = null;
        this.parent = parent;
    }

    public void setLeft(MathBiney child) {
        leftChild = child;
    }

    public void setRight(MathBiney child) {
        rightChild = child;
    }

    public Object getValue() {
        return mathThing;
    }

    public MathBiney getRight() {
        return rightChild;
    }
  
    public MathBiney getLeft() {
        return leftChild;
    }
  
    public MathBiney getParent() {
        return parent;
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
