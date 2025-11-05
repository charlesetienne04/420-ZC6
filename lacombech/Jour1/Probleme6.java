package lacombech.Jour1;

import java.util.Scanner;

public class Probleme6 {
    public static void main(String[] args) {
        String mtemp = "Quelle est votre nom?";
        String nom;
        int type, longueur, largeur;
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
        
        
        
        
    }
    public static int fortype(Scanner lectureClavier) {
        int type = 0;
        String mtemp = "Vous n’avez pas choisit le bon type de plancher";
        for(int i = 1; i < 3;) {
            type = saisirNom(lectureClavier);
            if (type < 1 || type > 3) {
                afficherResultat(mtemp);
            }
            else if (type > 0 || type < 4) {
                i = 3;
        }
    } 
        return type;
    }
    public static void afficherResultat(String message) {
        System.out.println(message);
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
