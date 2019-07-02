package otdav.servicesImplement;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import otdav.entities.Deposit;
import otdav.entities.Etat;
import otdav.entities.User;
import otdav.services.DepositService;




@Stateful
public class DepositServiceImp implements DepositService {
	@PersistenceContext(unitName = "otdav-ejb")
	public EntityManager em;
	
	
	@Override
	public void addDeposit(Deposit deposit) {
		//add a new deposit
		try {
			if (deposit != null)
				deposit.setEtat(Etat.pending);
				em.persist(deposit);	
		}catch (Exception e) {
			System.out.println(e); }
	}

	@Override
	public Deposit updateDeposit(Deposit deposit) {
		//Update All contents of this deposit
		try {
			if (deposit!= null) {
			return em.merge(deposit);
			}
			return null;
		
		}catch (Exception e) {
			return null;}
	}

	@Override
	public Deposit renewalDeposit(Deposit deposit) {
		
		// renewal the Deposit date deb, date fin
		
		try {
			if (deposit!= null) {
			return em.merge(deposit);
			}
			return null;
		}catch (Exception e) {
		return null;}
		
		/*Query query = em.createQuery("update Deposit d set "
				+ "dateDebutDepot=:dateDebutDepot,dateFinDepot=:dateFinDepot "
				+ " where d.idDeposit=:idDeposit", Deposit.class);
		query.setParameter("idDeposit", idDeposit);
		query.setParameter("dateDebutDepot", dateDebutDepot);
		query.setParameter("dateFinDepot", dateFinDepot);
		query.executeUpdate();*/	
	}

	@Override
	public void deleteDeposit(int idDeposit) {
		// delete this deposit
		try {
		em.remove(em.find(Deposit.class, idDeposit));}
		catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public List<Deposit> getDeposit() {
		//get all deposit
		TypedQuery<Deposit> query = em.createQuery("select * from Deposit ", Deposit.class);
		try
		{
			return query.getResultList();
		}
		catch (Exception e) { return null; }
	
	}

	@Override
	public Deposit revocDeposit(Deposit deposit) {
		// refuse this deposit (chage etat)
		
		try {
		if (deposit!= null) {
			deposit.setEtat(Etat.Refuse);}
		
			return em.merge(deposit);
		}catch ( Exception e ){
			return null;}
	}

	@Override
	public List<Deposit> DepositByAdherent(User user) {
		//Get all deposits by adherent
		TypedQuery<Deposit> query = em.createQuery("select d from Deposit d where d.user=:user.name", Deposit.class);
		query.setParameter("user", user);
		try
		{
			return query.getResultList();
		}
		catch (Exception e) { return null; }
	}
	

	@Override
	public List<Deposit> getDepositByCategorie(String category) {
		// TODO Auto-generated method stub
		return null;
	}

}
