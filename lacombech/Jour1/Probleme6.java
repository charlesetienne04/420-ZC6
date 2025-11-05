package lacombech.Jour1;

import java.util.Scanner;

public class Probleme6 {
    public static void main(String[] args) {
        String mtemp = "Quelle est votre nom?";
        String nom;
        int type, longueur, largeur, prix;
        Scanner lectureClavier = new Scanner(System.in);
        afficherResultat(mtemp);
        nom = saisirNom2(lectureClavier);
        mtemp = "Quel est le type de plancher";
        afficherResultat(mtemp);
        type = fortype(lectureClavier);
        mtemp = "Quel est la longueur";
        afficherResultat(mtemp);
        longueur = longLarg(lectureClavier);
        mtemp = "Quel est la largeur";
        afficherResultat(mtemp);
        largeur = longLarg(lectureClavier);
        lectureClavier.close();
        prix = surface(longueur, largeur, type);
        System.out.println(" nom: " + nom + " type: " + type + " prix: " + prix);
    }

    public static int fortype(Scanner lectureClavier) {
        int type = 0;
        String mtemp = "Vous n’avez pas choisit le bon type de plancher";
        for (int i = 1; i < 3;) {
            type = saisirNom(lectureClavier);
            if (type < 1 || type > 3) {
                afficherResultat(mtemp);
            } else if (type > 0 || type < 4) {
                i = 3;
            }
        }
        return type;
    }

    public static void afficherResultat(String message) {
        System.out.println(message);
    }

    public static int surface(int x, int y, int i) {
        int sur;
        sur = x * y;
        if (i == 1) {
            sur = sur * 5;
        } else if (i == 2) {
            sur = sur * 12;
        } else if (i == 3) {
            sur = sur * 10;
        }
        return sur;
    }

    public static int longLarg(Scanner lecture) {
        int chiffre;
        chiffre = lecture.nextInt();
        return chiffre;
    }

    public static int saisirNom(Scanner lecture) {
        int chiffre;
        chiffre = lecture.nextInt();
        return chiffre;
    }

    public static String saisirNom2(Scanner lecture) {
        String chiffre;
        chiffre = lecture.nextLine();
        return chiffre;
    }
}
