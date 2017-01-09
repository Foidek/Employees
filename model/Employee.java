package model;

public class Employee {

	private String firstName, lastName;
	private int roomNumber, startHour, endHour;
	
	public Employee(String firstName, String lastName, int roomNumber, int startHour, int endHour){
		this.firstName = firstName;
		this.lastName = lastName;
		this.roomNumber = roomNumber;
		this.startHour = startHour;
		this.endHour = endHour;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public int getStartHour() {
		return startHour;
	}
	
	public int getEndHour() {
		return endHour;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public void setStartHour(int startHour) {
		this.startHour = startHour;
	}
	
	public void setEndHour(int endHour) {
		this.endHour = endHour;
	}
}
