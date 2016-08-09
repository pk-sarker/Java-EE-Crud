/**
 * 
 */
package simple.crud.app.models;
import java.util.Date;
import java.util.UUID;

/**
 * @author pijus
 *
 */
public class AddressType {
	private UUID uuidAddress;
	private String residenceType;
	private Integer identificationNumber;
	private String streetName;
	private Integer streetNumber;
	private String postCode;
	private String city;
	private String state;
	private Date createDate;
	private Date updateDate;
	/**
	 * @return the uuidAddress
	 */
	public UUID getUuidAddress() {
		return uuidAddress;
	}
	/**
	 * @param uuidAddress the uuidAddress to set
	 */
	public void setUuidAddress(UUID uuidAddress) {
		this.uuidAddress = uuidAddress;
	}
	/**
	 * @return the residenceType
	 */
	public String getResidenceType() {
		return residenceType;
	}
	/**
	 * @param residenceType the residenceType to set
	 */
	public void setResidenceType(String residenceType) {
		this.residenceType = residenceType;
	}
	/**
	 * @return the identificationNumber
	 */
	public Integer getIdentificationNumber() {
		return identificationNumber;
	}
	/**
	 * @param identificationNumber the identificationNumber to set
	 */
	public void setIdentificationNumber(Integer identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}
	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	/**
	 * @return the streetNumber
	 */
	public Integer getStreetNumber() {
		return streetNumber;
	}
	/**
	 * @param streetNumber the streetNumber to set
	 */
	public void setStreetNumber(Integer streetNumber) {
		this.streetNumber = streetNumber;
	}
	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}
	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}
	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	public String toString(){
		return "{uuidAddress: "+uuidAddress.toString()+", residenceType: "+residenceType+", identificationNumber: "+identificationNumber+", streetNumber: "+streetNumber+", streetName: "+streetName+", postCode: "+postCode+", city: "+city+", state: "+state+", createDate: "+createDate+", updateDate: "+updateDate+" }";
	}
	
}
