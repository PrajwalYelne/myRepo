public class Event {
	
	private String eventName , ownerName;
	private Integer attendeesCount;
	Event(){}
	Event(String eventName, Integer attendeesCount, String ownerName){
		this.eventName=eventName;
		this.attendeesCount=attendeesCount;
		this.ownerName=ownerName;
	}
	void setEventName(String eventName){this.eventName=eventName;}
	String getEventName(){return eventName;}
	void setOwnerName(String ownerName){this.ownerName=ownerName;}
	String getOwnerName(){return ownerName;}
	void setAttendeesCount(Integer attendeesCount){this.attendeesCount=attendeesCount;}
	Integer getAttendeesCount(){return attendeesCount;}
}
