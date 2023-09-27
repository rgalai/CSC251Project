import java.util.Scanner;

/**
 * The Project_roberto_ramirez class represents a program for collecting and displaying
 * policy information and related calculations.
 */
public class Project_roberto_ramirez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter policy information
        System.out.println("Enter Policy Information:");

        // Input for Policy Number
        System.out.print("\nPolicy Number: ");
        String policyNumber = scanner.nextLine();

        // Input for Provider Name
        System.out.print("\nProvider Name: ");
        String providerName = scanner.nextLine();

        // Input for Policyholder's First Name
        System.out.print("\nPolicyholder's First Name: ");
        String firstName = scanner.nextLine();

        // Input for Policyholder's Last Name
        System.out.print("\nPolicyholder's Last Name: ");
        String lastName = scanner.nextLine();

        // Input for Policyholder's Age
        System.out.print("\nPolicyholder's Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Input for Policyholder's Smoking Status
        System.out.print("\nPolicyholder's Smoking Status (smoker/non-smoker): ");
        String smokingStatus = scanner.nextLine();

        // Input for Policyholder's Height (in inches)
        System.out.print("\nPolicyholder's Height (in inches): ");
        double heightInInches = scanner.nextDouble();

        // Input for Policyholder's Weight (in pounds)
        System.out.print("\nPolicyholder's Weight (in pounds): ");
        double weightInPounds = scanner.nextDouble();

        // Create an instance of the Policy class using the constructor with arguments
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus,
                heightInInches, weightInPounds);

        // Display policy information
        System.out.println(policy.toString());

        // Calculate and display BMI and insurance price
        double bmi = policy.calculateBMI();
        double insurancePrice = policy.calculateInsurancePrice();
        System.out.println("BMI: " + bmi + "\n");
        System.out.println("Insurance Price: $" + insurancePrice);

        scanner.close();
    }
}
