class Sheriezempic
    // Properties or Attributes (with Data Encapsulation)
    private String activeIngredient = "Sheriechandolariem";
    private int strengthMilligrams = 100;
    private String sideEffects = "May cause sounds of clucking like a chicken during sleep";
    private boolean adverseReactions = "May change body odor.";
    private String sigRX= "Take 1 tablet by mouth daily with 8 ounces of water containing olive oil";
    private String mechanismOfAction = "Sheriechandolariemase binds to leptin receptors in the hypothalamus, which leads to decreased food intake";

    // Methods

    public void displayDrugInfo() {
        System.out.println("Drug Information:");
        System.out.println("Active Ingredient:" + activeIngredient);
        System.out.println("Strength:" + strengthMilligrams + "mg");
        System.out.println("Patient Instructions: " + sigRX);
       System.out.println("How does Sheriezempic work?:" + mechanismOfAction);
    }

    public void displaySideEffects () { // write an if-else statement that if the adverse reaction happens than a potential side effect will be clucking like a chicken.
        System.out.println("Potential Side Effect:" + sideEffects);
        if (adverseReactionOccured) {
            switch (adverseReactionSeverity) {
                case: Mild
                        System.out.println("Adverse Reaction Mild: " + adverseReactions);
                break;

                switch (adverseReactionSeverity) {
                    case: Moderate
                        System.out.println("Adverse Reaction Moderate: " + sideEffects);
                        break;

                    switch (adverseReactionSeverity) {
                        case: Severe
                            System.out.println("Adverse Reaction Severe: " + sideEffects + adverseReactions));
                            break;
    }

public void

    // Constructors

    // Business or Action Methods: add enum (double check placement-maybe it should be under your initial class)
    public enum AdverseReactionSeverity{
        Mild, Moderate, Severe;
    }

    // Data Validation

    // Data Encapsulation: getters and setters

    // toString() Method
}
