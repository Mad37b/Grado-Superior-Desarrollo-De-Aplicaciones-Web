package clases;

/**
 *
 * @author Ulises III
 */


import java.sql.*;

public class conexion { // Se recomienda usar mayúscula inicial: Conexion

	private String url;
	private String controlador ;
	private String usuario ;
	private String contraseña ;
	private Statement estado ;
	private Connection conexion;

	public conexion() {
		// --- CONFIGURACIÓN PARA ORACLE XE 21C EN DOCKER ---
        
		usuario = "SYSTEM"; // Usuario administrador de Oracle XE
		contraseña = "11111"; // Contraseña que definiste al crear el contenedor Docker
        
        // URL de conexión: @host:puerto/nombre_del_servicio (XEPDB1 es el PDB predeterminado)
		url = "jdbc:oracle:thin:@localhost:1521/XEPDB1"; 
        
        // Nombre de la clase del driver de Oracle (compatible con ojdbc17)
		controlador = "oracle.jdbc.driver.OracleDriver";
        
		// 1. Carga del Driver
		try {
			Class.forName(controlador);
			System.out.println("Driver de Oracle establecido correctamente.");
		} catch (Exception excepcion1) {
			System.err.println("❌ ERROR: Fallo al cargar el driver JDBC de Oracle." + excepcion1 );
                        System.err.println("Causa probable: El archivo ojdbc17.jar no está en WEB-INF/lib.");
			excepcion1.printStackTrace();
		}
        
		// 2. Intentar Conexión
		try {
			conexion = DriverManager.getConnection(url, usuario, contraseña);

			System.out.println("✅ Conexión a Oracle XE realizada con éxito.");
                         System.out.println("Estado de la conexión: " + conexion);
            
		} catch (Exception e2) {
            
			System.err.println("❌ ERROR: Conexión no realizada.");
            System.err.println("Verifica:");
            System.err.println("1. Contenedor Docker: ¿Está UP y corriendo?");
            System.err.println("2. Credenciales: ¿Usuario (SYSTEM) o Contraseña (11111) incorrectos?");
            System.err.println("3. URL/Puerto: ¿Es 'localhost:1521/XEPDB1' correcto?");
			System.err.println("Detalles: " + e2.getMessage());
			e2.printStackTrace();
		}
        
		// 3. Crear Statement (Para ejecutar consultas SQL)
		try {
            // Solo intentamos crear el estado si la conexión fue exitosa
            if (conexion != null) {
			    estado = conexion.createStatement();
                System.out.println("Statement (Estado) creado correctamente.");
            } else {
                 System.err.println("No se pudo crear el Statement porque la conexión es nula.");
            }
		} catch (SQLException e3) {
			System.err.println("ERROR: No se pudo crear el Statement.");
			e3.printStackTrace();
		}
	}

	
        
        public String toString(){
        
            return "Conexion [url=" + url + ", usuario=" + usuario + ", conexion=" + conexion + "]";
        }
        
        

	public Statement getEstado() {
		return estado;
	}

	public void setEstado(Statement estado) {
		this.estado = estado;
	}
    
    // Opcional: Método para cerrar la conexión
    public void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexión a Oracle cerrada.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        conexion prueba = new conexion ();
        System.out.println("prueba de conexion desde la clase conexion" + prueba.toString());

    }
}