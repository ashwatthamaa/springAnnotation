package repUser;

import org.springframework.stereotype.Repository;

import entity.User;

@Repository
public class UserDAOImpl implements UserDAO{

	@Override
	public String createNewUser(int id, String name, int age) {
		User u = new User(id, name, age);
		return u.getId()+" "+u.getName()+" "+u.getAge();
	}

}
