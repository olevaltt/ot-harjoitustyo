
package com.mycompany.mathexerciser.ui;

import java.util.*;
import java.sql.*;
import dao.Database;


public class ExerciserUi {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Welcome");
        Database db = new Database();
//        try {
//            db.createDB();
//        
//        } catch (SQLException e) {
//            System.out.println("Database creation failed");
//            return;
//        }
        
        System.out.println("What do you want to do?");
        System.out.println("exit (1)");
        System.out.println("Add a problem (2)");
        String input = reader.nextLine();
        if (input == "1") {
            System.exit(0);
        }
    }
}
