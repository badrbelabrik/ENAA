package onlinecourses;

import java.rmi.UnexpectedException;
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
                    int idetudrech = input.nextInt();
                    System.out.print("Entrez id du cours:");
                    int idcoursrech = input.nextInt();
                    Etudiant etudidtrouve = null;
                    Cours coursidtrouve = null;
                    String studentname;
                    String coursname;
                    for(Etudiant e: etudiants){
                        if(e.getId() == idetudrech){
                           System.out.println("Student name: "+e.getNom()+" found");
                           etudidtrouve = e;
                           studentname = e.getNom();
                           break;
                        }
                    }
                    if(etudidtrouve == null) {System.out.println("There is no student with such id!!");}
                    for (Cours c: cours){
                        if(c.getId() == idcoursrech){
                            System.out.println("Cours: "+c.getTitre()+" found");
                            coursidtrouve = c;
                            coursname = c.getTitre();
                            break;
                        }
                    }
                    if(coursidtrouve == null) {System.out.println("There is no cours with such id!!");}

                    if(etudidtrouve != null && coursidtrouve != null){
                        etudidtrouve.inscrire(coursidtrouve);
                        System.out.println("The student "+etudidtrouve.getNom()+" has been assigned to "+coursidtrouve.getTitre());
                    }
                    break;
                case 5:
                    System.out.print("Entrez l'id d'instructeur :");
                    int instidrech = input.nextInt();
                    System.out.print("Entrez l'id du cours :");
                    int coursidrech = input.nextInt();
                    Instructeur insttrouve = null;
                    Cours courstrouve = null;

                    for(Instructeur i: instructeurs){
                        if(i.getId()==instidrech){
                            String instructorname = i.getNom();
                            System.out.println("Instructor name: "+instructorname+" found");
                            insttrouve = i;
                            break;
                        }
                    } if(insttrouve == null) {System.out.println("There is no instructor with such id!!");}
                    for (Cours c: cours){
                        if(c.getId() == coursidrech){
                            coursname = c.getTitre();
                            System.out.println("Cours : "+coursname+" found");
                            courstrouve = c;
                            break;
                        }
                    }
                    if(courstrouve == null) {System.out.println("There is no cours with such id!!");}
                    if(insttrouve != null && courstrouve != null){
                        insttrouve.assignerCours(courstrouve);
                        System.out.println("The instructor "+insttrouve.getNom()+" has been assigned to "+courstrouve.getTitre());
                    }

                    break;
                case 6:
                    System.out.print("Entrez l'id du cours:");
                    int idcours = input.nextInt();
                    Cours coursstrouve = null;
                    for(Cours c: cours){
                        if(c.getId() == idcours){
                            coursstrouve = c;
                            break;
                        }
                    }
                    if(coursstrouve == null){
                        System.out.println("There is no cours with such id!");
                    } else if (coursstrouve != null){
                        coursstrouve.afficherDetails();
                    }
                    break;
            }
        }
        while(choix!=0);
    }
}
