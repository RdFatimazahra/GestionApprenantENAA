package enna.project;

import java.util.Scanner;
import java.io.PrintStream;
import java.util.ArrayList;

public class Classe {
	private static int indexAuto = 1; // Index automatique initialisé à 1
    private int index;
    private String nom;
    private int num;
    private int effectif;
    private ArrayList<Apprenant> listeApprenants;
    

    // Liste des classes
    private static ArrayList<Classe> classes = new ArrayList<>();

    public Classe(String nom, int num, int effectif) {
        this.index = indexAuto++; // Affecter l'index automatique et l'incrémenter
        this.nom = nom;
        this.num = num;
        this.effectif = effectif;
        this.listeApprenants = Apprenant.getListeApprenants(); // Initialiser la liste à partir de la classe Apprenant
    }
    
    // Getters et setters pour l'attribut "nom"
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getters et setters pour l'attribut "num"
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    // Getters et setters pour l'attribut "effectif"
    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    // Getters pour l'attribut "index"
    public int getIndex() {
        return index;
    }
	
    public static void ajouterClasse() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nom de la classe :");
        String nom = scanner.nextLine();

        System.out.println("Entrez le numéro de la classe :");
        int num = scanner.nextInt();
        scanner.nextLine(); // consommer la nouvelle ligne restante

        System.out.println("Entrez l'effectif de la classe :");
        int effectif = scanner.nextInt();
        scanner.nextLine(); // consommer la nouvelle ligne restante

        Classe nouvelleClasse = new Classe(nom, num, effectif);
        classes.add(nouvelleClasse);

        System.out.println("La classe a été ajoutée avec succès.");
    }

    // Méthode pour supprimer une classe
    public static void supprimerClasse() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez l'index de la classe que vous voulez supprimer :");
        int index = scanner.nextInt();
        scanner.nextLine(); // consommer la nouvelle ligne restante

        if (index >= 0 && index < classes.size()) {
            classes.remove(index);
            System.out.println("La classe a été supprimée avec succès.");
        } else {
            System.out.println("L'index de la classe n'existe pas.");
        }
    }

    // Méthode pour modifier une classe
    public static void modifierClasse() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez l'index de la classe que vous voulez modifier :");
        int index = scanner.nextInt();
        scanner.nextLine(); // consommer la nouvelle ligne restante

        if (index >= 0 && index < classes.size()) {
            Classe classe = classes.get(index);

            System.out.println("Entrez le nouveau nom de la classe :");
            String nom = scanner.nextLine();

            System.out.println("Entrez le nouveau numéro de la classe :");
            int num = scanner.nextInt();
            scanner.nextLine(); // consommer la nouvelle ligne restante

            System.out.println("Entrez le nouvel effectif de la classe :");
            int effectif = scanner.nextInt();
            scanner.nextLine(); // consommer la nouvelle ligne restante

            classe.setNom(nom);
            classe.setNum(num);
            classe.setEffectif(effectif);

            System.out.println("Les informations de la classe ont été modifiées avec succès.");
        } else {
            System.out.println("L'index de la classe n'existe pas.");
        }
    }

    // Méthode pour afficher la liste des classes
    public static void afficherClasses() {
        System.out.println("Liste des classes :");
        for (Classe classe : classes) {
            System.out.println(classe);
        }
    }
    
    public static ArrayList<Apprenant> filtrerApprenantsParClasse(int numeroClasse, ArrayList<Apprenant> apprenants) {
        ArrayList<Apprenant> apprenantsClasse = new ArrayList<>();

        // Parcourir la liste des apprenants et ajouter ceux apprenant à la classe spécifiée
        for (Apprenant apprenant : apprenants) {
            if (apprenant.getNumClasse() == numeroClasse) {
                apprenantsClasse.add(apprenant);
            }
        }

        return apprenantsClasse;
    }
    

	@Override
	public String toString() {
		return "Classe [index=" + index + ", nom=" + nom + ", num=" + num + ", effectif=" + effectif
				+ ", listeApprenants=" + listeApprenants + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}