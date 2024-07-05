 class SheriezempicClient {
     public static void main(String[] args) {

         //Create a Sheriezempic object and set its properties via individual setters.
         Sheriezempic sheriezempic = new Sheriezempic(AdverseReactionSeverity.Severity.Mild);

         // Display RX info and side effects and adverse reactions:
         System.out.println("Sheriezempic Drug Profile");

         // Next, call methods on it---not sure what to do after wards or if I need setters. Research if my methods here should align with my main file.
         sheriezempic.displayDrugInfo();
         sheriezempic.displaySideEffects();
         sheriezempic.getAdverseReaction()



         //
     }
}
