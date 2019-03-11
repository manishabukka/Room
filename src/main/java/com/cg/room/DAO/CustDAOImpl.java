package com.cg.room.DAO;

import java.util.HashMap;
import java.util.Map;

import com.cg.room.beans.Customer;
import com.cg.room.beans.Room;

public class CustDAOImpl implements ICustDAO {

	 int cust_id = 1000, c = 0;
	Room room = new Room();
	Customer customer = new Customer();
	Map<Integer, Room> roomEntry;
	Map<Integer, Customer> custEntry;

	public CustDAOImpl() {
		roomEntry = new HashMap<Integer, Room>();
		roomEntry.put(101, new Room("AC_SINGLE", "NOT_BOOKED"));
		roomEntry.put(102, new Room("AC_SINGLE", "NOT_BOOKED"));
		roomEntry.put(103, new Room("AC_DOUBLE", "NOT_BOOKED"));
		roomEntry.put(104, new Room("NONAC_SINGLE", "NOT_BOOKED"));
		roomEntry.put(105, new Room("NONAC_DOUBLE", "NOT_BOOKED"));

		custEntry = new HashMap<Integer, Customer>();

	}

	public int getCustomerDetails(Customer customer) {
		int c = 0;

		for (Map.Entry m : roomEntry.entrySet()) {

			if (m.getKey().equals(customer.getRoomno())) {
				room = roomEntry.get((customer).getRoomno());
				if (room.getRoomtype().equals(customer.getRoomtype())) {
					if (room.getstatus().equals("NOT_BOOKED")) {
						++cust_id;
						custEntry.put(cust_id,
								new Customer(customer.getCustname(), customer.getEmail(), customer.getCustaddress(),
										customer.getMobile(), customer.getRoomtype(), customer.getRoomno()));
						
						
						//System.out.println(cust_id);
						c++;
						
						break;
					}

				}
			}
		}
		if (c == 0) {
			System.out.println("room not available");
			return 0;
		} else {

			room.setstatus("Booked");
			System.out.println(room.getstatus());
			return cust_id;
		}
	}

	public Customer getCustID(int cust_id) {
	
		int c1 = 0;
		for (Map.Entry m : custEntry.entrySet()) {
			System.out.println(m.getKey());
			if (m.getKey().equals(cust_id)) {
				
				customer=(Customer)m.getValue();
 
				c1++;
				break;

			} 
		}
		if (c1 == 0) {

			return null;
		} else {

			return customer;

		}

	}
}
