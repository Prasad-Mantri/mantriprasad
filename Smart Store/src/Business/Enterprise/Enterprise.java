/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Order.MasterOrderCatalog;
import Business.Order.StoreOrder;
import Business.Order.StoreOrderDirectory;
import Business.Organization.EnterpriseOrganizationDirectory;
import Business.Product.ProductCatalog;
import Business.Shelf.ShelfDirectory;


/**
 *
 * @author Prasad
 */
public abstract class Enterprise{
    
    private EnterpriseType enterpriseType;
    private String name;
    private int id;
    private EnterpriseOrganizationDirectory organizationDirectory;
    private ProductCatalog productCatalog;
    private ShelfDirectory shelfDirectory;
    private MasterOrderCatalog masterOrderCatalog;
    private StoreOrder storeOrder;
    private StoreOrderDirectory storeOrderDirectory;
    private static int ecount=1;
    
    public Enterprise(String name, EnterpriseType type) {
        this.name = name;
        this.enterpriseType = type;
        organizationDirectory = new EnterpriseOrganizationDirectory();
        productCatalog = new ProductCatalog();
        shelfDirectory = new ShelfDirectory();
        masterOrderCatalog = new MasterOrderCatalog();
        storeOrder = new StoreOrder();
        storeOrderDirectory = new StoreOrderDirectory();
        
        id = ecount;
        ecount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseOrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(EnterpriseOrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public ShelfDirectory getShelfDirectory() {
        return shelfDirectory;
    }

    public void setShelfDirectory(ShelfDirectory shelfDirectory) {
        this.shelfDirectory = shelfDirectory;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    public StoreOrder getStoreOrder() {
        return storeOrder;
    }

    public void setStoreOrder(StoreOrder storeOrder) {
        this.storeOrder = storeOrder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }

    public StoreOrderDirectory getStoreOrderDirectory() {
        return storeOrderDirectory;
    }

    public void setStoreOrderDirectory(StoreOrderDirectory storeOrderDirectory) {
        this.storeOrderDirectory = storeOrderDirectory;
    }

   
    
    public enum EnterpriseType{
        Retail("Retail");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

   
}
