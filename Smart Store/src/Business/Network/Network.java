/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.NetworkOrganizationDirectory;

/**
 *
 * @author Prasad
 */
public class Network{
    private String networkName;
    private int networkID;
    private EnterpriseDirectory enterpriseDirectory;
    private NetworkOrganizationDirectory organizationDirectory;
    private static int ncount = 1;

    public Network() {
       
        enterpriseDirectory = new EnterpriseDirectory();
        organizationDirectory = new NetworkOrganizationDirectory();
        networkID = ncount;
        ncount++;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

   

    @Override
    public String toString() {
        return networkName;
    }

  

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public NetworkOrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(NetworkOrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public int getNetworkID() {
        return networkID;
    }

    public void setNetworkID(int networkID) {
        this.networkID = networkID;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    
}
