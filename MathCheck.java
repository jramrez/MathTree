public class MathCheck {

    //Previously featured on StackMath
    public static double returnResult(String s, double num1, double num2) {  
        switch (s) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            case "%":
                return num1 % num2;
            default:
                return -1;
        }
    }

    public static boolean ifOperator(String s) {
        String[] oparray = {"+","-","*","/","%"};

        for (String p : oparray) {
            if (s.equals(p)) {
                return true;
            }
        }
        return false;
    }
}
