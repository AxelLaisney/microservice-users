//This class describe the model of the database table users
package fr.java.spring.microservice.microservicesusers.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity() //define that we are describing a data base entity
@Data // lombok annotion to avoid to make all the setter and getter
public class Users {
    @Id //define that user_id is the primary key
    private int user_id;
    private String user_fname;
    private String user_lname;
    private String user_email;
    private String user_phone;

    //Class controller to create an User object
    public Users(String user_fname, String user_lname, String user_email, String user_phone){
        this.user_fname = user_fname;
        this.user_lname = user_lname;
        this.user_email = user_email;
        this.user_phone = user_phone;
    }
}
