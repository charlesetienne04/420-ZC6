package lacombech.Jour2;

import java.util.Scanner;

public class Probleme12d2 {
    public static void main(String[] args) {
        int nb1, nb2, resultat;
        String temp = "Veuiller entre le premier chiffre";
        Scanner lectureClavier = new Scanner(System.in);
        afficherResultat(temp);
        nb1 = lectureClavier.nextInt();
        temp = "Veuiller entre le deuxieme chiffre";
        nb2 = lectureClavier.nextInt();
        lectureClavier.close();
        resultat = SommeMinMax(nb1, nb2);
        afficherResultat("La somme est : " + resultat);
    }
    public static void afficherResultat(String message) {
        System.out.println(message);
    }

    public static int SommeMinMax(int x, int y) {
        int p;
        if (x  > y) {
            p = x;
            x = y;
            y = p;
        }
        int somme = 0;
            for (int i = x; i <= y; i++) {
                somme += i;
            }
            return somme;
        
    }
}


/* 
    Problème # 12: 
Créer une méthode sommeMinMax. Vous devez demander deux nombre entiers à l’écran 
(minimum et maximum). Ensuite, vous devez faire la somme de tous les nombres entre la 
valeur minimum et la valeur maximum. Il faut valider que le nombre maximum est bien plus 
grand que le nombre minimum. 
 */