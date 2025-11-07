package lacombech.Jour2;

import java.util.*;

public class Probleme10d2 {
    public static void main(String[] args) {
        int nb1, nb2, resultat;
        String temp = "Veuiller entre le premier chiffre";
        Scanner lectureClavier = new Scanner(System.in);
        afficherResultat(temp);
        nb1 = lectureClavier.nextInt();
        temp = "Veuiller entre le deuxieme chiffre";
        nb2 = lectureClavier.nextInt();
        lectureClavier.close();
        resultat = plusGrand(nb1, nb2);
        afficherResultat("Le plus grand nombre est : " + resultat);

    }

    public static void afficherResultat(String message) {
        System.out.println(message);
    }

    public static int plusGrand(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}

/*
 * Créer une méthode plusGrand entre deux nombres entiers et doit retourner le
 * plus grand des
 * deux. Vous devez demander deux nombre entiers à l’écran, appeler votre
 * méthode qui
 * retourne le plus grand des deux nombres et afficher le nombre le plus grand.
 */