package com.cg.room.beans;

public class Room {
	
	public Room(String roomtype, String status) {
		this.roomtype=roomtype;
		this.status=status;
	}
	public Room() {
		// TODO Auto-generated constructor stub
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public String getstatus() {
		return status;
	}
	public void setstatus(String status) {
		this.status = status;
	}
	private String roomtype;
	private String status;

}
