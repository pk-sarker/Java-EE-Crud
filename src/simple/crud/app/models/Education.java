/**
 * 
 */
package simple.crud.app.models;

import java.util.Date;

/**
 * @author pijus
 *
 */
public class Education {
	private Integer educationId;
	private String userId;
	private String institutionName;
	private String educationLevel;
	private String majorSubject;
	private String faculty;
	private String department;
	private Date startDate;
	private Date endDate;
	private Date dateCreated;
	private Date dateUpdated;
	
	/**
	 * @return the educationId
	 */
	public Integer getEducationId() {
		return educationId;
	}
	/**
	 * @param educationId the educationId to set
	 */
	public void setEducationId(Integer educationId) {
		this.educationId = educationId;
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
	 * @return the institutionName
	 */
	public String getInstitutionName() {
		return institutionName;
	}
	/**
	 * @param institutionName the institutionName to set
	 */
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	/**
	 * @return the educationLevel
	 */
	public String getEducationLevel() {
		return educationLevel;
	}
	/**
	 * @param educationLevel the educationLevel to set
	 */
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	/**
	 * @return the majorSubject
	 */
	public String getMajorSubject() {
		return majorSubject;
	}
	/**
	 * @param majorSubject the majorSubject to set
	 */
	public void setMajorSubject(String majorSubject) {
		this.majorSubject = majorSubject;
	}
	/**
	 * @return the faculty
	 */
	public String getFaculty() {
		return faculty;
	}
	/**
	 * @param faculty the faculty to set
	 */
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
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
