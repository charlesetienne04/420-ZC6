package lacombech.Jour2;

import java.util.Scanner;

public class Probleme13d2 {
    public static void main(String[] args) {
        int nb2, resultat;
        String nb1;
        String temp = "Quels est le type de temperature a convertir (C/c ou F/f)";
        Scanner lectureClavier = new Scanner(System.in);
        afficherResultat(temp);
        nb1 = lectureClavier.nextLine().toLowerCase();
        temp = "Veuiller entre la temperature a convertir";
        nb2 = lectureClavier.nextInt();
        lectureClavier.close();
        if (nb1.equals("c")) {
            resultat = celciusAFar(nb2);
        } else {
            resultat = FarACel(nb2);
        }
        afficherResultat("La temperature convertie est : " + resultat);
    }

    public static void afficherResultat(String message) {
        System.out.println(message);
    }

    public static int celciusAFar(int x) {
        int i = x * 9 / 5 + 32;
        return i;
    }

    public static int FarACel(int x) {
        int i = (x - 32) * 5 / 9;
        return i;
    }
}

/*
 * Problème # 13:
 * On vous demande de créer un petit programme qui permet de convertir une
 * température de
 * Celsius à fahrenheit ou de fahrenheit à Celsius en utilisant les méthodes.
 * On doit demander à l’écran le type de conversion voulu (C/c ou F/f). Ensuite,
 * on doit demander
 * la température à convertir (peut être un nombre réel). On convertit notre
 * température et on
 * affiche celle-ci.
 * Formule Celsius à fahrenheit: Celcius*9/5 + 32
 * Formule fahrenheit à Celsius: (Fahrenheit – 32)*5/9
 */