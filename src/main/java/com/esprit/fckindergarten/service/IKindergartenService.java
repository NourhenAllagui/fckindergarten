package com.esprit.fckindergarten.service;

import java.util.List;

import com.esprit.fckindergarten.entity.Kindergarten;

public interface IKindergartenService {
	
	Kindergarten AddKg(Kindergarten Kg);
	
	List<Kindergarten> RetrieveAllKg();
	
	Kindergarten RetrieveKgById(Long id);
	

}
