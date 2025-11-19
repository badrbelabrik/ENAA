package InheritanceChallenges.challenge5;

public class Main {
    public static void  main(String[]args){
        PaiementCarte p1 = new PaiementCarte();
        PaiementCarte p2 = new PaiementCarte();

        PaiementVirement p3 = new PaiementVirement();
        PaiementVirement p4 = new PaiementVirement();

        PaiementCash p5 = new PaiementCash();
        PaiementCash p6 = new PaiementCash();

        p1.effectuerPaiement(1500);
        p3.effectuerPaiement(750);
        p5.effectuerPaiement(670);
    }
}
