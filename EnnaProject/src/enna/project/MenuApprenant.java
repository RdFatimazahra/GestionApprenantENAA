package enna.project;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuApprenant {
	 public static void afficherMenu(ArrayList<Apprenant> listeApprenants, Scanner scanner) {
	        int choix;

	        do {
	            System.out.println("Menu:");
	            System.out.println("1. Ajouter un apprenant");
	            System.out.println("2. Afficher la liste des apprenants");
	            System.out.println("3. Rechercher un apprenant");
	            System.out.println("4. Modifier les informations d'un apprenant");
	            System.out.println("5. Supprimer un apprenant");
	            System.out.println("6. Retour au menu principal");

	            System.out.println("Entrez votre choix :");
	            choix = scanner.nextInt();
	            scanner.nextLine(); // consommer la nouvelle ligne restante

	            switch (choix) {
	                case 1:
	                    Apprenant.ajouter(listeApprenants);
	                    break;
	                case 2:
	                    Apprenant.afficher(listeApprenants);
	                    break;
	                case 3:
	                    Apprenant.rechercher(listeApprenants);
	                    break;
	                case 4:
	                    Apprenant.modifier(listeApprenants);
	                    break;
	                case 5:
	                    Apprenant.supprimer(listeApprenants);
	                    break;
	                case 6:
	                    System.out.println("Retour au menu principal...");
	                    break;
	                default:
	                    System.out.println("Choix invalide, veuillez réessayer.");
	            }
	        } while (choix != 6);
	    }

	    public static void main(String[] args) {
	        // Exemple d'utilisation de la méthode afficherMenu
	        ArrayList<Apprenant> listeApprenants = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);
	        afficherMenu(listeApprenants, scanner);
	    }
	}