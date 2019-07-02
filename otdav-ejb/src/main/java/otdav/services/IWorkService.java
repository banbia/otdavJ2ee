package otdav.services;

import java.util.List;

import javax.ejb.Remote;

import otdav.entities.Work;

@Remote
public interface IWorkService {
	
	public int  addWork(Work work);
	public String removeWork(int idWork);
	public String updateWork(Work NewWork);
	public Work findWorkById(int id);
	public List<Work> findAllWorks();

}
