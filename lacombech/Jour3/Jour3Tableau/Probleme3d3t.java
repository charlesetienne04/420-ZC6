package lacombech.Jour3.Jour3Tableau;
public class Probleme3d3t {
    public static void main(String[] args) {
        int[] tableauOriginal = new int[10];
        int[] tableauInverse = new int[10];

        // Remplir le tableau original avec des nombres aléatoires
        for (int i = 0; i < tableauOriginal.length; i++) {
            tableauOriginal[i] = (int)(Math.random() * 100); // Nombres aléatoires entre 0 et 99
        }

        // Inverser les éléments dans le nouveau tableau
        for (int i = 0; i < tableauOriginal.length; i++) {
            tableauInverse[i] = tableauOriginal[tableauOriginal.length - 1 - i];
        }

        // Afficher les deux tableaux
        System.out.println("Tableau original :");
        for (int nombre : tableauOriginal) {
            System.out.print(nombre + " ");
        }
        System.out.println();

        System.out.println("Tableau inversé :");
        for (int nombre : tableauInverse) {
            System.out.print(nombre + " ");
        }
        System.out.println();

    }
}
/*  
Problème # 3:
 Déclarez un tableau d’entiers de nombre aléatoire. Ensuite, inversez les éléments de votre 
tableau dans un nouveau tableau. De 1 à N du tableau1 devient de N à 1 dans le tableau2. 
Affichez les deux tableaux. 
 */