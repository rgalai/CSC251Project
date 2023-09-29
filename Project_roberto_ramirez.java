import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The Project_roberto_ramirez class represents a program for reading policy information from a text file
 * and displaying related calculations.
 */
public class Project_roberto_ramirez {
    /**
     * Main method to read policy information from a text file and perform calculations.
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Declare variables to store policy information
        String policyNumber, providerName, firstName, lastName, smokingStatus;
        int age;
        double heightInInches, weightInPounds;

        // Read policy information from the text file
        try (BufferedReader reader = new BufferedReader(new FileReader("PolicyInformation.txt"))) {
            // Read each line from the file
            policyNumber = reader.readLine();
            providerName = reader.readLine();
            firstName = reader.readLine();
            lastName = reader.readLine();
            age = Integer.parseInt(reader.readLine());
            smokingStatus = reader.readLine();
            heightInInches = Double.parseDouble(reader.readLine());
            weightInPounds = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            // Handle file reading errors here
            e.printStackTrace();
            return;
        }

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
    }
}
