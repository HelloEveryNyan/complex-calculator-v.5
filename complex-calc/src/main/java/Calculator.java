public class Calculator {
    private final OperationStrategy currentOperationStrategy;
    private final Logger logger;

    public Calculator(OperationStrategy currentOperationStrategy, Logger logger) {
        this.currentOperationStrategy = currentOperationStrategy;
        this.logger = logger;
    }

    public ComplexNumber calculate(ComplexNumber operand1, ComplexNumber operand2) {
        if (currentOperationStrategy == null) {
            throw new IllegalStateException("Operation strategy is not set");
        }

        if (operand1 == null || operand2 == null) {
            throw new IllegalArgumentException("Operands must not be null");
        }

        ComplexNumber result = currentOperationStrategy.performOperation(operand1, operand2);

        logger.log("Operation: " + currentOperationStrategy.getClass().getSimpleName());
        logger.log("Operands: " + operand1.toString() + ", " + operand2.toString());
        logger.log("Result: " + result.toString());

        return result;
    }
}