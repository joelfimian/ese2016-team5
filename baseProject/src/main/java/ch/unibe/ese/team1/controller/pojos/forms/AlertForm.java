package ch.unibe.ese.team1.controller.pojos.forms;

import ch.unibe.ese.team1.model.Type;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import ch.unibe.ese.team1.model.User;

/** This form is used when a user wants to create a new alert. */
public class AlertForm {
	
	private User user;

	private String type;
	
	private int offerType; 


	@NotBlank(message = "Required")
	@Pattern(regexp = "^[0-9]{4} - [-\\w\\s\\u00C0-\\u00FF]*", message = "Please pick a city from the list")
	private String city;

	@NotNull(message = "Requires a number")
	@Min(value = 0, message = "Please enter a positive distance")
	private Integer radius;
	
	@NotNull(message = "Requires a number")
	@Min(value = 0, message = "In your dreams.")
	private Integer price;
	
	private int zipCode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zip) {
		this.zipCode = zip;
	}

	public Integer getRadius() {
		return radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public int getOfferType(){
		return offerType;
	}
	
	public void setOfferType(int offerType){
		this.offerType = offerType; 
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
                
        public void setType(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }
}
