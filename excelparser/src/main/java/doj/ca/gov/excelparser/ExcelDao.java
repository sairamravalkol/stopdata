package doj.ca.gov.excelparser;


import java.util.Calendar;
import java.util.Date;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.LocalDate;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.Session;

public class ExcelDao {
	private Session session;
	public void insertData(StopData stopData) {
		session = DbConnection.openConnection();
//		String cql = "Insert INTO stop_data.stopdata_by_doj_record_id(doj_record_id,agency_ori,lea_batchid,lea_record_id,officer,location) \n" + 
//				"Values('"+stopData.getDoj_Record_Id()+"','"+stopData.getAgency_ORI()+"','"+stopData.getLEA_batchID()+"','"+stopData.getLEA_Record_ID()+"' ,{officer_uid: '"+stopData.getOfficer_UID()+"'},{locationdescription:'"+stopData.getLocationdescription()+"',ClosestCity:'"+stopData.getClosestCity()+"',K12Schoolname:'"+stopData.getK12Schoolname()+"'})";
		String cqlQuery= "insert into stop_data.stopdata_by_doj_record_id(agency_ori,lea_batchid,lea_record_id,dateofstop,"
				+ "starttimeofstop,durationofstop,"
				+ "resp_to_svc_call,officer_uid,officeryearsofexperience,officertypeofassignment,officerotherassignmenttype,"
				+ "locationdescription,closestcity,k12school,k12schoolname,"
				+ "ethnicity_set,gender_key,gendernonconforming,lgbt,age,limitedenglish,disability_set,stopforastudent,"
				+ "prireasonforstop_key,reasonforstopnarrative,"
				+ "trafficviolation_id,edu_cd_sec_id,edu_cd_subdiv_id,suspicion_offense_cd,Suspicion_subType_Set,"
				+ "action_set,basis_for_search_set,basisforsearchnarrative,propety_seized_set,result_of_stop_set) "
			    + " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		
		String cqlQuery1= "insert into stop_data.stopdata_by_doj_record_id(agency_ori,doj_record_id,lea_batchid,lea_record_id,"
				+ "starttimeofstop,durationofstop,resp_to_svc_call,officer,location,dateofstop,persondata) "
				+ " values(?,?,?,?,?,?,?,{officer_uid: ?, officerotherassignmenttype: ?, officertypeofassignment: ?, "
				+ "officeryearsofexperience: ?}, {locationdescription: ?,closestcity: ?,k12school: ?,k12schoolname: ?},?,"
				+ "[{{age: ?}}])";
		  
		
		//{{Ethnicity_Set:{'',''},Gender_Key:'',Gendernonconforming: 'x',LGBT:true,Age:,Limitedenglish:true,Disability_Set:{'',''},stopforastudent:true}
		
	 	PreparedStatement ps = session.prepare(cqlQuery1);
	 	BoundStatement bs = ps.bind()
	 			            .setString(0, stopData.getAgency_ORI())
	 			            .setString(1, "sairam")
	 			            .setString(2, stopData.getLEA_batchID())
	 			           .setString(3, stopData.getLEA_Record_ID())
	 			           .setTime(4, stopData.getStarttimeofStop().getTime())
	 			           .setInt(5, stopData.getDurationofstop())
	 			           .setBool(6, stopData.getResp_to_svc_call())
	 			           .setString(7, stopData.getOfficer_UID())
	 			           .setString(8, stopData.getOfficerotherassignmenttype())
	 			           .setString(9,stopData.getOfficertypeofassignment())
	 			           .setInt(10, stopData.getOfficeryearsofexperience())
	 			           .setString(11, stopData.getLocationdescription())
	 			           .setString(12, stopData.getClosestCity())
	 			           .setBool(13, stopData.getK12school())
	 			           .setString(14, stopData.getK12Schoolname())
	 			          .setDate(15, getLocalDate(stopData.getDateofStop())) 
	 			          .setSet(16, null)
	 			          
	 			           ;
	 	                
	 	
	 			            
	 			           
	 			            
		session.execute(bs);
		
		session.close();
	}
	public LocalDate getLocalDate(Date input) {
		
	   	Calendar cal = Calendar.getInstance();
	   	cal.setTime(input);
	   	
	   	LocalDate ldate = LocalDate.fromYearMonthDay(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH));
	   	       
	   	       
	   	return ldate;

	}

}
