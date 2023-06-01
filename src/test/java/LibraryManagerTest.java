import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class LibraryManagerTest {

    private LibraryManager libraryManager;

    @BeforeEach//Initializes fresh instance of LibraryManager before each test method
    void setup() {
        libraryManager = new LibraryManager();
    }

    @DisplayName("Test addItem() method")
    @Test
    void testAddItem() {
        //Test 1
        String item1 = "Book";
        libraryManager.addItem(item1);
        Assertions.assertTrue(libraryManager.getItems().contains(item1));

        //Test 2
        String item2 = "DVD";
        libraryManager.addItem(item2);
        Assertions.assertTrue(libraryManager.getItems().contains(item2));
    }

    @DisplayName("Test removeItem() method")
    @Test
    void testRemoveItem() {
        //Adds items to library first
        String item1 = "Book";
        String item2 = "DVD";
        libraryManager.addItem(item1);
        libraryManager.addItem(item2);

        //Test  1
        libraryManager.removeItem(item1);
        Assertions.assertFalse(libraryManager.getItems().contains(item1));

        //Test 2
        libraryManager.removeItem(item2);
        Assertions.assertFalse(libraryManager.getItems().contains(item2));
    }
}
