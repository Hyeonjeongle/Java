package com.shop.dao;

import java.util.List;

import com.shop.db.DBHelper;
import com.shop.vo.ProductVO;

public class ProductDAO extends DBHelper {

	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	
	private ProductDAO () {};
	
	
	public int insertProduct (ProductVO vo) {
		return 0;
	}	
	public ProductVO selectProduct (int prodNo) {
		return null; 
	}	
	public List<ProductVO> selectProducts () {
		return null;
	}	
	public int updateProduct (int prodNo) {
		return 0;
	}	
	public int delectProduct (int prodNo) {
		return 0;
	}	
}