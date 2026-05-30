import conexion.ConexionBD;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        Connection conexion = ConexionBD.conectar(); // Intentamos conectarnos a la base de datos

        if (conexion != null) { // Verificamos si la conexión funcionó
            System.out.println("La conexión funciona correctamente.");
        } else {
            System.out.println("No se pudo conectar a la base de datos.");
        }

    }
}