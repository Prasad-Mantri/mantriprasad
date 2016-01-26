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
public class EcoSystemOrganizationDirectory extends OrganizationDirectory {
    

    @Override
    public Organization createOrganization(Organization.Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.EcoSystemAdmin.getValue())){
            organization = new EcoSystemAdminOrganization(Organization.Type.EcoSystemAdmin.getValue());
            organizationList.add(organization);
        }
       
        return organization;
    }
}
