package com.drug;

class SheriezempicClient {

    public static void main(String[] args) {

        // creatre instances of the drug(Rx) Sheriezempic
        Sheriezempic sheriezempic100mg = new Sheriezempic();
        Sheriezempic sheriezempic150mg = new Sheriezempic(150, "Sheriechandolariem", "May cause slight dizziness", "May change body odor to scents of Jasmine");

        // Set properties
        sheriezempic100mg.setAdverseReactionSeverity(Sheriezempic.AdverseReactionSeverity.MILD);
        sheriezempic150mg.setAdverseReactionSeverity(Sheriezempic.AdverseReactionSeverity.MODERATE);

        // Rx info
        System.out.println("Sheriezempic 100mg Info:");
        sheriezempic100mg.displayDrugInfo();
        sheriezempic100mg.displaySideEffects();

        System.out.println("\nSheriezempic 150mg Info:");
        sheriezempic150mg.displayDrugInfo();
        sheriezempic150mg.displaySideEffects();

        // added another instance of Sheriezempic with 200mg strength
        Sheriezempic sheriezempic200mg = new Sheriezempic(200, "Sheriechandolariem", "May cause dry mouth", "May change body odor to scents of Bergamot");
        sheriezempic200mg.setAdverseReactionSeverity(Sheriezempic.AdverseReactionSeverity.SEVERE);

        System.out.println("\nSheriezempic 200mg Info:");
        sheriezempic200mg.displayDrugInfo();
        sheriezempic200mg.displaySideEffects();
    }
}