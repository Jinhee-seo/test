package com.example.exam.test.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.exam.test.vo.TestVo;

@Repository
@Mapper
public interface TestMapper {
	public List<TestVo> selectTest();
	public TestVo selectUser(TestVo vo);
	public Map<String,Object> selectMember2(Map<String,Object> param);
    
}
