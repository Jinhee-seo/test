package com.example.exam.test.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exam.test.mapper.TestMapper;
import com.example.exam.test.vo.TestVo;

import java.util.List;
import java.util.Map;

@Service
public class TestService {
	
    @Autowired 
    public TestMapper mapper;
    
    public List<TestVo> selectTest() {
        return mapper.selectTest();
    }
    
    public TestVo selectUser(TestVo vo) {
        return mapper.selectUser(vo);
    }
    
    public Map<String,Object> selectMember2(Map<String,Object> param) throws Exception{
        return mapper.selectMember2(param);
    }
}