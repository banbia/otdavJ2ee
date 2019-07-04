package otdav.entities;
// Generated 30 juin 2019 11:35:09 by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * WorkDeposit generated by hbm2java
 */
@Entity
@Table(name = "work_deposit", catalog = "pi_otdav")
public class WorkDeposit implements java.io.Serializable {
	@Id
	private int idWorkDeposit;
	private Integer idantifiantUnique;
	private String titre;
	private String auteur;
	private String description;
	private String support;
	private Integer typeCategorie;
	@OneToMany(mappedBy = "workDeposit")
	private Set<Deposit> deposits;
	public WorkDeposit() {
	}

	public WorkDeposit(int idWorkDeposit) {
		this.idWorkDeposit = idWorkDeposit;
	}

	public WorkDeposit(int idWorkDeposit, Integer idantifiantUnique, String titre, String auteur, String description,
			String support, Integer typeCategorie, Set<Deposit> deposits) {
		this.idWorkDeposit = idWorkDeposit;
		this.idantifiantUnique = idantifiantUnique;
		this.titre = titre;
		this.auteur = auteur;
		this.description = description;
		this.support = support;
		this.typeCategorie = typeCategorie;
		this.deposits = deposits;
	}

	@Column(name = "idWorkDeposit", unique = true, nullable = false)
	public int getIdWorkDeposit() {
		return this.idWorkDeposit;
	}

	public void setIdWorkDeposit(int idWorkDeposit) {
		this.idWorkDeposit = idWorkDeposit;
	}

	@Column(name = "idantifiantUnique")
	public Integer getIdantifiantUnique() {
		return this.idantifiantUnique;
	}

	public void setIdantifiantUnique(Integer idantifiantUnique) {
		this.idantifiantUnique = idantifiantUnique;
	}

	@Column(name = "titre", length = 254)
	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Column(name = "auteur", length = 254)
	public String getAuteur() {
		return this.auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Column(name = "description", length = 254)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "support", length = 254)
	public String getSupport() {
		return this.support;
	}

	public void setSupport(String support) {
		this.support = support;
	}

	@Column(name = "typeCategorie")
	public Integer getTypeCategorie() {
		return this.typeCategorie;
	}

	public void setTypeCategorie(Integer typeCategorie) {
		this.typeCategorie = typeCategorie;
	}

	
	public Set<Deposit> getDeposits() {
		return this.deposits;
	}

	public void setDeposits(Set<Deposit> deposits) {
		this.deposits = deposits;
	}


}
