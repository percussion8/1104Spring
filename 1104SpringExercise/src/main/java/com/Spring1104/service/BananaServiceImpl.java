package com.Spring1104.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Spring1104.mapper.BananaMapper;
import com.Spring1104.vo.BananaVO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BananaServiceImpl implements BananaService{
	private BananaMapper mapper;

	@Override
	public List<BananaVO> getAll() {
		System.out.println("여러개의 목록 가져오기");
		return null;
	}

	@Override
	public void register(BananaVO banana) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BananaVO getOne(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modify(BananaVO banana) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int no) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
