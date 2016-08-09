/**
 * 
 */
package simple.crud.app.models;

import java.util.Date;

/**
 * @author pijus
 *
 */
public class Responsibilities {
	private Integer respbId;
	private Integer projectId;
	private Integer jobId;
	private String userId;
	private String respbShortCode;
	private String respbDetails;
	private Date dateAdded;
	private Date dateCreated;
	/**
	 * @return the respbId
	 */
	public Integer getRespbId() {
		return respbId;
	}
	/**
	 * @param respbId the respbId to set
	 */
	public void setRespbId(Integer respbId) {
		this.respbId = respbId;
	}
	/**
	 * @return the projectId
	 */
	public Integer getProjectId() {
		return projectId;
	}
	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
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
	 * @return the respbShortCode
	 */
	public String getRespbShortCode() {
		return respbShortCode;
	}
	/**
	 * @param respbShortCode the respbShortCode to set
	 */
	public void setRespbShortCode(String respbShortCode) {
		this.respbShortCode = respbShortCode;
	}
	/**
	 * @return the respbDetails
	 */
	public String getRespbDetails() {
		return respbDetails;
	}
	/**
	 * @param respbDetails the respbDetails to set
	 */
	public void setRespbDetails(String respbDetails) {
		this.respbDetails = respbDetails;
	}
	/**
	 * @return the dateAdded
	 */
	public Date getDateAdded() {
		return dateAdded;
	}
	/**
	 * @param dateAdded the dateAdded to set
	 */
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
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
}
