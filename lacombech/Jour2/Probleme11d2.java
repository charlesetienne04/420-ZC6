package lacombech.Jour2;

import java.util.*;

public class Probleme11d2 {
    public static void main(String[] args) {
         int nb1, nb2, resultat;
        String temp = "Veuiller entre le premier chiffre";
        Scanner lectureClavier = new Scanner(System.in);
        afficherResultat(temp);
        nb1 = lectureClavier.nextInt();
        temp = "Veuiller entre le deuxieme chiffre";
        nb2 = lectureClavier.nextInt();
        lectureClavier.close();
        resultat = factoriser(nb1, nb2);
        afficherResultat("La factorielle est : " + resultat);
    }
    public static void afficherResultat(String message) {
        System.out.println(message);
    }

    public static int factoriser(int x, int y) {
        int i = x * y;
            return i;
        
    }
}
/*  Problème # 11: 
Créer une méthode factorielle. La méthode permet de retourner la factorielle d’un nombre 
entier demandé à l’écran. 
 */