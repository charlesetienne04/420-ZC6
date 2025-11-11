package lacombech.examjava;

public class Exam {
    public static void main(String[] args) {
        String[] tab_ville = {"Le caire", "New York", "Paris", "Calcutta", "Barcelone", "Manille", "Montreal", "Hong Kong"};
        double[] tab_superficie = {210, 1214, 105.4, 185, 100.4, 38.55, 363.52, 1104};
        int tab_population[] = {8452409, 8391881, 2211297, 4580544, 1621537, 1660714, 1667700, 7018636};
        double tab_densite[] = new double[tab_ville.length];
        tab_densite = densite(tab_population, tab_superficie, tab_densite);
        afficherTableau(tab_ville, tab_superficie, tab_population, tab_densite);
    }
    public static double[] densite(int[] tab_population, double[] tab_superficie, double[] tab_densite) {
        for (int i = 0; i < tab_densite.length; i++) {
        tab_densite[i] = tab_population[i] / tab_superficie[i];
        }
        return tab_densite;
    }
    /*en utilisant votre éditeur de code, écrire une méthode qui reçoit en paramètres les 4 tableaux et qui affiche leurs résultats en println de la façon suivante :
     Ville Superficie Population Densité
     -----------------------------------
     -----------------------------------
     ville1 superficie1 population1 densité1
     ville2 superficie2 population2 densité2
     ...
    */
    public static void afficherTableau(String[] tab_ville, double[] tab_superficie, int[] tab_population, double[] tab_densite) {
        System.out.println("Ville\t\t" + "Superficie\t" + "Population\t" + "Densité");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < tab_ville.length; i++) {
            System.out.printf("%-15s %-15.2f %-15d %-15.2f%n", tab_ville[i], tab_superficie[i], tab_population[i], tab_densite[i]);
        }
    }

}
