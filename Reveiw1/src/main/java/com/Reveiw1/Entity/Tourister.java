package com.Reveiw1.Entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity

public class Tourister {
	@Id
	@GeneratedValue
	private int tid;
	@Override
	public String toString() {
		return "Tourister [tid=" + tid + ", tname=" + tname + ", temail=" + temail + ", tpassword=" + tpassword
				+ ", tcontactNumber=" + tcontactNumber + "]";
	}
	
	public Tourister() {
		super();
		
	}
	private String tname;
	private String temail;
	private String tpassword;
	private String tcontactNumber;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTemail() {
		return temail;
	}
	public void setTemail(String temail) {
		this.temail = temail;
	}
	public String getTpassword() {
		return tpassword;
	}
	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}
	public String getTcontactNumber() {
		return tcontactNumber;
	}
	public void setTcontactNumber(String tcontactNumber) {
		this.tcontactNumber = tcontactNumber;
	}

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="TouristerDetails_id")
	private TouristerDetails touristerDetails;
	public TouristerDetails getTouristerDetails() {
		return touristerDetails;
	}

	public void setTouristerDetails(TouristerDetails touristerDetails) {
		this.touristerDetails = touristerDetails;
	}
	

}
