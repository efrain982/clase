import java.sql.SQLException;

import singleton.ConexionSingleton;

public class Main {
    
    public static void main(String[] args){
        try {
        //Creacion de objeto singleton
        ConexionSingleton conexionSingleton = ConexionSingleton.getInstance(
            "jdbc:mysql://localhost:3306/ine",
            "ine",
            "ine.1234");
            conexionSingleton.getConexion().query("select * from ciudadano");
        } catch (SQLException e) {
            e.printStackTrace();
        }       
        
    }
}
