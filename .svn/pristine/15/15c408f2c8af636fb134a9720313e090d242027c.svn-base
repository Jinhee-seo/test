package com.example.exam.test.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exam.test.mapper.BoardMapper;
import com.example.exam.test.vo.BoardVo;

import java.util.List;

@Service
public class BoardService {
	
    @Autowired 
    public BoardMapper boardMapper;
    
    public List<BoardVo> boardList() throws Exception{
        return boardMapper.boardList();
    }
    
    public void boardInsert(BoardVo board) throws Exception{
        boardMapper.boardInsert(board);
    }
    
    public BoardVo boardView(int bno) throws Exception{
    	boardMapper.hitPlus(bno);
        return boardMapper.boardView(bno);
    }
    
    public BoardVo boardView2(int bno) throws Exception{
        return boardMapper.boardView(bno);
    }
    
    public void boardUpdate(BoardVo board) throws Exception{
        boardMapper.boardUpdate(board);
    }
    
    public void boardDelete(int bno) throws Exception{
        boardMapper.boardDelete(bno);
    }
}