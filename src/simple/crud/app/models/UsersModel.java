package simple.crud.app.models;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import simple.crud.app.models.AddressType;

public class UsersModel {
	
	private UUID userId;
	private String firstname;
	private String lastname;

	private String userType;
	private String userDesignation;
	private List<String> responsibilities; 
	private AddressType address;
	private Date dateCreated;
	private Date dateUpdated;
	private Date dateLastLogin;
	/**
	 * @return the userId
	 */
	public UUID getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}
	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}
	/**
	 * @return the userDesignation
	 */
	public String getUserDesignation() {
		return userDesignation;
	}
	/**
	 * @param userDesignation the userDesignation to set
	 */
	public void setUserDesignation(String userDesignation) {
		this.userDesignation = userDesignation;
	}
	/**
	 * @return the responsibilities
	 */
	public List<String> getResponsibilities() {
		return responsibilities;
	}
	/**
	 * @param responsibilities the responsibilities to set
	 */
	public void setResponsibilities(List<String> responsibilities) {
		this.responsibilities = responsibilities;
	}
	/**
	 * @return the address
	 */
	public AddressType getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(AddressType address) {
		this.address = address;
	}
	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}
	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	/**
	 * @return the dateUpdated
	 */
	public Date getDateUpdated() {
		return dateUpdated;
	}
	/**
	 * @param dateUpdated the dateUpdated to set
	 */
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	/**
	 * @return the dateLastLogin
	 */
	public Date getDateLastLogin() {
		return dateLastLogin;
	}
	/**
	 * @param dateLastLogin the dateLastLogin to set
	 */
	public void setDateLastLogin(Date dateLastLogin) {
		this.dateLastLogin = dateLastLogin;
	}
	@Override
	public String toString(){
		return "User [UserId=" + userId.toString() + ", firstName=" + getFirstname()
                + ", lastName=" + getLastname() + ", userType=" + userType + ", Address="
                + address.toString() + "]";
		
	}
	
	
}
