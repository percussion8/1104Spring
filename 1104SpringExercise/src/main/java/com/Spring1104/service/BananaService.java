package com.Spring1104.service;

import java.util.List;

import com.Spring1104.vo.BananaVO;

public interface BananaService {
	public List<BananaVO> getAll(); //mapper-select
	public void register(BananaVO banana); //mapper-insert
	public BananaVO getOne(int no); //mapper-read
	public boolean modify(BananaVO banana); //mapper-update
	public boolean remove(int no); //mapper-delete
}
