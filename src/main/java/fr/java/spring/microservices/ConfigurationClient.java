package fr.java.spring.microservices;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Give a name to client and pass the url of it to make the requests
@FeignClient(name = "AccountClient", url = "http://localhost:5051/")
public interface ConfigurationClient {
    
    //define a get request at a specific url with a parameter id
    @GetMapping(path = "/accounts/user")
    public Optional getUserAccount(@RequestParam(name = "id") int id);
}
