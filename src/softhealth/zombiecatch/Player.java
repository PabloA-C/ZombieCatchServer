package softhealth.zombiecatch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key key;

	// hostMail, gameLocation,radious,timeleft,chopperlocation

	private String gameTitle, userEmail;
	private double userLat, userLon, score;
	private Integer sneakLvl;
	private boolean isHuman;

	public Key getKey() {
		return key;
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Integer getSneakLvl() {
		return sneakLvl;
	}

	public void setSneakLvl(Integer sneakLVl) {
		this.sneakLvl = sneakLVl;
	}

	public double getUserLat() {
		return userLat;
	}

	public void setUserLat(double userLat) {
		this.userLat = userLat;
	}

	public double getuserLon() {
		return userLon;
	}

	public void setUserLon(double userLon) {
		this.userLon = userLon;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public boolean getIsHuman() {
		return isHuman;

	}

	public void setIsHuman(boolean isHuman) {
		this.isHuman = isHuman;
	}
}
