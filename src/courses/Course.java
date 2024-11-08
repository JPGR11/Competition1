package courses;

public class Course {
	private String courseID;
	private String courseName;
	private String facultyRequired;
	private String roomRequired;
	private String meetingTimes;
	
	public Course(String courseID, String courseName, String facultyRequired, String roomRequired, String meetingTimes) {
		setCourseID(courseID);
		setCourseName(courseName);
		setFacultyRequired(facultyRequired);
		setRoomRequired(roomRequired);
		setMeetingTimes(meetingTimes);
	}
	
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getFacultyRequired() {
		return facultyRequired;
	}
	public void setFacultyRequired(String facultyRequired) {
		this.facultyRequired = facultyRequired;
	}
	public String getRoomRequired() {
		return roomRequired;
	}
	public void setRoomRequired(String roomRequired) {
		this.roomRequired = roomRequired;
	}
	public String getMeetingTimes() {
		return meetingTimes;
	}
	public void setMeetingTimes(String meetingTimes) {
		this.meetingTimes = meetingTimes;
	}

}
