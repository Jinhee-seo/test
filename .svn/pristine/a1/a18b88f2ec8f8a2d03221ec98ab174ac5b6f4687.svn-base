package com.example.exam.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.exam.test.vo.BoardVo;

@Repository
@Mapper
public interface BoardMapper {
	
    public void boardInsert(BoardVo vo) throws Exception;
    
    
    public List<BoardVo> boardList() throws Exception;
    
    
    public BoardVo boardView(int bno) throws Exception;
    
    
    public void hitPlus(int bno) throws Exception;
    
    
    public void boardUpdate(BoardVo vo) throws Exception;
    
   
    public void boardDelete(int bno) throws Exception;
}
