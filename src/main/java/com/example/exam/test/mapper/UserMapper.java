package com.example.exam.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.exam.test.vo.UserVo;

@Repository
@Mapper
public interface UserMapper {
	//글작성
    public void userInsert(UserVo vo) throws Exception;
    public UserVo selectUser(UserVo vo) throws Exception;
}
