package com.samanecorp.jsf4.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.samanecorp.jsf4.entities.User;

@ManagedBean(name="userbean")
@SessionScoped
public class UserBean implements Serializable {

	/*
	 * @EJB private IUser userdao;
	 */
	
	private User user;
	private String user_params;
	private String error_message;
	
	public UserBean() {
		user = new User();
	}

	public String getLogin() {
		String url = null;
		try {
			User u = new User(1, "SECK", "Ngor", "seck@samanecorp.com", "passer", null);//userdao.getConnection(user.getEmail(), user.getPassword());
			if(u != null) {
				//Demarrage de la session
				FacesContext facesContext = FacesContext.getCurrentInstance();
				HttpSession session = (HttpSession)facesContext.getExternalContext().getSession(true);
				session.setAttribute("user_session", u);
				url = "/accueil.jsf";
				user_params = u.getPrenom() + "  " + u.getNom();
				error_message = null;
			} else {
				error_message = "Email ou Mot de passe incorrect";
				url = "/index.jsf";
			}
			//Redirection
			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
			externalContext.redirect(externalContext.getRequestContextPath() + url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return url;		
	}
	
	public String logOut() {
		try {
			//Destruction de la session
		    FacesContext facesContext = FacesContext.getCurrentInstance();
		    HttpSession session = (HttpSession)facesContext.getExternalContext().getSession(false);
		    session.invalidate();
		    
		    //Gestion de la redirection
		    ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		    externalContext.redirect(externalContext.getRequestContextPath() + "/index.jsf");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index.jsf";
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUser_params() {
		return user_params;
	}

	public void setUser_params(String user_params) {
		this.user_params = user_params;
	}

	public String getError_message() {
		return error_message;
	}

	public void setError_message(String error_message) {
		this.error_message = error_message;
	}
	
	
}
