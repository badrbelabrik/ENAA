package challengesserie1;
import java.util.Scanner;
import java.util.Arrays;

public class Challenges {
    public static void challenge1(){
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez votre nom :");
        String name = input.nextLine();
        System.out.println("Bonjour, " + name + " !");
    }

    public static void challenge2(){
    Scanner input = new Scanner(System.in);
    System.out.print("Entrez un nombre :");
    int nombre = input.nextInt();
    for (; nombre > 0; nombre--){
        System.out.println(nombre);
    }
    }

    public static void challenge3(){
        int N = (int)(Math.random() * 20) + 1;
        Scanner input = new Scanner(System.in);
        int guess;
         do {
            System.out.print("guess the number:");
            guess = input.nextInt();
            if(guess<N){
                System.out.println("Trop petit ! Essayez encore.");
            } else if (guess>N){
                System.out.println("Trop grand ! Essayez encore.");
            } else {System.out.println("Bravo!!.");}
        } while(N != guess);
    }

    public static void challenge4(){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Consulter le solde");
        System.out.println("2. Dépôt");
        System.out.println("3. Retrait");
        System.out.println("4. Quitter");
        System.out.println("Entrez votre choix :");
        int option = input.nextInt();

        switch(option){
            case 1:
                break;
            case 2:
                System.out.println("Entrez le montant :");
                int montant = input.nextInt();
                System.out.println("Dépôt effectué avec succès");
                break;
            default:
                System.out.println("Invalide choix");

        }
    }

    public static void challenge5(){
        int[] tab = {4, 9, 1, 7, 3};
        int max=0;
        for(int i=0; i<tab.length; i++){
            if(tab[i]>max){
                max = tab[i];
            }

        }
        System.out.println("le max est :"+ max);
        Arrays.sort(tab);
        System.out.print("Deuxieme plus grand est:" + tab[tab.length-2]);
    }

    public static void challenge6(){
        
    }
}
