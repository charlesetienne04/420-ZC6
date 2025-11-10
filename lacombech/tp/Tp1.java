package lacombech.tp;

import java.util.*;

public class Tp1 {
    public static void main(String[] args) {
        int choix = 0, r1 = (int) (Math.random() * 20), nombre = 0;
        ;
        double argent = 0;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println(
                "Choisir une option (1-3) >>>\n-------------------------------\n\n1) Transformer $$$ en monnaie\n2) Jeu trouver un nombre mystère\n3) Quitter\n\nChoix :");
        while (true) {
            choix = lectureClavier.nextInt();
            if (choix == 1) {
                double[] temp = { 100, 50, 20, 10, 5, 2, 1, 0.25, 0.10, 0.05, 0.01 };
                System.out.print("Insérer un montant en $ (format = 188,88)>>> ");
                argent = lectureClavier.nextDouble();
                for (int i = 0; i < temp.length; i++) {
                    int temp2 = 0;
                    if (argent - temp[i] >= 0) {
                        while (true) {
                            {
                                if (argent - temp[i] >= 0) {
                                    argent -= temp[i];
                                    temp2++;
                                } else {
                                    System.out.println(temp2 + "x" + temp[i] + "$");
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            } else if (choix == 2) {
                for (int i = 0; i < 6; i++) {
                    System.out.print("Veuiller entrer un nombre entre 0 et 20 >>> ");
                    nombre = lectureClavier.nextInt();
                    if (nombre == r1) {
                        System.out.println("Trouvé en " + (i + 1) + " essais");
                        break;
                    } else if (nombre < r1) {
                        System.out.println(nombre + " est trop bas.");
                    } else {
                        System.out.println(nombre + " est trop haut.");
                    }
                }
                if (nombre != r1) {
                    System.out.println("Vous n'avez pas trouvé le nombre. Le nombre était : " + r1);
                }
                break;
            } else if (choix == 3) {
                System.exit(0);
            } else {
                System.out.println("Choix invalide.");
            }
        }
        lectureClavier.close();
    }

}