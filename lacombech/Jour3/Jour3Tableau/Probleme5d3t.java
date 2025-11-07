package lacombech.Jour3.Jour3Tableau;

public class Probleme5d3t {
    public static void main(String[] args) {
        int[] nombres = new int[10];
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = (int) (Math.random() * 101); // Nombres aléatoires entre 0 et 100
        }

        System.out.println("Tableau avant permutation :");
        afficherTableau(nombres);

        // Permutation des éléments
        for (int i = 0; i < nombres.length / 2; i++) {
            int temp = nombres[i];
            nombres[i] = nombres[nombres.length - 1 - i];
            nombres[nombres.length - 1 - i] = temp;
        }

        System.out.println("Tableau après permutation :");
        afficherTableau(nombres);
    }

    public static void afficherTableau(int[] tableau) {
        for (int nombre : tableau) {
            System.out.print(nombre + " ");
        }
        System.out.println();
    }
}

/*  
Problème # 5:
 Déclarez un tableau d’entiers de longueur 10. Mettre des nombres aléatoires déterminés par 
l’ordinateur entre 0 et 100. Affichez le tableau. 
Permutez la première case et la dernière case ensemble, la deuxième case et l’avant-dernière 
case ensemble, etc. Réaffichez le tableau. 
Utilisez une méthode paramétrée pour afficher votre tableau. 
 */