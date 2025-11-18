package onlinecourses;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
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
            System.out.println("7. Payer pour un cours");
            System.out.println("8. marque un cours complete pour un etudiant");
            System.out.println("9. afficher les certifications");
            System.out.println("0. Quitter");
            System.out.print("Entrez votre choix :");
            choix = input.nextInt();
            input.nextLine();
            int idetudrech,idcoursrech,idinstrucrech;
            Etudiant etudtrouve;
            Cours courstrouve;
            Instructeur instrutrouve;
            Paiement paiementtrouve;
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
                    System.out.print("Entrez le prix:");
                    double prixcours = input.nextDouble();
                    Cours c1 = new Cours(courtitre,courdesc,prixcours);
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
                    if(etudtrouve == null) {System.out.println("There is no student with this id!!");}
                    for (Cours c: cours){
                        if(c.getId() == idcoursrech){
                            courstrouve = c;
                            break;
                        }
                    }
                    if(courstrouve == null) {System.out.println("There is no cours with this id!!");}
                    if(etudtrouve.getPaiement() == null){
                        System.out.println("You didnt pay for this course !!!");
                    }
                    else if(etudtrouve != null && courstrouve != null){
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
                case 7:
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
                    if(etudtrouve == null) {System.out.println("There is no student with this id!!");}
                    for (Cours c: cours){
                        if(c.getId() == idcoursrech){
                            courstrouve = c;
                            break;
                        }
                    }
                    if(courstrouve == null) {System.out.println("There is no cours with this id!!");}
                    if(courstrouve != null && etudtrouve != null){
                        Paiement p1 = new Paiement(courstrouve,true);
                        p1.assignPrix(courstrouve);
                        etudtrouve.setPaiement(p1);



                        System.out.println("Paiement "+p1.getId()+": student "+etudtrouve.getNom()+" for cours "+
                                courstrouve.getTitre()+" has been done");
                    }
                    break;
                case 8:
                    System.out.print("Entrez id d'etudiant:");
                    idetudrech = input.nextInt();
                    System.out.print("Entrez id du cours:");
                    idcoursrech = input.nextInt();
                    etudtrouve = null;
                    courstrouve = null;
                    for(Cours c: cours){
                        if(c.getId()==idcoursrech){
                            courstrouve =c;
                            for(Etudiant e: courstrouve.getCoursetudiants()){
                                if(e.getId()==idetudrech){
                                    etudtrouve = e;
                                }
                            }
                            if(etudtrouve != null){
                                etudtrouve.setCourscompleted();
                                courstrouve.genererCertification();
                            }
                        }
                    }
                    System.out.println("Etudiant "+etudtrouve.getNom()+" a completer le cours, " +
                            "Le certificat sera généré automatiquement.");
                    break;
                case 9:
                    for(Cours c: cours){
                        System.out.println("=== list des certifications du cours "+c.getTitre()+" ===");
                        c.afficherCertifications();
                    }
                    break;
            }
        }
        while(choix!=0);
    }
}
