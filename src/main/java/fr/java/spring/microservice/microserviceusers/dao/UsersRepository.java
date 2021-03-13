package fr.java.spring.microservice.microserviceusers.dao;

import org.springframework.data.repository.CrudRepository;

import fr.java.spring.microservice.microservicesusers.model.Users;

public interface UsersRepository extends CrudRepository<Users, Integer>{
    
}
