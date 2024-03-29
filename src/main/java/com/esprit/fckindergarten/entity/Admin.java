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
public class Admin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	private String Name;
	
	@OneToMany(cascade= CascadeType.ALL,mappedBy="admin")
	private Set<Reclamation> reclamations;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Set<Reclamation> getReclamations() {
		return reclamations;
	}

	public void setReclamations(Set<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}

	public Admin(Long id, String name, Set<Reclamation> reclamations) {
		super();
		this.id = id;
		Name = name;
		this.reclamations = reclamations;
	}

	public Admin() {
		super();
		
	}
	

	

}