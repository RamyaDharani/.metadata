package com.Reveiw1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TouristGuide {
@Id
	private int GuideId;
	private String GuideName;
	private int GuideAge;
	private String Availability;
	private String LanguageKnown;
	private String contactNumber;
	private int AmountPerDay;
	
	public int getGuideId() {
		return GuideId;
	}
	public void setGuideId(int guideId) {
		GuideId = guideId;
	}
	public String getGuideName() {
		return GuideName;
	}
	public void setGuideName(String guideName) {
		GuideName = guideName;
	}
	public int getGuideAge() {
		return GuideAge;
	}
	public void setGuideAge(int guideAge) {
		GuideAge = guideAge;
	}
	public String getAvailability() {
		return Availability;
	}
	public void setAvailability(String availability) {
		Availability = availability;
	}
	public String getLanguageKnown() {
		return LanguageKnown;
	}
	public void setLanguageKnown(String languageKnown) {
		LanguageKnown = languageKnown;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public int getAmountPerDay() {
		return AmountPerDay;
	}
	public void setAmountPerDay(int amountPerDay) {
		AmountPerDay = amountPerDay;
	}
	
}
