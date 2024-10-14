package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    //private -> no quiero que se acceda directamente
    //static -> quiero que pertenezca a la clase(no a la instancia de la clase, no al objeto)
    private static Connection connection;

    //Logica de lo que vamos a poner:
    //Si alguien pide una conexion,
        //si esta -> se la doy
        //si no esta -> la creo


    public static Connection getConnection() {

        if (connection== null){
            //la creo y creo su metodo
            newConnection();
        }
        return connection;
    }

    private static void newConnection() {
        //uri de conexion jdbc:mysql://127.0.0.1:3306/concesionario, es lo mismo que poner localhost en los numeros de 127
        String url = "jdbc:mysql://127.0.0.1:3306/concesionario";
        //ahora necesito inicializar la variable connection
        try {
            connection = DriverManager.getConnection(url, "root", "");
        } catch (SQLException e) {
            System.out.println("error en la conexion de la base de datos");
        }
        System.out.println("conexion creada correctamente.");
    }

    public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("error al cerrar la conexion");
        }finally{
            connection = null;
        }
    }
}
