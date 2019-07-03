package otdav.services;

import java.util.List;

import javax.ejb.Remote;

import otdav.entities.TypeWork;
import otdav.entities.Work;

@Remote
public interface IWorkService {
	
	public void  addWork(Work work);
	public Work approveWork (Work work);
	public Work revokeWork (Work work);
	public Work cancelWork (Work work); // delete
	public String updateWork(Work NewWork);
	public Work findWorkById(int id);
	public List<Work> findWorkBytype(TypeWork etat);
	public List<Work> findAllWorks();

}
