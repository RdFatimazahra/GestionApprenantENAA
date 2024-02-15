package enna.project;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuClasse {

	public static void afficherMenu() {
		Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("=== Gestion des classes ===");
            System.out.println("1. Ajouter une classe");
            System.out.println("2. Supprimer une classe");
            System.out.println("3. Modifier une classe");
            System.out.println("4. Afficher la liste des classes");
            System.out.println("5. Filtrer apprenant par classe");
            System.out.println("0. Retour au menu principal");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne restante

            switch (choix) {
                case 1:
                    Classe.ajouterClasse(); // Appel de la méthode pour ajouter une classe
                    break;
                case 2:
                    Classe.supprimerClasse(); // Appel de la méthode pour supprimer une classe
                    break;
                case 3:
                    Classe.modifierClasse(); // Appel de la méthode pour modifier une classe
                    break;
                case 4:
                    Classe.afficherClasses(); // Appel de la méthode pour afficher la liste des classes  
                    break;
                case 5:
                	 // Demander à l'utilisateur le numéro de classe à filtrer
                    System.out.print("Entrez le numéro de classe à filtrer : ");
                    int numeroClasse = scanner.nextInt();
                    scanner.nextLine(); // Consommer la nouvelle ligne restante
                    
                    // Passer la liste des apprenants en tant qu'argument à la méthode de filtrage
                    ArrayList<Apprenant> apprenantsFiltres = Classe.filtrerApprenantsParClasse(numeroClasse, Apprenant.getListeApprenants());
                    
                    // Afficher les apprenants filtrés
                    if (apprenantsFiltres.isEmpty()) {
                        System.out.println("Aucun apprenant trouvé pour la classe spécifiée.");
                    } else {
                        System.out.println("Apprenants de la classe " + numeroClasse + " :");
                        for (Apprenant apprenant : apprenantsFiltres) {
                            System.out.println(apprenant);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Retour au menu principal...");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        } while (choix != 0);
   }
	
	public static void main(String[] args) {
	

	}

}
