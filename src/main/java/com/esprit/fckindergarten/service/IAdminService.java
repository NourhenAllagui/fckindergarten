package com.esprit.fckindergarten.service;

import java.util.List;

import com.esprit.fckindergarten.entity.Admin;

public interface IAdminService {

	List<Admin> retrieveAllAdmin();

	Admin addAdmin(Admin Ad);

	Admin retrieveAdminById(Long id);
}
