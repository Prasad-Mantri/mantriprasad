/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.StoreManagerRole;
import java.util.ArrayList;

/**
 *
 * @author Prasad
 */
public class StoreManagerOrganization extends Organization {

    public StoreManagerOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new StoreManagerRole());
        return roles;
    }
    
}
