package com.esprit.fckindergarten.service;

import java.util.List;

import com.esprit.fckindergarten.entity.FeedbackEvents;

public interface IFeedbackEventsService {

	List<FeedbackEvents> retrieveAllFeedbackEvents();
	FeedbackEvents AddFeedbackEv(FeedbackEvents FDE,Long id);
	void deleteFdEv(Long id);
	FeedbackEvents retrieveFeedbackEventById(Long id);
	
}
