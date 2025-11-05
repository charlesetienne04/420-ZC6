package lacombech.Jour1;

import java.util.Scanner;

public class Probleme6 {
    public static void main(String[] args) {
        String mtemp = "Quelle est votre nom?";
        String nom;
        int note, note2 = 0;
        Scanner lectureClavier = new Scanner(System.in);
        afficherResultat(mtemp);
        nom = saisirNom2(lectureClavier);
        mtemp = "Quel est le type de plancher";
        afficherResultat(mtemp);
        
        /*for(int i = 1; i < 3;) {
            if (i == 1) {
                afficherResultat(mtemp);
                i = 2;
            }
            note = saisirNom(lectureClavier);
            if (note < 0 || note > 100) {
                mtemp = "Le nombre est invalide";
                afficherResultat(mtemp);
            } else {
                i = 3;
                note2 = note;
            }
        } */
        lectureClavier.close();
        
        
        notepass(note2);
        
    }
    public static int fortype(int type, Scanner lectureClavier) {
        String mtemp = "Nombre invalide";
        for(int i = 1; i < 3;) {
            type = saisirNom(lectureClavier);
            if (type < 1 || type > 3) {
                afficherResultat(mtemp);
                i = 2;
            }
            if (note < 0 || note > 100) {
                mtemp = "Le nombre est invalide";
                afficherResultat(mtemp);
            } else {
                i = 3;
                note2 = note;
            }
        } 
    }
    public static void afficherResultat(String message) {
        System.out.println(message);
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

    public static void notepass(int notes) {
        String a;
        if (notes < 60) {
            a = "Échec";
            afficherResultat(a);
        } else if (notes >= 60) {
            a = "Réussite";
            afficherResultat(a);
        }
    }
}
