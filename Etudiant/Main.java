package Etudiant;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int choix = 0;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1. Ajouter un étudiant");
            System.out.println("2. Afficher la liste des étudiants");
            System.out.println("3. Supprimer un étudiant");
            System.out.println("4. Quitter");
            choix = sc.nextInt();
        }while(choix != 4);
        sc.close();
    }