package enna.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		
		  if (Administrateur.authentifier()) {
		
		Scanner scanner = new Scanner(System.in);
	    int choix;

	    do {
	        System.out.println("=== Menu Principal ===");
	        System.out.println("1. Gérer les apprenants");
	        System.out.println("2. Gérer les classes");
	        System.out.println("0. Quitter");
	        System.out.print("Votre choix : ");
	        choix = scanner.nextInt();
	        scanner.nextLine(); // Consommer la nouvelle ligne restante

	        switch (choix) {
	            case 1:
	            	 MenuApprenant.afficherMenu(new ArrayList<Apprenant>(), scanner);
	                break;
	            case 2:
	                MenuClasse.afficherMenu();
	                break;
	            case 0:
	                System.out.println("Au revoir !");
	                break;
	            default:
	                System.out.println("Choix invalide. Veuillez choisir une option valide.");
	        }
	    } while (choix != 0);

	    scanner.close();
	    
	  } else {
	
		  System.out.println("Accès refusé. L'application se termine.");
      }
  }

}
