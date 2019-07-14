package otdav.services;

import java.util.List;

import otdav.entities.Fees;
import otdav.entities.User;

public interface IFeesService {
	public int addFees(Fees fees);
	public void updateFees(Fees fees);
	public Fees getFeesByUser(User user);
	public Fees findFeesById(int idFees);
	public void deleteFess(Fees fees) ;
	public List<Fees> getFees();
}
