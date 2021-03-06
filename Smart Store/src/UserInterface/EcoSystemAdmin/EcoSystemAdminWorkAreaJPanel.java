/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EcoSystemAdmin;

import Business.EcoSystem.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Prasad
 */
public class EcoSystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EcoSystemAdminWorkAreaJPanel
     */
    
        JPanel userProcessContainer;
        EcoSystem business;
    

    public EcoSystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageNetworkButton = new javax.swing.JButton();
        manageNetworkAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);

        manageNetworkButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manageNetworkButton.setText(" Manage Networks");
        manageNetworkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworkButtonActionPerformed(evt);
            }
        });

        manageNetworkAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manageNetworkAdmin.setText("Manage Network Admin");
        manageNetworkAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworkAdminActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("EcoSystem Admin ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageNetworkAdmin)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(327, 327, 327)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(308, 308, 308)
                            .addComponent(manageNetworkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(315, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {manageNetworkAdmin, manageNetworkButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(102, 102, 102)
                .addComponent(manageNetworkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(manageNetworkAdmin)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {manageNetworkAdmin, manageNetworkButton});

    }// </editor-fold>//GEN-END:initComponents

    private void manageNetworkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworkButtonActionPerformed
        // TODO add your handling code here:
        ManageNetwork nc = new ManageNetwork(userProcessContainer, business);
        userProcessContainer.add("ManageNetwork", nc);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageNetworkButtonActionPerformed

    private void manageNetworkAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworkAdminActionPerformed
        // TODO add your handling code here:
        ManageNetworkAdmin nac = new ManageNetworkAdmin(userProcessContainer, business);
        userProcessContainer.add("ManageNetworkAdmin", nac);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageNetworkAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageNetworkAdmin;
    private javax.swing.JButton manageNetworkButton;
    // End of variables declaration//GEN-END:variables
}
