package fr.abp.cours;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int valeur;
        Scanner lectureClavier = new Scanner(System.in);
        do {
            System.out.println("Entrez une valeur");
            valeur = lectureClavier.nextInt();

        } while (valeur < 0 || valeur < 100);

        System.out.println("Vous avez saisi la valeur " + valeur);
    }
}
