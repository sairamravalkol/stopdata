package doj.ca.gov.excelparser.entity;

public class Location {
	private String  closestCity = null;
	private String locationDescription = null;
	private Boolean k12school = null;
	private String k12schoolname = null ;
	
	
	public Location() {
		// Default constructor
	}


	public String getClosestCity() {
		return closestCity;
	}


	public void setClosestCity(String closestCity) {
		this.closestCity = closestCity;
	}


	public String getLocationDescription() {
		return locationDescription;
	}


	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}


	public Boolean getK12school() {
		return k12school;
	}


	public void setK12school(Boolean k12school) {
		this.k12school = k12school;
	}


	public String getK12schoolname() {
		return k12schoolname;
	}


	public void setK12schoolname(String k12schoolname) {
		this.k12schoolname = k12schoolname;
	}
 
}
