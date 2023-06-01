public class MethodReturnTypes {
    public static void main(String[] args) {
        MethodReturnTypes methodReturnTypes = new MethodReturnTypes();
        System.out.println(methodReturnTypes.getString());
        System.out.println(methodReturnTypes.getInteger());
        System.out.println(methodReturnTypes.getBoolean());
    }

    public String getString() {
        return "String for you";
    }

    public int getInteger() {
        return 42;
    }

    public boolean getBoolean() {
        return true;
    }
}

