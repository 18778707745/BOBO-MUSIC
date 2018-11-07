package ssm.music.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ssm.music.dao.UserDao;
import ssm.music.entity.User;
import ssm.music.service.UserService;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
	
	@Autowired
	UserDao userDao;

	public void add(User e) {
	}

	public List<User> getUserList() {
		return null;
	}

	public User getUserById(Integer id) {
		return userDao.getUserById(id);
	}

}
