package otdav.Entities;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Category;
import otdav.entities.CategoryUser;
import otdav.serviceImplementation.CategoryUserService;
import services.ServiceCategory;

@ManagedBean(name = "CategoryAdhesionBean")
@SessionScoped


public class CategoryUserBean implements Serializable{

	private int idCategory;
	private String libele;
	
	@EJB
	CategoryUserService serviceCategoryUser;
	
	public CategoryUserBean() {
	}	
	
	public void addCategoryUser() {
		serviceCategoryUser.addCategoryUser(new CategoryUser(idCategory,libele));
	}
	public CategoryUserBean(int idCategoryUser) {		
		this.idCategory = idCategoryUser;
	}
	
	public CategoryUserBean(int idCategoryUser, String libele) {
		this.idCategory = idCategoryUser;
		this.libele = libele;
	}
	
 }

