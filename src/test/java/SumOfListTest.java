import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class SumOfListTest {

    @DisplayName("Test getSum() method")
    @Test
    void testGetSum() {
        //Test 1
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int expected1 = 15;
        int actual1 = SumOfList.getSum(numbers1);
        Assertions.assertEquals(expected1, actual1);

        //Test 2
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(10, -5, 8, -3));
        int expected2 = 10;
        int actual2 = SumOfList.getSum(numbers2);
        Assertions.assertEquals(expected2, actual2);
    }
}
