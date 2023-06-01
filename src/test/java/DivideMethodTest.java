import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DivideMethodTest {

    private final DivideMethod divideMethod = new DivideMethod();

    @DisplayName("Test divide() method")
    @Test
    void testDivide() {
        float num1 = 10.0f;
        float num2 = 2.5f;
        float expected = 4.0f;
        float actual = divideMethod.divide(num1, num2);
        Assertions.assertEquals(expected, actual);
    }
}