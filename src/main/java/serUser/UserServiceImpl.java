package serUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repUser.UserDAO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO dao;
	
	public boolean validateUser(int id, String name, int age) {
		return true;
	}
	
	public String addUser(int id, String name, int age){
		if(validateUser(id,name,age)){
			return dao.createNewUser(id, name, age);
		}
		else{
			return "User not valid";
		}
	}
	
}
