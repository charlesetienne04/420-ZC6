package lacombech.Jour3.Jour3Tableau;

public class Probleme7d3t {
    public static void main(String[] args) {
        int[] nombres = new int[10];
        int[] occurrences = new int[5];
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = (int) (Math.random() * 5); // Nombres aléatoires entre 0 et 4
        }

        for (int i = 0; i < occurrences.length; i++) {
            occurrences[i] = compterOccurrences(nombres, i);
        }

        System.out.println("Tableau des nombres :");
        for (int nombre : nombres) {
            System.out.print(nombre + " ");
        }
        System.out.println("\nNombre d'occurrences pour chaque élément :");
        for (int i = 0; i < occurrences.length; i++) {
            afficherOccurrences(i, occurrences[i]);
        }
    }

    public static int compterOccurrences(int[] tableau, int valeur) {
        int compteur = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (i == valeur) {
                compteur++;
            }
        }
        return compteur;
    }

    public static void afficherOccurrences(int valeur, int occurrences) {
        System.out.println("Valeur " + valeur + " apparaît " + occurrences + " fois.");
    }
}
/*  
Problème # 7:
 Déclarez un tableau d’entiers de longueur 10. Mettre des nombres aléatoires déterminés par 
l’ordinateur entre 0 et 4.  
En utilisant un nouveau tableau, déterminez le nombre de fois que chaque élément apparaît 
dans le tableau. Utilisez une méthode paramétrée pour trouver le nombre d’occurrences dans 
le tableau. 
Affichez le tableau et affichez le nombre d’occurrences pour chaque élément du tableau (0, 1, 
2, 3, 4). Utilisez une méthode paramétrée pour afficher votre le nombre d’occurrences
 */