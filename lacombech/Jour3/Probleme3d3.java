package lacombech.Jour3;

import java.util.Scanner;

public class Probleme3d3 {
    public static void main(String[] args) {
        int nombre, resultat; // Vous pouvez changer ce nombre pour tester avec d'autres valeurs
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre entier pour calculer sa factorielle : ");
        nombre = lectureClavier.nextInt();
        lectureClavier.close();
        resultat  = factorielle(nombre);
        System.out.println("La factorielle de " + nombre + " est : " + resultat);
    }

    public static int factorielle(int x) {
        int p = x;
        for (int i = 1; i < x; i++) {
            p *= i;
        }
        return p;
    }
}

/*  
 Problème # 3:
 Créer une fonction factorielle. La fonction permet de retourner la factorielle d’un nombre 
entier demandé à l’écran. 
 */