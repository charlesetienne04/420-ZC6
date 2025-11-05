package lacombech.Jour1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        String mtemp = "Quelle est votre note?";
        int note, note2 = 0;
        Scanner lectureClavier = new Scanner(System.in);
        for(int i = 1; i < 3;) {
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
        }
        lectureClavier.close();
        
        
        notepass(note2);
        
    }

    public static void afficherResultat(String message) {
        System.out.println(message);
    }

    public static int saisirNom(Scanner lecture) {
        int chiffre;
        chiffre = lecture.nextInt();
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
