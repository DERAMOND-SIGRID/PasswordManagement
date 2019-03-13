package fr.silo.passwordManagement.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.silo.passwordManagement.dao.IrepositarySite;
import fr.silo.passwordManagement.model.Site;

@Service
public class ServiceSite {

	@Autowired
	public IrepositarySite IrepoSite;
	
	public ArrayList<Site> FindAllSiteByUserEmail(String mail){
		ArrayList<Site> listSite = (ArrayList<Site>) IrepoSite.findAll();
		ArrayList<Site> listSiteUser = new ArrayList<Site>();
		for(Site s: listSite) {
			if(s.getPerson().getPerson_email().equals(mail)) {
				listSiteUser.add(s);
			}
		}
		return listSiteUser;
	}
}
