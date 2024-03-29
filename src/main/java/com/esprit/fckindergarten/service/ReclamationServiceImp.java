package com.esprit.fckindergarten.service;


import java.util.Date;
import java.util.List;
import java.util.Optional;

//import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.fckindergarten.entity.Admin;
import com.esprit.fckindergarten.entity.Kindergarten;
import com.esprit.fckindergarten.entity.Parents;
import com.esprit.fckindergarten.entity.Reclamation;
import com.esprit.fckindergarten.repository.ReclamationRepository;

@Service
public class ReclamationServiceImp implements IReclamationService {

	@Autowired
	private ReclamationRepository reclamRepository;
	@Autowired
	private ParentServiceImp parentserviceimp;
	@Autowired
	private AdminServiceImp AdminServImp;
	@Autowired
	private KindergartenServiceImp KgservImp;
	//private static final org.apache.logging.log4j.Logger l = LogManager.getLogger(ReclamationServiceImp.class);

	@Override
	public List<Reclamation> retrieveAllReclamation() {
		
		return (List<Reclamation>) reclamRepository.findAll();
	}

	@Override
	public Reclamation addReclamation(Reclamation Rec ,Long kindergarten_id,Long parents_id) {
		 Rec.setDate(new Date());
		 Parents p=parentserviceimp.retrieveParent(parents_id);
			Rec.setParents(p);
		Kindergarten Kg=KgservImp.RetrieveKgById(kindergarten_id);
		    Rec.setKindergarten(Kg);
		return reclamRepository.save(Rec);
	}

	@Override
	public void deleteReclamation(Long id) {
		reclamRepository.deleteById(id);

	}

	
	@Override
	public Reclamation updateReclamation(Reclamation Rec,Long id,Long admin_id) {
		Admin AD = AdminServImp.retrieveAdminById(admin_id);
		Rec.setAdmin(AD);
		reclamRepository.save(Rec);
		return Rec;
	}

	
	@Override
	public Optional<Reclamation> retrieveReclamation(Long id) {
		return reclamRepository.findById(id);
	}

	
}

