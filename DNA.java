public class DNA {
    //Declare variables
    private String dnaSeq;
    private int codon1, sizeMut, count;

    //Constructor
    public DNA(String seq) {
        this.dnaSeq = seq;
    }

    //Method to see if sequence codes for a protein
    private boolean isProtein() {
        // Check if seq contains start and stop codons and if start codon is at the beginning
        if (this.dnaSeq.contains("ATG") && (this.dnaSeq.contains("UAA") || this.dnaSeq.contains("UAG") || this.dnaSeq.contains("UGA"))
                && this.dnaSeq.indexOf("ATG") == 0) {
                return true;
        }
        else {
            return false;
        }
    }

    //Method to mutate the sequence
    private String mutate(String dnaSeq, String codon, String mutation) {
        //Check if sequence has codon to be mutated
        if (this.dnaSeq.contains("codon")) {
            //find index of where it is
            this.codon1 = this.dnaSeq.indexOf("codon");

            //Analyze size of mutation
            this.sizeMut = mutation.length(); 

            //replace codon with mutation
            for(this.count = 0; count < sizeMut; count++){
                dnaSeq(codon1 +count) = mutation.charAt(count);
            }

        }

        return dnaSeq;
    }


}
