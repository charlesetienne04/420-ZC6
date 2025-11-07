package lacombech.Jour3;

import java.util.Scanner;

public class Probleme4d3 {
    public static void main(String[] args) {
        int min;
        int max;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Veuillez entrer le nombre minimum (entier) : ");
        min = lectureClavier.nextInt();
        System.out.println("Veuillez entrer le nombre maximum (entier) : ");
        max = lectureClavier.nextInt();
        lectureClavier.close();
        if (max > min) {
            int somme = sommeMinMax(min, max);
            System.out.println("La somme des nombres entre " + min + " et " + max + " est : " + somme);
        } else {
            System.out.println("Le nombre maximum doit être plus grand que le nombre minimum.");
        }
    }

    public static int sommeMinMax(int min, int max) {
        int somme = 0;
        for (int i = min; i <= max; i++) {
            somme += i;
        }
        return somme;
    }
}


/*  
Problème # 4:
 Créer une fonction sommeMinMax. Vous devez demander deux nombre entiers à l’écran 
(minimum et maximum). Ensuite, vous devez faire la somme de tous les nombres entre la 
valeur minimum et la valeur maximum. Il faut valider que le nombre maximum est bien plus 
grand que le nombre minimum. 
Exemple :  
Minimum : 4  
Maximum : 8 
Somme : 4 + 5 + 6 + 7 + 8 = 30 
 */