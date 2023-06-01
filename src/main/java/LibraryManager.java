import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<String> items = new ArrayList<>();

    public ArrayList<String> getItems() {
        return items;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }
}

