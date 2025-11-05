package lacombech.Jour1;

import java.util.Scanner;

public class Probleme1 {
    public static void main(String[] args) {
        Scanner lectureClavier = new Scanner(System.in);
        int x;
        int y;
        afficherResultat2(null);
        x = saisirNom(lectureClavier);
        afficherResultat2(null);
        y = saisirNom(lectureClavier);
        lectureClavier.close();
        

        ifnum1(x, y);

    }

    public static void ifnum1(int x, int y) {
        if (x < y) {
            afficherResultat(y);
        } else if (x > y) {
            afficherResultat(x);
        } else {
            afficherResultat("les deux chiffres sont égals");
        }
    }

    public static void afficherResultat(int message) {
        System.out.println(message);
    }

    public static void afficherResultat(String message) {
        System.out.println(message);
    }
    public static void afficherResultat2(String message) {
        System.out.println("veuiller entrer un nombre");
    }

    public static int saisirNom(Scanner lecture) {
        int chiffre;
        int chiffre2;
        chiffre = lecture.nextInt();
        chiffre2 = chiffre;
        
        return chiffre2;
        
        
        
    }
}
