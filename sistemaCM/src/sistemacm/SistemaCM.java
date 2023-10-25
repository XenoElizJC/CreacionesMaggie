package sistemacm;

import java.sql.Connection;
import java.sql.DriverManager;

public class SistemaCM {
    
    public static final String URL = "jdbc:mysql://localhost:3306/creacionesm";
    public static  String USERNAME="root";
    public static  String PASSWD="Elizabeth20??";
    
    
    public static void main(String[] args) {

        new Inicio().setVisible(true);
    }
    
    public Connection getConnection(){

    Connection conexion = null;
    
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexion = DriverManager.getConnection(URL,USERNAME,PASSWD);
        
        
    }catch (Exception e){
        System.err.println("Error"+e);
    }
    
    
    return conexion;
}
    
}
