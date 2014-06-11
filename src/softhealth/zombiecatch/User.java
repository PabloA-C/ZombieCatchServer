package softhealth.zombiecatch;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key key;
	private String email;
	private String password;
	private Map<String, Integer> hSkills;
	private Map<String, Integer> zSkills;
	private double experience;


	public Key getKey() {
		return key;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<String, Integer> getHSkills() {
		return hSkills;
	}

	public void setHSkills(Map<String, Integer> sHkills) {
		this.hSkills = hSkills;
	}

	public Map<String, Integer> getZSkills() {
		return zSkills;
	}

	public void setZSkills(Map<String, Integer> sZkills) {
		this.zSkills = zSkills;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = this.experience;
	}

}
