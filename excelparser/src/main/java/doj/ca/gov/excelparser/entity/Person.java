package doj.ca.gov.excelparser.entity;

import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;

public class Person {

	
	private Map<String, Boolean> action_set = null;
	private Set<String> basis_for_property_seizure_set = null;
	private Set<String> basis_for_search_set = null;
	private String basisforsearchnarrative = null;
	private Set<String> contraband_or_evidence_set = null;
	//private Set<String> perceptiondata(frozen<perceptiondata>)
	private String persondeletedreason = null;
	private String persondeleteothercomment = null;
	private Integer personnum = null;
	//primaryreason(frozen<reason>) = null;
	private Set<String> propety_seized_set = null;
	//private Map<String, Frozen<Set<String>>> result_of_stop_set = null;
	
	
	public Person() {
		
	
	

}


	public Map<String, Boolean> getAction_set() {
		return action_set;
	}


	public void setAction_set(Map<String, Boolean> action_set) {
		this.action_set = action_set;
	}


	public Set<String> getBasis_for_property_seizure_set() {
		return basis_for_property_seizure_set;
	}


	public void setBasis_for_property_seizure_set(Set<String> basis_for_property_seizure_set) {
		this.basis_for_property_seizure_set = basis_for_property_seizure_set;
	}


	public Set<String> getBasis_for_search_set() {
		return basis_for_search_set;
	}


	public void setBasis_for_search_set(Set<String> basis_for_search_set) {
		this.basis_for_search_set = basis_for_search_set;
	}


	public String getBasisforsearchnarrative() {
		return basisforsearchnarrative;
	}


	public void setBasisforsearchnarrative(String basisforsearchnarrative) {
		this.basisforsearchnarrative = basisforsearchnarrative;
	}


	public Set<String> getContraband_or_evidence_set() {
		return contraband_or_evidence_set;
	}


	public void setContraband_or_evidence_set(Set<String> contraband_or_evidence_set) {
		this.contraband_or_evidence_set = contraband_or_evidence_set;
	}


	public String getPersondeletedreason() {
		return persondeletedreason;
	}


	public void setPersondeletedreason(String persondeletedreason) {
		this.persondeletedreason = persondeletedreason;
	}


	public String getPersondeleteothercomment() {
		return persondeleteothercomment;
	}


	public void setPersondeleteothercomment(String persondeleteothercomment) {
		this.persondeleteothercomment = persondeleteothercomment;
	}


	public Integer getPersonnum() {
		return personnum;
	}


	public void setPersonnum(Integer personnum) {
		this.personnum = personnum;
	}


	public Set<String> getPropety_seized_set() {
		return propety_seized_set;
	}


	public void setPropety_seized_set(Set<String> propety_seized_set) {
		this.propety_seized_set = propety_seized_set;
	}
}
