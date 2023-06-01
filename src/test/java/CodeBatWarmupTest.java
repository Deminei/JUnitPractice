import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CodeBatWarmupTest {

    private final CodeBatWarmup codeBatWarmup = new CodeBatWarmup();

    @DisplayName("Test diff21() method")
    @Test
    void testDiff21() {
        int n1 = 10;
        int expected = 11;
        int actual = codeBatWarmup.diff21(n1);
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Test nearHundred() method")
    @Test
    void testNearHundred() {
        //Test 1
        int n1 = 90;
        boolean expected1 = true;
        boolean actual1 = codeBatWarmup.nearHundred(n1);
        Assertions.assertEquals(expected1, actual1);

        //Test 2
        int n2 = 150;
        boolean expected2 = false;
        boolean actual2 = codeBatWarmup.nearHundred(n2);
        Assertions.assertEquals(expected2, actual2);
    }

    @DisplayName("Test notString() method")
    @Test
    void testNotString() {
        //Test 1
        String str1 = "hello";
        String expected1 = "not hello";
        String actual1 = codeBatWarmup.notString(str1);
        Assertions.assertEquals(expected1, actual1);

        //Test 2
        String str2 = "not bad";
        String expected2 = "not bad";
        String actual2 = codeBatWarmup.notString(str2);
        Assertions.assertEquals(expected2, actual2);
    }
}
