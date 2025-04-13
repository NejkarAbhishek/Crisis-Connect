 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organization;

 /*
 * @author abhis
 */

import business.enterprise.Enterprise;
import java.util.ArrayList;
 
 
public class OrganizationDirectory {
    ArrayList<Organization> organizationlist;
    Enterprise enterprise;
    OrganizationDirectory orgDirectory;
 
    public OrganizationDirectory(Enterprise e) {
        this.enterprise = e;
        this.organizationlist = new ArrayList<>();
    }
    public Organization newOrganization(int id, String name, String address, String city, String state, String country){
        Organization org = new Organization(id, name, address, city, state, country);
    organizationlist.add(org);
    System.out.println("Organization added: " + name);
    return org;
    }
    public ArrayList<Organization> getAllOrg(){
        System.out.println("Fetching organizations for enterprise: " + enterprise.getType());
        return organizationlist;
    }
    public Organization findOrg(int id){
        for (Organization o : organizationlist) {
            if (o.getId() == id) {
                return o;
            }
        }
        return null; 
    }

 
    
    public static OrganizationDirectory findOrgDirectory(Enterprise e) {
        if (e != null) {
            return e.getOrgDirectory();
        }
        return null; // If the enterprise is null, return null
    }
}