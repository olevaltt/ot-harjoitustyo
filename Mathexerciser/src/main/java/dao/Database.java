
package dao;

import java.util.*;
import java.sql.*;

public class Database {
    
    public Database() {
        try {
            createDB();
        } catch (SQLException e) {
            System.out.println("Homma meni vituiks");
        }
        
    }
    
    public static void createDB() throws SQLException {
        
        Connection db = DriverManager.getConnection("jdbc:sqlite:mathexerciser.db");
        Statement s = db.createStatement();
        
        try {
            DatabaseMetaData metadata = db.getMetaData();
            ResultSet r = metadata.getTables(null, null, "Exercises", null);
            r.next();
            

        } catch (SQLException e) {
            s.execute("CREATE TABLE Exercises (id INTEGER PRIMARY KEY, type TEXT, question TEXT, answer TEXT)");
        }
       
    }
    
    
    
}
