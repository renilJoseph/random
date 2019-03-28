package edu.asu.diging.tutorial.spring.domain;

import java.util.Map;

public class Mood {
	
	private String feeling;
	
	private String reasonMap;
	
	public Mood(String mood) {
		feeling = mood;
	}

	public String getReasonMap() {
		return reasonMap;
	}

	public void setReasonMap(String reasonMap) {
		this.reasonMap = reasonMap;
	}

	public String getFeeling() {
		return feeling;
	}

	public void setFeeling(String feeling) {
		this.feeling = feeling;
	}
	
	

}
