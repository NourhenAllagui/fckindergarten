package com.esprit.fckindergarten.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esprit.fckindergarten.entity.Parents;

public interface ParentRepository extends JpaRepository<Parents,Long> {

}
