package ssm.music.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ssm.music.entity.User;

public interface UserService extends BaseService<User> {
	
	public User getUserById(Integer id);
	
	public List<User> getUserList();

}
