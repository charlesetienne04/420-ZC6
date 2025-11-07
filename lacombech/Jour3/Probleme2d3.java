package lacombech.Jour3;
import java.util.Scanner;
public class Probleme2d3 {
    public static void main(String[] args) {
        int nb1, nb2, resultat;
        String temp = "Veuiller entre le premier chiffre";
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println(temp);
        nb1 = lectureClavier.nextInt();
        temp = "Veuiller entre le deuxieme chiffre";
        System.out.println(temp);
        nb2 = lectureClavier.nextInt();
        lectureClavier.close();
        resultat = plusGrand(nb1, nb2);
        System.out.println("Le plus grand nombre est : " + resultat);
    }
    public static int plusGrand(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}
/*  
 * Problème # 2:
 Créer une fonction plusGrand entre deux nombres entiers et doit retourner le plus grand des 
deux. Vous devez demander deux nombre entiers à l’écran, appeler votre fonction qui retourne 
le plus grand des deux nombres et afficher le nombre le plus grand.
 */
