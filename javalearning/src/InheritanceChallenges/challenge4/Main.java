package InheritanceChallenges.challenge4;

public class Main {
    public static void main(String[]args){
        CompteCourant c1 = new CompteCourant(2500,1000);
        CompteEpargne c2 = new CompteEpargne(3500,0.05);
        c1.verser();
        System.out.println("Votre nouvelle solde est :"+c1.getSolde());
        c1.retirer();
        System.out.println("Votre nouvelle solde est :"+c1.getSolde());
        c2.verser();
        System.out.println("L'interet de votre compte est :"+c2.appliquerInteret());
    }
}
