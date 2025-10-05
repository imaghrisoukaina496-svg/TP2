package ma.projet.Test;
import java.util.Scanner;
public class Exercice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int n = sc.nextInt();

        int[] t = new int[n];
        System.out.println("Entrez les elements du tableau : ");
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        System.out.print("Nombres absents : ");
        for (int i = 1; i <= n; i++) {
            boolean trouve = false;
            for (int j = 0; j < n; j++) {
                if (t[j] == i) {
                    trouve = true;
                    break;
                }
            }
            if (!trouve) {
                System.out.print(i + " ");
            }
        }
        sc.close();

	}

}
