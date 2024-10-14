import database.DBConnection;

import java.sql.Connection;

public class Entrada {
    public static void main(String[] args) {
        //trabajas con la conexion
        DBConnection dbConnection = new DBConnection();
        //Connection connection = dbConnection.getConnection();
        //cierras conexion
        dbConnection.closeConnection();
        //vuelves a abrirla pòr lo que sea y para esto hace falta lo que hemos creado en el metodo(if connection == null, abrela)
        //DBConnection dbConnection1 = new DBConnection();
        //Connection connection1 = dbConnection1.getConnection();
    }
}
