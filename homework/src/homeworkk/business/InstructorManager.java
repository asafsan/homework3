package homeworkk.business;

import homeworkk.coreLogging.Logger;
import homeworkk.dataAccess.InstructorDao;
import homeworkk.entities.Instructor;

public class InstructorManager {
	private InstructorDao _instructorDao;
	private Logger[] _loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this._instructorDao = instructorDao;
		this._loggers = loggers;
	}
	
	public void add(Instructor instructor) throws Exception {
		this._instructorDao.add(instructor);
		
		for(Logger logger : _loggers) {
			logger.log(instructor.getFirstName()+" "+instructor.getLastName());
		}
	}
	
	public void update(Instructor instructor) {
		this._instructorDao.update(instructor);
	}
	
	public void delete(String id) {
		this._instructorDao.delete(id);
	}

}
