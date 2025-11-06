package lacombech.Jour2;

import java.util.Scanner;

public class Probleme7d2 {
    public static void main(String[] args) {
        char caractereRecherche = 'A';
        String y;
        String nom = "compter le nombre de voyelles et de consonnes dans une phrase qui est demande a lecran";
        int compteur = 0, compteur2 = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            caractereRecherche = i;
            
            for (int i2 = 0; i2 < nom.length(); i2++) {
                if (nom.toUpperCase().charAt(i2) == caractereRecherche) {
                    if (nom.charAt(i2) == 1) {
                        compteur2++;
                    } else if (nom.charAt(i2) == 5) {
                        compteur2++;
                    } else if (nom.charAt(i2) == 9) {
                        compteur2++;
                    } else if (nom.charAt(i2) == 15) {
                        compteur2++;
                    } else if (nom.charAt(i2) == 21) {
                        compteur2++;
                    } else if (nom.charAt(i2) == 25) {
                        compteur2++;
                    } else {
                        compteur++;
                    }
                }
            }
        }
        System.out.println("nombre de voyelles : " + compteur2 + " nombre de consonnes : " + compteur);

    }

    public static void afficherResultat(String message) {
        System.out.println(message);
    }
}
