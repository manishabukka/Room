package com.cg.room.service;

import com.cg.room.beans.Customer;

public interface ICustService {
	 public int getCustomerDetails(Customer customer);

	public Customer getCustId(int cust_id);
		
}
