package InheritanceChallenges.challenge4;

import java.util.Scanner;

public class CompteEpargne extends Compte{
    private double tauxinteret;

    public CompteEpargne(double solde, double tauxinteret){
        super(solde);
        this.tauxinteret = tauxinteret;
    }

    public void verser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez votre montant :");
        double montant = input.nextDouble();
        setSolde(getSolde() + montant);
    }

    public double appliquerInteret(){
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez la durée (ans):");
        double duree = input.nextDouble();
        return getSolde() * tauxinteret * duree;
    }


}
