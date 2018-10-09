package com.stackroute.moviecruiser.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")

	private int id;
         
	private String comments;
	@Column(name = "movie_id")
	private String movieId;

	

	
	@Column(name = "poster_path")
	private String poster_path;

	@Column(name = "release_date")
	private String release_date;

	@Column(name = "vote_average")
	private Double vote_average;

	@Column(name = "vote_count")
	private Integer vote_count;

	@Column(name = "user_id")
	private String userId;

	public Movie() {

	}

	

	public Movie(String comments, String movieId, String poster_path, String release_date, Double vote_average,
			Integer vote_count, String userId) {
		super();
		//this.id = id;
		this.comments = comments;
		this.movieId = movieId;
		this.poster_path = poster_path;
		this.release_date = release_date;
		this.vote_average = vote_average;
		this.vote_count = vote_count;
		this.userId = userId;
	}



	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getPoster_path() {
		return poster_path;
	}
	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}

    public Integer getVote_count() {
		return vote_count;
	}
	public void setVote_count(Integer vote_count) {
		this.vote_count = vote_count;
	}

	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	
	public Double getVote_average() {
		return vote_average;
	}
	public void setVote_average(Double vote_average) {
		this.vote_average = vote_average;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}

