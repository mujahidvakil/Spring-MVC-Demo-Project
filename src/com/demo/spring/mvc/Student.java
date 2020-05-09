package com.demo.spring.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countryOption;
	private String favoriteLanguage;
	private String[] opratingSystem;

	public String[] getOpratingSystem() {
		return opratingSystem;
	}
	public void setOpratingSystem(String[] opratingSystem) {
		this.opratingSystem = opratingSystem;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public Student() {
		countryOption=new LinkedHashMap<>();
		countryOption.put("IND", "India");
		countryOption.put("PAK", "Pakistan");
		countryOption.put("US", "America");
		countryOption.put("BR", "Brazil");
	}
	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}

	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
