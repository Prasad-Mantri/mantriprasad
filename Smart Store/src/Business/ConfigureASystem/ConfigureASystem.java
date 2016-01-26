/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ConfigureASystem;

import Business.EcoSystem.EcoSystem;
import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Role.EcoSystemAdminRole;

/**
 *
 * @author Prasad
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        Organization org = system.getOrganizationDirectory().createOrganization(Organization.Type.EcoSystemAdmin);
        
        Employee employee = org.getEmployeeDirectory().createEmployee("IOTAdmin");
        
        org.getUserAccountDirectory().createUserAccount("sys", "sys", employee, new EcoSystemAdminRole());
        
        return system;
    }
}
