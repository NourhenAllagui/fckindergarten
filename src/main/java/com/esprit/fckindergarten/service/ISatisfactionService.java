package com.esprit.fckindergarten.service;

import java.util.List;


import com.esprit.fckindergarten.entity.Satisfaction;

public interface ISatisfactionService {
	
	List<Satisfaction> retrieveAllSatisfactions();

	Satisfaction addSatisfaction(Satisfaction Satis,Long parents_id);

	//Satisfaction updateSatisfaction(Satisfaction Satis);

	Satisfaction retrieveSatisfaction(Long id);
}
