package fr.abp.cours;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char recherche;
        System.out.println("Quel caractère recherchez vous ?");
        Scanner lectureClavier = new Scanner(System.in);
        recherche = lectureClavier.next().charAt(0);
    }
}
