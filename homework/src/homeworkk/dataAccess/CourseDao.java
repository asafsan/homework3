package homeworkk.dataAccess;

import homeworkk.entities.Course;

public interface CourseDao {
	void add(Course course);
	void update(Course course);
	void delete(String id);
	Course getByName(String name);

}
