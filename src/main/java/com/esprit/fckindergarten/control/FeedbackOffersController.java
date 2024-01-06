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

import com.esprit.fckindergarten.entity.FeedbackOffers;
import com.esprit.fckindergarten.service.FeedbackOfferServiceImp;

@RestController
@RequestMapping("/FeedbackOffers")
public class FeedbackOffersController {

	@Autowired
	private FeedbackOfferServiceImp FeedbackOfferServImp;
	@PostMapping("/addFeedbackOffer")
	@ResponseBody
	public FeedbackOffers AddFeedbackOffers(@RequestBody FeedbackOffers FdO) {
		FeedbackOffers fdOffers=FeedbackOfferServImp.AddFeedbackOffers(FdO);
		return fdOffers;
	}
	@GetMapping("/{id}")
	@ResponseBody
	public FeedbackOffers retieveFeedbackOffersById(@PathVariable Long id) {
		return FeedbackOfferServImp.retieveFeedbackOffersById(id);
	}
	@GetMapping("/all")
	@ResponseBody
	public List<FeedbackOffers> retieveAllFeedbackOffers() {
		return FeedbackOfferServImp.retieveAllFeedbackOffers();
	}
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public String deleteFeedbackOffers(@PathVariable Long id){
		FeedbackOfferServImp.deleteFeedbackOffers(id);
		return "it is done";
	}
}
