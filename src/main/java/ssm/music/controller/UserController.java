package ssm.music.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import ssm.music.entity.User;
import ssm.music.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("result")
	public Model testlogin(Model model,@RequestParam(value="username") Integer username) {
		model.addAttribute("msg",userService.getUserById(username).getUsername());
		return model;
		
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
