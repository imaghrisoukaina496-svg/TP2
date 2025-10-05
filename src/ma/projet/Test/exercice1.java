package ma.projet.Test;

import java.util.Scanner;

public class exercice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez la taille du tableau :");
		int n =sc.nextInt();
		int[] tab = new int[n];
		System.out.println("entrez les elements du tableau :");
		for(int i = 0; i < n; i++){
			tab[i] = sc.nextInt();
		}
		int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = 1; 
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (tab[j] < tab[i] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (lis[i] > max)
                max = lis[i];
        }

        System.out.println("Longueur de la plus longue sous-suite croissante : " + max);
        sc.close();
		
		
		

	}

}
