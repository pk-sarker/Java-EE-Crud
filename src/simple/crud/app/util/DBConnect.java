/**
 * 
 */

package simple.crud.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;

// import com.mysql.jdbc.Connection;

/**
 * @author pijus
 *
 */
public class DBConnect {
	
	private static Connection connect;
	
	public static Connection getConnection(){
		if(connect != null){
			return connect;
		}
		
		InputStream inputStream = DBConnect.class.getClassLoader().getResourceAsStream("/db.properties");
		Properties dbProperties = new Properties();
		
		try{
			dbProperties.load(inputStream);
			String driver = dbProperties.getProperty("driver");
			String url = dbProperties.getProperty("url");
			String user = dbProperties.getProperty("user");
			String password = dbProperties.getProperty("password");
			Class.forName( driver );
			connect = DriverManager.getConnection( url, user, password );
		} catch(IOException e){
			e.printStackTrace();
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch(SQLException e){
			e.printStackTrace();
		}
		return connect;
	}
	
	public static void closeConnection(Connection currentConnection){
		if(currentConnection == null){
			return ;
		}
		try{
			currentConnection.close();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}

}
