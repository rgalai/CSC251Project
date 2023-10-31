/**
 * The PolicyHolder class represents a policy holder with various attributes and methods related to the policy holder.
 */
public class PolicyHolder {


    // Attributes related to the policy holder
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double heightInInches;
    private double weightInPounds;

    // Constructors for PolicyHolder class
    public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double heightInInches, double weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    // Getters and setters for PolicyHolder class

    // Methods related to the policy holder
    public double calculateBMI() {
        return (weightInPounds * 703) / (heightInInches * heightInInches);
    }

    // Additional methods related to the policy holder if needed

    // toString method for PolicyHolder class if needed

    // Methods from Policy class that are directly related to the policy holder
    public double calculateInsurancePrice() {
        // Implement the logic for calculating insurance price using policy holder attributes
        // You can access the attributes using this.firstName, this.lastName, etc.
        // You may also want to move the constants like BASE_FEE, AGE_FEE, etc., to this class if they are needed for calculations.
        // Return the calculated price.
        return 0.0; // Placeholder, implement the actual logic here
    }
    
    

    /**
     * Returns a string representation of the PolicyHolder object
     *
     * @return A string representation of the PolicyHolder object
     */
    @Override
    public String toString() {
        // Provide a string representation of the PolicyHolder object
        return "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Smoking Status: " + smokingStatus + "\n" +
                "Height: " + heightInInches + " inches\n" +
                "Weight: " + weightInPounds + " pounds";
    }
    
        public int getAge() {
        return age;
    }
    
        public String getSmokingStatus() {
        return smokingStatus;
    }
    
    
    
}