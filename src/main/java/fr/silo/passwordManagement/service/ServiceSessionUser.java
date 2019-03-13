package fr.silo.passwordManagement.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import fr.silo.passwordManagement.dao.IrepositaryPerson;
import fr.silo.passwordManagement.model.Person;


@Service
public class ServiceSessionUser {

	@Autowired
	private IrepositaryPerson IrepoPerson;
	
	public Object getSessionUSer(Model model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String mail = authentication.getName();
		ArrayList<Person> listPerson = (ArrayList<Person>) IrepoPerson.findAll();
		Object user = null;
		for(Person p : listPerson) {
			if(p.getPerson_email().equals(mail)) {
				model.addAttribute("sessionUser", p);
				user = p;
			}
		}
		return user;
		
	}
}
