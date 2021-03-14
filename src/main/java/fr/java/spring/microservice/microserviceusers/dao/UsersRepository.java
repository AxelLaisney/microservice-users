package fr.java.spring.microservice.microserviceusers.dao;

import org.springframework.data.repository.CrudRepository;

import fr.java.spring.microservice.microservicesusers.model.Users;

//A generic Interface to magange CRUD operations.

public interface UsersRepository extends CrudRepository<Users, Integer>{
    
}
