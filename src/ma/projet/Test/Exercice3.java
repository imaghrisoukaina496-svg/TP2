package ma.projet.Test;
import java.util.Scanner;
public class Exercice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Entrez n : ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("n doit être > 0");
            
        }

        int[][] a = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int num = 1;
        int max = n * n;

        while (num <= max) {
            // 1) gauche -> droite (ligne top)
            for (int j = left; j <= right && num <= max; j++) {
                a[top][j] = num++;
            }
            top++;

            // 2) haut -> bas (colonne right)
            for (int i = top; i <= bottom && num <= max; i++) {
                a[i][right] = num++;
            }
            right--;

            // 3) droite -> gauche (ligne bottom)
            for (int j = right; j >= left && num <= max; j--) {
                a[bottom][j] = num++;
            }
            bottom--;

            // 4) bas -> haut (colonne left)
            for (int i = bottom; i >= top && num <= max; i--) {
                a[i][left] = num++;
            }
            left++;
        }

        // affichage formaté
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();// TODO Auto-generated method stub

	}

}
