package challengesserie1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

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
        System.out.println("0. Quitter");
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

        ArrayList<Integer> tab = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 3, 4, 5));
        int last = tab.get(tab.size() -1);
        tab.remove(tab.size() -1);
        tab.add(0, last);
        System.out.println(tab);
    }

    public static void challenge7(){
        int[] tab = {2, 3, 2, 5, 3};
        int [] tab2;

        for (int i=0; i<tab.length; i++){
            int counter=0;
            boolean repeated = false;
            for(int j=0; j<i; j++){
                if(tab[i] == tab[j]){
                   repeated = true;
                   break;
                    }

                }
            if(!repeated) {
                for(int j=0; j<tab.length; j++)
                    if (tab[i] == tab[j]) {
                        counter++;
                    }
            }
            System.out.print(tab[i]+ "=" + counter + " ") ;
            }

        }

        public static void challenge8(){
        int [] tab = {2, 6, 1, 4, 5 };
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez un cible :");
        int cible = input.nextInt();
        for (int i=0; i<tab.length; i++){
            int somme = 0;
            for (int j=0; j<tab.length; j++){
                if(tab[i]+tab[j] == cible){
                    System.out.println(tab[i] + "," + tab[j]);
                }
            }
        }
    }

    public static void challenge9(){
        int [] tab1 = {1, 2, 3, 4};
        int [] tab2 = {3, 4, 5, 6};
        for (int i=0; i<tab1.length; i++){
            for (int j=0; j<tab2.length; j++){
                if(tab1[i] == tab2[j]){
                    System.out.print(tab1[i] +" ");
                }
            }
        }
    }

    public static void challenge10(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first word :");
        String word1 = input.nextLine();
        System.out.print("Enter the second word :");
        String word2 = input.nextLine();
        if (word1.length() != word2.length()){
            System.out.print("Les deux mots ne sont pas des anagrammes.");
            return;
        }
        char [] tab1 = word1.toCharArray();
        char [] tab2 = word2.toCharArray();
        Arrays.sort(tab1);
        Arrays.sort(tab2);

        if(Arrays.equals(tab1, tab2)){
            System.out.println("Les deux mots sont des anagrammes.");
        } else {System.out.println("Les deux mots ne sont pas des anagrammes.");}
    }

    public static void challenge11() {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez une phrase :");
        String phrase = input.nextLine();
        String[] tab = phrase.split(",");
        HashMap<String, Integer> count = new HashMap<>();
        for (String sentence : tab) {
            sentence = sentence.trim(); // remove extra spaces
            count.put(sentence, count.getOrDefault(sentence, 0) + 1);
        }
        int maxcount = 0;
        String mostrepeated = null;
        for(String sentence: count.keySet()){
            int currentcount = count.get(sentence);
            if(maxcount < currentcount){
                maxcount = currentcount;
                mostrepeated = sentence;
            }
        }
        System.out.println("Mot le plus fréquent est :" +mostrepeated);
    }

    public static void challenge12() {

    }

        public static void main(String[] args){

        challenge6();
        }
}


