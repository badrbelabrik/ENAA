package Encapsulationchallenges.challenge3;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    private static int nextId = 1;
    private int etudiantId;
    private String titre;
    private List<Cours> coursSuivis = new ArrayList<>();

public Etudiant(int etudiantId){
    this.etudiantId = nextId++;
    this.titre = titre;
}

public void inscrire(Cours c){
    c.ajouterEtudiant(this);
    coursSuivis.add(c);
}


}
