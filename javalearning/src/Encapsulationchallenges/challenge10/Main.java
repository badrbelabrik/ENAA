package Encapsulationchallenges.challenge10;

public class Main {
    public static void  main(String[]args){
        Projet p1 = new Projet("creation application delivery");
        Projet p2 = new Projet("creation application gestion");
        Projet p3 = new Projet("creation siteweb du societe");

        Employe e1 = new Employe("badr");
        Employe e2 = new Employe("yassine");
        Employe e3 = new Employe("ali");

        e1.ajouterProjet(p1);
        e1.ajouterProjet(p2);
        e1.ajouterProjet(p3);

        e2.ajouterProjet(p1);

        e1.afficherProjets();
        p1.afficherEmployes();
    }
}
