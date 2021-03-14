//Controller of the MicroserviceUserApplication class
package fr.java.spring.microservice.microserviceusers.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.java.spring.microservice.microservicesusers.model.Users;
import fr.java.spring.microservice.microserviceusers.dao.UsersRepository;


//Annotation to define that our controller is a rest controller
@RestController
public class MicroserviceUsersController {
    
    //Inject the UsersRepository class in the controller
    @Autowired UsersRepository repository;

    /* 
    The annotations GetMapping and PostMapping define what to trigger based on the type of request received.
    the "path" determine what method to trigger based on the URI in the request.
    @ResquestParam is used to get the parameters in the get and post resquest.
    */

    
    //Return all users when a Get request is called with this URI
    @GetMapping(path = "/users")
    public Iterable<Users> getAllUsers(){
        return this.repository.findAll();
    }

    //Return a specific user when an Id is given with this URI
    @GetMapping(path = "/users/id")
    public Optional<Users> getUsersId(@RequestParam int Id){
        return this.repository.findById(Id);
    }

    //Add an user when a Post request is received
    @PostMapping(path = "/users")
    public String addUser(@RequestParam String fname, @RequestParam String lname, @RequestParam String mail, @RequestParam String phone){
        Users user = new Users(fname, lname, mail, phone);
        this.repository.save(user);
        return "A user has been added";
    }

    //Delete an user when a specific id is given
    @PostMapping(path = "/users/delete")
    public String deleteUser(@RequestParam int id){
        this.repository.deleteById(id);
        return "A user has been deleted";
    }
}
