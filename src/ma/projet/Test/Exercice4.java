package ma.projet.Test;
import java.util.Scanner;
public class Exercice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nombre de lignes : ");
        int n = sc.nextInt();
        System.out.print("Entrez le nombre de colonnes : ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        System.out.println("Entrez la matrice binaire (0 ou 1) :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int maxAire = 0;
        int ligneDebut = 0, ligneFin = 0, colDebut = 0, colFin = 0;

        // Parcourir tous les sous-rectangles possibles
        for (int i1 = 0; i1 < n; i1++) {
            for (int j1 = 0; j1 < m; j1++) {
                if (mat[i1][j1] == 1) {
                    for (int i2 = i1; i2 < n; i2++) {
                        for (int j2 = j1; j2 < m; j2++) {

                            // Vérifier si tout le rectangle [i1..i2][j1..j2] contient que des 1
                            boolean toutUn = true;
                            for (int i = i1; i <= i2 && toutUn; i++) {
                                for (int j = j1; j <= j2; j++) {
                                    if (mat[i][j] == 0) {
                                        toutUn = false;
                                        break;
                                    }
                                }
                            }

                            if (toutUn) {
                                int aire = (i2 - i1 + 1) * (j2 - j1 + 1);
                                if (aire > maxAire) {
                                    maxAire = aire;
                                    ligneDebut = i1;
                                    ligneFin = i2;
                                    colDebut = j1;
                                    colFin = j2;
                                }
                            }
                        }
                    }
                }
            }
        }

        if (maxAire == 0) {
            System.out.println("Aucun rectangle de 1 trouvé.");
        } else {
            System.out.println("\nPlus grand rectangle de 1 :");
            System.out.println("Aire = " + maxAire);
            System.out.println("De (" + ligneDebut + "," + colDebut + ") à (" + ligneFin + "," + colFin + ")");
        }
        sc.close();

	}

}
