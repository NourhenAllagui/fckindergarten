package com.esprit.fckindergarten.service;

import java.util.List;

import com.esprit.fckindergarten.entity.FeedbackOffers;

public interface IFeedbackOffersService {

	List<FeedbackOffers> retieveAllFeedbackOffers();
	
	FeedbackOffers AddFeedbackOffers(FeedbackOffers FdO);
	FeedbackOffers retieveFeedbackOffersById(Long id);
	void deleteFeedbackOffers(Long id);
}
