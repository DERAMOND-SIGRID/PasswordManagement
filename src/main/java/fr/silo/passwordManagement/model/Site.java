package fr.silo.passwordManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Site")
public class Site {

	@Id
	private long site_id;
	private String site_name;
	private String site_url;
	private String site_login;
	private String site_password;
	private Person person;
	
	public Site(long site_id, String site_name, String site_url, String site_login, String site_password,
			Person person) {
		super();
		this.site_id = site_id;
		this.site_name = site_name;
		this.site_url = site_url;
		this.site_login = site_login;
		this.site_password = site_password;
		this.person = person;
	}

	public Site() {
		super();
	}

	@Id
	@Column(name="site_id")
	public long getSite_id() {
		return site_id;
	}

	public void setSite_id(long site_id) {
		this.site_id = site_id;
	}

	@Column(name="site_name")
	public String getSite_name() {
		return site_name;
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	@Column(name="site_url")
	public String getSite_url() {
		return site_url;
	}

	public void setSite_url(String site_url) {
		this.site_url = site_url;
	}

	@Column(name="site_login")
	public String getSite_login() {
		return site_login;
	}

	public void setSite_login(String site_login) {
		this.site_login = site_login;
	}

	@Column(name="site_password")
	public String getSite_password() {
		return site_password;
	}

	public void setSite_password(String site_password) {
		this.site_password = site_password;
	}

	@ManyToOne
    @JoinColumn(name="person_email")
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Site [site_id=" + site_id + ", site_name=" + site_name + ", site_url=" + site_url + ", site_login="
				+ site_login + ", person=" + person + "]";
	}
	
	
	
}
