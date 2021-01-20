package javaproject;

import java.sql.*;

public class JavaProject {

    
    public static void main(String[] args) throws SQLException {
        dbConnection db = new dbConnection();
        //db.updateInfo("Sheina Arlanza", "RyuzakiShin", "zaki1720", 20, 
        // "Nov-19-2000","09630402614", "Dorillo St.,Poblacion Ilaya,"
        //  + "Passi City,Iloilo", "A+", "Female");
        
        //db.insertData("Shein Arlanza", "Zaki", "123456", 20, "2021-Nov-19", "Dorillo St.,Passi City", 
        // "09630402614", "B+", "Female"); 
        db.getAllData();
        db.insertAppointment("Sheina Arlanza", "J-Anne Soliva", "Tuesday");
        //db.close();
        
        launch ln = new launch();
        ln.show(true);
                       
             
             
    }
    
}
