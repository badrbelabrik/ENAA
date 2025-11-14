package onlinecourses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Etudiant> etudiants = new ArrayList<>();
        List<Cours> cours = new ArrayList<>();
        List<Instructeur> instructeurs = new ArrayList<>();

        int choix;
        do{
            System.out.println("=== Menu Gestion des Cours ===");
            System.out.println("1. Ajouter un étudiant");
            System.out.println("2. Ajouter un instructeur");
            System.out.println("3. Ajouter un cours");
            System.out.println("4. Inscrire un étudiant à un cours");
            System.out.println("5. Assigner un instructeur à un cours");
            System.out.println("6. Afficher les détails d’un cours");
            System.out.println("7. Quitter");
            System.out.print("Entrez votre choix :");
            choix = input.nextInt();
            input.nextLine();
            int idetudrech,idcoursrech,idinstrucrech;
            Etudiant etudtrouve;
            Cours courstrouve;
            Instructeur instrutrouve;

            switch(choix){
                case 1:
                    System.out.print("Entrez le nom:");
                    String etudnom = input.nextLine();
                    System.out.print("Entrez l'email':");
                    String etudemail = input.nextLine();
                    Etudiant etu = new Etudiant(etudnom,etudemail);
                    etudiants.add(etu);
                    break;
                case 2:
                    System.out.print("Entrez le nom:");
                    String instnom = input.nextLine();
                    System.out.print("Entrez la specialisation:");
                    String instspecialisation = input.nextLine();
                    Instructeur inst1 = new Instructeur(instnom,instspecialisation);
                    instructeurs.add(inst1);
                    break;
                case 3:
                    System.out.print("Entrez le titre:");
                    String courtitre = input.nextLine();
                    System.out.print("Entrez le description:");
                    String courdesc = input.nextLine();
                    Cours c1 = new Cours(courtitre,courdesc);
                    cours.add(c1);
                    break;
                case 4:
                    System.out.print("Entrez id d'etudiant:");
                    idetudrech = input.nextInt();
                    System.out.print("Entrez id du cours:");
                    idcoursrech = input.nextInt();
                    etudtrouve = null;
                    courstrouve = null;
                    for(Etudiant e: etudiants){
                        if(e.getId() == idetudrech){
                            etudtrouve = e;
                           break;
                        }
                    }
                    if(etudtrouve == null) {System.out.println("There is no student with such id!!");}
                    for (Cours c: cours){
                        if(c.getId() == idcoursrech){
                            courstrouve = c;
                            break;
                        }
                    }
                    if(courstrouve == null) {System.out.println("There is no cours with this id!!");}

                    if(etudtrouve != null && courstrouve != null){
                        etudtrouve.inscrire(courstrouve);
                        System.out.println("The student "+etudtrouve.getNom()+" has been assigned to "+courstrouve.getTitre());
                    }
                    break;
                case 5:
                    System.out.print("Entrez l'id d'instructeur :");
                    idinstrucrech = input.nextInt();
                    System.out.print("Entrez l'id du cours :");
                    idcoursrech = input.nextInt();
                    instrutrouve = null;
                    courstrouve = null;

                    for(Instructeur i: instructeurs){
                        if(i.getId()==idinstrucrech){
                            instrutrouve = i;
                            break;
                        }
                    } if(instrutrouve == null) {System.out.println("There is no instructor with this id!!");}
                    for (Cours c: cours){
                        if(c.getId() == idcoursrech){
                            courstrouve = c;
                            break;
                        }
                    }
                    if(courstrouve == null) {System.out.println("There is no cours with this id!!");}
                    if(instrutrouve != null && courstrouve != null){
                        instrutrouve.assignerCours(courstrouve);
                        System.out.println("The instructor "+instrutrouve.getNom()+" has been assigned to "+courstrouve.getTitre());
                    }

                    break;
                case 6:
                    System.out.print("Entrez l'id du cours:");
                    idcoursrech = input.nextInt();
                    courstrouve = null;
                    for(Cours c: cours){
                        if(c.getId() == idcoursrech){
                            courstrouve = c;
                            break;
                        }
                    }
                    if(courstrouve == null){
                        System.out.println("There is no cours with this id!!");
                    } else if (courstrouve != null){
                        courstrouve.afficherDetails();
                    }
                    break;
            }
        }
        while(choix!=0);
    }
}
