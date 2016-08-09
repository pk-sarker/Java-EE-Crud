/**
 * 
 */
package simple.crud.app.models;

import java.util.Date;

/**
 * @author pijus
 *
 */
public class Jobs {
	private Integer jobId;
	private String userId;
	private String jobType;
	private String designation;
	private String role;
	private String organizationName;
	private String jobLocation;
	private Double remunerationPerYear;
	private String refMgrName;
	private String refMgrEmail;
	private String refMgrPhone;
	private Date startDate;
	private Date endDate;
	private Date dateCreated;
	private Date dateUpdated;
	
	/**
	 * @return the jobId
	 */
	public Integer getJobId() {
		return jobId;
	}
	/**
	 * @param jobId the jobId to set
	 */
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the jobType
	 */
	public String getJobType() {
		return jobType;
	}
	/**
	 * @param jobType the jobType to set
	 */
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	/**
	 * @return the organizationName
	 */
	public String getOrganizationName() {
		return organizationName;
	}
	/**
	 * @param organizationName the organizationName to set
	 */
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	/**
	 * @return the jobLocation
	 */
	public String getJobLocation() {
		return jobLocation;
	}
	/**
	 * @param jobLocation the jobLocation to set
	 */
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	/**
	 * @return the remunerationPerYear
	 */
	public Double getRemunerationPerYear() {
		return remunerationPerYear;
	}
	/**
	 * @param remunerationPerYear the remunerationPerYear to set
	 */
	public void setRemunerationPerYear(Double remunerationPerYear) {
		this.remunerationPerYear = remunerationPerYear;
	}
	/**
	 * @return the refMgrName
	 */
	public String getRefMgrName() {
		return refMgrName;
	}
	/**
	 * @param refMgrName the refMgrName to set
	 */
	public void setRefMgrName(String refMgrName) {
		this.refMgrName = refMgrName;
	}
	/**
	 * @return the refMgrEmail
	 */
	public String getRefMgrEmail() {
		return refMgrEmail;
	}
	/**
	 * @param refMgrEmail the refMgrEmail to set
	 */
	public void setRefMgrEmail(String refMgrEmail) {
		this.refMgrEmail = refMgrEmail;
	}
	/**
	 * @return the refMgrPhone
	 */
	public String getRefMgrPhone() {
		return refMgrPhone;
	}
	/**
	 * @param refMgrPhone the refMgrPhone to set
	 */
	public void setRefMgrPhone(String refMgrPhone) {
		this.refMgrPhone = refMgrPhone;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
	
}
