package homeworkk.dataAccess;


import java.time.LocalDate;
import java.util.ArrayList;

import homeworkk.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
ArrayList<Category> categories = new ArrayList<Category>();
	
	public HibernateCategoryDao() {
		categories.add(new Category("57a80781-af30-4195-81c0-df4b3087622a", "Software Development", LocalDate.now(), false));
		categories.add(new Category("3cbd3313-9a53-4abc-8ba9-67161ce1b680", "Game Development", LocalDate.now(), false));
		categories.add(new Category("81131e38-5352-46c0-ad30-a10e4d1f35c6", "Web Development", LocalDate.now(), false));
	}

	@Override
	public void add(Category category) {
		categories.add(category);
		System.out.println("Category: " + category.getName() + " added to system!(Hibernate)");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Category: " + category.getName() + " updated!(Hibernate)");
		
	}

	@Override
	public void delete(String id) {
		System.out.println("Category removed from the system!(Hibernate)");
		
	}

	@Override
	public Category getByName(String name) {
		Category category = new Category();
		for(Category c : categories) {
			if(c.getName().equalsIgnoreCase(name)) {
				category = c;
				return category;
			}
		}
		return category;
	}

}
