package JavaCore.Predavanje4;

public class Main {
    public static void main(String[] args) {
        Kalkulator kal = new Kalkulator();
        kal.operand1=20.5;
        kal.operand2= 30.5;
        System.out.println(kal.add(kal.operand1, kal.operand2));
        System.out.println(kal.div(kal.operand1, kal.operand2));
        System.out.println(kal.sub(kal.operand1, kal.operand2));
        System.out.println(kal.mul(kal.operand1, kal.operand2));
    }
}
