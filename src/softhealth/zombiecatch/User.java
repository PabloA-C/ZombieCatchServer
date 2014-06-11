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
	private String userName;
	private String password;
	private Integer lvlStrong,lvlPerceptive,lvlDeadly,lvlSneaky;
	
	private double experience;


	public Key getKey() {
		return key;
	}

	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName= userName;
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

	public Integer getlvlStrong() {
		return lvlStrong;
	}
	
	public void setlvlStrong(Integer lvlStrong) {
		this.lvlStrong=lvlStrong;
	}

	public Integer getlvlPerceptive() {
		return lvlPerceptive;
	}
	public void setlvlPerceptive(Integer lvlPerceptive) {
		this.lvlPerceptive = lvlPerceptive;
	}

	
	public Integer getlvlDeadly() {
		return lvlDeadly;
	}
	
	public void setlvlDeadly(Integer lvlDeadly) {
		this.lvlDeadly = lvlDeadly;
	}


	public Integer getlvlSneaky() {
		return lvlSneaky;
	}
	
	public void setlvlSneaky(Integer lvlSneaky) {
		this.lvlSneaky = lvlSneaky;
	}
	

	public double getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = this.experience;
	}

}
