package javaproject;

import java.sql.*;

public class dbConnection {
    String databaseName = "clinicms";
    String url = "jdbc:mysql://localhost:3306/" + databaseName;
    Connection conn;
    Statement statement;
    
    public dbConnection()throws SQLException {
        
        this.conn = DriverManager.getConnection(url,"root","");
        this.statement = conn.createStatement();        
    }
     
    public void insertData(String name, String username, String pass, 
        int age, String birthdate, String address, String contact_no,
        String bloodtype, String gender) throws SQLException{
        
        String query = "INSERT INTO register (NAME,USERNAME,Pass,AGE,"
          + "BIRTHDATE,ADDRESS,CONTACT_NO,BLOOD_TYPE,GENDER)"
          + "VALUES('"+name+"','"+username+"','"+pass+"','"+age+"',"
                + "'"+birthdate+"','"+address+"','"+contact_no+"',"
                + "'"+bloodtype+"','"+gender+"')";
        
        statement.execute(query);
    }
    
    public void getAllData() throws SQLException{
        String query = "SELECT * FROM `register`";   
        
        ResultSet result = statement.executeQuery(query);
         
         while(result.next()){
             System.out.println(result.getString("name"));
             System.out.println(result.getString("username"));
             System.out.println(result.getString("pass"));
             System.out.println(result.getInt("Age"));
             System.out.println(result.getString("birthdate"));
             System.out.println(result.getString("address"));
             System.out.println(result.getString("contact_no"));
             System.out.println(result.getString("blood_type"));
             System.out.println(result.getString("gender"));             
        
         } 
    }
        
    public void updateInfo(String name, String username, String password, 
        int age, String birthdate, String contact, String address, 
        String bloodType, String gender,String current) throws SQLException{
           
        String query = "UPDATE register set name='"+name+"', "
            + "username='"+username+"',pass='"+password+"',age='"+age+"',"
            + "birthdate='"+birthdate+"',address='"+address+"',contact_no='"
            +contact+"',blood_type='"+bloodType+"',gender='"+gender+"' "
            + "WHERE username='"+current+"'";   
        statement.executeUpdate(query);  
    }
    
    public void insertAppointment(String patient,String docname, String day)
        throws SQLException{
            
        String query = "INSERT INTO appointment(Patient_Name,Doctor,Day)"
            + "VALUES('"+patient+"','"+docname+"','"+day+"')";
            
        statement.execute(query);
            
    }
    
    public void cancelAppointment(String name) throws SQLException {
        String query = "DELETE FROM appointment where Patient_Name = '"+name+"'"; 
        statement.executeUpdate(query);
    }
    
    public static boolean ifUsernameExist(String username) throws SQLException{
        boolean unExst = false;
        
        try {
            String databaseName = "clinicms";
            String url = "jdbc:mysql://localhost:3306/" + databaseName;
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,"root","");
            String query = "SELECT * FROM `register` where username=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            ResultSet result = statement.executeQuery();
            
            if (result.next()) {
                System.out.println("Username already exists");
                unExst = true;
            }
        }
        
        catch (SQLException error){
            Logger.getLogger(about.class.getName()).log(Level.SEVERE, null, error);
        }
        
        catch(ClassNotFoundException error){
            Logger.getLogger(about.class.getName()).log(Level.SEVERE, null, error);  
        }
        
        return unExst;
    } 
         
    public void close() throws SQLException{
        conn.close();
    }

   
}

    
