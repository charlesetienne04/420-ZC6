package lacombech.Jour2;
import java.util.*;

public class Probleme9d2 {
   public static double circonference(double rayon){
        return 2 * Math.PI * rayon;
    }
    public static void main(String[] args) {
        Scanner lectureClavier = new Scanner(System.in);

        System.out.print("Insérer le rayon d'un cercle >>> ");
        System.out.print("Rayon: " + circonference(lectureClavier.nextDouble()));

        lectureClavier.close();
    }
}