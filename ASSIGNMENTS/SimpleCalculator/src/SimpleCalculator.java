public class SimpleCalculator {
    private double firstNum, secondNum;

    public SimpleCalculator(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public void add() {
        System.out.println("Addition: " + (firstNum + secondNum));
    }

    public void subtract() {
        System.out.println("Subtraction: " + (firstNum - secondNum));
    }

    public void multiply() {
        System.out.println("Multiplication: " + (firstNum * secondNum));
    }

    public void divide() {
        if (secondNum != 0)
            System.out.println("Division: " + (firstNum / secondNum));
        else
            System.out.println("Error: Cannot divide by zero.");
    }

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator(10, 5);
        calc.add();
        calc.subtract();
        calc.multiply();
        calc.divide();
    }
}
