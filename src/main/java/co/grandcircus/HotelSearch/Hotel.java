package co.grandcircus.HotelSearch;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("hotels")
public class Hotel {

	@Id
	private String id;
	
	@Field("hotelName")
	private String name;
	
	private String city;
	private int pricePerNight;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHotelName() {
		return name;
	}

	public void setHotelName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public Hotel(String id, String name, String city, int pricePerNight) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}

	public Hotel() {

	}

}
