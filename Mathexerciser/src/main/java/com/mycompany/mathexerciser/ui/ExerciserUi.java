
package com.mycompany.mathexerciser.ui;

import java.util.*;
import com.mycompany.mathexerciser.domain.User;

public class ExerciserUi {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Welcome");
        String input = reader.nextLine();
        
        while(true) {
            
            switch(input) {
                
                case "exit":
                    System.out.println("Shutting down");
                    System.exit(0);
                    break;
                
            }
            
            
        
        String name = reader.nextLine();
        String username = reader.nextLine();
    
        User  user = new User(name, username);
    
    
    
    }
        
       
        
    
    }
}
