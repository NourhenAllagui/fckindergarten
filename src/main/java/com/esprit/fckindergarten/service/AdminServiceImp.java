package com.esprit.fckindergarten.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.fckindergarten.entity.Admin;
import com.esprit.fckindergarten.repository.AdminRepository;

@Service
public class AdminServiceImp implements IAdminService {

	@Autowired
	AdminRepository AdRepo;
	@Override
	public List<Admin> retrieveAllAdmin() {
	
		return (List<Admin>) AdRepo.findAll();
	}

	@Override
	public Admin addAdmin(Admin Ad) {
		
		return AdRepo.save(Ad);
	}

	@Override
	public Admin retrieveAdminById(Long id) {
		
		return AdRepo.findById(id).orElse(null);
	}

	
	

}
