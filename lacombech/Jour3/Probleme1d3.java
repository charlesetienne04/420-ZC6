package lacombech.Jour3;
import java.util.Scanner;
public class Probleme1d3 {
    public static void main(String[] args) {
        int rayon;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Veuillez entrer le rayon du cercle (nombre entier) : ");
        rayon = lectureClavier.nextInt();
        lectureClavier.close();
        double circonference = circonference(rayon);
        System.out.println("La circonférence du cercle de rayon " + rayon + " est de : " + circonference);
    }
    public static double circonference(int r) {
        return 2 * Math.PI * r;
    }
}
/*  
 *  Problème # 1:
 Créer une fonction circonference d’un cercle. Vous devez demander à l’écran le rayon (nombre 
entier), appeler la fonction et afficher par la suite la circonférence (nombre réel).
 */