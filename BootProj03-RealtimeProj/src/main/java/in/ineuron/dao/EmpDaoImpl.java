package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.EmployeeBO;

@Repository("dao")
public class EmpDaoImpl implements IEmpDao {

	private static final String SQL_SELECT_QUERY = "select empId,ename,esal from emptab";
	
	@Autowired
	private DataSource datasource;
	
	public EmpDaoImpl() {
		System.out.println("EmpDao.EmpDao()");
	}
	
	@Override
	public List<EmployeeBO> displayAllRecords() {
		// TODO Auto-generated method stub
		ArrayList<EmployeeBO> empListBO = null;
		try(Connection connection = datasource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(SQL_SELECT_QUERY);
				ResultSet resultSet = pstmt.executeQuery();)
		{
			empListBO = new ArrayList<EmployeeBO>();
			
			while (resultSet.next())
			{
				EmployeeBO empBO = new EmployeeBO();
				empBO.setEmpId(resultSet.getInt(1));
				empBO.setEname(resultSet.getString(2));
				empBO.setEsal(resultSet.getDouble(3));
				
				empListBO.add(empBO);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return empListBO;
	}
}
