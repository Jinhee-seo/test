package com.example.exam.test.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exam.test.mapper.UserMapper;
import com.example.exam.test.vo.UserVo;

@Service 
public class UserService {
	
    @Autowired 
    public UserMapper userMapper;
    
    public UserVo selectUser(UserVo vo) throws Exception {
        return userMapper.selectUser(vo);
    }
    
    public void insertUser(UserVo vo) throws Exception{
    	userMapper.userInsert(vo);
    }
}