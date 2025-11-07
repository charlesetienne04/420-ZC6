package lacombech.Jour3.Jour3Tableau;

public class Probleme6d3t {
    public static void main(String[] args) {
        int[] nombres = { -65, -34, 7, -3, -43, 14, 23, -9, 45, 11 };
        int sommePositifs = 0, sommeNegatifs = 0, sommeNegatifsB = 0, sommePositifsB = 0;
        int[] nombresAleatoires = new int[10];

        for (int i : nombres) {
            if (i > 0) {
                sommePositifs += i;
            } else {
                sommeNegatifs += i;
            }
        }
        // Partie B
        for (int i = 0; i < nombresAleatoires.length; i++) {
            nombresAleatoires[i] = (int) (Math.random() * 201) - 100; // Nombres aléatoires entre -100 et 100
        }
        for (int i : nombresAleatoires) {
            if (i > 0) {
                sommePositifsB += i;
            } else {
                sommeNegatifsB += i;
            }
        }
        System.out.println("Somme des éléments positifs : " + sommePositifs);
        System.out.println("Somme des éléments négatifs : " + sommeNegatifs);
        System.out.println("Somme des éléments positifs deuxieme : " + sommePositifsB);
        System.out.println("Somme des éléments négatifs deuxieme : " + sommeNegatifsB);

    }
}

/*
 * Problème # 6:
 * A. Soit le tableau d’entiers ci-dessous: -65 -34 7 -3 -43 14 23 -9 45 11
 * Déclarez le tableau. À l’aide d’une boucle FOR, parcourez le tableau et
 * déterminez la somme
 * des éléments positifs et la somme des éléments négatifs du tableau. Affichez
 * les deux sommes.
 * B. Déclarez le tableau de valeurs aléatoires entre -100 et 100. À l’aide
 * d’une boucle FOR,
 * parcourez le tableau et déterminez la somme des éléments positifs et la somme
 * des
 * éléments négatifs du tableau. Affichez les deux sommes.
 */