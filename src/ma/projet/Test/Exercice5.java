package ma.projet.Test;
import java.util.Scanner;
public class Exercice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Entrez n : ");
        int n = sc.nextInt();
        int[] t = new int[n];
        System.out.println("Entrez les elements du tableau :");
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        
        int pos1 = -1;
        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                pos1 = i;
                break;
            }
        }

        if (pos1 == -1) { 
            System.out.println("Ce n’est PAS une permutation circulaire ");
            
        }

       
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            int attendu = i + 1;
            int valeur = t[(pos1 + i) % n];
            if (valeur != attendu) {
                ok = false;
                break;
            }
        }

        if (ok)
            System.out.println("C’est une permutation circulaire ");
        else
            System.out.println("Ce n’est PAS une permutation circulaire ");
        sc.close();

	}

}
