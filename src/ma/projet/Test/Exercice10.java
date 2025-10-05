package ma.projet.Test;

import java.util.Scanner;

public class Exercice10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = 3;
        int[][] M = new int[n][n];

        System.out.println("Entrez les éléments de la matrice 3x3 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        if (estMagique(M))
            System.out.println("La matrice est magique ");
        else
            System.out.println("La matrice n'est pas magique.");

        sc.close();
    }

    
    static boolean estMagique(int[][] M) {
        int n = 3;
        int sommeRef = 0;

        for (int j = 0; j < n; j++) {
            sommeRef += M[0][j];
        }

        for (int i = 1; i < n; i++) {
            int sommeLigne = 0;
            for (int j = 0; j < n; j++) {
                sommeLigne += M[i][j];
            }
            if (sommeLigne != sommeRef) return false;
        }

        
        for (int j = 0; j < n; j++) {
            int sommeCol = 0;
            for (int i = 0; i < n; i++) {
                sommeCol += M[i][j];
            }
            if (sommeCol != sommeRef) return false;
        }

        
        int sommeDiag1 = M[0][0] + M[1][1] + M[2][2];
        if (sommeDiag1 != sommeRef) return false;

        
        int sommeDiag2 = M[0][2] + M[1][1] + M[2][0];
        if (sommeDiag2 != sommeRef) return false;

        return true; 

	}

}
