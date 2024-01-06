package com.esprit.fckindergarten.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Kindergarten implements Serializable {

	/**
	 * 
	 */
	@OneToMany(cascade= CascadeType.ALL,mappedBy="Kindergarten")
	private Set<Reclamation> reclamation;
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String names;

	public Kindergarten(Set<Reclamation> reclamation, Long id, String names) {
		super();
		this.reclamation = reclamation;
		this.id = id;
		this.names = names;
	}

	public Kindergarten() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Set<Reclamation> getReclamation() {
		return reclamation;
	}

	public void setReclamation(Set<Reclamation> reclamation) {
		this.reclamation = reclamation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}
}