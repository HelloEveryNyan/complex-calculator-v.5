public class DivisionStrategy implements OperationStrategy {
    @Override
    public ComplexNumber performOperation(ComplexNumber c1, ComplexNumber c2) {
        double denominator = Math.pow(c2.getReal(), 2) + Math.pow(c2.getImaginary(), 2);
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        double real = (c1.getReal() * c2.getReal() + c1.getImaginary() * c2.getImaginary()) / denominator;
        double imaginary = (c1.getImaginary() * c2.getReal() - c1.getReal() * c2.getImaginary()) / denominator;
        return new ComplexNumber(real, imaginary);
    }
}