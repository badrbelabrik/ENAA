package InheritanceChallenges.challenge7;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
            Guerrier p1 = new Guerrier("guerrier",100);
            Mage p2 = new Mage("mage",100);
            Archer p3 = new Archer("archer",100);
            int choix;
            do{
                Scanner input = new Scanner(System.in);
                System.out.println("1). guerrier ATTACK mage");
                System.out.println("2). guerrier ATTACK archer");
                System.out.println("3). mage ATTACK guerrier");
                System.out.println("4). mage ATTACK archer");
                System.out.println("5). archer ATTACK guerrier");
                System.out.println("6). archer ATTACK mage");
                System.out.print("Choose an option : ");
                choix = input.nextInt();

                switch (choix){
                    case 1:
                        p1.attaquer(p2);
                        break;
                    case 2:
                        p1.attaquer(p3);
                        break;
                    case 3:
                        p2.attaquer(p1);
                        break;
                    case 4:
                        p2.attaquer(p3);
                        break;
                    case 5:
                        p3.attaquer(p1);
                        break;
                    case 6:
                        p3.attaquer(p2);
                        break;
                }

            } while (choix !=0);
    }
}
