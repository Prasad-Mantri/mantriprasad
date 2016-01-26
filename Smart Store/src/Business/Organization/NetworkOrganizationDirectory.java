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
public class NetworkOrganizationDirectory extends OrganizationDirectory {

    @Override
    public Organization createOrganization(Organization.Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.NetworkAdmin.getValue())){
            organization = new NetworkAdminOrganization(Organization.Type.NetworkAdmin.getValue());
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.CityHead.getValue())){
            organization = new CityHeadOrganization(Organization.Type.CityHead.getValue());
            organizationList.add(organization);
        }
        return organization;
    }
    
}
