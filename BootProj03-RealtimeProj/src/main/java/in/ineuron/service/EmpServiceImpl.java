package in.ineuron.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.EmployeeBO;
import in.ineuron.dao.IEmpDao;
import in.ineuron.dto.EmployeeDTO;

@Service("service")
public class EmpServiceImpl implements IEmpService {
	@Autowired
	private IEmpDao dao;
	public EmpServiceImpl() {
		System.out.println("EmpServiceImpl.EmpServiceImpl()");
	}
	
	public List<EmployeeDTO>  displayAllRecords() {
		List<EmployeeBO> employeesBO = dao.displayAllRecords();
		
		List<EmployeeDTO> employeesDTO = new ArrayList<EmployeeDTO>();
		
		for(EmployeeBO empBO : employeesBO)
		{
			EmployeeDTO empDTO = new EmployeeDTO();
			
			empDTO.setEmpId(empBO.getEmpId());
			empDTO.setEname(empBO.getEname());
			empDTO.setEsal(empBO.getEsal());
			
			employeesDTO.add(empDTO);
		}
		
		return employeesDTO;
	};
}
