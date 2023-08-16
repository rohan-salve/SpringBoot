package in.ineuron.vo;

public class EmployeeVO {
	
	String empId;
	String ename;
	String esal;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsal() {
		return esal;
	}
	public void setEsal(String esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "EmployeeVO [empId=" + empId + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	
	
}
