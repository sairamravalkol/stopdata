package doj.ca.gov.excelparser.entity;

import java.util.Set;

public class PerceptionData {
	
	
	
	
	private Integer age = null;
	private Set<String> disability_set = null;
	private Set<String> ethnicity_set = null;
	private String gender_key = null;
	private String gendernonconforming = null;
	private Boolean lgbt = null;
	private String limitedenglish = null;
	private Boolean stopforastudent = null;
	
	public  PerceptionData() {
		
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Set<String> getDisability_set() {
		return disability_set;
	}

	public void setDisability_set(Set<String> disability_set) {
		this.disability_set = disability_set;
	}

	public Set<String> getEthnicity_set() {
		return ethnicity_set;
	}

	public void setEthnicity_set(Set<String> ethnicity_set) {
		this.ethnicity_set = ethnicity_set;
	}

	public String getGender_key() {
		return gender_key;
	}

	public void setGender_key(String gender_key) {
		this.gender_key = gender_key;
	}

	public String getGendernonconforming() {
		return gendernonconforming;
	}

	public void setGendernonconforming(String gendernonconforming) {
		this.gendernonconforming = gendernonconforming;
	}

	public Boolean getLgbt() {
		return lgbt;
	}

	public void setLgbt(Boolean lgbt) {
		this.lgbt = lgbt;
	}

	public String getLimitedenglish() {
		return limitedenglish;
	}

	public void setLimitedenglish(String limitedenglish) {
		this.limitedenglish = limitedenglish;
	}

	public Boolean getStopforastudent() {
		return stopforastudent;
	}

	public void setStopforastudent(Boolean stopforastudent) {
		this.stopforastudent = stopforastudent;
	}

	
	
	
}
