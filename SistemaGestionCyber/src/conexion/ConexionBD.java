package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/sistemagestioncyber";
    private static final String USER = "root";  // Usuario con el que ingresamos a MySQL
    private static final String PASSWORD = "123";  // Contraseña de MySQL Workbench


    public static Connection conectar() { //Intenta conectarse a la base de datos y devuelve esa conexión.

        Connection conexion = null; // Variable donde vamos a guardar la conexión
        try {                                               //intenta abrir una conexión con MySQL
            conexion = DriverManager.getConnection(         //usando: URL, usuario y contraseña
                    URL,
                    USER,
                    PASSWORD
            );
            System.out.println("Conexión exitosa a MySQL."); // Si conecta correctamente muestra este mensaje

        } catch (SQLException e) {  // Si ocurre error entra acá y muestra error tecnico en consola

            System.out.println("Error al conectar con la base de datos.");
            e.printStackTrace();

        }

        return conexion; //Devuelve la conexión creada, si funcionó: devuelve la conexión abierta, si falló: devuelve null
    }
}