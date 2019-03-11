package com.cg.room.beans;

public class Customer {
	private String custname;
	private String Email;
	private String custaddress;
	private int mobile;
	private String roomtype;
	private int roomno;
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public Customer(String custname, String email, String custaddress, int mobile, String roomtype, int roomno) {
		super();
		this.custname = custname;
		Email = email;
		this.custaddress = custaddress;
		this.mobile = mobile;
		this.roomtype = roomtype;
		this.roomno = roomno;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	

}
