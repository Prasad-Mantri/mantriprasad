/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.StoreKeeper;

import Business.Enterprise.Enterprise;
import Business.Item.OrderItem;
import Business.Item.ShelfItem;
import Business.Product.Product;
import Business.Shelf.Shelf;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Prasad
 */
public class WorkRequestProcessing extends javax.swing.JPanel {

    /**
     * Creates new form WorkRequestProcessing
     */
   JPanel userProcessContainer;
   Enterprise enterprise;
   WorkRequest wkr;

    WorkRequestProcessing(JPanel userProcessContainer, Enterprise enterprise, WorkRequest wkr) {
         initComponents();
         
         this.userProcessContainer = userProcessContainer;
         this.enterprise = enterprise;
         this.wkr = wkr;
         
         if(wkr.getProduct()==null)
         {
             quantityLabel.setVisible(false);
             quantitySpinner.setVisible(false);
             addQuantityButton.setVisible(false);
         }  
         else
         {
             quantityLabel.setVisible(true);
             quantitySpinner.setVisible(true);
             addQuantityButton.setVisible(true);
             updateStatusButton.setVisible(false);
             statusLabel.setVisible(false);
         }    
         
         
    }

   public void backAction(){
         userProcessContainer.remove(this);
        Component[] componentAr = userProcessContainer.getComponents();
        Component component = componentAr[componentAr.length - 1];
        StoreKeeperWorkArea skwa = (StoreKeeperWorkArea) component;
        skwa.populateGMessageTable();
        skwa.populateMyRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        quantityLabel = new javax.swing.JLabel();
        addQuantityButton = new javax.swing.JButton();
        updateStatusButton = new javax.swing.JButton();

        setBackground(java.awt.Color.white);

        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headerLabel.setText("Work Requesting Processing");

        statusLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        statusLabel.setText("Send Status :");

        quantityLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        quantityLabel.setText("Quantity Added");

        addQuantityButton.setText("Add Quantity");
        addQuantityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuantityButtonActionPerformed(evt);
            }
        });

        updateStatusButton.setText("Update Status");
        updateStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStatusButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(addQuantityButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(quantityLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(updateStatusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(headerLabel))
                        .addGap(262, 262, 262))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel)
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel))
                .addGap(40, 40, 40)
                .addComponent(addQuantityButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLabel)
                    .addComponent(updateStatusButton))
                .addGap(224, 224, 224))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStatusButtonActionPerformed
        // TODO add your handling code here:
        if(wkr.getProduct()==null)
        {
            wkr.setStatus("Attended");
            JOptionPane.showMessageDialog(null,"Customer has been attended", "Message", JOptionPane.INFORMATION_MESSAGE);
            backAction();
        }
        
            
    }//GEN-LAST:event_updateStatusButtonActionPerformed

    private void addQuantityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuantityButtonActionPerformed
        // TODO add your handling code here:
        int qty = (Integer) quantitySpinner.getValue();
        boolean ordered=false;
        if(qty<=0)
         {
                    JOptionPane.showMessageDialog(this, "Quantiy should be greater than zero.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
         }
        else
        {
            for(Shelf s:enterprise.getShelfDirectory().getShelfDirectory())
            {
                for (ShelfItem si:s.getShelfList())
                {
                    if(si.getProduct().getId()==wkr.getProduct().getId())
                    {
                        for(Product p:enterprise.getProductCatalog().getProductList())
                        {
                            if(p.getId()==si.getProduct().getId())
                            {
                                if(si.getQuantity()<=(si.getThreshold()/2))
                                {
                                    si.getProduct().setPrice((float) (si.getProduct().getPrice()-1.0));
                                }   
                                
                                if(p.getQuantity()>=20)
                                {    
                                p.setQuantity(p.getQuantity()-20);
                                si.setQuantity(si.getQuantity()+20);
                                
                                }
                                else
                                {
                                    si.setQuantity(p.getQuantity());
                                    p.setQuantity(0);
                                    if(si.getQuantity()<=(si.getThreshold()/2))
                                     {
                                       si.getProduct().setPrice((float) (si.getProduct().getPrice()+1.0));
                                     } 
                                    
                                }   
                                if(p.getQuantity()<= p.getThreshold())
                                {
                                    OrderItem or = new OrderItem();
                                    or.setProduct(p);
                                    or.setQuantity(100);
                                    
                                    enterprise.getStoreOrder().getItemList().add(or);
                                    ordered=true;
                                }
                                
                                
                            }    
                        }
                    }
                }
            }  
        } 
        
        if(ordered==true)
        {
             JOptionPane.showMessageDialog(null,"Product has been refilled and also placed order for the same product", "Message", JOptionPane.INFORMATION_MESSAGE);  
        } 
        else
        {
            JOptionPane.showMessageDialog(null,"Product has been refilled", "Message", JOptionPane.INFORMATION_MESSAGE);
        }   
         wkr.setStatus("Product Refilled");
         quantitySpinner.setValue(0);
         backAction();
    }//GEN-LAST:event_addQuantityButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addQuantityButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton updateStatusButton;
    // End of variables declaration//GEN-END:variables
}