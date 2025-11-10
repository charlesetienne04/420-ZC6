package lacombech.Jour3.Jour3Tableau;

public class Probleme8d3t {
    public static void main(String[] args) {
        String[] Etudiants = new String[100];
        int[] tp1 = new int[100];
        int[] tp2 = new int[100];
        int[] examen1 = new int[100];
        Etudiants[0] = "Pierre";
        Etudiants[1] = "Andre";
        Etudiants[2] = "Julie";
        tp1[0] = 65;
        tp1[1] = 78;
        tp1[2] = 43;
        tp2[0] = 45;
        tp2[1] = 55;
        tp2[2] = 67;
        examen1[0] = 34;
        examen1[1] = 65;
        examen1[2] = 21;
        double[] moyenne = new double[tp1.length];
            
       moyenne = calculerMoyenne(tp1, tp2, examen1);
       afficherMoyenne(moyenne, Etudiants);


    }
    public static double[] calculerMoyenne(int tp1 [], int tp2 [], int examen1 []) {
        double[] moyenne = new double[tp1.length];
        for (int i = 0; i < moyenne.length; i++) {
            moyenne[i] = (tp1[i] + tp2[i] + examen1[i]) / 3;
        }
        return moyenne;
    }
    public static void afficherMoyenne(double[] moyenne, String[] Etudiants) {
        for (int i = 0; i < moyenne.length; i++) {
            if (moyenne[i] != 0){
                System.out.println("La moyenne de " + Etudiants[i] + " est de " + moyenne[i]);
            }
            
        }
    }
}


/*
  package lacombech.Jour3.Jour3Tableau;

public class Probleme8d3t {
    public static void main(String[] args) {
        String[] Etudiants = new String[100];
        int[][] results = {{65, 45, 34}, {78, 55, 65}, {43, 67, 21}};
        Etudiants[0] = "Pierre";
        Etudiants[1] = "Andre";
        Etudiants[2] = "Julie";
        double[] moyenne = new double[results.length];
            
       moyenne = calculerMoyenne(results);
       afficherMoyenne(moyenne, Etudiants);


    }
    public static double[] calculerMoyenne(int results[][]) {
        double[] moyenne = new double[results.length];
        for (int i = 0; i < moyenne.length; i++) {
            moyenne[i] = (results[i]) / 3;
        }
        return moyenne;
    }
    public static void afficherMoyenne(double[] moyenne, String[] Etudiants) {
        for (int i = 0; i < moyenne.length; i++) {
            if (moyenne[i] != 0){
                System.out.println("La moyenne de " + Etudiants[i] + " est de " + moyenne[i]);
            }
            
        }
    }
}
 */