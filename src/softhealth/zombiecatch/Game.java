package softhealth.zombiecatch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

@Entity
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key key;

	// hostMail, gameLocation,radious,timeleft,chopperlocation

	private String gameTitle, pass, hostEmail;
	private Integer maxPlayers;
	private double rad, lat, lon, chopLat, chopLon, timeLeft;

	public Key getKey() {
		return key;
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getHostEmail() {
		return hostEmail;
	}

	public void setHostEmail(String hostEmail) {
		this.hostEmail = hostEmail;
	}

	public Integer getMaxPlayers() {
		return maxPlayers;
	}

	public void set(Integer maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getChopLat(){
		return chopLat ;
	}
	
	public void setChopLat(double chopLat ){
		this.chopLat= chopLat ;
	}
	
	public double getChopLon(){
		return chopLon;
	}
	
	public void setChopLon(double chopLon ){
		this.chopLon=chopLon ;
	}
	
	public double getTimeLeft(){
		return timeLeft;
	}
	
	public void setTimeLeft(double timeLeft ){
		this.timeLeft=timeLeft ;
	}

}
