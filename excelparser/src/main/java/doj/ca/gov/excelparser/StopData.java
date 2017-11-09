package doj.ca.gov.excelparser;


import java.sql.Time;
import java.util.Map;
import java.util.Set;

public class StopData {
	
	private String Agency_ORI;
	 private String LEA_batchID;
	 private String LEA_Record_ID;
	 private java.util.Date DateofStop;
	 private Time starttimeofStop;
	 private Integer Durationofstop;
	 private Boolean Resp_to_svc_call;
	 private String Officer_UID;
	 private Integer Officeryearsofexperience;
	 private String Officertypeofassignment;
	 private String Officerotherassignmenttype;
	 private String locationdescription;
	 private String ClosestCity;
	 private Boolean K12school;
	 private String K12Schoolname;
	 private Set<String> Ethnicity_Set;
	 private String Gender_Key;
	 private String Gendernonconforming;
	 private Boolean LGBT;
	 private Integer Age;
	 private Boolean Limitedenglish;
	 private Set<String> Disability_Set;
	 private Boolean stopforastudent;
	 private String PriReasonforStop_Key;
	 private String reasonforstopnarrative;
	 private String Trafficviolation_ID;
	 private Integer Traffic_Violation_Offense_CD;
	 private String EDU_CD_sec_ID;
	 private String EDU_CD_Subdiv_ID;
	 private Integer Suspicion_offense_CD;
	 private Set<String> Suspicion_subType_Set;
	 private Map<String,Boolean>Action_Set;
	 private Set<String> Basis_for_Search_Set;
	 private String Basisforsearchnarrative;
	 private Set<String> Basis_for_Property_Seizure_Set;
	 private Set<String> Propety_Seized_Set;
	 private Set<String> Contraband_or_Evidence_Set;
	 private Map<String,Set<Integer>> Result_of_Stop_Set;
	 
	 
	 
	 public StopData() {
		 //Default constructor
	 }



	public String getAgency_ORI() {
		return Agency_ORI;
	}



	public void setAgency_ORI(String agency_ORI) {
		Agency_ORI = agency_ORI;
	}



	public String getLEA_batchID() {
		return LEA_batchID;
	}



	public void setLEA_batchID(String lEA_batchID) {
		LEA_batchID = lEA_batchID;
	}



	public String getLEA_Record_ID() {
		return LEA_Record_ID;
	}



	public void setLEA_Record_ID(String lEA_Record_ID) {
		LEA_Record_ID = lEA_Record_ID;
	}



	public java.util.Date getDateofStop() {
		return DateofStop;
	}



	public void setDateofStop(java.util.Date dateofStop) {
		DateofStop = dateofStop;
	}



	public Time getStarttimeofStop() {
		return starttimeofStop;
	}



	public void setStarttimeofStop(Time starttimeofStop) {
		this.starttimeofStop = starttimeofStop;
	}



	public Integer getDurationofstop() {
		return Durationofstop;
	}



	public void setDurationofstop(Integer durationofstop) {
		Durationofstop = durationofstop;
	}



	public Boolean getResp_to_svc_call() {
		return Resp_to_svc_call;
	}



	public void setResp_to_svc_call(Boolean resp_to_svc_call) {
		Resp_to_svc_call = resp_to_svc_call;
	}



	public String getOfficer_UID() {
		return Officer_UID;
	}



	public void setOfficer_UID(String officer_UID) {
		Officer_UID = officer_UID;
	}



	public Integer getOfficeryearsofexperience() {
		return Officeryearsofexperience;
	}



	public void setOfficeryearsofexperience(Integer officeryearsofexperience) {
		Officeryearsofexperience = officeryearsofexperience;
	}



	public String getOfficertypeofassignment() {
		return Officertypeofassignment;
	}



	public void setOfficertypeofassignment(String officertypeofassignment) {
		Officertypeofassignment = officertypeofassignment;
	}



	public String getOfficerotherassignmenttype() {
		return Officerotherassignmenttype;
	}



	public void setOfficerotherassignmenttype(String officerotherassignmenttype) {
		Officerotherassignmenttype = officerotherassignmenttype;
	}



	public String getLocationdescription() {
		return locationdescription;
	}



	public void setLocationdescription(String locationdescription) {
		this.locationdescription = locationdescription;
	}



	public String getClosestCity() {
		return ClosestCity;
	}



	public void setClosestCity(String closestCity) {
		ClosestCity = closestCity;
	}



	public Boolean getK12school() {
		return K12school;
	}



	public void setK12school(Boolean k12school) {
		K12school = k12school;
	}



	public String getK12Schoolname() {
		return K12Schoolname;
	}



	public void setK12Schoolname(String k12Schoolname) {
		K12Schoolname = k12Schoolname;
	}



	public Set<String> getEthnicity_Set() {
		return Ethnicity_Set;
	}



	public void setEthnicity_Set(Set<String> ethnicity_Set) {
		Ethnicity_Set = ethnicity_Set;
	}



	public String getGender_Key() {
		return Gender_Key;
	}



	public void setGender_Key(String gender_Key) {
		Gender_Key = gender_Key;
	}



	public String getGendernonconforming() {
		return Gendernonconforming;
	}



	public void setGendernonconforming(String gendernonconforming) {
		Gendernonconforming = gendernonconforming;
	}



	public Boolean getLGBT() {
		return LGBT;
	}



	public void setLGBT(Boolean lGBT) {
		LGBT = lGBT;
	}



	public Integer getAge() {
		return Age;
	}



	public void setAge(Integer age) {
		Age = age;
	}



	public Boolean getLimitedenglish() {
		return Limitedenglish;
	}



	public void setLimitedenglish(Boolean limitedenglish) {
		Limitedenglish = limitedenglish;
	}



	public Set<String> getDisability_Set() {
		return Disability_Set;
	}



	public void setDisability_Set(Set<String> disability_Set) {
		Disability_Set = disability_Set;
	}



	public Boolean getStopforastudent() {
		return stopforastudent;
	}



	public void setStopforastudent(Boolean stopforastudent) {
		this.stopforastudent = stopforastudent;
	}



	public String getPriReasonforStop_Key() {
		return PriReasonforStop_Key;
	}



	public void setPriReasonforStop_Key(String priReasonforStop_Key) {
		PriReasonforStop_Key = priReasonforStop_Key;
	}



	public String getReasonforstopnarrative() {
		return reasonforstopnarrative;
	}



	public void setReasonforstopnarrative(String reasonforstopnarrative) {
		this.reasonforstopnarrative = reasonforstopnarrative;
	}



	public String getTrafficviolation_ID() {
		return Trafficviolation_ID;
	}



	public void setTrafficviolation_ID(String trafficviolation_ID) {
		Trafficviolation_ID = trafficviolation_ID;
	}



	public Integer getTraffic_Violation_Offense_CD() {
		return Traffic_Violation_Offense_CD;
	}



	public void setTraffic_Violation_Offense_CD(Integer traffic_Violation_Offense_CD) {
		Traffic_Violation_Offense_CD = traffic_Violation_Offense_CD;
	}



	public String getEDU_CD_sec_ID() {
		return EDU_CD_sec_ID;
	}



	public void setEDU_CD_sec_ID(String eDU_CD_sec_ID) {
		EDU_CD_sec_ID = eDU_CD_sec_ID;
	}



	public String getEDU_CD_Subdiv_ID() {
		return EDU_CD_Subdiv_ID;
	}



	public void setEDU_CD_Subdiv_ID(String eDU_CD_Subdiv_ID) {
		EDU_CD_Subdiv_ID = eDU_CD_Subdiv_ID;
	}



	public Integer getSuspicion_offense_CD() {
		return Suspicion_offense_CD;
	}



	public void setSuspicion_offense_CD(Integer suspicion_offense_CD) {
		Suspicion_offense_CD = suspicion_offense_CD;
	}



	public Set<String> getSuspicion_subType_Set() {
		return Suspicion_subType_Set;
	}



	public void setSuspicion_subType_Set(Set<String> suspicion_subType_Set) {
		Suspicion_subType_Set = suspicion_subType_Set;
	}



	public Map<String, Boolean> getAction_Set() {
		return Action_Set;
	}



	public void setAction_Set(Map<String, Boolean> action_Set) {
		Action_Set = action_Set;
	}



	public Set<String> getBasis_for_Search_Set() {
		return Basis_for_Search_Set;
	}



	public void setBasis_for_Search_Set(Set<String> basis_for_Search_Set) {
		Basis_for_Search_Set = basis_for_Search_Set;
	}



	public String getBasisforsearchnarrative() {
		return Basisforsearchnarrative;
	}



	public void setBasisforsearchnarrative(String basisforsearchnarrative) {
		Basisforsearchnarrative = basisforsearchnarrative;
	}



	public Set<String> getBasis_for_Property_Seizure_Set() {
		return Basis_for_Property_Seizure_Set;
	}



	public void setBasis_for_Property_Seizure_Set(Set<String> basis_for_Property_Seizure_Set) {
		Basis_for_Property_Seizure_Set = basis_for_Property_Seizure_Set;
	}



	public Set<String> getPropety_Seized_Set() {
		return Propety_Seized_Set;
	}



	public void setPropety_Seized_Set(Set<String> propety_Seized_Set) {
		Propety_Seized_Set = propety_Seized_Set;
	}



	public Set<String> getContraband_or_Evidence_Set() {
		return Contraband_or_Evidence_Set;
	}



	public void setContraband_or_Evidence_Set(Set<String> contraband_or_Evidence_Set) {
		Contraband_or_Evidence_Set = contraband_or_Evidence_Set;
	}



	public Map<String, Set<Integer>> getResult_of_Stop_Set() {
		return Result_of_Stop_Set;
	}



	public void setResult_of_Stop_Set(Map<String, Set<Integer>> result_of_Stop_Set) {
		Result_of_Stop_Set = result_of_Stop_Set;
	}

	 
	
	
}
