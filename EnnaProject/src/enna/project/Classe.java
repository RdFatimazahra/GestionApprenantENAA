package enna.project;

import java.util.ArrayList;

public class Classe {

	private String nom;
	private int num;
	private int effectif;
	private ArrayList<Apprenant> apprenants;
	
	 
	public Classe (String nom,int num,int effectif) {
		
		this.nom=nom;
		this.num=num;
		this.effectif=effectif;
		this.apprenants= new ArrayList<>();
		
	}
	
	public String getNom() {
		 return nom;
	}
	
	public void setNom(String nom) {
		this.nom=nom;
	}
	
	public int getNum() {
		 return num;
	}
	
	public void setNum(int num) {
		this.num=num;
	}
	
	
	public int getEffectif() {
		 return effectif;
	}
	
	public void setEffectif(int effectif) {
		this.effectif=effectif;
	}
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
