package otdav.serviceImplementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import otdav.entities.CategoryUser;
import otdav.services.ICategoryUserService;

public class CategoryUserService implements ICategoryUserService {
	
	private List<CategoryUser> categoreisUser;
	@PersistenceContext(name="otdav-ejb")
	 static	EntityManager em;
	
	public List<CategoryUser> getCategoreisUser() {
		return categoreisUser;
	}

	public void setCategoreisUser(List<CategoryUser> categoreisUser) {
		this.categoreisUser = categoreisUser;
	}

	@Override
	public int addCategoryUser(CategoryUser categoryUser) {
		em.persist(categoryUser);
		return categoryUser.getIdCategoryUser();	
	}

	@Override
	public void removeCategoryUser(CategoryUser categoryUser) {
		em.remove(categoryUser);		
	}

	@Override
	public void updateCategoryUser(CategoryUser categoryUser) {
		em.persist(categoryUser);
		
	}

	@Override
	public CategoryUser findCategoryUserById(int id) {
		CategoryUser cotegoryUserToFind = em.find(CategoryUser.class, id);
		return cotegoryUserToFind;
	}

	@Override
	public List<CategoryUser> findAllCategoryUser() {
		return categoreisUser;
	}

}
