/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EcoSystem;

import Business.Network.Network;
import Business.Organization.EcoSystemOrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author Prasad
 */
public class EcoSystem {
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private EcoSystemOrganizationDirectory organizationDirectory;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public EcoSystem() {
        
        networkList = new ArrayList<>();
        organizationDirectory = new EcoSystemOrganizationDirectory(); 
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }


   

    public EcoSystemOrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(EcoSystemOrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    
}
