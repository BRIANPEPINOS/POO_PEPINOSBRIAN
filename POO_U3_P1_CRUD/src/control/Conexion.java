// Indicamos el paquete al que pertenece la clase.
package control;

// Importamos las clases y paquetes necesarios.
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

// Definimos la clase 'Conexion'.
public class Conexion {
    // Definimos variables para almacenar la información necesaria para la conexión a la base de datos.
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/gestion_clases";

    // Definimos una variable para almacenar la conexión a la base de datos.
    Connection conectar = null;

    // Definimos un método público llamado 'conexion' que devuelve un objeto de tipo Connection.
    public Connection conexion() {
        try {
            // Cargamos la clase del controlador de MySQL para establecer la conexión.
            Class.forName(driver);

            // Establecemos la conexión con la base de datos utilizando el URL, usuario y contraseña especificados.
            conectar = (Connection) DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            // En caso de error, mostramos un mensaje de error.
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXION " + e.getMessage());
        }

        // Retornamos el objeto de conexión (puede ser nulo si hay algún error).
        return conectar;
    }
}