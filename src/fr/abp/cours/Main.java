package fr.abp.cours;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;
        char aTrouver;
        char recherche;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Quel caractère recherchez vous ?");
        recherche = lectureClavier.next().charAt(0);

        for (i = 0; i <= 127; i++) {
            aTrouver = (char) i;
            if (aTrouver == recherche) {
                System.out.println("le code Unicode de " + aTrouver + " est \\u00" + Integer.toString(i, 16));
            }
        }
    }
}
