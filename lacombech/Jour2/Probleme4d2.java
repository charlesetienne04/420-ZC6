package lacombech.Jour2;

import java.util.Scanner;

public class Probleme4d2 {
    public static void main(String[] args) {
        int i;
        Scanner lectureClavier = new Scanner(System.in);
        do{
            i = saisirNom(lectureClavier);
            
        }while(i >= 100 || i <= 0);
        System.out.println("oui");
    }
    public static int saisirNom(Scanner lecture) {
        int chiffre;
        chiffre = lecture.nextInt();
        return chiffre;
    }


}
