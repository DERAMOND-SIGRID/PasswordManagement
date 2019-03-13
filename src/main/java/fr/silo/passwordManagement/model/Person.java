package fr.silo.passwordManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Person")
public class Person {
	
	private String person_pseudo;
	private String person_email;
	private String person_password;
	private String role;
	private boolean enable;
	
	
	public Person(String person_pseudo, String person_email, String person_password, String role, boolean enable) {
		super();
		this.person_pseudo = person_pseudo;
		this.person_email = person_email;
		this.person_password = person_password;
		this.role = role;
		this.enable = enable;
	}


	
	public Person() {
		super();
	}



	@Column(name="person_pseudo")
	public String getPerson_pseudo() {
		return person_pseudo;
	}


	public void setPerson_pseudo(String person_pseudo) {
		this.person_pseudo = person_pseudo;
	}

	@Id
	@Column(name="person_email")
	public String getPerson_email() {
		return person_email;
	}


	public void setPerson_email(String person_email) {
		this.person_email = person_email;
	}

	@Column(name="person_password")
	public String getPerson_password() {
		return person_password;
	}


	public void setPerson_password(String person_password) {
		this.person_password = person_password;
	}

	
	@Column(name="role")
	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}


	@Column(name="enable")
	public boolean isEnable() {
		return enable;
	}



	public void setEnable(boolean enable) {
		this.enable = enable;
	}



	@Override
	public String toString() {
		return "Person [person_pseudo=" + person_pseudo + ", person_email=" + person_email + "]";
	}
	
	

}
