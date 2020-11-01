package registrationDAO;

import registrationModel.Employee;

public interface IResgistrationDAO {
	public int registerEmployee(Employee employee) throws ClassNotFoundException;
}
