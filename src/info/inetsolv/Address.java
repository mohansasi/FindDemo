package info.inetsolv;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ADDRESS_TBL database table.
 * 
 */
@Entity
@Table(name="ADDRESS_TBL")
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	

	public Address(long aid, String city) {
		super();
		this.aid = aid;
		this.city = city;
	}

	private static final long serialVersionUID = 1L;

	@Id
	private long aid;

	private String city;

	@Column(name="\"STATE\"")
	private String state;

	private String street;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(long aid, String city, String state, String street) {
		super();
		this.aid = aid;
		this.city = city;
		this.state = state;
		this.street = street;
	}

	public long getAid() {
		return this.aid;
	}

	public void setAid(long aid) {
		this.aid = aid;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}