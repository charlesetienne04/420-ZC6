package lacombech;

public class Test {
    public static void main(String[] args) {
        String x = "fred";
        String y = "jo";
        int z = x.compareTo(y);

        if (z == 0){
            afficherResultat("mes variables sont pareilles z=", z);
        }else{
            afficherResultat("mes variables sont différentes z="+z);
        }

        
    }

    public static void afficherResultat(String message, int zz){
        System.out.println(message + zz);
    }
    public static void afficherResultat(String message){
        System.out.println(message);
    }
}
