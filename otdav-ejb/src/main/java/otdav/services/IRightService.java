package otdav.services;

import java.util.List;

import javax.ejb.Remote;

import otdav.entities.Right;

@Remote
public interface IRightService {
	public List<Right> getRights();
	public void setRights(List<Right> rights);
	public Right getRightByReference(String reference);
	public void addRight(Right right);
	public void updateRight(Right right);
	public void deleteRight(Right right);
}
