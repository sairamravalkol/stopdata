package doj.ca.gov.excelparser;

import com.datastax.driver.core.Session;
import com.datastax.driver.mapping.Mapper;
import com.datastax.driver.mapping.MappingManager;
import com.sun.org.glassfish.gmbal.ManagedObjectManagerFactory;

public class TestApp {

	public static void main(String[] args) {
		DbConnection db =new DbConnection();
		Session openConnection = db.openConnection();
		MappingManager manager = new MappingManager(openConnection);
		Mapper<Employee> mapper = manager.mapper(Employee.class);
		Employee e = new Employee();
		e.setEmpno(101);
		e.setEname("sairam");
		e.setSalary("20000");
		mapper.save(e);
		
	}

}
