package com.esprit.fckindergarten.service;

import java.util.List;
import java.util.Optional;

import com.esprit.fckindergarten.entity.Reclamation;

public interface IReclamationService {

	List<Reclamation> retrieveAllReclamation();

	Reclamation addReclamation(Reclamation Rec ,Long kindergarten_id,Long parents_id);

	void deleteReclamation(Long id);

	Reclamation updateReclamation(Reclamation Rec,Long id ,Long admin_id);

	Optional<Reclamation> retrieveReclamation(Long id);

}
