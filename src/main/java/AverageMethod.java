import java.util.Scanner;

public class AverageMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the second number:");
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the third number:");
        double num3 = Double.parseDouble(scanner.nextLine());

        AverageMethod averageMethod = new AverageMethod();
        double average = averageMethod.average(num1, num2, num3);
        System.out.println("The average is: " + average);
    }

    public double sum(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public double average(double num1, double num2, double num3) {
        return sum(num1, num2, num3) / 3.0;
    }
}
