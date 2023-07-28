package in.ineuron.dao;

import java.util.List;

import in.ineuron.bo.EmployeeBO;

public interface IEmpDao {
	public abstract List<EmployeeBO> displayAllRecords();
}
