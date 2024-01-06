package com.esprit.fckindergarten.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esprit.fckindergarten.entity.Events;

public interface EventsRepository extends JpaRepository<Events,Long> {

}
