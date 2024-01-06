package com.esprit.fckindergarten.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.fckindergarten.entity.Parents;
import com.esprit.fckindergarten.repository.ParentRepository;

@Service
public class ParentServiceImp implements IParentService  {

	@Autowired
	ParentRepository ParentRepo;
	@Override
	public List<Parents> retrieveAllParent() {
		return (List<Parents>) ParentRepo.findAll();
	}

	@Override
	public Parents addParent(Parents PR) {
		
		return ParentRepo.save(PR);
	}

	@Override
	public Parents retrieveParent(Long id) {
		// TODO Auto-generated method stub
		return ParentRepo.findById(id).orElse(null);
	}

}
