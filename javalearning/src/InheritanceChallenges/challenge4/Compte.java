package InheritanceChallenges.challenge4;

import java.util.Scanner;

public class Compte {
    private static int nextNumero =1;
    private int numero;
    private double solde;

    public Compte(double solde){
        this.numero = nextNumero++;
        this.solde = solde;
    }

    public void verser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez votre montant :");
        double montant = input.nextDouble();
        solde += montant;
    }
    public void retirer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez le montant pour retirer :");
        double montant = input.nextDouble();
        setSolde(getSolde()-montant);
        System.out.println("Nouveau solde : "+getSolde());
       };
    public int getNumero() {
        return getNumero();
    }

    public double getSolde() {
        return getSolde();
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}







