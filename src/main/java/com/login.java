package com;

import javax.servlet.http.HttpServletRequest;

//import org.apache.coyote.http11.Http11AprProtocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class login {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@ResponseBody
	@RequestMapping("/hi")
	public String grtNmae(HttpServletRequest req, Model mo) {
		
		return "bolo";
	}
	
	@RequestMapping("/set")
	public String setName(HttpServletRequest req, Model mo) {
		
		
		return "hello";//(/WEB-INF/hello.html
	}
	@RequestMapping("/signup")
	public String setname(HttpServletRequest req, Model mo) {
		
		return "signup";
	}
	@RequestMapping("/signin")
	public String signin(HttpServletRequest req, Model mo) {
		
		return "signin";
	}
	
	@RequestMapping("/create-user")
	public String creatUser(HttpServletRequest req, Model mo) {
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		String con = req.getParameter("confirm-password");
		String dob = req.getParameter("dob");
		System.out.println(String.format("email is %s and password is %s and con-pass is %s and dob is %s",email,pass,con,dob));
		
			
 int rowcont = jdbcTemplate.update("insert into r  values (?,?)",pass, email);
		System.out.println(rowcont);
	   
		//mo.addAllAttributes("email",email);
		
		return "trevel-book";
	}
	
	@RequestMapping("/validate-login")
	public String getSingin(HttpServletRequest req, Model mo) {
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
System.out.println(String.format("email is %s and password is %s ",email,pass));
		
		

	String sql = ("select count(*) from r where id = '" +pass+" 'and name = '"+email+"'");

		
          int n = jdbcTemplate.queryForObject(sql, Integer.class);
		System.out.println(n);
		System.out.println(n);
		if(n > 0) {
			System.out.println("vaild user");
			return "LoginSucess";
		}
		else {
			System.out.println("invalid user");
			
			return "Error";
		}
	}

}
