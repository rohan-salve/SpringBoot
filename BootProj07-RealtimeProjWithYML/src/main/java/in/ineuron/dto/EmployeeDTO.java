package in.ineuron.dto;

public class EmployeeDTO {
	int empId;
	String ename;
	double esal;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	
}
