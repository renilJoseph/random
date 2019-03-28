package edu.asu.diging.tutorial.spring.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;
import edu.asu.diging.tutorial.spring.serviceInterface.MoodServiceInterface;

@Service
public class MoodService implements MoodServiceInterface {
	
	private String[] moods = null;
	private Map<String, String> reasonMap;
	
	@Override
	@PostConstruct 
	public void init() {
		moods = new String[]{"happy", "sad", "ok"};
		reasonMap = new HashMap<>();
		reasonMap.put("happy", "since i ran full");
		reasonMap.put("sad", "since i ran half");
		reasonMap.put("ok", "since i ran slow");
	}
	
	@Override
	public Mood getCurrentMood() {
		Mood mood =  new Mood(moods[new Random().nextInt(moods.length)]);
		mood.setReasonMap(reasonMap.get(mood.getFeeling()));
		
		return mood;
	}
	
	@Override
	public Mood getWhy(String moodVal) {
		Mood mood =  new Mood(moodVal);
		mood.setReasonMap(reasonMap.get(moodVal));
		
		return mood;
	}
}
