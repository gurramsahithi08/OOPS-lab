import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion");
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Convert to (C/F): ");
        char choice = scanner.next().charAt(0);

        double converted;
        String resultUnit;

        if (choice == 'C' || choice == 'c') {
            converted = (temperature - 32) * 5.0 / 9.0;
            resultUnit = "Celsius";
        } else if (choice == 'F' || choice == 'f') {
            converted = (temperature * 9.0 / 5.0) + 32;
            resultUnit = "Fahrenheit";
        } else {
            System.out.println("Invalid choice! Please enter 'C' or 'F'.");
            scanner.close();
            return;
        }

        System.out.println("Converted Temperature: " + converted + " " + resultUnit);
        scanner.close();
    }
}
