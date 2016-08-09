package simple.crud.app.dao;

import java.util.List;
import java.util.UUID;

import simple.crud.app.models.UsersModel;

public interface UserModelDAO {
	public boolean addUser(UsersModel user);
	public boolean updateUser(UsersModel user);
	public boolean deleteUser(UUID userId);
	public List<UsersModel> getAllUsers();
	public UsersModel getUserById(UUID userId);
}
