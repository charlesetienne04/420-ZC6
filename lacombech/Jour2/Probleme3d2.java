package lacombech.Jour2;

import java.util.Scanner;

public class Probleme3d2 {
    public static void main(String[] args) {
        String nom, mtemp;
        char caractereRecherche = 'a';
        int compteur = 0;
        Scanner lectureClavier = new Scanner(System.in);
        mtemp = "ecriver une phrase";
        afficherResultat(mtemp);
        nom = saisirNom(lectureClavier);
        for (int i = 0; i < nom.length(); i++) {
            if (nom.charAt(i) == caractereRecherche) {
                compteur++;
            }
        }
        nom = nom.replace("a", "$");
        System.out.println(compteur);
        afficherResultat(nom);
    }

    public static String saisirNom(Scanner lecture) {
        String chiffre;
        chiffre = lecture.nextLine();
        return chiffre;
    }

    public static void afficherResultat(String message) {
        System.out.println(message);
    }
}
