package edu.asu.diging.tutorial.spring.serviceInterface;

import edu.asu.diging.tutorial.spring.domain.Mood;

public interface MoodServiceInterface {
	
	public void init();
	
	public Mood getCurrentMood();
	
	public Mood getWhy(String moodVal);
}
