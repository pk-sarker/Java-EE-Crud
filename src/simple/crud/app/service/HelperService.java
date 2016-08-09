/**
 * 
 */
package simple.crud.app.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pijus
 *
 */
public class HelperService {
	
	
	public Map<String, LinkMap> getLeftLinks(){
		Map<String, LinkMap> leftLinks = new HashMap<String, LinkMap>();
		leftLinks.put("Home", new LinkMap("Home", "/CrudApp/home", ""));
		leftLinks.put("User Home", new LinkMap("User Home", "user", ""));
		leftLinks.put("Add User", new LinkMap("Add User", "user?action=add-user", ""));
		leftLinks.put("Update User", new LinkMap("Update User", "user?action=update-user", ""));
		leftLinks.put("Delete User", new LinkMap("Delete User", "user?action=delete-user", ""));
		
		return leftLinks;
	}
}
