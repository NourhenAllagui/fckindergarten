package com.esprit.fckindergarten.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class FeedbackOffers implements Serializable{

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
	
	@Enumerated(EnumType.ORDINAL)
	FeedbackNote stars;

	private String summarize_your_comment;
	private String explain_more;
	
	/*@ManyToOne
    private Offers FeedbackOffer;*/

	public FeedbackOffers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FeedbackOffers(Long id, Date date, FeedbackNote stars, String summarize_your_comment, String explain_more,
			Offers feedbackOffer) {
		super();
		this.id = id;
		this.date = date;
		this.stars = stars;
		this.summarize_your_comment = summarize_your_comment;
		this.explain_more = explain_more;
		//FeedbackOffer = feedbackOffer;
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

	public FeedbackNote getStars() {
		return stars;
	}

	public void setStars(FeedbackNote stars) {
		this.stars = stars;
	}

	public String getSummarize_your_comment() {
		return summarize_your_comment;
	}

	public void setSummarize_your_comment(String summarize_your_comment) {
		this.summarize_your_comment = summarize_your_comment;
	}

	public String getExplain_more() {
		return explain_more;
	}

	public void setExplain_more(String explain_more) {
		this.explain_more = explain_more;
	}

	/*public Offers getFeedbackOffer() {
		return FeedbackOffer;
	}

	public void setFeedbackOffer(Offers feedbackOffer) {
		FeedbackOffer = feedbackOffer;
	}*/
	
}
