package lacombech.Jour3;

import java.util.Scanner;

public class Probleme5d3 {
    public static void main(String[] args) {
        char typeConversion;
        double temperature;
        double temperatureConvertie = 0;
        String s;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Quel est le type de température à convertir (C/c ou F/f) ?");
        typeConversion = lectureClavier.next().charAt(0);
        System.out.println("Veuillez entrer la température à convertir : ");
        temperature = lectureClavier.nextDouble();
        lectureClavier.close();
        if (typeConversion == 'C' || typeConversion == 'c') {
            temperatureConvertie = celsiusAFahrenheit(temperature);
            s = String.format("%.2f", temperatureConvertie);
            System.out.println(temperature + " degrés Celsius est égal à " + s + " degrés Fahrenheit.");
        } else if (typeConversion == 'F' || typeConversion == 'f') {
            s = String.format("%.2f", temperatureConvertie);
            temperatureConvertie = fahrenheitACelsius(temperature);
            System.out.println(
                    temperature + " degrés Fahrenheit est égal à " + temperatureConvertie + " degrés Celsius.");
        } else {
            System.out.println(
                    "Type de conversion invalide. Veuillez entrer 'C' pour Celsius à Fahrenheit ou 'F' pour Fahrenheit à Celsius.");
        }
    }

    public static double celsiusAFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}

/*
 * Problème # 5:
 * On vous demande de créer un petit programme qui permet de convertir une
 * température de
 * Celsius à fahrenheit ou de fahrenheit à Celsius en utilisant les méthodes.
 * On doit demander à l’écran le type de conversion voulu (C/c ou F/f). Ensuite,
 * on doit demander
 * la température à convertir (peut être un nombre réel). On convertit notre
 * température et on
 * affiche celle-ci.
 * Formule Celsius à fahrenheit: Celcius*9/5 + 32
 * Formule fahrenheit à Celsius: (Fahrenheit – 32)*5/9
 */