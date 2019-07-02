package otdav.serviceImplementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import otdav.entities.Work;
import otdav.services.IWorkService;

public class WorkService implements IWorkService{
	
	@PersistenceContext(unitName = "otdav-ejb")
	EntityManager em;

	@Override
	public int addWork(Work work) {
		em.persist(work);
		return work.getIdWork();
	}

	@Override
	public String removeWork(int idWork) {
		if(em.find(Work.class, idWork)==null)
		{
			return "idWork ="+idWork+"d'ont existe";
		}
		else{
		em.remove(em.find(Work.class, idWork));
		return "Delete succeful";
		}
	}

	@Override
	public String updateWork(Work NewWork) {
		if (em.find(Work.class, NewWork.getIdWork())==null)
		{
	return "Work don't existe" +NewWork.getIdWork();
		}
		else{
			System.out.println("In updateOeuvre : ");
			Work oeuvrs = em.find(Work.class, NewWork.getIdWork());
			oeuvrs.setCategory(NewWork.getCategory());
			oeuvrs.setTitre(NewWork.getTitre());
			oeuvrs.setCompositeur(NewWork.getCompositeur());
			oeuvrs.setVille(NewWork.getVille());
			oeuvrs.setDate(NewWork.getDate());
			oeuvrs.setGenre(NewWork.getGenre());
			oeuvrs.setDuree(NewWork.getDuree());
			oeuvrs.setPourcentAdaptateur(NewWork.getPourcentAdaptateur());
			oeuvrs.setPourcentArrangeur(NewWork.getPourcentArrangeur());
			oeuvrs.setPourcentAuteur(NewWork.getPourcentAuteur());
			oeuvrs.setPourcentCompositeur(NewWork.getPourcentCompositeur());
			oeuvrs.setPourcentEditeur(NewWork.getPourcentEditeur());
	
	return "Updated with success ";
}

		
	}

	@Override
	public Work findWorkById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Work> findAllWorks() {
		// TODO Auto-generated method stub
		return null;
	}

}
