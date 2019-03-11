package com.cg.room.DAO;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cg.room.beans.Customer;

class CustDAOImplTest {
	Customer customer=new Customer();
	CustDAOImpl dao=new CustDAOImpl();

	@Test
	void testGetCustomerDetails() {
		customer.setCustaddress("Hyd");
		customer.setCustname("bindu");
		customer.setEmail("bindu@gmail.com");
		customer.setMobile(93478494);
		customer.setRoomno(101);
		customer.setRoomtype("AC_SINGLE");
		assertEquals(1000, dao.getCustomerDetails(customer));
		
	}

	@Test
	void testGetCustID() {
		assertEquals(null, dao.getCustID(1000));
		
	}

}
