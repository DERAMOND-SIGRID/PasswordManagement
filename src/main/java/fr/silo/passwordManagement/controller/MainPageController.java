package fr.silo.passwordManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

	@GetMapping("/")
	public String pageWelcome(Model model) {
		return "redirect:/main";
	}
}
