package doj.ca.gov.excelparser.entity;

import java.util.Set;

public class Reason {
	
	
	
	
	private String edu_cd_sec_id = null;
	private String edu_cd_subdiv_id = null;
	private String prireasonforstop_key = null;
	private String reasonforstopnarrative = null;
	private String suspicion_offense_cd = null;
	private Set<String> suspicion_subtype_set = null;
	private String traffic_violation_offense_cd = null;
	private String trafficviolation_id = null;
	
	public Reason() {
		
	
	
}

	public String getEdu_cd_sec_id() {
		return edu_cd_sec_id;
	}

	public void setEdu_cd_sec_id(String edu_cd_sec_id) {
		this.edu_cd_sec_id = edu_cd_sec_id;
	}

	public String getEdu_cd_subdiv_id() {
		return edu_cd_subdiv_id;
	}

	public void setEdu_cd_subdiv_id(String edu_cd_subdiv_id) {
		this.edu_cd_subdiv_id = edu_cd_subdiv_id;
	}

	public String getPrireasonforstop_key() {
		return prireasonforstop_key;
	}

	public void setPrireasonforstop_key(String prireasonforstop_key) {
		this.prireasonforstop_key = prireasonforstop_key;
	}

	public String getReasonforstopnarrative() {
		return reasonforstopnarrative;
	}

	public void setReasonforstopnarrative(String reasonforstopnarrative) {
		this.reasonforstopnarrative = reasonforstopnarrative;
	}

	public String getSuspicion_offense_cd() {
		return suspicion_offense_cd;
	}

	public void setSuspicion_offense_cd(String suspicion_offense_cd) {
		this.suspicion_offense_cd = suspicion_offense_cd;
	}

	public Set<String> getSuspicion_subtype_set() {
		return suspicion_subtype_set;
	}

	public void setSuspicion_subtype_set(Set<String> suspicion_subtype_set) {
		this.suspicion_subtype_set = suspicion_subtype_set;
	}

	public String getTraffic_violation_offense_cd() {
		return traffic_violation_offense_cd;
	}

	public void setTraffic_violation_offense_cd(String traffic_violation_offense_cd) {
		this.traffic_violation_offense_cd = traffic_violation_offense_cd;
	}

	public String getTrafficviolation_id() {
		return trafficviolation_id;
	}

	public void setTrafficviolation_id(String trafficviolation_id) {
		this.trafficviolation_id = trafficviolation_id;
	}
}