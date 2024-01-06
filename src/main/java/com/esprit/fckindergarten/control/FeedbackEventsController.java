package com.esprit.fckindergarten.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.fckindergarten.entity.FeedbackEvents;
import com.esprit.fckindergarten.service.FeedbackEventServiceImp;

@RestController
@RequestMapping("/FeedbackEvent")
public class FeedbackEventsController {
	@Autowired
	private FeedbackEventServiceImp feedbackEvServiIpm;
	
	@PostMapping("/addFeedbackEvent")
	@ResponseBody
	public FeedbackEvents AddFeedbackEv(@RequestBody FeedbackEvents FDE, Long id)  {
		FeedbackEvents fdEv =feedbackEvServiIpm.AddFeedbackEv(FDE, id);
		return fdEv;
	}
	@GetMapping("/{id}")
	@ResponseBody
	public FeedbackEvents retrieveFeedbackEventById(@PathVariable Long id){
		return feedbackEvServiIpm.retrieveFeedbackEventById(id);
	}
	@GetMapping("/all")
	@ResponseBody
	public List<FeedbackEvents> retrieveAllFeedbackEvents(){
		return feedbackEvServiIpm.retrieveAllFeedbackEvents();
	}
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public String deleteFdEv(@PathVariable Long id) {
		feedbackEvServiIpm.deleteFdEv(id);
		return "it is done";
	}
}
