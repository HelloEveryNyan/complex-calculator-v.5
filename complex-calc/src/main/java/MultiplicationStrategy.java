public class MultiplicationStrategy implements OperationStrategy {
    @Override
    public ComplexNumber performOperation(ComplexNumber c1, ComplexNumber c2) {
        double real = c1.getReal() * c2.getReal() - c1.getImaginary() * c2.getImaginary();
        double imaginary = c1.getReal() * c2.getImaginary() + c1.getImaginary() * c2.getReal();
        return new ComplexNumber(real, imaginary);
    }
}