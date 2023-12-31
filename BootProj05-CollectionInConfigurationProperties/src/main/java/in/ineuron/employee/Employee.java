package in.ineuron.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import in.ineuron.company.Company;


@Component("employee")
@ConfigurationProperties(prefix = "org.xyz")
public class Employee {

	String empName;
	long empId;
	Company company;
	String[] empSkills;
	List<String> empProjects;
	Set<Long> empCellNo;
	Map<String, Object> empCertifications;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String[] getEmpSkills() {
		return empSkills;
	}
	public void setEmpSkills(String[] empSkills) {
		this.empSkills = empSkills;
	}
	public List<String> getEmpProjects() {
		return empProjects;
	}
	public void setEmpProjects(List<String> empProjects) {
		this.empProjects = empProjects;
	}
	public Set<Long> getEmpCellNo() {
		return empCellNo;
	}
	public void setEmpCellNo(Set<Long> empCellNo) {
		this.empCellNo = empCellNo;
	}
	public Map<String, Object> getEmpCertifications() {
		return empCertifications;
	}
	public void setEmpCertifications(Map<String, Object> empCertifications) {
		this.empCertifications = empCertifications;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", company=" + company + ", empSkills="
				+ Arrays.toString(empSkills) + ", empProjects=" + empProjects + ", empCellNo=" + empCellNo
				+ ", empCertifications=" + empCertifications + "]";
	}
	
	
	
	
	
}
