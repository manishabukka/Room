package com.cg.room.service;

import com.cg.room.DAO.CustDAOImpl;
import com.cg.room.DAO.ICustDAO;
import com.cg.room.beans.Customer;

public class CustServiceImpl implements ICustService {
	ICustDAO iCustDAO= new CustDAOImpl();
	Customer customer = new Customer();

	public int getCustomerDetails(Customer customer) {

int cust_id=iCustDAO.getCustomerDetails(customer);
		return cust_id;
	}

	public Customer getCustId(int cust_id) {
	Customer customer=	iCustDAO.getCustID(cust_id);
	
		return customer;
	}

	


	

	  
	
	

}