/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.StoreKeeperRole;
import java.util.ArrayList;

/**
 *
 * @author Prasad
 */
public class StoreKeeperOrganization extends Organization {

    public StoreKeeperOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new StoreKeeperRole());
        return roles;
    }
    
}
