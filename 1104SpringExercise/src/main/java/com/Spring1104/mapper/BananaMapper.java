package com.Spring1104.mapper;

import com.Spring1104.vo.BananaVO;

public interface BananaMapper {
	public void insert(BananaVO banana);
	public void select();
	public void update(BananaVO banana);
	public void delete(int no);
	public void read(int no);
}
