package otdav.business;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import otdav.entities.Right;
import otdav.utils.JPAUtil;

public class RightBusiness {
	private List<Right> rights;
	EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
	public RightBusiness() {
		rights=new ArrayList<Right>();
		rights.add(new Right(1,"ref1","Libelle1", "Lorem ispum sit amet dolor"));
		rights.add(new Right(2,"ref2","Libelle2", "Lorem ispum sit amet dolor"));
		rights.add(new Right(3,"ref3","Libelle3", "Lorem ispum sit amet dolor"));
		rights.add(new Right(4,"ref4","Libelle4", "Lorem ispum sit amet dolor"));
		rights.add(new Right(5,"ref5","Libelle5", "Lorem ispum sit amet dolor"));
	}

	public List<Right> getRights() {
		return rights;
	}

	public void setRights(List<Right> rights) {
		this.rights = rights;
	}
	
	public Right getRightByReference(String reference){
		
		for (Right l:rights){
			if(l.getReference()==reference)
				return l;
		}
		return null;
	}
	
	public boolean addRight(Right right){
	    entityManager.getTransaction().begin();
	    entityManager.persist(right);
	    entityManager.getTransaction().commit();
		return false;
	}
	public boolean updateRight(int idRight, Right rendezVous){
		
		return false;
	}
	
	public boolean deleteRight(int id){
		entityManager.getTransaction().begin();
	    entityManager.remove(id);
		return false;
	}
}
