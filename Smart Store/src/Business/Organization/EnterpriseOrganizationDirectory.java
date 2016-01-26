/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

/**
 *
 * @author Prasad
 */
public class EnterpriseOrganizationDirectory extends OrganizationDirectory {
    
       private int orgID;
       private static int orcount=1;
       
       public EnterpriseOrganizationDirectory() 
       {
           orgID=orcount;
           orcount++;
       }        

    @Override
    public Organization createOrganization(Organization.Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.StoreAdmin.getValue())){
            organization = new StoreAdminOrganization(Organization.Type.StoreAdmin.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.StoreKeeper.getValue())){
            organization = new StoreKeeperOrganization(Organization.Type.StoreKeeper.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.StoreManager.getValue())){
            organization = new StoreManagerOrganization(Organization.Type.StoreManager.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Customer.getValue())){
            organization = new CustomerOrganization(Organization.Type.Customer.getValue());
            organizationList.add(organization);
        }
        
        return organization;
    }

    public int getOrgID() {
        return orgID;
    }
    
}
