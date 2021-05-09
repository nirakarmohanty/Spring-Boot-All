package com.src.nirakar.spring.mongodb.dto;

public class CourseDetails {
	private String CourseNam;
	private String Level;
	private int Experience;

	public String getCourseNam() {
		return CourseNam;
	}

	public void setCourseNam(String courseNam) {
		CourseNam = courseNam;
	}

	public String getLevel() {
		return Level;
	}

	public void setLevel(String level) {
		Level = level;
	}

	public int getExperience() {
		return Experience;
	}

	public void setExperience(int experience) {
		Experience = experience;
	}

}
