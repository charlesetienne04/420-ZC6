package lacombech.Jour2;

import java.util.Scanner;

public class Probleme6d2 {
    public static void main(String[] args) {
        int nombre, petit, grand, total = 0, compteur = 0;
        double moyenne;
        Scanner lectureClavier = new Scanner(System.in);
        afficherResultat("entrer un nombre");
        nombre = saisirNom(lectureClavier);
    
    if(nombre != 0){
        grand = nombre;
        petit = nombre;
        do{
            total += nombre;
            compteur++;
            if (nombre < petit) {
                petit = nombre;
            }
            if (nombre > grand){
                grand = nombre;
            }
            afficherResultat("entrer un nombre2");
            nombre = saisirNom(lectureClavier);
        }while(nombre != 0);
        moyenne =  total / compteur;
        afficherResultat(grand);
        afficherResultat(petit);
        afficherResultat(moyenne);
    }
    }
    public static int saisirNom(Scanner lecture) {
        int chiffre;
        chiffre = lecture.nextInt();
        return chiffre;
    }
    public static void afficherResultat(String message) {
        System.out.println(message);
        }
    public static void afficherResultat(int message) {
        System.out.println(message);
        }
        public static void afficherResultat(double message) {
        System.out.println(message);
        }
        
    

}
