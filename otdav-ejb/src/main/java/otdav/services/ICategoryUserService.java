package otdav.services;

import java.util.List;

import otdav.entities.CategoryUser;

public interface ICategoryUserService {

	public int    addCategoryUser(CategoryUser categoryUser);
	public void removeCategoryUser(CategoryUser categoryUser);
	public void updateCategoryUser(CategoryUser categoryUser);
	public CategoryUser findCategoryUserById(int id);
	public List<CategoryUser> findAllCategoryUser();
}
