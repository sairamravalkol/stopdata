package doj.ca.gov.excelparser;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.Table;

@Table(keyspace="stop_data",name="employee",caseSensitiveTable=false,caseSensitiveKeyspace=false)
public class Employee {
	@Column(name="employeenumber")
	private Integer empno;
	@Column(name="employeename")
	private String ename;
	@Column(name="employeesalary")
	private String salary;
	public Employee() {
		
	}
	
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	

}
