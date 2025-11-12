package onlinecourses;

import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        List<Etudiant> etudiants = new ArrayList<>();
        int choix;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("=== Menu Gestion des Cours ===");
            System.out.println("1. Ajouter un étudiant");
            System.out.println("2. Ajouter un instructeur");
            System.out.println("3. Ajouter un cours");
            System.out.println("4. Inscrire un étudiant à un cours");
            System.out.println("5. Assigner un instructeur à un cours");
            System.out.println("6. Afficher les détails d’un cours");
            System.out.println("7. Quitter");
            choix = input.nextInt();

            switch(choix){
                case 1:
                    System.out.println("Entrez le nom:");
                    String nom = input.nextLine();
                    System.out.println("Entrez l'email':");
                    String email = input.nextLine();
                    Etudiant etu1 = new Etudiant(1,nom,email);
            }

        }
        while(choix!=0);
    }
}
