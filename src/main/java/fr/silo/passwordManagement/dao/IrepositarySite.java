package fr.silo.passwordManagement.dao;

import org.springframework.data.repository.CrudRepository;
import fr.silo.passwordManagement.model.Site;

public interface IrepositarySite extends CrudRepository<Site, Long>{

}
