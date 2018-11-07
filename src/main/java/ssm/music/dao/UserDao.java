package ssm.music.dao;

import java.util.List;

import ssm.music.entity.User;

public interface UserDao extends BaseDao<User> {

	public User getUserById(Integer id);

	public List<User> getUserList();

}
