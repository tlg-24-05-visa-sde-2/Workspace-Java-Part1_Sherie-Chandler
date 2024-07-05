// This code was designed to inform the medical community of the groundbreaking drug Sheriezempic that is designed to decrease morbid obesity in patients with BMIs exceeding 40, its implications, and chemical makeup.

class Sheriezempic {
    // Properties or Attributes (with Data Encapsulation)
    private String activeIngredient = "Sheriechandolariem";
    private int strengthMilligrams = 100;
    private String sideEffects = "May cause sounds of clucking like a chicken during sleep";
    private String adverseReaction = "May change body odor to scents of Jasmine, Oud, or Bergamot";
    private String sigRX = "Take 1 tablet by mouth daily with 8 ounces of water containing olive oil";
    private String mechanismOfAction = "Sheriechandolariemase binds to leptin receptors in the hypothalamus, which leads to decreased food intake";
    private AdverseReactionSeverity adverseReactionSeverity;

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
        if (adverseReactions) {
            switch (adverseReactionSeverity) {
                case Mild:
                    System.out.println("Adverse Reaction Mild: " + sideEffects);
                    break;
                case Moderate:
                    System.out.println("Adverse Reaction Moderate: " + sideEffects);
                    break;
                case Severe:
                    System.out.println("Adverse Reaction Severe: " + sideEffects + ", " + adverseReactions);
                    break;
            }
        }
    }

    // Constructors
    public Sheriezempic(AdverseReactionSeverity severity) {
        this.adverseReactionSeverity = severity;
    }

    // Business or Action Methods

    // Data Validation

    // Data Encapsulation: getters and setters
    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    public int getStrengthMilligrams() {
        return strengthMilligrams;
    }

    public void setStrengthMilligrams(int strengthMilligrams) {
        this.strengthMilligrams = strengthMilligrams;
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

    public String getSigRX() {
        return sigRX;
    }

    public void setSigRX(String sigRX) {
        this.sigRX = sigRX;
    }

    public String getMechanismOfAction() {
        return mechanismOfAction;
    }

    public void setMechanismOfAction(String mechanismOfAction) {
        this.mechanismOfAction = mechanismOfAction;
    }

    public AdverseReactionSeverity getAdverseReactionSeverity() {
        return adverseReactionSeverity;
    }

    public void setAdverseReactionSeverity(AdverseReactionSeverity adverseReactionSeverity) {
        this.adverseReactionSeverity = adverseReactionSeverity;
    }


    @Override
    public String toString() {
        return String.format("Sheriezempic{activeIngredient='%s', strengthMilligrams=%d, sideEffects='%s', adverseReaction='%s', sigRX='%s', mechanismOfAction='%s', adverseReactionSeverity=%s}",
                activeIngredient, strengthMilligrams, sideEffects, adverseReaction, sigRX, mechanismOfAction, adverseReactionSeverity);
    }

}
}
