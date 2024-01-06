package com.esprit.fckindergarten.entity;

import java.awt.Image;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
//import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Offers implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	private String title;
	//private Image images;
	private String descriptions;
	
	/*@OneToMany(cascade= CascadeType.ALL,mappedBy="FeedbackOffer")
	private Set<Offers> offers;
*/
	public Offers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Offers(Long id, Date date, String title, Image images, String descriptions, Set<Offers> offers) {
		super();
		this.id = id;
		this.date = date;
		this.title = title;
		//this.images = images;
		this.descriptions = descriptions;
		//this.offers = offers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/*public Image getImages() {
		return images;
	}

	public void setImages(Image images) {
		this.images = images;
	}*/

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	/*public Set<Offers> getOffers() {
		return offers;
	}

	public void setOffers(Set<Offers> offers) {
		this.offers = offers;
	}*/
	
}
