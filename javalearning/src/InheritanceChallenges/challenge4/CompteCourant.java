package InheritanceChallenges.challenge4;

import java.util.Scanner;

public class CompteCourant extends Compte{
    private int limite;

    public CompteCourant(double solde, int limite){
        super(solde);
        this.limite = limite;
    }
    public void verser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez votre montant :");
        double montant = input.nextDouble();
        setSolde(getSolde() + montant);
    }

    public void retirer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez le montant pour retirer :");
        double montant = input.nextDouble();
        if(montant>limite){
            System.out.println("vous ne pouvez pas retirer plus que votre limite!!!");
        } else{
            setSolde(getSolde()-montant);
        }
    }

}
