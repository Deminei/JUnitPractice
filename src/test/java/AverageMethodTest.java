import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AverageMethodTest {

    @DisplayName("Test sum() method")
    @Test
    void testSum() {
        AverageMethod averageMethod = new AverageMethod();
        double num1 = 2.5;
        double num2 = 3.7;
        double num3 = 1.8;
        double expectedSum = 2.5 + 3.7 + 1.8;
        double actualSum = averageMethod.sum(num1, num2, num3);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @DisplayName("Test average() method")
    @Test
    void testAverage() {
        AverageMethod averageMethod = new AverageMethod();
        double num1 = 2.5;
        double num2 = 3.7;
        double num3 = 1.8;
        double expectedAverage = (2.5 + 3.7 + 1.8) / 3.0;
        double actualAverage = averageMethod.average(num1, num2, num3);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }
}
