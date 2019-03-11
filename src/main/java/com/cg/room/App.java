package com.cg.room;

import java.util.Scanner;

import com.cg.room.DAO.CustDAOImpl;
import com.cg.room.DAO.ICustDAO;
import com.cg.room.beans.Customer;
import com.cg.room.beans.Room;
import com.cg.room.service.CustServiceImpl;
import com.cg.room.service.ICustService;

/**
 * Hello world!
 *
 */
public class App 
{  
	static Customer customer=new Customer();
	 static Room room = new Room();
	static ICustService icustService= new CustServiceImpl();
	

    public static void main( String[] args )
    {
    	System.out.println("Select the option");
    	do {
		System.out.println("  1.Book Room \n2.View Booking Status \n 3.Exit");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();  int i=0;
		
		switch(ch){
		case 1:
			System.out.println("enter Customer Name:");
			customer.setCustname(sc.next());
			System.out.println("enter Email:");
			customer.setEmail(sc.next());
			System.out.println("enter Customer Address:");
			customer.setCustaddress(sc.next());
			System.out.println("enter Mobile No:");
			customer.setMobile(sc.nextInt());
			System.out.println("enter Room Type:");
			customer.setRoomtype(sc.next());
			System.out.println("enter Room No:");
			customer.setRoomno(sc.nextInt());
			
			i=icustService.getCustomerDetails(customer);
			System.out.println("ID :"+i);
			break;
		case 2:
			if(i!=0)
			{
				System.out.println("Enter cust ID:");
			int	cust_id=sc.nextInt();
				customer=icustService.getCustId(cust_id);
				if(customer!=null)
				{
					System.out.println("name of the customer:"+customer.getCustname());
					System.out.println("Booking Status:BOOKED");
					System.out.println("Room No:"+customer.getRoomno());
					System.out.println("Room Type:"+customer.getRoomtype());
				}
			}
			break;
		case 3:
			System.exit(0);
			break;
		}
			
    }while(true);
}
}
