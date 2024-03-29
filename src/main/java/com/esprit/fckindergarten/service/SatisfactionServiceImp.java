package com.esprit.fckindergarten.service;

import java.util.Date;
import java.util.List;


//import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.fckindergarten.entity.Parents;
import com.esprit.fckindergarten.entity.Satisfaction;
import com.esprit.fckindergarten.repository.SatisfactionRepository;

@Service
public class SatisfactionServiceImp implements ISatisfactionService{

	@Autowired
	SatisfactionRepository satisRepo;
	@Autowired
	private ParentServiceImp parentserviceimp;
	//private static final org.apache.logging.log4j.Logger l = LogManager.getLogger(ReclamationServiceImp.class);

	@Override
	public List<Satisfaction> retrieveAllSatisfactions() {
		return (List<Satisfaction>) satisRepo.findAll();
	}

	@Override
	public Satisfaction addSatisfaction(Satisfaction Satis,Long parents_id) {
		Satis.setDate(new Date());
		Parents p=parentserviceimp.retrieveParent(parents_id);
		Satis.setParentSatis(p);
		return satisRepo.save(Satis);
	}

	//@Override
	//public void deleteSatisfaction(Long id) {
		//satisRepo.deleteById(id);
		//}

	/*@Override
	public Satisfaction updateSatisfaction(Satisfaction Satis) {
		satisRepo.save(Satis);
		return Satis;
	}*/

	@Override
	public Satisfaction retrieveSatisfaction(Long id) {
		return satisRepo.findById(id).orElse(null);
	}

	
}
