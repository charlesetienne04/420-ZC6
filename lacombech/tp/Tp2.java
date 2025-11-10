package lacombech.tp;

import java.util.Scanner;

public class Tp2 {
    public static void main(String[] args) {
        Scanner lectureClavier = new Scanner(System.in);
        String[] Equipe = { "mon", "que", "lav", "ter" };
        int[] PartieJouees = { 2, 2, 2, 2 };
        int[] Victoires = { 1, 1, 0, 0 };
        int[] Defaites = { 1, 0, 0, 1 };
        int[] Nulles = { 0, 1, 2, 1 };
        int[] Points = { 3, 4, 2, 1 };
        calculerResultat(lectureClavier, Equipe, PartieJouees, Victoires, Defaites, Nulles, Points);

    }

    public static void calculerResultat(Scanner lectureClavier, String[] Equipe, int[] PartieJouees, int[] Victoires, int[] Defaites, int[] Nulles, int[] Points ) {
            while (true) {
            String[] nom_Equipe = new String[2];
            int[] nb_Buts = new int[2];
            String choix = "";
            int i2 = -1, i3 = -1;
            System.out.println("Veuiller entrer le nom de l'equipe visiteuse");
            nom_Equipe[0] = lectureClavier.nextLine().toLowerCase();
            System.out.println("Veuiller entrer le nom de l'equipe locale");
            nom_Equipe[1] = lectureClavier.nextLine().toLowerCase();
            System.out.println("Veuiller entrer le nombre de buts de l'equipe visiteuse");
            nb_Buts[0] = lectureClavier.nextInt();
            System.out.println("Veuiller entrer le nombre de buts de l'equipe locale");
            nb_Buts[1] = lectureClavier.nextInt();
            for (int i = 0; i < 4; i++) {
                if (nom_Equipe[0].equals(Equipe[i])) {
                    i2 = i;
                }
                if (nom_Equipe[1].equals(Equipe[i])) {
                    i3 = i;
                }

            }
            PartieJouees[i2]++;
            PartieJouees[i3]++;
            if (nb_Buts[0] > nb_Buts[1]) {
                Victoires[i2]++;
                Defaites[i3]++;
            } else if (nb_Buts[1] > nb_Buts[0]) {
                Victoires[i3]++;
                Defaites[i2]++;
            } else {
                Nulles[i2]++;
                Nulles[i3]++;
            }
            Points[i2] += nb_Buts[0];
            Points[i3] += nb_Buts[1];

                if (choix.equals("o")) {
                    break;
                }else{
                    System.out.println("Resultat\n-----------\n");
                    afficherResultat(nom_Equipe, nb_Buts);
                    afficherResultat2( Equipe, PartieJouees, Victoires, Defaites, Nulles, Points);
                    break;
                }
        }
    }

    public static void afficherResultat(String[] nom_Equipe, int[] nb_Buts) {
        System.out.println("Equipe visiteuse : " + nom_Equipe[0] + "\nNombre de buts : " + nb_Buts[0] + "\nEquipe locale : " + nom_Equipe[1] + "\nNombre de buts : " + nb_Buts[1]+ "\n");
    }
    public static void afficherResultat2(String[] Equipe, int[] PartieJouees, int[] Victoires, int[] Defaites, int[] Nulles, int[] Points) {
        System.out.println("Classement\n\nEquipe\t\tPJ  V  D  N  Pts\n----------------------------------\nJunior Montreal " + PartieJouees[0] + "  " + Victoires[0] + "  " + Defaites[0] + "  " + Nulles[0] + "  " + Points[0] + "\nRemparts Quebec " + PartieJouees[1] + "  " + Victoires[1] + "  " + Defaites[1] + "  " + Nulles[1] + "  " + Points[1] + "\nAigles Laval " + PartieJouees[2] + "  " + Victoires[2] + "  " + Defaites[2] + "  " + Nulles[2] + "  " + Points[2] + "\nEperviers Terrebonne " + PartieJouees[3] + "  " + Victoires[3] + "  " + Defaites[3] + "  " + Nulles[3] + "  " + Points[3]);
    }
}
