package com.samanecorp.jsf4.entities;

import java.util.ArrayList;
import java.util.List;

public class Patient {
	
	private int id;
	
	private String nom;
	
	private String prenom;
	
	private String adresse;
	
	private List<RendezVous> rendezvous= new ArrayList<RendezVous>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public List<RendezVous> getRendezvous() {
		return rendezvous;
	}
	public void setRendezvous(List<RendezVous> rendezvous) {
		this.rendezvous = rendezvous;
	}
	public Patient(int id, String nom, String prenom, String adresse, List<RendezVous> rendezvous) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.rendezvous = rendezvous;
	}
	public Patient() {
		super();
	}
	
	
}
