package ma.projet.Test;
import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int n = sc.nextInt();

        int[] t = new int[n];
        System.out.println("Entrez les elements du tableau : ");
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        int maj = entierMajoritaire(t, n);
        if (maj != -1)
            System.out.println("L’entier majoritaire est : " + maj);
        else
            System.out.println("Aucun entier majoritaire.");
        sc.close();
    }

    
    static int entierMajoritaire(int[] t, int n) {
        for (int i = 0; i < n; i++) {
            int compteur = 0;
            for (int j = 0; j < n; j++) {
                if (t[i] == t[j]) {
                    compteur++;
                }
            }
            if (compteur > n / 2) {
                return t[i]; 
            }
        }
        return -1; 
        
    }
}

