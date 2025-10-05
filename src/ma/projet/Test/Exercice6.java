package ma.projet.Test;
import java.util.Scanner;
public class Exercice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int n = sc.nextInt();

        int[] t = new int[n];
        System.out.println("Entrez les elements du tableau :");
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        int maxSomme = t[0];
        int sommeCourante = 0;

        for (int i = 0; i < n; i++) {
            sommeCourante += t[i];
            if (sommeCourante > maxSomme) {
                maxSomme = sommeCourante;
            }else if (sommeCourante < 0) {
                sommeCourante = 0;
            }
        }
        System.out.println("La somme maximale d’un sous-tableau est : " + maxSomme);
         
        sc.close();


	}

}
