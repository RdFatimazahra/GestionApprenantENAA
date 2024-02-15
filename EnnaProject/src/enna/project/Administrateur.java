package enna.project;

import java.util.Scanner;

public class Administrateur {

	
	 private static final String NOM_UTILISATEUR_ATTENDU = "admin";
	    private static final String MOT_DE_PASSE_ATTENDU = "motdepasse";

	    public static boolean authentifier() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Veuillez entrer votre nom d'utilisateur :");
	        String nomUtilisateur = scanner.nextLine();

	        System.out.println("Veuillez entrer votre mot de passe :");
	        String motDePasse = scanner.nextLine();

	        if (nomUtilisateur.equals(NOM_UTILISATEUR_ATTENDU) && motDePasse.equals(MOT_DE_PASSE_ATTENDU)) {
	            System.out.println("Authentification réussie !\n"); 
	            System.out.println("Bienvenue dans votre espace Gestion ENAA");
	            return true;
	        } else {
	            System.out.println("Nom d'utilisateur ou mot de passe incorrect. Veuillez réessayer.");
	            return false;
	        }
	    }


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
