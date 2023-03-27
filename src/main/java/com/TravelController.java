package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TravelController {
	
	@RequestMapping("/book-travel")
	public String redirectToLogin(HttpServletRequest req, Model mo) {
		
		String frm = req.getParameter("from_address");
		String toadr = req.getParameter("to_address");
		String data = req.getParameter("travel_date");
		
		System.out.println(String.format("from address is %s and to address is %s and date is %s",frm, toadr, data));
		
		return "sucess";
	}

}
