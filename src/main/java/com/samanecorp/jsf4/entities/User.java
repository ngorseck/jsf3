package com.samanecorp.jsf4.entities;

import java.util.ArrayList;
import java.util.List;

public class User {

	private int id;
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	private String password;
	
	private List<RendezVous> rendezVous= new ArrayList<RendezVous>();
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<RendezVous> getRendezVous() {
		return rendezVous;
	}
	public void setRendezVous(List<RendezVous> rendezVous) {
		this.rendezVous = rendezVous;
	}
	
	public User(int id, String nom, String prenom, String email, String password, List<RendezVous> rendezVous) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.rendezVous = rendezVous;
	}
	public User() {
		super();
	}
}
