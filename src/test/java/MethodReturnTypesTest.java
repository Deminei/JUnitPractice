import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MethodReturnTypesTest {

    private final MethodReturnTypes methodReturnTypes = new MethodReturnTypes();

    @DisplayName("Test getString() method")
    @Test
    void testGetString() {
        String expected = "String for you";
        String actual = methodReturnTypes.getString();
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Test getInteger() method")
    @Test
    void testGetInteger() {
        int expected = 42;
        int actual = methodReturnTypes.getInteger();
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Test getBoolean() method")
    @Test
    void testGetBoolean() {
        boolean expected = true;
        boolean actual = methodReturnTypes.getBoolean();
        Assertions.assertEquals(expected, actual);
    }
}
