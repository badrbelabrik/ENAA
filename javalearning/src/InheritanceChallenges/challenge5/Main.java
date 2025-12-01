package InheritanceChallenges.challenge5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void  main(String[]args){
        List<Paiement> paiements = new ArrayList<>();
        paiements.add(new PaiementCarte());
        paiements.add(new PaiementCash());
        paiements.add(new PaiementVirement());
        for(Paiement p: paiements){
            p.traiterPaiement(1500);
        }
    }
}
