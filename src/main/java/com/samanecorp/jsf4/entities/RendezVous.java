package com.samanecorp.jsf4.entities;

import java.util.Date;

public class RendezVous {

	private int id;
	
	private String libelle;
	
	private Date date;
	
	private Patient patient =new Patient();
	
	private User user =new User();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public RendezVous(int id, String libelle, Date date, Patient patient, User user) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.date = date;
		this.patient = patient;
		this.user = user;
	}
	public RendezVous() {
		super();
	}
}
