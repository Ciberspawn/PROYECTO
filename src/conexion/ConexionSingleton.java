package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionSingleton {
	
	/*public static void main(String[] args) {
		try {
		Class.forName ("oracle.jdbc.driver.OracleDriver");  

		//paso 2: crear la conexión con el objeto  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","MODULOII", "1234");
		
		//paso 3: crear objeto statement  
		Statement stmt=con.createStatement();  

		//paso 4: ejecutar query
		ResultSet rs = stmt.executeQuery ("select * from capacitacion");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getDate(2) + 
			"  " + rs.getTime(3) + 
			"  " + rs.getString(4) + 
			"  " + rs.getInt(5) + 
			"  " + rs.getInt(6));  
		}
		
		//paso 5: cierra el objeto de conexión  
		con.close();    

		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		
	}*/


	// Propiedades
    private static Connection conn = null;

    // Constructor
    private ConexionSingleton(){ 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String usuario = "MODULOII";
		String password = "1234";
    	
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection
			(url, usuario, password);
		}
		catch (ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	} // Fin constructor
    
	// Métodos
	public static Connection getConnection(){
		if (conn == null){
			new ConexionSingleton();
		}
	  
		return conn;
	} // Fin getConnection
    
}
