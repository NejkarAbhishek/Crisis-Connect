/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.enterprise;

import business.organization.OrganizationDirectory;
import java.util.ArrayList;

 /*
 * @author abhis
 */
public class Enterprise {
    String type;
    char[] enterprisePass;
    OrganizationDirectory orgDirectory;
 
    public Enterprise(String type) {
        this.type = type;
        this.orgDirectory = new OrganizationDirectory(this);
    }
 
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
 
    public char[] getEnterprisePass() {
        return enterprisePass;
    }
 
    public void setEnterprisePass(char[] enterprisePass) {
        this.enterprisePass = enterprisePass;
    }
    public OrganizationDirectory getOrgDirectory() {
        return orgDirectory;
    }

    public void setOrgDirectory(OrganizationDirectory orgDirectory) {
        this.orgDirectory = orgDirectory;
    }
    public static Enterprise findEnterprise(String enterpriseName, ArrayList<Enterprise> allEnterprises) {
        for (Enterprise enterprise : allEnterprises) {
            if (enterprise.getType().equalsIgnoreCase(enterpriseName)) {
                return enterprise;
            }
        }
        return null; 
    }
}