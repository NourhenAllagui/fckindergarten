package com.esprit.fckindergarten.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.fckindergarten.entity.FeedbackEvents;
import com.esprit.fckindergarten.repository.FeedbackEventsRepository;

@Service
public class FeedbackEventServiceImp implements IFeedbackEventsService {

	@Autowired
	FeedbackEventsRepository FeedbackEvRepo;
	
	@Override
	public List<FeedbackEvents> retrieveAllFeedbackEvents() {
		
		return (List<FeedbackEvents>) FeedbackEvRepo.findAll();
	}

	@Override
	public FeedbackEvents AddFeedbackEv(FeedbackEvents FDE, Long id) {
		return FeedbackEvRepo.save(FDE);
	}

	@Override
	public void deleteFdEv(Long id) {
		FeedbackEvRepo.deleteById(id);
	}

	@Override
	public FeedbackEvents retrieveFeedbackEventById(Long id) {
	
		return FeedbackEvRepo.findById(id).orElse(null);
	}
	

}
