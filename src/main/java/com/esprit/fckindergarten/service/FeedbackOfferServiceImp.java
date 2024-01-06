package com.esprit.fckindergarten.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.fckindergarten.entity.FeedbackOffers;
import com.esprit.fckindergarten.repository.FeedbackOffersRepository;
@Service
public class FeedbackOfferServiceImp implements IFeedbackOffersService {

	@Autowired
	FeedbackOffersRepository FeedbakEvRepo;
	
	@Override
	public List<FeedbackOffers> retieveAllFeedbackOffers() {
		
		return (List<FeedbackOffers>) FeedbakEvRepo.findAll();
	}

	@Override
	public FeedbackOffers AddFeedbackOffers(FeedbackOffers FdO) {
		
		return FeedbakEvRepo.save(FdO);
	}

	@Override
	public FeedbackOffers retieveFeedbackOffersById(Long id) {
		return FeedbakEvRepo.findById(id).orElse(null);
	}

	@Override
	public void deleteFeedbackOffers(Long id) {
		 FeedbakEvRepo.deleteById(id);
	}
	

}
