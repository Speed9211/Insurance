package com.insurance.dao.model;

public class Rider {

	int id;
	String riderName;
	double premiumIntrest;
	
	public Rider() {
		super();
	}
	public Rider(String riderName, double premiumIntrest) {
		super();
		this.riderName = riderName;
		this.premiumIntrest = premiumIntrest;
	}
	public Rider(int id, String riderName, double premiumIntrest) {
		super();
		this.id = id;
		this.riderName = riderName;
		this.premiumIntrest = premiumIntrest;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRiderName() {
		return riderName;
	}
	public void setRiderName(String riderName) {
		this.riderName = riderName;
	}
	public double getPremiumIntrest() {
		return premiumIntrest;
	}
	public void setPremiumIntrest(double premiumIntrest) {
		this.premiumIntrest = premiumIntrest;
	}
	@Override
	public String toString() {
		return "Rider [id=" + id + ", riderName=" + riderName + ", premiumIntrest=" + premiumIntrest + "]";
	}
	
	
	
}
