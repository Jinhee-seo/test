package com.example.exam.test.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.exam.test.service.UserService;
import com.example.exam.test.vo.UserVo;

@Controller
public class UserController { 
	
	@Autowired 
	UserService userService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView login() throws Exception {
	    
		ModelAndView mav = new ModelAndView("login");
	    return mav;
	}
	
	@RequestMapping(value="/loginUser", method=RequestMethod.POST) 
	@ResponseBody
	public ModelAndView loginUser(@ModelAttribute UserVo vo, HttpSession session) throws Exception {
    	
		UserVo userInfo = userService.selectUser(vo);
		
		if(userInfo != null) {
			session.setAttribute("userInfo", userInfo);
	    	return new ModelAndView("redirect://localhost:9090/board"); 
		}else {
			return new ModelAndView("login"); 
		}
    	
	}
	
	@RequestMapping(value="/join", method=RequestMethod.GET) 
	public ModelAndView join() throws Exception {
	    
		ModelAndView mav = new ModelAndView("join");
	    return mav;
	}
	
	
	@RequestMapping(value="/joinUser", method=RequestMethod.POST) 
	public String joinUser(@ModelAttribute UserVo vo) throws Exception {
		
		userService.insertUser(vo);
    	return "login";
    	
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {
	    
		session.invalidate();
	    return "login";
	}
	
}
