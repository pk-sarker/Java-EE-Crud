/**
 * 
 */
package simple.crud.app.service;

/**
 * @author pijus
 *
 */
public class LinkMap {
	private String displayText;
	private String link;
	private String clsssNames;
	
	public LinkMap(String displayText, String link, String classNames){
		this.displayText = displayText;
		this.link = link;
		this.clsssNames = classNames;
	}
	/**
	 * @return the displayText
	 */
	public String getDisplayText() {
		return displayText;
	}
	/**
	 * @param displayText the displayText to set
	 */
	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}
	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}
	/**
	 * @return the clsssNames
	 */
	public String getClsssNames() {
		return clsssNames;
	}
	/**
	 * @param clsssNames the clsssNames to set
	 */
	public void setClsssNames(String clsssNames) {
		this.clsssNames = clsssNames;
	}
	
	
}
