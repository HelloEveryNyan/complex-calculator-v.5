public class Main {
    public static void main(String[] args) {
        OperationStrategy additionStrategy = new AdditionStrategy();
        OperationStrategy multiplicationStrategy = new MultiplicationStrategy();
        OperationStrategy divisionStrategy = new DivisionStrategy();
        Logger logger = new Logger();

        Calculator additionCalculator = new Calculator(additionStrategy, logger);
        additionCalculator.calculate(new ComplexNumber(2, 3), new ComplexNumber(1, 4));

        Calculator multiplicationCalculator = new Calculator(multiplicationStrategy, logger);
        multiplicationCalculator.calculate(new ComplexNumber(2, 3), new ComplexNumber(1, 4));

        Calculator divisionCalculator = new Calculator(divisionStrategy, logger);
        divisionCalculator.calculate(new ComplexNumber(2, 3), new ComplexNumber(1, 1));
    }
}