package com.tutorial.bo;

import com.tutorial.bo.exception.BOException;
import com.tutorial.dto.Order;

public interface OrderBO {

	boolean placeOrder(Order order)throws BOException;
	boolean cancelOrder(int id) throws BOException; 
	boolean deleteOrder(int id) throws BOException;
	
}
