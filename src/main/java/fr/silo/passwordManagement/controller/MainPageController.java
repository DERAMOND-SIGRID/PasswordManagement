package fr.silo.passwordManagement.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
		model.addAttribute("siteList", siteList);
		return "main";
	}
	
	
}
