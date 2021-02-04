package JavaCore.Predavanje6.IfElse;

public class Kalkulator {

    public void rezultat (String operator, double operand1, double operand2) {


        if (operator == "+") {
            System.out.println(operand1 + operand2);

        } else if (operator == "-") {
            System.out.println(operand1 - operand2);

        } else if (operator == "*") {
            System.out.println(operand1 * operand2);

        } else
            System.out.println(operand1 / operand2);
    }
}
