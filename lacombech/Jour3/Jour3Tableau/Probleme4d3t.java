package lacombech.Jour3.Jour3Tableau;
public class Probleme4d3t {
    public static void main(String[] args) {
        int[] nombres = new int[5];
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = (int) (Math.random() * 101); // Nombres aléatoires entre 0 et 100
        }
        int valeurMax = nombres[0], valeurMin = nombres[0], positionMax = 0, positionMin = 0;
        for (int i = 1; i < nombres.length; i++) {
            if (nombres[i] > valeurMax) {
                valeurMax = nombres[i];
                positionMax = i;
            }
            if (nombres[i] < valeurMin) {
                valeurMin = nombres[i];
                positionMin = i;
            }
        }
        System.out.println("Valeur la plus grande : " + valeurMax + " à la position " + positionMax);
        System.out.println("Valeur la plus petite : " + valeurMin + " à la position " + positionMin);
    }
}
/*  
Problème # 4:
 Déclarez un tableau d’entiers de longueur 5. Mettez des nombres aléatoires déterminés par 
l’ordinateur entre 0 et 100. Par la suite, affichez la valeur la plus grande et la valeur la plus 
petite. Ensuite, donnez la position dans le tableau de la valeur le plus grande et la valeur la plus 
petite. 
 */
