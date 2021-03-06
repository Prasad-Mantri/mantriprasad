/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.StoreKeeper;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.StoreKeeperOrganization;
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
public class StoreKeeperWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form StoreKeeperWorkArea
     */
  
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount userAccount;
    public StoreKeeperWorkArea(JPanel userProcessContainer, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        populateGMessageTable();
        populateMyRequestTable();
    }

    public void populateGMessageTable() {

        DefaultTableModel model = (DefaultTableModel) messageTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(organization instanceof StoreKeeperOrganization)
            {
               for(WorkRequest wr:organization.getWorkQueue().getWorkRequestList() )
              {  
                Object row[] = new Object[2];
                row[0] = wr;
                row[1] = wr.getStatus();
               
                model.addRow(row);
              }
            }   
        }
    }
    
    public void populateMyRequestTable()
    {
        
        DefaultTableModel model = (DefaultTableModel) myWorkRequestTable.getModel();

        model.setRowCount(0);
        for(WorkRequest wr:userAccount.getWorkQueue().getWorkRequestList() )
              {  
                Object row[] = new Object[2];
                row[0] = wr;
                row[1] = wr.getStatus();
                
                model.addRow(row);
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

        headerLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTable = new javax.swing.JTable();
        upperTableLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        myWorkRequestTable = new javax.swing.JTable();
        myRequestLabel = new javax.swing.JLabel();
        processButton = new javax.swing.JButton();

        setBackground(java.awt.Color.white);

        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headerLabel.setText("StoreKeeper ");

        messageTable.setBackground(new java.awt.Color(204, 255, 153));
        messageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Status"
            }
        ));
        jScrollPane1.setViewportView(messageTable);
        if (messageTable.getColumnModel().getColumnCount() > 0) {
            messageTable.getColumnModel().getColumn(1).setMinWidth(150);
            messageTable.getColumnModel().getColumn(1).setMaxWidth(300);
        }

        upperTableLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        upperTableLabel.setText("General WorkMessage Alerts :");

        myWorkRequestTable.setBackground(new java.awt.Color(204, 255, 153));
        myWorkRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Status"
            }
        ));
        jScrollPane2.setViewportView(myWorkRequestTable);
        if (myWorkRequestTable.getColumnModel().getColumnCount() > 0) {
            myWorkRequestTable.getColumnModel().getColumn(1).setMinWidth(150);
            myWorkRequestTable.getColumnModel().getColumn(1).setMaxWidth(300);
        }

        myRequestLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        myRequestLabel.setText("My Work Requests:");

        processButton.setText("Get Assigned & Process");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 207, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(headerLabel)
                        .addGap(306, 306, 306))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upperTableLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(processButton))
                            .addComponent(myRequestLabel)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(148, 148, 148))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(headerLabel)
                .addGap(18, 18, 18)
                .addComponent(upperTableLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(processButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(myRequestLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed
        // TODO add your handling code here:
        boolean haveUser=false;
        int selectedRow = messageTable.getSelectedRow();
        if(selectedRow >= 0)
        {
          WorkRequest wkr = (WorkRequest)messageTable.getValueAt(selectedRow, 0);
          if(wkr.getStatus().matches("Attended")|| wkr.getStatus().matches("Product Refilled"))
          {
             JOptionPane.showMessageDialog(null,"This request is completed already", "Message", JOptionPane.WARNING_MESSAGE);  
             return;
          }
          else if(wkr.getStatus().matches("Request Processing"))
          { 
            if(wkr.getReceiver().getUsername().matches(userAccount.getUsername()))
            {
                 haveUser=true;                   
            } 
            else
            {
                JOptionPane.showMessageDialog(null,"Some other user is working on this request.", "Message", JOptionPane.WARNING_MESSAGE); 
                return;
            }    
            
          }
          else
          {
              haveUser=true; 
              wkr.setStatus("Request Processing");
               wkr.setReceiver(userAccount);
               userAccount.getWorkQueue().getWorkRequestList().add(wkr);
          }   
       
        if(haveUser==true)
        {
          WorkRequestProcessing wrp = new WorkRequestProcessing(userProcessContainer,enterprise,wkr);
          userProcessContainer.add("WorkRequestProcessing", wrp);
           CardLayout layout = (CardLayout) userProcessContainer.getLayout();
           layout.next(userProcessContainer);  
        }    
        
         
        }   
        else
        {
            JOptionPane.showMessageDialog(null,"Please select atleast one row", "Message", JOptionPane.WARNING_MESSAGE);
        } 
        
        
        
        
        
        
        
        
        
        
        
        
      
    }//GEN-LAST:event_processButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable messageTable;
    private javax.swing.JLabel myRequestLabel;
    private javax.swing.JTable myWorkRequestTable;
    private javax.swing.JButton processButton;
    private javax.swing.JLabel upperTableLabel;
    // End of variables declaration//GEN-END:variables
}
