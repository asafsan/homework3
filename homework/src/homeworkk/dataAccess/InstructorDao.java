package homeworkk.dataAccess;

import homeworkk.entities.Instructor;

public interface InstructorDao {
	void add(Instructor instructor);
	void update(Instructor instructor);
	void delete(String id);
	Instructor getByName(String name);

}
