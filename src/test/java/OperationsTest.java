import com.company.Operations;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationsTest {

    @DisplayName("Should display the correct result of addition")
    @ParameterizedTest(name = "{index} => firstNumber={0}, secondNumber={1}, result={2}")
    @CsvFileSource(resources = "/testData.csv", numLinesToSkip = 1)
    public void addTest(double firstNumber, double secondNumber, String result) {
        String expectedResult = firstNumber + " + " + secondNumber + " = " + result + System.lineSeparator();
        assertEquals(Operations.add(firstNumber, secondNumber), expectedResult);
    }

    @DisplayName("Should display the correct result of subtraction")
    @ParameterizedTest(name = "{index} => firstNumber={0}, secondNumber={1}, sum ={2}, result={3}")
    @CsvFileSource(resources = "/testData.csv", numLinesToSkip = 1)
    public void subtractTest(double firstNumber, double secondNumber, double sum , String result) {
        String expectedResult = firstNumber + " - " + secondNumber + " = " + result + System.lineSeparator();
        assertEquals(Operations.subtract(firstNumber, secondNumber), expectedResult);
    }

    @DisplayName("Should display the correct result of multiplication")
    @ParameterizedTest(name = "{index} => firstNumber={0}, secondNumber={1}, result={2}")
    @CsvSource({
            "10, 2, 20.0 ",
            "20, 5, 100.0"
    })
    public void multiplyTest(double firstNumber, double secondNumber, String result) {
        String expectedResult = firstNumber + " * " + secondNumber + " = " + result + System.lineSeparator();
        assertEquals(Operations.multiply(firstNumber, secondNumber), expectedResult);
    }

    @DisplayName("Should display the correct result of division")
    @ParameterizedTest(name = "{index} => firstNumber={0}, secondNumber={1}, result={2}")
    @CsvSource({
            "10, 2, 5.0 ",
            "20, 5, 4.0",
            "-20, 0, -Infinity",
            "20, 0, Infinity"
    })
    public void divideTest(double firstNumber, double secondNumber, String result) {
        String expectedResult = firstNumber + " / " + secondNumber + " = " + result + System.lineSeparator();
        assertEquals(Operations.divide(firstNumber, secondNumber), expectedResult);
    }
}
