package otdav.serviceImplementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.resource.spi.RetryableUnavailableException;

import otdav.entities.Fees;
import otdav.entities.User;
import otdav.services.IFeesService;
import javax.persistence.TypedQuery;


public class FeesService implements IFeesService {

private List<Fees> feeses;
	
	@PersistenceContext(name="otdav-ejb")
	 static	EntityManager em;
	
	public List<Fees> getFeeses() {
		return feeses;
	}

	public void setFeeses(List<Fees> feeses) {
		this.feeses = feeses;
	}
	@Override
	public int addFees(Fees fees) {
		em.persist(fees);
		return fees.getIdFees();	
	}

	@Override
	public void updateFees(Fees fees) {
		em.persist(fees);
	}

	@Override
	public Fees findFeesById(int idFees) {
		Fees feesToFind = em.find(Fees.class, idFees);
		return feesToFind;
	}

	@Override
	public void deleteFess(Fees fees) {
		em.remove(fees);
		
	}

	@Override
	public List<Fees> getFees() {
		return feeses;
	}

	@Override
	public Fees getFeesByUser(User user) {	
		TypedQuery<Fees> query = em.createQuery(
				"SELECT e from Fees e WHERE idUser=:user.id",Fees.class);
		query.setParameter("iduser", user.getIdUser());
		return (Fees) query.getResultList();
	}
	
}
