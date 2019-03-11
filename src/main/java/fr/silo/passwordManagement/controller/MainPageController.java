package fr.silo.passwordManagement.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.silo.passwordManagement.dao.IrepositarySite;
import fr.silo.passwordManagement.model.Site;

@Controller
public class MainPageController {

	@Autowired
	private IrepositarySite irepoSite;   
	
	@GetMapping("/")
	public String pageWelcome(Model model) {
		ArrayList<Site> siteList = new ArrayList<Site>(); 
		siteList = (ArrayList<Site>) irepoSite.findAll();
		System.out.println(siteList.get(0).getPerson().getPerson_email());
		model.addAttribute("siteList", siteList);
		return "main";
	}
	
	@PostMapping("/siteAdd")
	public String siteAdd(@Valid Site site) {
		System.out.println(site);
		return "main";
	
	}
	
}
