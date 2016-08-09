/**
 * 
 */
package simple.crud.app.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import simple.crud.app.models.UsersModel;
import simple.crud.app.util.DBConnect;

/**
 * @author pijus
 *
 */
public class UsersModelDAOImplementation implements UserModelDAO{
	private Connection connect;
	
	public UsersModelDAOImplementation(){
		connect = DBConnect.getConnection();
	}
	
	public boolean addUser(UsersModel user){
		Boolean isSuccessfull = false;
		
		return isSuccessfull;
	}
	
	public boolean updateUser(UsersModel user){
		Boolean isSuccessfull = false;
		
		return isSuccessfull;
	}
	
	public boolean deleteUser(UUID userId){
		Boolean isSuccessfull = false;
		
		return isSuccessfull;
	}
	public UsersModel getUserById(UUID userId){
		UsersModel UsersModelObj = new UsersModel();
		
		return UsersModelObj;
	}
	
	public List<UsersModel> getAllUsers(){
		List<UsersModel> allUsersObj = new ArrayList<UsersModel>();
		
		return allUsersObj; 
	}
	
	
}
