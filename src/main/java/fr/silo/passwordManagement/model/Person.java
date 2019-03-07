package fr.silo.passwordManagement.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Person")
public class Person implements Serializable {
	
	private String person_pseudo;
	private String person_email;
	private String person_paswword;
	
	
	public Person(String person_pseudo, String person_email, String person_paswword) {
		super();
		this.person_pseudo = person_pseudo;
		this.person_email = person_email;
		this.person_paswword = person_paswword;
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

	@Column(name="person_çpaswword")
	public String getPerson_paswword() {
		return person_paswword;
	}


	public void setPerson_paswword(String person_paswword) {
		this.person_paswword = person_paswword;
	}


	@Override
	public String toString() {
		return "Person [person_pseudo=" + person_pseudo + ", person_email=" + person_email + ", person_paswword="
				+ person_paswword + "]";
	}
	
	

}