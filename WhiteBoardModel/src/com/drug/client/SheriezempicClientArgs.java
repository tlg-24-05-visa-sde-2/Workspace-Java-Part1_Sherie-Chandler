package com.drug;

public class SheriezempicClientArgs {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Could you ask the pharmacist to confirm the strength of this Schedule II weight loss drug and possible adverse reactions?");
            System.out.println("Usage: Attention prescriber, Sheriezempic is currently available in 100mg and 300mg (the 200 mg is currently on backorder). Vanderbilt's clinical trial confirmed that patients " +
                    "with high levels of melanin are more likely to experience changes in their body chemistry and sleep talking, such as clucking like a chicken. ");
            return;
        }

        int strengthMilligrams;
        Sheriezempic.AdverseReactionSeverity severity;

        try {
            strengthMilligrams = Integer.parseInt(args[0]);
            severity = Sheriezempic.AdverseReactionSeverity.valueOf(args[1].toUpperCase());
        } catch (NumberFormatException e) {
            System.out.println("Attention prescriber the strength for Sheriezempic in milligrams is invalid.. It must be an integer.");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println("Warning prescriber, the adverse reaction value is invalid.. It must be one of the following: MILD, MODERATE, SEVERE.");
            return;
        }


        Sheriezempic drug = new Sheriezempic();
        try {
            drug.setStrengthMilligrams(strengthMilligrams);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        drug.setAdverseReactionSeverity(severity);

        // This is for the side effects and adverse reactions based on strengthMilligrams of the Rx.
        if (strengthMilligrams == 100) {
            drug.setSideEffects("May cause sounds of clucking like a chicken during sleep");
        } else if (strengthMilligrams == 300) {
            drug.setAdverseReaction("May change body odor to scents of Jasmine, Oud, or Bergamot");
        }

        // Display Rx info.
        drug.displayDrugInfo();
        drug.displaySideEffects();
    }
}