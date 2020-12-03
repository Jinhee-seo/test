package com.example.exam.test.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
import com.example.exam.test.vo.BoardVo;
import com.example.exam.test.service.BoardService;
 
@Controller
@RequestMapping("/board")
public class BoardController {
 
    @Autowired
    private BoardService boardService;
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView list(HttpSession session) throws Exception{
        
        List<BoardVo> list = boardService.boardList();
        return new ModelAndView("boardList","list",list);
    }
      
    @RequestMapping(value="/post",method=RequestMethod.GET)
    public ModelAndView writeForm(HttpSession session) throws Exception{
        return new ModelAndView("boardWrite");
    }
    
    @RequestMapping(value="/post",method=RequestMethod.POST)
    public String write(@ModelAttribute("BoardVO") BoardVo board, HttpSession session) throws Exception{
 
    	boardService.boardInsert(board);
        
        return "redirect://localhost:9090/board";
    }
    
    @RequestMapping(value="/{bno}",method=RequestMethod.GET)
    public ModelAndView view(@PathVariable("bno") int bno, HttpSession session) throws Exception{
        
        BoardVo board = boardService.boardView(bno);
        
        return new ModelAndView("boardView","board",board);
    }
    
    @RequestMapping(value="/post/{bno}", method=RequestMethod.GET)
    public ModelAndView updateForm(@PathVariable("bno") int bno, HttpSession session) throws Exception{
            
        BoardVo board = boardService.boardView2(bno);
        
        return new ModelAndView("boardUpdate","board",board);
    }
        
    @RequestMapping(value="/update/{bno}", method=RequestMethod.POST)
    public String update(@ModelAttribute("BoardVO")BoardVo board,@PathVariable("bno") int bno, HttpSession session) throws Exception{
            
    	boardService.boardUpdate(board);
            
        return "redirect://localhost:9090/board/"+bno;
    }
    
    @RequestMapping(value="/delete/{bno}", method=RequestMethod.GET)
    public String delete(@PathVariable("bno") int bno) throws Exception{
            
    	boardService.boardDelete(bno);
            
        return "redirect://localhost:9090/board";
    }
    
}