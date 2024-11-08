package room;

public class Room {
	private String roomID;
	private String roomName;
	private int roomCapacity;
	private String specifications;
	
	public Room(String roomID, String roomName, int roomCapacity, String specifications) {
		setRoomID(roomID);
		setRoomName(roomName);
		setRoomCapacity(roomCapacity);
		setSpecifications(specifications);
	}

	public String getRoomID() {
		return roomID;
	}

	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getRoomCapacity() {
		return roomCapacity;
	}

	public void setRoomCapacity(int roomCapacity) {
		this.roomCapacity = roomCapacity;
	}

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

}
