package com.samanecorp.jsf4.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import org.primefaces.event.SelectEvent;

import com.samanecorp.jsf4.entities.Patient;
import com.samanecorp.jsf4.entities.User;

@ManagedBean(name="patientbean")
@RequestScoped
public class PatientBean implements Serializable {
	//@EJB
	//private IPatient patientdao;
	
	private Patient patient;
	
	public PatientBean() throws IOException, ServletException {
		//Gestion des sessions
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession)facesContext.getExternalContext().getSession(true);
		User user = (User)session.getAttribute("user_session");
		if(user == null) {
			//Gestion de la redirection
			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
			externalContext.redirect(externalContext.getRequestContextPath() + "/index.jsf");
		}
		
		patient = new Patient();
	}

	public void addPatient() {
		try {
			//patientdao.add(patient);
			patient.setNom("");
			patient.setPrenom("");
			patient.setAdresse("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void resetPatient() {
		patient = new Patient();
	}
	
	public void updatePatient() {
		try {
			//patientdao.update(patient);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List<Patient> getAll() {
		List<Patient> patients = new ArrayList<>();
		try {
			patients.add(new Patient(1, "P1", "P1", "P1", null));
			patients.add(new Patient(2, "P2", "P2", "P2", null));
			patients.add(new Patient(3, "P3", "P3", "P3", null));//patientdao.list(patient);
		} catch (Exception e) {
			
		}
		
		return patients;
	}
	public void getById(SelectEvent ev) {
		patient = ((Patient) ev.getObject());
		
		//int idPatient = ((Patient) ev.getObject()).getId();
		//patient = new Patient(idPatient, "P1", "P1", "P1", null);//patientdao.get(idPatient, patient);
	}
	public void delete(Patient patient) {
		try {
			//patientdao.delete(patient.getId(), patient);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void initPatient() {
		patient = new Patient();
		patient.setNom("");
		patient.setPrenom("");
		patient.setAdresse("");
	}
	
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
