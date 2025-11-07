package lacombech.Jour3.Jour3Tableau;
import java.util.Scanner;
public class Probleme2d3t {
    public static void main(String[] args) {
        double[] nombres = new double[10];
        java.util.Scanner lectureClavier = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Veuillez entrer un nombre réel pour l'indice " + i + " : ");
            nombres[i] = lectureClavier.nextDouble();
        }

        lectureClavier.close();

        System.out.println("Les nombres réels dans le tableau sont :");
        for (double nombre : nombres) {
            System.out.println(nombre);
        }
    }
}

/*  
Problème # 2:
 Déclarez un tableau de réels de longueur 10. À l’aide d’une boucle, demandez un nombre réel 
pour chaque indice du tableau. Affichez le tableau à l’écran.  
 */