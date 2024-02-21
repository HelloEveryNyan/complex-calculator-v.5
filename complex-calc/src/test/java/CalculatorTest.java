import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator(new AdditionStrategy(), new Logger());
        ComplexNumber result = calculator.calculate(new ComplexNumber(2, 3), new ComplexNumber(1, 4));
        assertEquals(new ComplexNumber(3, 7), result);
    }

    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator(new MultiplicationStrategy(), new Logger());
        ComplexNumber result = calculator.calculate(new ComplexNumber(2, 3), new ComplexNumber(1, 4));
        assertEquals(new ComplexNumber(-10, 11), result);
    }

    @Test
    void testDivision() {
        Calculator calculator = new Calculator(new DivisionStrategy(), new Logger());
        ComplexNumber result = calculator.calculate(new ComplexNumber(2, 3), new ComplexNumber(1, 1));
        assertEquals(new ComplexNumber(2.5, 0.5), result);
    }
}