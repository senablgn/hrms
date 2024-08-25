package kodlamaio.hrms2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.business.abstracts.UserService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms2.dataAccess.abstracts.UserDao;
import kodlamaio.hrms2.entities.concretes.User;
@Service
public class UserManager implements UserService{
	private UserDao userDao;
	
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}



	@Override
	public DataResult<List<User>> getUsers() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(), "users listed");
				
	}



	
	
	

}
