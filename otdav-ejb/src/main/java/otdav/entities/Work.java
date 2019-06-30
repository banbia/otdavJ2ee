package otdav.entities;
// Generated 30 juin 2019 11:35:09 by Hibernate Tools 4.0.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Work generated by hbm2java
 */
@Entity
@Table(name = "work", catalog = "pi_otdav")
public class Work implements java.io.Serializable {

	private int idWork;
	private User user;
	private Category category;
	private String titre;
	private String compositeur;
	private String ville;
	private Date date;
	private String genre;
	private Integer duree;
	private Float pourcentAdaptateur;
	private Float pourcentArrangeur;
	private Float pourcentAuteur;
	private Float pourcentCompositeur;
	private Float pourcentEditeur;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "work")
	private Set<Division> divisions = new HashSet(0);

	public Work() {
	}

	public Work(int idWork, User user, Category category) {
		this.idWork = idWork;
		this.user = user;
		this.category = category;
	}

	public Work(int idWork, User user, Category category, String titre, String compositeur, String ville, Date date,
			String genre, Integer duree, Float pourcentAdaptateur, Float pourcentArrangeur, Float pourcentAuteur,
			Float pourcentCompositeur, Float pourcentEditeur, Set divisions) {
		this.idWork = idWork;
		this.user = user;
		this.category = category;
		this.titre = titre;
		this.compositeur = compositeur;
		this.ville = ville;
		this.date = date;
		this.genre = genre;
		this.duree = duree;
		this.pourcentAdaptateur = pourcentAdaptateur;
		this.pourcentArrangeur = pourcentArrangeur;
		this.pourcentAuteur = pourcentAuteur;
		this.pourcentCompositeur = pourcentCompositeur;
		this.pourcentEditeur = pourcentEditeur;
		this.divisions = divisions;
	}

	@Id

	@Column(name = "idWork", unique = true, nullable = false)
	public int getIdWork() {
		return this.idWork;
	}

	public void setIdWork(int idWork) {
		this.idWork = idWork;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUser", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCategory", nullable = false)
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Column(name = "titre", length = 254)
	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Column(name = "compositeur", length = 254)
	public String getCompositeur() {
		return this.compositeur;
	}

	public void setCompositeur(String compositeur) {
		this.compositeur = compositeur;
	}

	@Column(name = "ville", length = 254)
	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "genre", length = 254)
	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Column(name = "duree")
	public Integer getDuree() {
		return this.duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	@Column(name = "pourcentAdaptateur", precision = 12, scale = 0)
	public Float getPourcentAdaptateur() {
		return this.pourcentAdaptateur;
	}

	public void setPourcentAdaptateur(Float pourcentAdaptateur) {
		this.pourcentAdaptateur = pourcentAdaptateur;
	}

	@Column(name = "pourcentArrangeur", precision = 12, scale = 0)
	public Float getPourcentArrangeur() {
		return this.pourcentArrangeur;
	}

	public void setPourcentArrangeur(Float pourcentArrangeur) {
		this.pourcentArrangeur = pourcentArrangeur;
	}

	@Column(name = "pourcentAuteur", precision = 12, scale = 0)
	public Float getPourcentAuteur() {
		return this.pourcentAuteur;
	}

	public void setPourcentAuteur(Float pourcentAuteur) {
		this.pourcentAuteur = pourcentAuteur;
	}

	@Column(name = "pourcentCompositeur", precision = 12, scale = 0)
	public Float getPourcentCompositeur() {
		return this.pourcentCompositeur;
	}

	public void setPourcentCompositeur(Float pourcentCompositeur) {
		this.pourcentCompositeur = pourcentCompositeur;
	}

	@Column(name = "pourcentEditeur", precision = 12, scale = 0)
	public Float getPourcentEditeur() {
		return this.pourcentEditeur;
	}

	public void setPourcentEditeur(Float pourcentEditeur) {
		this.pourcentEditeur = pourcentEditeur;
	}

	
	public Set getDivisions() {
		return this.divisions;
	}

	public void setDivisions(Set divisions) {
		this.divisions = divisions;
	}

}
