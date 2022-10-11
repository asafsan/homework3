package homeworkk.dataAccess;

import homeworkk.entities.Category;

public interface CategoryDao {
	void add(Category category);
	void update(Category category);
	void delete(String id);
	Category getByName(String name);

}
