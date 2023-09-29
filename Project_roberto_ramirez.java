import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The following class represents a program for reading policy information from a text file
 * and displaying insurance calculations based on the file.
 */

public class Project_roberto_ramirez {

    /**
     * Main method to read policy information from a text file and perform calculations.
     * @param args Command-line arguments (not used in this program).
     */

    public static void main(String[] args) {
    // Declare variables to store policy information
        int smokers = 0;
        int nonSmokers = 0;

    // Read policy information from text file
        try (BufferedReader reader = new BufferedReader(new FileReader("PolicyInformation.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String policyNumber = line;
                String providerName = reader.readLine();
                String firstName = reader.readLine();
                String lastName = reader.readLine();
                int age = Integer.parseInt(reader.readLine());
                String smokingStatus = reader.readLine();
                double heightInInches = Double.parseDouble(reader.readLine());
                double weightInPounds = Double.parseDouble(reader.readLine());

                // Count smokers and non-smokers
                if ("smoker".equalsIgnoreCase(smokingStatus)) {
                    smokers++;
                } else if ("non-smoker".equalsIgnoreCase(smokingStatus)) {
                    nonSmokers++;
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

            // Display the number of smokers and non-smokers
            System.out.println("\nNumber of Smokers: " + smokers);
            System.out.println("\nNumber of Non-Smokers: " + nonSmokers);
      
        } catch (IOException | NumberFormatException e) {
        // Handle file reading errors here
            e.printStackTrace();
        }
    }
}
