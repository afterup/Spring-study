package com.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.spring.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> getList();
	public BoardVO get(Long bno);
	
	public void insert(BoardVO board);
	public void insertSelectKey(BoardVO board);
	
	public int modify(BoardVO board);
	public int remove(Long bno);
}
