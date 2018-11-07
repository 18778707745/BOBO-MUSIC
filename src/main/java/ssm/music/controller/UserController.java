package ssm.music.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import ssm.music.entity.User;
import ssm.music.service.UserService;

@Controller
@RequestMapping("music/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("test")
	@ResponseBody
	public void testlogin() {
		
	}
	

//	@RequestMapping("logIn")
//	@ResponseBody
//	public JSONObject logIn(User user) {
//		JSONObject jsonObject = new JSONObject();
//		if(user.getUsername()!=null&&user.getPassword()!=null) {
//			
//		}else {
//			jsonObject.put("tip","请输入用户名或密码");
//		}
//		
//		return null;
//	}

}
