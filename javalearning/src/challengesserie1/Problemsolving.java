package challengesserie1;
import java.util.Scanner;

public class Problemsolving {
    public static void challenge1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez votre consommation :");
        double consom = input.nextFloat();
        double fact, taxe, result;
        if (consom > 300) {
            fact = 100 * 0.8;
            fact += 200 * 1.2;
            fact += (consom - 300) * 1.5;
        } else if (consom > 100 && consom < 300) {
            fact = 100 * 0.8;
            fact += (consom - 100) * 1.2;
        } else {
            fact = consom * 0.8;
        }
        taxe = fact / 10;
        result = fact + taxe;
        System.out.println("Facture avant taxe : " + fact + "MAD");
        System.out.println("Facture apres taxe :" + result + "MAD");
    }

    public static void challenge2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez la serie de commande:");
        String commands = input.nextLine();
        int x = 0, y = 0;
        String[] tab1 = commands.split(" ");
        for (int i = 0; i < tab1.length; i++) {
            String cmd = tab1[i].trim();
            if (cmd.equals("UP")) {
                y++;
            } else if (cmd.equals("DOWN")) {
                y--;
            } else if (cmd.equals("RIGHT")) {
                x++;
            } else if (cmd.equals("LEFT")) {
                x--;
            }
        }
        System.out.println("La position finale est : (" + x + "," + y + ")");
    }

    public static void challenge3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez le nombre d'etudiant :");
        int N = input.nextInt();
        System.out.print("Entrez le nombre de bancs :");
        int M = input.nextInt();
        int counter = 1;
        int plusbank =0;

        for (int i = 1; i <= M; i++) {
            System.out.println("Banc " + i + ": Étudiant" + counter + ", Étudiant"+ (counter+1));
            counter += 2;
            plusbank = i;


        }
        if (N%2 == 1 && N/2<M){
            System.out.println();
        }
    }

}
