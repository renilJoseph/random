package edu.asu.diging.tutorial.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.asu.diging.tutorial.spring.domain.Mood;
import edu.asu.diging.tutorial.spring.service.MoodService;
import edu.asu.diging.tutorial.spring.serviceInterface.MoodServiceInterface;

@Controller
public class HomeController {
	
	@Autowired
	MoodServiceInterface service;
	
	
	
	@RequestMapping(value = "/")
	public String home(ModelMap map) {
		map.addAttribute("mood", service.getCurrentMood());
		return "index2";
	}
	
	@RequestMapping(value = "/reason", method = RequestMethod.GET)
	public String reason(@RequestParam(value = "mood") String moodVal, ModelMap map) {
		
		map.addAttribute("mood", service.getWhy(moodVal));
		return "index";
	}
	
}
