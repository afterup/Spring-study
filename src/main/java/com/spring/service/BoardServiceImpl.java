package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.domain.BoardVO;
import com.spring.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Log4j
public class BoardServiceImpl implements BoardService{
	
	private BoardMapper mapper;

	@Override
	public void register(BoardVO board) {
		log.info("register..."+board);
		
		mapper.insertSelectKey(board);
	}
	
	@Override
	public BoardVO get(Long bno) {
		log.info("get");
		return mapper.get(bno);
	}

	@Override
	public List<BoardVO> getList() {
		log.info("getList");
		return mapper.getList();
	}

	@Override
	public boolean modify(BoardVO board) {
		log.info("modify");
		if(mapper.modify(board)==1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(Long bno) {
		log.info("remove");
		if(mapper.remove(bno)==1) {
			return true;
		}
		return false;
	}


	
	
	
}
