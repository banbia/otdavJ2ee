package otdav.entities;
// Generated 30 juin 2019 11:35:09 by Hibernate Tools 4.0.1.Final

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

/**
 * Resignation generated by hbm2java
 */
@Entity
@Table(name = "resignation", catalog = "pi_otdav")
public class Resignation implements java.io.Serializable {

	private int idResignation;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user", nullable = false)
	private User user;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "resignation")
	private Set<User> users = new HashSet(0);

	public Resignation() {
	}

	public Resignation(int idResignation, User user) {
		this.idResignation = idResignation;
		this.user = user;
	}

	public Resignation(int idResignation, User user, Set users) {
		this.idResignation = idResignation;
		this.user = user;
		this.users = users;
	}

	@Id

	@Column(name = "idResignation", unique = true, nullable = false)
	public int getIdResignation() {
		return this.idResignation;
	}

	public void setIdResignation(int idResignation) {
		this.idResignation = idResignation;
	}

	
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}
