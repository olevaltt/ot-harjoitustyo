
package com.mycompany.mathexerciser.domain;

import java.util.*;

public class User {
    
    private String name;
    private String username;
    
    public User(String name, String username) { //tee ominaisuus joka tarkastaa ettei järjestelmässä jo ole samanimistä käyttäjää.
        this.name = name;
        this.username = username;
    }
    
    
    public String getName() {
        return name;
    }
    
    public String getUsername() {
        return username;
    }
    
}
