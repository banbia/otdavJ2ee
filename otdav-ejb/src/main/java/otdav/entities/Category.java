package otdav.entities;
// Generated 30 juin 2019 11:35:09 by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Category generated by hbm2java
 */
@Entity
@Table(name = "category", catalog = "pi_otdav")
public class Category implements java.io.Serializable {

	private int idCategory;
	private String libele;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	private Set<Work> works = new HashSet(0);
	public Category() {
	}

	public Category(int idCategory) {
		this.idCategory = idCategory;
	}

	public Category(int idCategory, String libele, Set works) {
		this.idCategory = idCategory;
		this.libele = libele;
		this.works = works;
	}

	@Id

	@Column(name = "idCategory", unique = true, nullable = false)
	public int getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	@Column(name = "libele", length = 254)
	public String getLibele() {
		return this.libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}

	
	public Set getWorks() {
		return this.works;
	}

	public void setWorks(Set works) {
		this.works = works;
	}

}
