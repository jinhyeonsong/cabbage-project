package com.summer.cabbage.dao;

import java.util.List;

import com.summer.cabbage.vo.Subscribe;

public interface SubscribesDAO {

	//기버의 주문조회 총 리스트	
	List<Subscribe> selectOrderCheckList(Subscribe subscribe);
	//기버의 주문조회 총 리스트카운트
	int selectOrderCheckListCount(Subscribe subscribe);
	int deleteOrderCheckList(int no);

}