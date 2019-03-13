package fr.silo.passwordManagement.dao;

import org.springframework.data.repository.CrudRepository;

import fr.silo.passwordManagement.model.Person;


public interface IrepositaryPerson extends CrudRepository<Person, String>{

}
