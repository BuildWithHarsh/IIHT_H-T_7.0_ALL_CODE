package com.task.sprint1;

class Course{
	private int id;
	private String courseName;
	private int courseDuration;
	private int courseFees;
	private String courseTeacher;

	public Course() {
		super();
	}

	public Course(int id, String courseName, int courseDuration, int courseFees, String courseTeacher) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseFees = courseFees;
		this.courseTeacher = courseTeacher;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", courseDuration=" + courseDuration
				+ ", courseFees=" + courseFees + ", courseTeacher=" + courseTeacher + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

	public int getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}

	public String getCourseTeacher() {
		return courseTeacher;
	}

	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}
	
	

}
