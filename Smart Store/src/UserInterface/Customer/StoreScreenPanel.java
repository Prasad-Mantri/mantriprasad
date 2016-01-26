/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Customer.Customer;
import Business.Enterprise.Enterprise;
import Business.Item.OrderItem;
import Business.Item.ShelfItem;
import Business.Order.Order;
import Business.Organization.Organization;
import Business.Organization.StoreKeeperOrganization;
import Business.Shelf.Shelf;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prasad
 */
public class StoreScreenPanel extends javax.swing.JPanel {

    /**
     * Creates new form StoreScreenPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    Enterprise enterprise;
    Order order;
    StoreScreenPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        
        populateTables();
        
        order = new Order();
        order.setOrderNumber(enterprise.getMasterOrderCatalog().getOrderList().size());
    }
    
    public void populateTables(){
        populateShelfTable(shelf1Table,1);
        populateShelfTable(shelf2Table,2);
        populateShelfTable(shelf3Table,3);
    }

 
    
    public void populateOrderTable(){
        
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();

        model.setRowCount(0);

        for (OrderItem o : order.getItemList())
        { 
                        
                Object row[] = new Object[3];
                row[0] = o;
                row[1] = o.getQuantity();
                row[2] = o.getTotalPrice();
               
                model.addRow(row);
        }
    }     
    
    
    public void populateShelfTable(JTable shelfTable, int table)
    {    
      int cnt =1;  
      DefaultTableModel model = (DefaultTableModel) shelfTable.getModel();

        model.setRowCount(0);

        for (Shelf s : enterprise.getShelfDirectory().getShelfDirectory())
        { 
            if(cnt==table)
            {
                         
            for(ShelfItem si:s.getShelfList())
               {
                
                Object row[] = new Object[3];
                row[0] = si;
                row[1] = si.getQuantity();
                row[2] = si.getProduct().getPrice();
               
                model.addRow(row);
              }
            break; 
            }
            else
            {
                cnt++;
                continue;
            }  
        }
        
        
    
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        shelf1Table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        shelf3Table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        shelf2Table = new javax.swing.JTable();
        headerLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        shelf1Spinner = new javax.swing.JSpinner();
        shelf2Spinner = new javax.swing.JSpinner();
        shelf3Spinner = new javax.swing.JSpinner();
        shelf1pickButton = new javax.swing.JButton();
        shelf2pickButton = new javax.swing.JButton();
        shelf3pickButton = new javax.swing.JButton();
        checkButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        shelf1Button = new javax.swing.JButton();
        shelf2Button = new javax.swing.JButton();
        shelf3Button = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        removeSpinner = new javax.swing.JSpinner();

        setBackground(java.awt.Color.white);

        shelf1Table.setBackground(new java.awt.Color(204, 255, 153));
        shelf1Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(shelf1Table);
        if (shelf1Table.getColumnModel().getColumnCount() > 0) {
            shelf1Table.getColumnModel().getColumn(1).setMaxWidth(50);
            shelf1Table.getColumnModel().getColumn(2).setMaxWidth(50);
        }

        shelf3Table.setBackground(new java.awt.Color(204, 255, 153));
        shelf3Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(shelf3Table);
        if (shelf3Table.getColumnModel().getColumnCount() > 0) {
            shelf3Table.getColumnModel().getColumn(1).setMaxWidth(50);
            shelf3Table.getColumnModel().getColumn(2).setMaxWidth(55);
        }

        shelf2Table.setBackground(new java.awt.Color(204, 255, 153));
        shelf2Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(shelf2Table);
        if (shelf2Table.getColumnModel().getColumnCount() > 0) {
            shelf2Table.getColumnModel().getColumn(1).setMaxWidth(50);
            shelf2Table.getColumnModel().getColumn(2).setMaxWidth(55);
        }

        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        headerLabel.setText("Store Section ");

        orderTable.setBackground(new java.awt.Color(204, 255, 153));
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Quantity", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(orderTable);

        shelf1pickButton.setText("Pick");
        shelf1pickButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shelf1pickButtonActionPerformed(evt);
            }
        });

        shelf2pickButton.setText("Pick");
        shelf2pickButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shelf2pickButtonActionPerformed(evt);
            }
        });

        shelf3pickButton.setText("Pick");
        shelf3pickButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shelf3pickButtonActionPerformed(evt);
            }
        });

        checkButton.setText("Check Out");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        shelf1Button.setText("Help");
        shelf1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shelf1ButtonActionPerformed(evt);
            }
        });

        shelf2Button.setText("Help");
        shelf2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shelf2ButtonActionPerformed(evt);
            }
        });

        shelf3Button.setText("Help");
        shelf3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shelf3ButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(headerLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(backButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(shelf1Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(shelf1pickButton)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(checkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(shelf1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(shelf2Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(shelf2pickButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(shelf2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(shelf3Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(shelf3pickButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(shelf3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(658, 658, 658)
                                .addComponent(removeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2, jScrollPane3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(headerLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shelf1Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shelf2Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shelf3Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shelf1pickButton)
                    .addComponent(shelf2pickButton)
                    .addComponent(shelf3pickButton)
                    .addComponent(shelf1Button)
                    .addComponent(shelf2Button)
                    .addComponent(shelf3Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(removeButton)
                            .addComponent(removeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(checkButton)
                        .addGap(54, 54, 54))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void shelf2pickButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shelf2pickButtonActionPerformed
        // TODO add your handling code here:
        pickButton(shelf2Table,shelf2Spinner,"shelf 2");
    }//GEN-LAST:event_shelf2pickButtonActionPerformed

    private void shelf1pickButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shelf1pickButtonActionPerformed
        // TODO add your handling code here:
         pickButton(shelf1Table,shelf1Spinner,"shelf 1");
    }//GEN-LAST:event_shelf1pickButtonActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        // TODO add your handling code here:
        float totalcost =0;
        if (order.getItemList().size() > 0) {
            order.setTimeStamp();
            for(OrderItem oi:order.getItemList())
            {
                totalcost = totalcost + oi.getTotalPrice();
            }
            order.setTotalCost(totalcost);
            enterprise.getMasterOrderCatalog().getOrderList().add(order);
            Customer c= (Customer) userAccount.getEmployee();
            c.getOrderHistory().add(order);
            JOptionPane.showMessageDialog(null, "Order has been added successfully!!");
             userProcessContainer.remove(this);
             CardLayout layout = (CardLayout) userProcessContainer.getLayout();
             layout.previous(userProcessContainer);
           
          
        } else {
            JOptionPane.showMessageDialog(null, "No any item added in your cart!!");
        }
        
        
    }//GEN-LAST:event_checkButtonActionPerformed

    private void shelf1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shelf1ButtonActionPerformed
        // TODO add your handling code here:
        helpButton("shelf 1");
    }//GEN-LAST:event_shelf1ButtonActionPerformed

    private void shelf2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shelf2ButtonActionPerformed
        // TODO add your handling code here:
        helpButton("shelf 2");
    }//GEN-LAST:event_shelf2ButtonActionPerformed

    private void shelf3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shelf3ButtonActionPerformed
        helpButton("shelf 3");
    }//GEN-LAST:event_shelf3ButtonActionPerformed

    private void shelf3pickButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shelf3pickButtonActionPerformed
        // TODO add your handling code here:
         pickButton(shelf3Table,shelf3Spinner,"shelf 3");
    }//GEN-LAST:event_shelf3pickButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        if (order.getItemList().size() > 0)
        {
            ArrayList<OrderItem> orderLi = order.getItemList();
            for (OrderItem orderItem : order.getItemList())
            {
                for(Shelf sf:enterprise.getShelfDirectory().getShelfDirectory())
                {
                    for (ShelfItem si: sf.getShelfList())
                    {
                        if(si.getProduct().getId()==orderItem.getProduct().getId())
                        {
                            si.setQuantity(si.getQuantity()+orderItem.getQuantity());
                        }   
                    }   
                }    
                
               
            }
            order.getItemList().removeAll(orderLi);
        }
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = orderTable.getSelectedRow();
        int qty = (Integer) removeSpinner.getValue();
        boolean changed = false;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a product", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
         else if(qty<=0)
         {
                    JOptionPane.showMessageDialog(this, "Quantiy should be greater than zero.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
         }
         
        else
        {
         OrderItem oi = (OrderItem) orderTable.getValueAt(selectedRow, 0);
         if(oi.getQuantity()<qty)
         {
           JOptionPane.showMessageDialog(this, "You can't remove more items than the present items in cart.", "Warning", JOptionPane.WARNING_MESSAGE);    
             
         } 
         else
         {   
           for(Shelf sf:enterprise.getShelfDirectory().getShelfDirectory())
                {
                    for (ShelfItem si: sf.getShelfList())
                    {
                        if(si.getProduct().getId()==oi.getProduct().getId())
                        {
                            if(si.getQuantity()<=(si.getThreshold()/2))
                            {
                                     changed = true; 
                            }
                            oi.setQuantity(oi.getQuantity()-qty);
                            si.setQuantity(si.getQuantity()+qty);
                             if(si.getQuantity()<=(si.getThreshold()/2))
                                 {
                                      si.getProduct().setPrice((float) (si.getProduct().getPrice()+1.0)); 
                                 }
                             else
                             {
                                 if(changed ==true)
                                 {    
                                 si.getProduct().setPrice((float) (si.getProduct().getPrice()-1.0));
                                 }
                             }
                            oi.setTotalPrice(oi.getProduct().getPrice() * oi.getQuantity() );
                            if(oi.getQuantity()==0)
                            {
                              order.getItemList().remove(oi);
                            }    
                        }   
                    }   
                }    
                
         }    
                 
        
       
        populateOrderTable();
        populateTables();
        }   
               
        removeSpinner.setValue(0);
    }//GEN-LAST:event_removeButtonActionPerformed

    public void helpButton(String shelf)
    {
      
        for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof StoreKeeperOrganization)
            {   
                WorkRequest wr = new WorkRequest();
                wr.setMessage("Customer "+ userAccount.getEmployee().getName()+ " is waiting for Assistance at " + shelf);
                wr.setSender(userAccount);
                wr.setStatus("Pending");
               
                org.getWorkQueue().getWorkRequestList().add(wr);
                
            }
        }
        JOptionPane.showMessageDialog(null,"Help has been requested");
    }    

    public void pickButton(JTable shelfTable,JSpinner shelfSpinner, String shelf)
    {
         int selectedRow = shelfTable.getSelectedRow();
         int qty = (Integer) shelfSpinner.getValue();
         OrderItem or = null;
         int x=1;
         boolean alreadyPresent= false;
        ShelfItem selectedItem;
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a product", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        else if(qty<=0)
         {
                    JOptionPane.showMessageDialog(this, "Quantiy should be greater than zero.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
         }
         else
         {
             
            selectedItem = (ShelfItem) shelfTable.getValueAt(selectedRow, 0);
            if(selectedItem.getQuantity()<qty)
            {
                 JOptionPane.showMessageDialog(this, "Sorry.. It is a cart. You can't pick more number products than available ones.", "Warning", JOptionPane.WARNING_MESSAGE);
                  
            } 
            else
            {  
               if(order!=null)
               {    
                for(OrderItem oi:order.getItemList())
                {
                    if(oi.getProduct().getId()==selectedItem.getProduct().getId())
                    {
                        or=oi;
                        x=0;
                        alreadyPresent= true;
                        break;
                    }
                    else
                    {
                        x=1;
                    }   
                }
               }
               else
               {
                   x=1;
               }   
             if(x==1)
             {
                 or= new OrderItem(); 
                 or.setProduct(selectedItem.getProduct());
                 
             }  
           
            int totalqty=0;
            float totalprice=0;
            if(or.getQuantity()!=0)
            {
                totalqty= or.getQuantity()+ qty;
            }   
            else
                {
                    totalqty = qty;
                }   
            selectedItem.setQuantity(selectedItem.getQuantity()- qty);
            totalprice = selectedItem.getProduct().getPrice() * totalqty;
            or.setQuantity(totalqty);
            or.setTotalPrice(totalprice);
            if(!alreadyPresent)
            {    
            order.getItemList().add(or);
            }
            if(selectedItem.getQuantity()<=selectedItem.getThreshold())
              {
                  for (Organization org:enterprise.getOrganizationDirectory().getOrganizationList())
                  {
                      if(org instanceof StoreKeeperOrganization)
                      {   
                           WorkRequest wr = new WorkRequest();
                           wr.setMessage("Product "+ selectedItem.getProduct().getName()+ " needs to be refilled present in " + shelf );
                           wr.setSender(userAccount);
                           wr.setStatus("Pending");
                           wr.setProduct(selectedItem.getProduct());
                           org.getWorkQueue().getWorkRequestList().add(wr);
                
                       }
                  }   
              
                  
              }   
             if(selectedItem.getQuantity()<=(selectedItem.getThreshold()/2))
             {
                selectedItem.getProduct().setPrice((float) (selectedItem.getProduct().getPrice()+1.0)); 
             }
            }     
                  
        }
                
     populateOrderTable();
     populateTables();
     shelfSpinner.setValue(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton checkButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton removeButton;
    private javax.swing.JSpinner removeSpinner;
    private javax.swing.JButton shelf1Button;
    private javax.swing.JSpinner shelf1Spinner;
    private javax.swing.JTable shelf1Table;
    private javax.swing.JButton shelf1pickButton;
    private javax.swing.JButton shelf2Button;
    private javax.swing.JSpinner shelf2Spinner;
    private javax.swing.JTable shelf2Table;
    private javax.swing.JButton shelf2pickButton;
    private javax.swing.JButton shelf3Button;
    private javax.swing.JSpinner shelf3Spinner;
    private javax.swing.JTable shelf3Table;
    private javax.swing.JButton shelf3pickButton;
    // End of variables declaration//GEN-END:variables
}