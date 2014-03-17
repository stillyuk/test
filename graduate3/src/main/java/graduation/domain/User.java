package graduation.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "USER")
public class User {
	@Id
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	@GeneratedValue(generator = "uuid")
	@Column(name = "UUID", length = 36)
	private String uuid;

	@Column(name = "USERNAME", length = 33)
	private String username;

	@Column(name = "EMAIL", length = 33)
	private String email;
	
	@Column(name = "PASSWORD", length = 33)
	private String password;

	@JoinColumn(name = "ROLE_ID")
	@ManyToOne(fetch = FetchType.EAGER)
	private Role role;

	@ManyToMany
	@JoinTable(name = "GROUP_USER", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = { @JoinColumn(name = "GROUP_ID") })
	private List<Group> groups;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
