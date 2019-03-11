package com.cg.room.DAO;

import com.cg.room.beans.Customer;

public interface ICustDAO {
	
	
	int getCustomerDetails(Customer customer);

	Customer getCustID(int cust_id);
}
