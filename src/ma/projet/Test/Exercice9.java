package ma.projet.Test;

import java.util.Scanner;

public class Exercice9 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Entrez la taille de la matrice : ");
	        int n = sc.nextInt();

	        int[][] M = new int[n][n];
	        System.out.println("Entrez les elements de la matrice :");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                M[i][j] = sc.nextInt();
	            }
	        }

	        int sommePrincipale = 0;
	        int sommeSecondaire = 0;

	        for (int i = 0; i < n; i++) {
	            sommePrincipale += M[i][i];               
	            sommeSecondaire += M[i][n - 1 - i];       
	        }

	        int difference = Math.abs(sommePrincipale - sommeSecondaire);

	        System.out.println("Somme diagonale principale : " + sommePrincipale);
	        System.out.println("Somme diagonale secondaire : " + sommeSecondaire);
	        System.out.println("Valeur absolue de la difference : " + difference);
	        sc.close();
		

	}

}
