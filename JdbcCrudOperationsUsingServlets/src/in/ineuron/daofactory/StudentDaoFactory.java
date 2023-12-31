package in.ineuron.daofactory;

import in.ineuron.persistence.IStudentDao;
import in.ineuron.persistence.StudentDaoImpl;

//Abstraction logic of implementation
public class StudentDaoFactory {

	// make constructor private to avoid object creation
	private StudentDaoFactory() {

	}

	static StudentDaoImpl studentDao = null;

	public static IStudentDao getStudentDao() {

		// singleton pattern code
		if (studentDao == null) {
			studentDao = new StudentDaoImpl();
		}
		return studentDao;

	}
}
