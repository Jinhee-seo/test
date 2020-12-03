package com.example.exam.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.exam.test.service.TestService;
import com.example.exam.test.vo.TestVo;

@RestController
public class TestController {

	@Autowired
	TestService testService;

	@RequestMapping(value = "/test")
	public ModelAndView test() {

		ModelAndView mav = new ModelAndView("test");
		List<TestVo> testList = testService.selectTest();
		mav.addObject("list", testList);
		return mav;
	}
	
	@RequestMapping(value = "/testModel", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ModelMap testPost(@RequestBody(required = false) TestVo vo, ModelMap model) throws Exception {

		TestVo userInfo = testService.selectUser(vo);
		model.addAttribute("userInfo", userInfo);

		return model;
	}
	
	@RequestMapping(value = "/testSet")
	public TestVo test2() {

		TestVo vo = new TestVo();
		vo.setUserid("test");
		vo.setPasswd("1234");

		TestVo returnMap = testService.selectUser(vo);
		return returnMap;

	}

	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	public TestVo testGet(@RequestParam String userid, @RequestParam String passwd) throws Exception {

		TestVo vo = new TestVo();
		vo.setUserid(userid);
		vo.setPasswd(passwd);

		TestVo returnMap = testService.selectUser(vo);
		return returnMap;

	}

	@RequestMapping(value = "/test3", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = { MediaType.APPLICATION_JSON_VALUE })
	public TestVo testPost(@RequestBody(required = false) TestVo vo) throws Exception {
		
		 TestVo returnMap = new TestVo();
		 
		 if(testService.selectUser(vo) != null) { 
			 returnMap = testService.selectUser(vo);
		 }
	
		 return returnMap;

	}

	@RequestMapping(value = "/test4")
	public Map<String, Object> testPostJson(@RequestParam Map<String, Object> param, ModelMap model) throws Exception {

		Map<String, Object> userInfo = new HashMap<String, Object>();
		
		if(testService.selectMember2(param) != null) { 
			userInfo = (Map<String, Object>) testService.selectMember2(param);
		}
		
		return userInfo;

	}

}
