/**
 * The Policy class represents an insurance policy with various attributes and methods
 */
public class Policy {

    // Attributes

    /** The policy number of the insurance policy. */
    private String policyNumber;

    /** The name of the insurance provider. */
    private String providerName;

    /** The first name of the policyholder. */
    private String policyholderFirstName;

    /** The last name of the policyholder. */
    private String policyholderLastName;

    /** The age of the policyholder. */
    private int policyholderAge;

    /** The smoking status of the policyholder. */
    private String policyholderSmokingStatus;

    /** The height of the policyholder in inches. */
    private double policyholderHeightInInches;

    /** The weight of the policyholder in pounds. */
    private double policyholderWeightInPounds;

    // Constants for pricing

    /** The base fee for the insurance policy. */
    private static final double BASE_FEE = 600.0;

    /** The additional fee per year of age for the policyholder. */
    private static final double AGE_FEE = 75.0;

    /** The additional fee for smokers. */
    private static final double SMOKER_FEE = 100.0;

    /** The BMI threshold for an additional fee. */
    private static final double BMI_THRESHOLD = 35.0;

    /** The fee per BMI unit above the threshold. */
    private static final double BMI_FEE_PER_UNIT = 20.0;

    // Constructors

    /**
     * Constructs a new Policy object with default values for all attributes
     */
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

    /**
     * Constructs a new Policy object with the provided values for all attributes
     *
     * @param policyNumber             The policy number.
     * @param providerName            The name of the insurance provider
     * @param policyholderFirstName   The first name of the policyholder
     * @param policyholderLastName    The last name of the policyholder
     * @param policyholderAge         The age of the policyholder
     * @param policyholderSmokingStatus The smoking status of the policyholder
     * @param policyholderHeightInInches The height of the policyholder in inches
     * @param policyholderWeightInPounds The weight of the policyholder in pounds
     */
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

    // Methods

    /**
     * Calculates and returns the Body Mass Index (BMI) of the policyholder
     *
     * @return The BMI of the policyholder
     */
    public double calculateBMI() {
        return (policyholderWeightInPounds * 703) / (policyholderHeightInInches * policyholderHeightInInches);
    }

    /**
     * Calculates and returns the price of the insurance policy based on various factors
     *
     * @return The price of the insurance policy
     */
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

    /**
     * Returns a string representation of the Policy object
     *
     * @return A string representation of the Policy object
     */
     
    @Override
    public String toString() {
        // Provide a string representation of the Policy object
        return "" +
                "\nPolicy Number: " + policyNumber + "\n" + "\n" +
                "Provider Name: " + providerName + "\n" + "\n" +
                "Policyholder's FirstName: " + policyholderFirstName + "\n"  + "\n"+
                "Policyholder's LastName: " + policyholderLastName + "\n"  + "\n"+
                "Policyholder's Age:" + policyholderAge + "\n" + "\n" +
                "Policyholder's Smoking Status: " + policyholderSmokingStatus + "\n" + "\n" +
                "Policyholder's Height: " + policyholderHeightInInches + "\n" + "\n" +
                "Policyholder's Weight: " + policyholderWeightInPounds + "\n"
                ;
    }
}
