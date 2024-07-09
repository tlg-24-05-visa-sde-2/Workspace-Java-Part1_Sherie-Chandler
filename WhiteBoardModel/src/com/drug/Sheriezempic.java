package com.drug;

class Sheriezempic {
    // Properties or Attributes (with Data Encapsulation)
    private int strengthMilligrams = 100;
    private String activeIngredient = "Sheriechandolariem";
    private String sideEffects = "May cause sounds of clucking like a chicken during sleep";
    private String adverseReaction = "May change body odor to scents of Jasmine, Oud, or Bergamot";
    private String sigRX = "Take 1 tablet by mouth daily with 8 ounces of water containing olive oil";
    private String mechanismOfAction = "Sheriechandolariemase binds to leptin receptors in the hypothalamus, which leads to decreased food intake";
    private AdverseReactionSeverity adverseReactionSeverity;

    public static final int MIN_STRENGTH = 100;
    public static final int MAX_STRENGTH = 300;

    // Enum for Adverse Reaction Severity--ask if this is the correct place to put this or if it should be in its own file
    public enum AdverseReactionSeverity {
        MILD, MODERATE, SEVERE
    }

    // Constructors
    public Sheriezempic() {
        this(100, "Sheriechandolariem", "May cause sounds of clucking like a chicken during sleep", "May change body odor to scents of Jasmine, Oud, or Bergamot");
    }

    public Sheriezempic(int strengthMilligrams, String activeIngredient) {
        this();
        setStrengthMilligrams(strengthMilligrams);
        setActiveIngredient(activeIngredient);
    }

    public Sheriezempic(int strengthMilligrams, String activeIngredient, String sideEffects, String adverseReaction) {
        setStrengthMilligrams(strengthMilligrams);
        setActiveIngredient(activeIngredient);
        setSideEffects(sideEffects);
        setAdverseReaction(adverseReaction);
    }

    // Methods
    public void displayDrugInfo() {
        System.out.println("Drug Information:");
        System.out.println("Active Ingredient: " + activeIngredient);
        System.out.println("Strength: " + strengthMilligrams + "mg");
        System.out.println("Patient Instructions: " + sigRX);
        System.out.println("How does Sheriezempic work?: " + mechanismOfAction);
    }

    public void displaySideEffects() {
        System.out.println("Potential Side Effect: " + sideEffects);
        if (adverseReactionSeverity != null) {
            switch (adverseReactionSeverity) {
                case MILD:
                    System.out.println("Adverse Reaction Mild: " + adverseReaction);
                    break;
                case MODERATE:
                    System.out.println("Adverse Reaction Moderate: " + adverseReaction);
                    break;
                case SEVERE:
                    System.out.println("Adverse Reaction Severe: " + adverseReaction);
                    break;
            }
        }
    }

    // Getters and Setters
    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    public int getStrengthMilligrams() {
        return strengthMilligrams;
    }
    // now you need to creat a customer error
    // throw has to be followed by an object (new type) vs throws is followed by a class (reread chap 11 and review w3schools)

    public void setStrengthMilligrams(int strengthMilligrams) {
        if (strengthMilligrams >= MIN_STRENGTH && strengthMilligrams <= MAX_STRENGTH) {
            this.strengthMilligrams = strengthMilligrams;
        } else {
            throw new IllegalArgumentException("Strength must be between " + MIN_STRENGTH + " and " + MAX_STRENGTH);
        }
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }

    public String getAdverseReaction() {
        return adverseReaction;
    }

    public void setAdverseReaction(String adverseReaction) {
        this.adverseReaction = adverseReaction;
    }

    public AdverseReactionSeverity getAdverseReactionSeverity() {
        return adverseReactionSeverity;
    }

    public void setAdverseReactionSeverity(AdverseReactionSeverity adverseReactionSeverity) {
        this.adverseReactionSeverity = adverseReactionSeverity;
    }


    public String toString() {
        return String.format("Sheriezempic{activeIngredient='%s', strengthMilligrams=%d, sideEffects='%s', adverseReaction='%s', sigRX='%s', mechanismOfAction='%s', adverseReactionSeverity=%s}",
                activeIngredient, strengthMilligrams, sideEffects, adverseReaction, sigRX, mechanismOfAction, adverseReactionSeverity);
    }
}