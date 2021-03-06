/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.StoreManager;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.StoreKeeperOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prasad
 */
public class StoreManagerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form StoreManagerWorkArea
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount userAccount;
    public StoreManagerWorkArea(JPanel userProcessContainer, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        
        storeManagerNameText.setText(userAccount.getEmployee().getName());
        populateMessageTable();
    }

    
    public void populateMessageTable() {

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
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        messageTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        checkOrderButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        storeManagerNameText = new javax.swing.JLabel();
        storeReportsButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);

        messageTable.setBackground(new java.awt.Color(204, 255, 153));
        messageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(messageTable);
        if (messageTable.getColumnModel().getColumnCount() > 0) {
            messageTable.getColumnModel().getColumn(1).setMinWidth(150);
            messageTable.getColumnModel().getColumn(1).setMaxWidth(130);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Store Manager");

        checkOrderButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkOrderButton.setText("Check Order");
        checkOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOrderButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Store Order");

        jLabel3.setText("Logged In: ");

        storeManagerNameText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        storeManagerNameText.setText("jLabel4");

        storeReportsButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        storeReportsButton.setText("Store Reports");
        storeReportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeReportsButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Store Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(storeManagerNameText)
                .addGap(251, 251, 251)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(checkOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(storeReportsButton)
                .addGap(174, 174, 174))
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(183, 183, 183))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {checkOrderButton, storeReportsButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(storeManagerNameText))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storeReportsButton))
                .addGap(100, 100, 100))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {checkOrderButton, storeReportsButton});

    }// </editor-fold>//GEN-END:initComponents

    private void checkOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOrderButtonActionPerformed
        // TODO add your handling code here:
            StoreOrderPanel sop = new StoreOrderPanel(userProcessContainer,enterprise);
          userProcessContainer.add("StoreOrderPanel", sop);
           CardLayout layout = (CardLayout) userProcessContainer.getLayout();
           layout.next(userProcessContainer);  
        
    }//GEN-LAST:event_checkOrderButtonActionPerformed

    private void storeReportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeReportsButtonActionPerformed
        // TODO add your handling code here:
          StoreReportsPanel srp = new StoreReportsPanel(userProcessContainer,enterprise);
          userProcessContainer.add("StoreReportsPanel", srp);
           CardLayout layout = (CardLayout) userProcessContainer.getLayout();
           layout.next(userProcessContainer);  
    }//GEN-LAST:event_storeReportsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkOrderButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable messageTable;
    private javax.swing.JLabel storeManagerNameText;
    private javax.swing.JButton storeReportsButton;
    // End of variables declaration//GEN-END:variables
}
