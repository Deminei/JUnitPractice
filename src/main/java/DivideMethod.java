import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        float num1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter the second number:");
        float num2 = Float.parseFloat(scanner.nextLine());

        DivideMethod divideMethod = new DivideMethod();
        float result = divideMethod.divide(num1, num2);
        System.out.println(result);
    }

    public float divide(float num1, float num2) {
        return num1 / num2;
    }
}






