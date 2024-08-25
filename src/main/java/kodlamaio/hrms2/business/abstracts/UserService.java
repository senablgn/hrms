package kodlamaio.hrms2.business.abstracts;

import java.util.List;

import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.entities.concretes.User;

public interface UserService {
	DataResult<List<User>>getUsers();

}
