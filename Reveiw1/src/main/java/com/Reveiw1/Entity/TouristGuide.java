package com.Reveiw1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TouristGuide {
@Id
	private int guideId;
	private String guideName;
	private int guideAge;
	private String availability;
	private String languageKnown;
	private String contactNumber;
	private int amountPerDay;
	private int noOfDays;
	public int getGuideId() {
		return guideId;
	}
	public void setGuideId(int guideId) {
		this.guideId = guideId;
	}
	public String getGuideName() {
		return guideName;
	}
	public void setGuideName(String guideName) {
		this.guideName = guideName;
	}
	public int getGuideAge() {
		return guideAge;
	}
	public void setGuideAge(int guideAge) {
		this.guideAge = guideAge;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getLanguageKnown() {
		return languageKnown;
	}
	public void setLanguageKnown(String languageKnown) {
		this.languageKnown = languageKnown;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public int getAmountPerDay() {
		return amountPerDay;
	}
	public void setAmountPerDay(int amountPerDay) {
		this.amountPerDay = amountPerDay;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	
	
}
