package enna.project;

import java.util.Scanner;
import java.io.PrintStream;
import java.util.ArrayList;


public class Apprenant {

	private static int indexAuto = 1; 
	private int index;
	private String nom;
	private String prenom;
	private String DateNaissance;
	private int NumTel;
	private String adresse;
	private int numClasse;
	private ArrayList<Apprenant> listeApprenants;
	
	public Apprenant (String nom,String prenom,String DateNaissance,int NumTel,String adresse, int numClasse) {
		
		this.index = indexAuto++;
		this.nom=nom;
		this.prenom=prenom;
		this.DateNaissance= DateNaissance;
		this.NumTel=NumTel;
		this.adresse=adresse;
		this.numClasse=numClasse;
		this.listeApprenants= new ArrayList<>();
	
	}
	
	//Getters :
	
	

	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		 return prenom;
	}
	
	public String getDateNaissance() {
		return DateNaissance;
	}
	
	public int getNumTel() {
		return NumTel;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public int getNumClasse() {
		return numClasse;
	}
	
	// Getters pour l'attribut "index"
    public int getIndex() {
        return index;
    }
	
	//Setters :
	
	public void setNom(String nom) {
		this.nom=nom;
		
	}
	
	public void setPrenom(String prenom) {
		this.prenom=prenom;
	}
	
	public void setDateNaissance(String DateNaissance) {
		this.DateNaissance=DateNaissance;
		
	}
	
	public void setNumTel(int NumTel) {
		this.NumTel=NumTel;
		
	}

	public void setAdresse(String adresse) {
		this.adresse=adresse;
		
	}
	
	public void setNumClasse(int numClasse) {
		this.numClasse=numClasse;
		
	}
	
	
	// Méthode pour ajouter un apprenant
    public static void ajouter(ArrayList<Apprenant> listeApprenants) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nom de l'apprenant :");
        String nom = scanner.nextLine();

        System.out.println("Entrez le prénom de l'apprenant :");
        String prenom = scanner.nextLine();

        System.out.println("Entrez la date de naissance de l'apprenant :");
        String dateNaissance = scanner.nextLine();

        System.out.println("Entrez le numéro de téléphone de l'apprenant :");
        int numeroTelephone = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Entrez l'adresse de l'apprenant :");
        String adresse = scanner.nextLine();
        
        System.out.println("Entrez le numéro de classe de l'apprenant :");
        int numeroClasse = scanner.nextInt();
        scanner.nextLine(); // consommer la nouvelle ligne restante

        // Création d'un nouvel apprenant avec les informations entrées par l'utilisateur
        Apprenant nouvelApprenant = new Apprenant(nom, prenom, dateNaissance, numeroTelephone, adresse, numeroClasse);

        // Ajout du nouvel apprenant à la liste
        listeApprenants.add(nouvelApprenant);
        System.out.println("L'apprenant a été ajouté avec succès.");
    }

    // Méthode pour afficher la liste des apprenants
    public static void afficher(ArrayList<Apprenant> listeApprenants) {
        System.out.println("Liste des apprenants :");
        for (Apprenant apprenant : listeApprenants) {
            System.out.println(apprenant);
        }
    }

    // Méthode pour supprimer un apprenant
    public static void supprimer(ArrayList<Apprenant> listeApprenants) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez l'index de l'apprenant que vous voulez supprimer :");
        int index = scanner.nextInt();
        scanner.nextLine(); // consommer la nouvelle ligne restante

        if (index >= 0 && index < listeApprenants.size()) {
            listeApprenants.remove(index);
            System.out.println("L'apprenant a été supprimé avec succès.");
        } else {
            System.out.println("L'index de l'apprenant n'existe pas.");
        }
    }

    // Méthode pour modifier les informations d'un apprenant
    public static void modifier(ArrayList<Apprenant> listeApprenants) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez l'index de l'apprenant que vous voulez modifier :");
        int index = scanner.nextInt();
        scanner.nextLine(); // consommer la nouvelle ligne restante

        if (index >= 0 && index < listeApprenants.size()) {
            Apprenant apprenant = listeApprenants.get(index);

            System.out.println("Entrez le nouveau nom de l'apprenant :");
            String nom = scanner.nextLine();

            System.out.println("Entrez le nouveau prénom de l'apprenant :");
            String prenom = scanner.nextLine();

            System.out.println("Entrez la nouvelle date de naissance de l'apprenant :");
            String dateNaissance = scanner.nextLine();

            System.out.println("Entrez la nouvelle adresse de l'apprenant :");
            String adresse = scanner.nextLine();

            System.out.println("Entrez le nouveau numéro de téléphone de l'apprenant :");
            int numeroTelephone = scanner.nextInt();

            System.out.println("Entrez le nouveau numéro de classe de l'apprenant :");
            int numeroClasse = scanner.nextInt();
            scanner.nextLine(); // consommer la nouvelle ligne restante

            apprenant.setNom(nom);
            apprenant.setPrenom(prenom);
            apprenant.setDateNaissance(dateNaissance);
            apprenant.setAdresse(adresse);
            apprenant.setNumTel(numeroTelephone);
            apprenant.setNumClasse(numeroClasse);

            System.out.println("Les informations de l'apprenant ont été modifiées avec succès.");
        } else {
            System.out.println("L'index de l'apprenant n'existe pas.");
        }
    }

    // Méthode pour rechercher un apprenant par nom ou prénom
    public static void rechercher(ArrayList<Apprenant> listeApprenants) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nom ou le prénom de l'apprenant que vous voulez rechercher :");
        String critere = scanner.nextLine();

        boolean found = false;
        for (Apprenant apprenant : listeApprenants) {
            if (apprenant.getNom().equalsIgnoreCase(critere) || apprenant.getPrenom().equalsIgnoreCase(critere)) {
                System.out.println(apprenant);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Aucun apprenant trouvé avec ce critère de recherche.");
        }
    }

    // Méthode toString pour afficher les informations d'un apprenant
    @Override
    public String toString() {
    	
        return 	"Index : " +index + " \n" +
        		"Nom : " + nom + "\n" +
                "Prénom : " + prenom + "\n" +
                "Date de naissance : " + DateNaissance + "\n" +
                "Adresse : " + adresse + "\n" +
                "Numéro de téléphone : " + NumTel + "\n" +
                "Numéro de classe : " + numClasse;
    }
	 
	 
	public static void main(String[] args) {
		 
	    }

	public static ArrayList<Apprenant> getListeApprenants() {
		// TODO Auto-generated method stub
		return null;
	}
}
