/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EcoSystemAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Prasad
 */
public class EcoSystemAdminOrganization extends Organization {

    public EcoSystemAdminOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
      ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EcoSystemAdminRole());
        return roles;  
    }
    
}
