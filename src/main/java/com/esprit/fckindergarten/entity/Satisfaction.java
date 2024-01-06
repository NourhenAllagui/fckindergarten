package com.esprit.fckindergarten.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Satisfaction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date date;
	

	public Parents getParentSatis() {
		return ParentSatis;
	}


	public void setParentSatis(Parents parentSatis) {
		ParentSatis = parentSatis;
	}

	@Enumerated(EnumType.ORDINAL)
	Satisfactions satisfactionOfYourChild ;
	

	@Enumerated(EnumType.ORDINAL)
	Satisfactions sysOfEducation;
	

	@Enumerated(EnumType.ORDINAL)
	Satisfactions satisEvent;
	
	@Enumerated(EnumType.ORDINAL)
	Satisfactions satisOffer;

	@Enumerated(EnumType.ORDINAL)
	Satisfactions statisTeamsOfFc;
	

	@Enumerated(EnumType.ORDINAL)
	Satisfactions statisambiance;
	

	@Enumerated(EnumType.ORDINAL)
	Satisfactions statisBus;
	
	
	@Enumerated(EnumType.ORDINAL)
	Satisfactions statisCommunationOnFc;
	

	@Enumerated(EnumType.ORDINAL)
	Satisfactions noteFc;
	
	@ManyToOne
     private Parents ParentSatis;


	public Satisfaction() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Satisfaction(int id, Date date, Satisfactions satisfactionOfYourChild, Satisfactions sysOfEducation,
			Satisfactions satisEvent, Satisfactions satisOffer, Satisfactions statisTeamsOfFc,
			Satisfactions statisambiance, Satisfactions statisBus, Satisfactions statisCommunationOnFc,
			Satisfactions noteFc, Parents parentSatis) {
		super();
		this.id = id;
		this.date = date;
		this.satisfactionOfYourChild = satisfactionOfYourChild;
		this.sysOfEducation = sysOfEducation;
		this.satisEvent = satisEvent;
		this.satisOffer = satisOffer;
		this.statisTeamsOfFc = statisTeamsOfFc;
		this.statisambiance = statisambiance;
		this.statisBus = statisBus;
		this.statisCommunationOnFc = statisCommunationOnFc;
		this.noteFc = noteFc;
		ParentSatis = parentSatis;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Satisfactions getSatisfactionOfYourChild() {
		return satisfactionOfYourChild;
	}


	public void setSatisfactionOfYourChild(Satisfactions satisfactionOfYourChild) {
		this.satisfactionOfYourChild = satisfactionOfYourChild;
	}


	public Satisfactions getSysOfEducation() {
		return sysOfEducation;
	}


	public void setSysOfEducation(Satisfactions sysOfEducation) {
		this.sysOfEducation = sysOfEducation;
	}


	public Satisfactions getSatisEvent() {
		return satisEvent;
	}


	public void setSatisEvent(Satisfactions satisEvent) {
		this.satisEvent = satisEvent;
	}


	public Satisfactions getSatisOffer() {
		return satisOffer;
	}


	public void setSatisOffer(Satisfactions satisOffer) {
		this.satisOffer = satisOffer;
	}


	public Satisfactions getStatisTeamsOfFc() {
		return statisTeamsOfFc;
	}


	public void setStatisTeamsOfFc(Satisfactions statisTeamsOfFc) {
		this.statisTeamsOfFc = statisTeamsOfFc;
	}


	public Satisfactions getStatisambiance() {
		return statisambiance;
	}


	public void setStatisambiance(Satisfactions statisambiance) {
		this.statisambiance = statisambiance;
	}


	public Satisfactions getStatisBus() {
		return statisBus;
	}


	public void setStatisBus(Satisfactions statisBus) {
		this.statisBus = statisBus;
	}


	public Satisfactions getStatisCommunationOnFc() {
		return statisCommunationOnFc;
	}


	public void setStatisCommunationOnFc(Satisfactions statisCommunationOnFc) {
		this.statisCommunationOnFc = statisCommunationOnFc;
	}


	public Satisfactions getNoteFc() {
		return noteFc;
	}


	public void setNoteFc(Satisfactions noteFc) {
		this.noteFc = noteFc;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}