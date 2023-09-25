public class Policy {

    // Attributes
    private String policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String policyholderSmokingStatus;
    private double policyholderHeightInInches;
    private double policyholderWeightInPounds;

    // Constants for pricing
    private static final double BASE_FEE = 600.0;
    private static final double AGE_FEE = 75.0;
    private static final double SMOKER_FEE = 100.0;
    private static final double BMI_THRESHOLD = 35.0;
    private static final double BMI_FEE_PER_UNIT = 20.0;

    // Constructor with default values
    public Policy() {
        // Initialize all fields with default values
        policyNumber = "";
        providerName = "";
        policyholderFirstName = "";
        policyholderLastName = "";
        policyholderAge = 0;
        policyholderSmokingStatus = "";
        policyholderHeightInInches = 0.0;
        policyholderWeightInPounds = 0.0;
    }

    // Constructor with arguments to fully initialize the Policy object
    public Policy(String policyNumber, String providerName, String policyholderFirstName,
                  String policyholderLastName, int policyholderAge, String policyholderSmokingStatus,
                  double policyholderHeightInInches, double policyholderWeightInPounds) {
        // Initialize the fields with provided values
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyholderFirstName = policyholderFirstName;
        this.policyholderLastName = policyholderLastName;
        this.policyholderAge = policyholderAge;
        this.policyholderSmokingStatus = policyholderSmokingStatus;
        this.policyholderHeightInInches = policyholderHeightInInches;
        this.policyholderWeightInPounds = policyholderWeightInPounds;
    }

    // Getters and Setters for all fields
    // ...

    // Calculate and return the BMI of the policyholder
    public double calculateBMI() {
        return (policyholderWeightInPounds * 703) / (policyholderHeightInInches * policyholderHeightInInches);
    }

    // Calculate and return the price of the insurance policy
    public double calculateInsurancePrice() {
        double price = BASE_FEE;

        // Additional fee if the policyholder is over 50 years old
        if (policyholderAge > 50) {
            price += AGE_FEE;
        }

        // Additional fee if the policyholder is a smoker
        if ("smoker".equalsIgnoreCase(policyholderSmokingStatus)) {
            price += SMOKER_FEE;
        }

        // Calculate BMI and add an additional fee if it's over 35
        double bmi = calculateBMI();
        if (bmi > BMI_THRESHOLD) {
            price += (bmi - BMI_THRESHOLD) * BMI_FEE_PER_UNIT;
        }

        return price;
    }

    @Override
    public String toString() {
        // Provide a string representation of the Policy object
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", providerName='" + providerName + '\'' +
                ", policyholderFirstName='" + policyholderFirstName + '\'' +
                ", policyholderLastName='" + policyholderLastName + '\'' +
                ", policyholderAge=" + policyholderAge +
                ", policyholderSmokingStatus='" + policyholderSmokingStatus + '\'' +
                ", policyholderHeightInInches=" + policyholderHeightInInches +
                ", policyholderWeightInPounds=" + policyholderWeightInPounds +
                '}';
    }
}
