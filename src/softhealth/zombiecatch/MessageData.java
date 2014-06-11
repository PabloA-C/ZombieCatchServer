package softhealth.zombiecatch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

/**
 * An entity for messsages sent from the web console to the registered devices
 * 
 * Its associated endpoint, MessageEndpoint.java, was NOT automatically generated 
 * from this class. While it is easy to generate endpoints automatically, you can
 * write an endpoint manually without generating it. You still need to generate
 * the associated client library from the endpoint when changes are made.
 * 
 * For more information on endpoints, see
 * http://developers.google.com/eclipse/docs/cloud_endpoints.
 */

@Entity
public class MessageData {

  /*
   * Autogenerated primary key
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Key key;
  
  /*
   * The text of the message sent
   */
  private String message;

  /*
   * Timestamp indicating when this device registered with the application.
   */
  private long timestamp;
  
  public Key getKey() {
    return key;
  }
  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }
}
