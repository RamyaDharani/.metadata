package com.Reveiw1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class TouristerDetails {
	@Id
	@GeneratedValue
	private long tid;
	private String tcity;
	private String tstreet;
	private String tpincode;
	public TouristerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TouristerDetails [tid=" + tid + ", tcity=" + tcity + ", tstreet=" + tstreet + ", tpincode=" + tpincode
				+ "]";
	}
	public long getTid() {
		return tid;
	}
	public void setTid(long tid) {
		this.tid = tid;
	}
	public String getTcity() {
		return tcity;
	}
	public void setTcity(String tcity) {
		this.tcity = tcity;
	}
	public String getTstreet() {
		return tstreet;
	}
	public void setTstreet(String tstreet) {
		this.tstreet = tstreet;
	}
	public String getTpincode() {
		return tpincode;
	}
	public void setTpincode(String tpincode) {
		this.tpincode = tpincode;
	}
	

}
