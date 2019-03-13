package fr.silo.passwordManagement.controller;

import java.util.ArrayList;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.silo.passwordManagement.dao.IrepositaryPerson;
import fr.silo.passwordManagement.dao.IrepositarySite;
import fr.silo.passwordManagement.model.Person;
import fr.silo.passwordManagement.model.Site;
import fr.silo.passwordManagement.service.ServiceSessionUser;
import fr.silo.passwordManagement.service.ServiceSite;

@Controller
public class MainPageController {

	@Autowired
	private ServiceSessionUser session;

	@Autowired
	private IrepositarySite irepoSite;

	@Autowired
	private IrepositaryPerson irepoPerson;

	@Autowired
	private ServiceSite serviceSite;

	@GetMapping("/login")
	public String pageLogin() {
		return "login";
	}

	@GetMapping("/")
	public String pageWelcome(Model model) {
		ArrayList<Site> siteList = new ArrayList<Site>();
		Person p = (Person) session.getSessionUSer(model);
		siteList = serviceSite.FindAllSiteByUserEmail(p.getPerson_email());
		model.addAttribute("siteList", siteList);
		return "main";
	}

	@PostMapping("/siteAdd")
	public String siteAdd(@Valid Site site, Model model) {
		Person p = (Person) session.getSessionUSer(model);
		site.setPerson(p);
		irepoSite.save(site);
		return "redirect:/";
	}

}
