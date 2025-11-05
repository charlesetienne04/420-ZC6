package lacombech.Jour1;

public class Probleme3 {
    public static void main(String[] args) {
        int age1 = 30;
        int age2 = 60;
        int temp1;
        temp1 = ifnum1(age1, age2);
        if (temp1 == 1) {
            afficherResultat2();
        }

    }

    public static int ifnum1(int x, int y) {
        int i = 0;
        i = (x + y) / 2;
        afficherResultat(i);
        if (x < y) {
            afficherResultat(y);
            return y;
        } else if (x > y) {
            afficherResultat(x);
            return x;
        } else {
            i = 1;
            return i;
        }

    }

    public static void afficherResultat(int message) {
        System.out.println(message);
    }

    public static void afficherResultat2() {
        System.out.println("les deux âges sont égals");
    }
}
