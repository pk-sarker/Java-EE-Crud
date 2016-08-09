/**
 * 
 */
package simple.crud.app.models;

import java.util.Date;

/**
 * @author pijus
 *
 */
public class Skills {
	private Integer skill_id;
	private String user_id;
	private Integer job_id;
	private Integer project_id;
	private String technology;
	private String skill_desc;
	private Date dateCreated;
	private Date dateUpdated;
	/**
	 * @return the skill_id
	 */
	public Integer getSkill_id() {
		return skill_id;
	}
	/**
	 * @param skill_id the skill_id to set
	 */
	public void setSkill_id(Integer skill_id) {
		this.skill_id = skill_id;
	}
	/**
	 * @return the user_id
	 */
	public String getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the job_id
	 */
	public Integer getJob_id() {
		return job_id;
	}
	/**
	 * @param job_id the job_id to set
	 */
	public void setJob_id(Integer job_id) {
		this.job_id = job_id;
	}
	/**
	 * @return the project_id
	 */
	public Integer getProject_id() {
		return project_id;
	}
	/**
	 * @param project_id the project_id to set
	 */
	public void setProject_id(Integer project_id) {
		this.project_id = project_id;
	}
	/**
	 * @return the technology
	 */
	public String getTechnology() {
		return technology;
	}
	/**
	 * @param technology the technology to set
	 */
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	/**
	 * @return the skill_desc
	 */
	public String getSkill_desc() {
		return skill_desc;
	}
	/**
	 * @param skill_desc the skill_desc to set
	 */
	public void setSkill_desc(String skill_desc) {
		this.skill_desc = skill_desc;
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
