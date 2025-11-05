package lacombech.Jour1;

public class Probleme2 {
    public static void main(String[] args) {
        double salaire = 9.30;
        int heuresem = 60;
        double salairequinze = calculSalaire(salaire, heuresem);
        afficherResultat(salairequinze);
    }

    public static double calculSalaire(double sal, int heuresem) {
        double total;
        total = sal * heuresem;
        return total;
    }

    public static void afficherResultat(double message) {
        System.out.println(message);
    }
}