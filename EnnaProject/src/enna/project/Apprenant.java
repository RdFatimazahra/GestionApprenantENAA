package enna.project;

import java.io.PrintStream;
import java.util.ArrayList;

public class Apprenant {

	private String nom;
	private String prenom;
	private String DateNaiss;
	private int NumTel;
	private String adresse;
	private int numClasse;
	private ArrayList<Apprenant> apprenants;
	
	public Apprenant (String nom,String prenom,String DateNaiss,int NumTel,String adresse, int numClasse) {
		
		this.nom=nom;
		this.prenom=prenom;
		this.DateNaiss=DateNaiss;
		this.NumTel=NumTel;
		this.adresse=adresse;
		this.numClasse=numClasse;
		this.apprenants= new ArrayList<>();
	
	}
	
	//Getters :
	
	

	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		 return prenom;
	}
	
	public String getDateNaiss() {
		return DateNaiss;
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
	
	//Setters :
	
	public void setNom(String nom) {
		this.nom=nom;
		
	}
	
	public void setPrenom(String prenom) {
		this.prenom=prenom;
	}
	
	public void setDateNaiss(String DateNaiss) {
		this.DateNaiss=DateNaiss;
		
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
	
	@Override
	public String toString() {
		return "Apprenant [nom=" + nom + ", prenom=" + prenom + ", DateNaiss=" + DateNaiss + ", NumTel=" + NumTel
				+ ", adresse=" + adresse + ", numClasse=" + numClasse + "]";
	}
	
	public void AjouterApprenant(Apprenant apprenant) {
		apprenants.add(apprenant);
		
	}
	public static void  AfficherList() {
		System.out.println("La liste des apprenants :");
		for(Apprenant apprenant:apprenants) {
			System.out.println("apprenants");
		}
		
	}
	
	

	public static void main(String[] args) {

		Apprenant apprenant1= new Apprenant(null, null, null, 0, null, 0);
		Apprenant apprenant2= new Apprenant("test","test","12/12/2000",0611223344,"test d adresse",2);
		System.out.println(AfficherList());
	}

}
