package com.esprit.fckindergarten.service;

import java.util.List;


import com.esprit.fckindergarten.entity.Parents;

public interface IParentService {


	List<Parents> retrieveAllParent();

	Parents addParent(Parents PR);
	Parents retrieveParent(Long id);
}
