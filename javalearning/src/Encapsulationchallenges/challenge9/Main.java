package Encapsulationchallenges.challenge9;

public class Main {
    public static void main(String[]args){
        Etudiant e1 = new Etudiant("badr");
        Certification c1 = new Certification("java OOP","30-07-2025");

        e1.attribuerCertification(c1);
        e1.afficherDetails();
    }
}
