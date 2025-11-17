package Encapsulationchallenges.challenge3;

public class Main {
    public static void main(String[] args){
        Cours c1 = new Cours("java");
        Cours c2 = new Cours("python");
        Cours c3 = new Cours("php");

        Etudiant e1 = new Etudiant("badr");
        Etudiant e2 = new Etudiant("yassine");

        e1.inscrire(c1);
        e1.inscrire(c2);
        e1.inscrire(c3);

        e2.inscrire(c1);

        e1.afficherCours();
        e2.afficherCours();

        c1.afficherEtudiants();





    }
}
