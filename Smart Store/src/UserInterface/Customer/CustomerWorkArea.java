/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Customer.Customer;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.StoreKeeperOrganization;
import Business.Organization.StoreManagerOrganization;
import Business.Product.Product;
import Business.Shelf.Shelf;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prasad
 */
public class CustomerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkArea
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount userAccount;

    public CustomerWorkArea(JPanel userProcessContainer, Enterprise enterprise, UserAccount userAccount) {
       initComponents();
       this.userProcessContainer= userProcessContainer;
       this.enterprise = enterprise;
       this.userAccount = userAccount;
       
       customerNameLabel.setText(userAccount.getEmployee().getName());
       Customer c = (Customer)userAccount.getEmployee();
       
       
       
       productComboBox.removeAllItems();

        for (Product p : enterprise.getProductCatalog().getProductList()) {   
            productComboBox.addItem(p);
        } 
        
       shelfComboBox.removeAllItems();
       
        for (Shelf sl : enterprise.getShelfDirectory().getShelfDirectory()) {   
            shelfComboBox.addItem(sl);
        } 
       
       populateTable();
       
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) offersTable.getModel();
        
        model.setRowCount(0);
                 
            Object[] row = new Object[1];
            row[0] = "Get 30% Off on Electric Appliances";
            model.addRow(row);
            row[0] = "Buy One get One free on Tomato Ketchup";
            model.addRow(row);
            row[0] = "Winter Special: Get Additional 10% off on Discounted Items";
            model.addRow(row);
            row[0] = "Christmas Sale from 25th Dec to 31st Dec";
            model.addRow(row);
            row[0] = "Great Deals on Clothing Section";
            model.addRow(row);
           
            
            
        }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        offersTable = new javax.swing.JTable();
        detailsButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        productComboBox = new javax.swing.JComboBox();
        myPreviousOrdersButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        storeSectionButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        shelfComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        sendRequestButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);

        jLabel1.setText("Logged In: ");

        customerNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customerNameLabel.setText("jLabel2");

        offersTable.setBackground(new java.awt.Color(204, 255, 153));
        offersTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        offersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Offers"
            }
        ));
        jScrollPane1.setViewportView(offersTable);

        detailsButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        detailsButton.setText("Details");
        detailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Locate the Product and its Details");

        productComboBox.setBackground(new java.awt.Color(204, 255, 153));
        productComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        productComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productComboBoxActionPerformed(evt);
            }
        });

        myPreviousOrdersButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        myPreviousOrdersButton.setText("My Previous Orders");
        myPreviousOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myPreviousOrdersButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Check your last Orders here :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Start Shopping :");

        storeSectionButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        storeSectionButton.setText("Store Section");
        storeSectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeSectionButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Need Assistance ???");

        shelfComboBox.setBackground(new java.awt.Color(204, 255, 153));
        shelfComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Shelf Near You:");

        sendRequestButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sendRequestButton.setText("Send Request");
        sendRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendRequestButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Welcome Customer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(246, 246, 246))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(customerNameLabel)
                                .addGap(256, 256, 256)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(273, 273, 273)
                                .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(detailsButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(myPreviousOrdersButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(storeSectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(28, 28, 28)))
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(sendRequestButton)
                                .addGap(58, 58, 58))
                            .addComponent(shelfComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(142, 142, 142))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(56, 56, 56)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(customerNameLabel)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailsButton))
                .addGap(65, 65, 65)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(shelfComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myPreviousOrdersButton)
                    .addComponent(storeSectionButton)
                    .addComponent(sendRequestButton))
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void detailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsButtonActionPerformed
        // TODO add your handling code here:
          Product pd = (Product) productComboBox.getSelectedItem();
         pd.setSearchCount(pd.getSearchCount()+1);
        ProductDetailsPanel pdp = new ProductDetailsPanel(userProcessContainer,pd,enterprise);
        userProcessContainer.add("ManageNetworkAdmin", pdp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_detailsButtonActionPerformed

    private void myPreviousOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myPreviousOrdersButtonActionPerformed
        // TODO add your handling code here:
        PreviousOrdersJPanel pop = new PreviousOrdersJPanel(userProcessContainer,userAccount,enterprise);
        userProcessContainer.add("PreviousOrdersJPanel", pop);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_myPreviousOrdersButtonActionPerformed

    private void storeSectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeSectionButtonActionPerformed
        // TODO add your handling code here:
        StoreScreenPanel ssp = new StoreScreenPanel(userProcessContainer,userAccount,enterprise);
        userProcessContainer.add("StoreScreenPanel", ssp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_storeSectionButtonActionPerformed

    private void sendRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRequestButtonActionPerformed
        // TODO add your handling code here:
        Shelf s1 = (Shelf) shelfComboBox.getSelectedItem();
        
        for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof StoreKeeperOrganization)
            {   
                WorkRequest wr = new WorkRequest();
                wr.setMessage("Customer "+ userAccount.getEmployee().getName()+ " is waiting for Assistance at "+ s1);
                wr.setSender(userAccount);
                wr.setStatus("Pending");
               
                org.getWorkQueue().getWorkRequestList().add(wr);
                
            }
        }
        JOptionPane.showMessageDialog(null,"Help has been requested");
    }//GEN-LAST:event_sendRequestButtonActionPerformed

    private void productComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JButton detailsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton myPreviousOrdersButton;
    private javax.swing.JTable offersTable;
    private javax.swing.JComboBox productComboBox;
    private javax.swing.JButton sendRequestButton;
    private javax.swing.JComboBox shelfComboBox;
    private javax.swing.JButton storeSectionButton;
    // End of variables declaration//GEN-END:variables
}
