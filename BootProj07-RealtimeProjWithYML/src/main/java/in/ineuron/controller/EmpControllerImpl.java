package in.ineuron.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ineuron.dto.EmployeeDTO;
import in.ineuron.service.EmpServiceImpl;
import in.ineuron.vo.EmployeeVO;


@Component("controller")
public class EmpControllerImpl implements IEmpController{
	
	@Autowired
	EmpServiceImpl service;
	
	public EmpControllerImpl() {
		System.out.println("EmpControllerImpl.EmpControllerImpl()");
}

	@Override
	public List<EmployeeVO> displayAllRecords() {
		List<EmployeeDTO> employeesDTO = service.displayAllRecords();
		
		List<EmployeeVO> employeesVO = new ArrayList<EmployeeVO>();
		
		for(EmployeeDTO empDTO : employeesDTO)
		{
			EmployeeVO empVO = new EmployeeVO();
			
			empVO.setEmpId(String.valueOf(empDTO.getEmpId()));
			empVO.setEname(empDTO.getEname());
			empVO.setEsal(String.valueOf(empDTO.getEsal()));
			
			employeesVO.add(empVO);
		}
		
		
		return employeesVO;
	}
}
