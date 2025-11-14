package Encapsulationchallenges.challenge2;

public class Main {
    public static void main(String[] args){
        Cours c1 = new Cours("developement web","technologies de developement des sitewebs");
        Cours c2 = new Cours("developement applications mobile","technologies de developement mobiles");
        Cours c3 = new Cours("soft skills","soft skills");
        Instructeur i1 = new Instructeur("badr","javascript");
        c1.assignInstructeur(i1);
        c2.assignInstructeur(i1);
        c3.assignInstructeur(i1);
        i1.afficherCours();
    }
}
