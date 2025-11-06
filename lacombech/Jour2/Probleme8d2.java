package lacombech.Jour2;

import java.util.*;

public class Probleme8d2 {
    public static void main(String[] args) {
        Scanner lectureClavier = new Scanner(System.in);

        ArrayList<String> mots = new ArrayList<String>();

        while(true){
            String mot = lectureClavier.nextLine().toLowerCase();
            if(mot.equals("stop")) {
                break;
            }
            mots.add(mot);
        }

        System.out.println("Premier mot (ordre alphabétique) : " + mots.getFirst());
        System.out.println("Dernier mot (ordre alphabétique) : " + mots.getLast());

        lectureClavier.close();

    }
}
