//Controller of the MicroserviceUserApplication class
package fr.java.spring.microservice.microserviceusers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Annotation to define that our controller is a rest controller
@RestController
public class MicroserviceUsersController {
    
    /*GetMapping mean that this method will be called when the application received
    a get request with the correct URI defined by path*/
    @GetMapping(path = "/hello")
    public String getHello(){
        return "hello world";
    }
}
