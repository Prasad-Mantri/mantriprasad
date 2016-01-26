/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.StoreAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Prasad
 */
public class StoreAdminOrganization extends Organization {

    public StoreAdminOrganization(String name) {
        super(name);
    }

    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new StoreAdminRole());
        return roles;
    }
    
}
