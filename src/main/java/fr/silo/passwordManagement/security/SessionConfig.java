package fr.silo.passwordManagement.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;

import fr.silo.passwordManagement.dao.IrepositaryPerson;

public class SessionConfig {

	@Autowired
	private IrepositaryPerson irepoPerson;
	
	public Object getSessionUser(Model model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String mail = authentication.getName();
		System.out.println(mail);
		
		return model;
		
	}
}
