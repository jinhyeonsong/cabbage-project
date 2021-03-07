package com.summer.cabbage.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.summer.cabbage.vo.DeliveryRegion;

@Repository
public class DeliveryRegionsDAOImpl implements DeliveryRegionsDAO {
	@Autowired
	private SqlSession session;
	
	//2021 0304 방 배송지 옵션받아오기
	@Override
	public List<DeliveryRegion> selectList(int productNo) {
		return session.selectList("deliveryRegions.selectDeliveryOptions",productNo);
	}
	//배송지역 옵션들 - 송진현
	@Override
	public List<DeliveryRegion> selectListRegion(int productNo) {
		// TODO Auto-generated method stub
		return session.selectList("deliveryRegions.selectListRegion",productNo);
	}
	//구독 등록하기 210304 박형우
	@Override
	public int insertDeliveryRegions(DeliveryRegion deliveryRegion) {
		return session.insert("deliveryRegions.insertDeliveryRegions", deliveryRegion);
	}
	
}
