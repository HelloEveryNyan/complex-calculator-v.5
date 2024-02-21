public class AdditionStrategy implements OperationStrategy {
    @Override
    public ComplexNumber performOperation(ComplexNumber c1, ComplexNumber c2) {
        double real = c1.getReal() + c2.getReal();
        double imaginary = c1.getImaginary() + c2.getImaginary();
        return new ComplexNumber(real, imaginary);
    }
}