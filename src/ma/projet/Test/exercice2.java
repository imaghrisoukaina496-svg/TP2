package ma.projet.Test;

import java.util.Scanner;

public class exercice2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Entrez la taille du tableau : ");
        int taille = sc.nextInt();
        
        
        int[] t = new int[taille];
        
        
        System.out.println("Entrez les " + taille + " éléments :");
        for (int i = 0; i < taille; i++) {
            t[i] = sc.nextInt();
        }
        
        
        System.out.print("Pivots : ");
        for (int i = 0; i < t.length; i++) {
            boolean pivot = true;
            
           
            for (int j = 0; j < i; j++) {
                if (t[j] > t[i]) {
                    pivot = false;
                    break;
                }
            }
            
         
            if (pivot) {
                for (int j = i + 1; j < t.length; j++) {
                    if (t[j] < t[i]) {
                        pivot = false;
                        break;
                    }
                }
            }
            
            if (pivot) {
                System.out.print(t[i] + " ");
            }
        }
        
        sc.close();
		
	}

}
