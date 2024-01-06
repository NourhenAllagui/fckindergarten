package com.esprit.fckindergarten.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.fckindergarten.entity.Kindergarten;
import com.esprit.fckindergarten.repository.KindergartenRepository;

@Service
public class KindergartenServiceImp implements IKindergartenService {

	@Autowired
	private KindergartenRepository KgRep;
	
	@Override
	public Kindergarten AddKg(Kindergarten Kg) {
		
		return KgRep.save(Kg);
	}

	@Override
	public List<Kindergarten> RetrieveAllKg() {
		
		return (List<Kindergarten>) KgRep.findAll();
	}

	@Override
	public Kindergarten RetrieveKgById(Long id) {
		return KgRep.findById(id).orElse(null);
	}

}
