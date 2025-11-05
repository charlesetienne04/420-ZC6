package lacombech.Jour1;

/*import java.util.Scanner; */

public class Probleme5 {
    public static void main(String[] args) {
        double montant = 60;
        rabais(montant);
        /* 
        Scanner lectureClavier = new Scanner(System.in);

        lectureClavier.close();*/
    }
    /*public static double saisirNom(Scanner lecture) {
        double chiffre;
        chiffre = lecture.nextDouble();
        return chiffre;
    }*/
    public static void rabais(double montant) {
        montant = montant - (montant * 0.25);
        afficherResultat(montant);
    }
    public static void afficherResultat(double message) {
        System.out.println(message);
    }

}
