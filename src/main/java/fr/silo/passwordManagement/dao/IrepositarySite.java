package fr.silo.passwordManagement.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.silo.passwordManagement.model.Site;

@Repository
public interface IrepositarySite extends CrudRepository<Site, Long>{

	/*@Query("select s from site s where s.person_email = :mail")
	public ArrayList<Site> findAllByUserEmail(@Param("mail") String mail);*/
}
