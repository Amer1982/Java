package JavaCore.Predavanje7.SwitchCase;

public class Kalkulator {

    public double rezultat(String operator, double operand1, double operand2) {

        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            default:
                return operand1/operand2;
        }
    }
}
