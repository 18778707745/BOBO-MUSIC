package ssm.music.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ssm.music.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class Test {
	
//	@Autowired
//	UserDao userdao;
	
	@Autowired
	UserService userService;
		
	@org.junit.Test
	public void testUserById() {
		System.out.println(userService.getUserById(2).getUsername());
	}
	
//	@org.junit.Test
//	public void testUserList() {
//		List<User> userList = userdao.getUserList();
//		for(int i = 0; i<userList.size(); i++) {
//			System.out.println(userList.get(i).getUsername());
//		}
//	}
}
