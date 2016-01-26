/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EcoSystemAdmin;

import Business.EcoSystem.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prasad
 */
public class ManageNetwork extends javax.swing.JPanel {

    /**
     * Creates new form ManageNetwork
     */
     JPanel userProcessContainer;
     EcoSystem business;

    ManageNetwork(JPanel userProcessContainer, EcoSystem business) {
       initComponents();
       
       this.userProcessContainer = userProcessContainer;
       this.business = business;
       populateTable();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) networkTable.getModel();

        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
              
                         Object[] row = new Object[2];
                         row[0] = network.getNetworkID();
                         row[1] = network.getNetworkName();
                        
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
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        addNetworkButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();

        setBackground(java.awt.Color.white);

        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headerLabel.setText("Network Creation");

        nameLabel.setText("Name");

        addNetworkButton.setText("Add Network");
        addNetworkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNetworkButtonActionPerformed(evt);
            }
        });

        networkTable.setBackground(new java.awt.Color(204, 255, 153));
        networkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network ID", "Network Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkTable);

        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(headerLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(283, 283, 283)
                                .addComponent(addNetworkButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(backButton)))
                        .addGap(181, 181, 181)))
                .addContainerGap(263, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addGap(120, 120, 120)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(headerLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addGap(40, 40, 40)
                .addComponent(addNetworkButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addNetworkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNetworkButtonActionPerformed
        // TODO add your handling code here:
        int x=0;
        if(nameTextField.getText().trim().matches(""))
        {
        JOptionPane.showMessageDialog(null, "This field is mandatory!!!", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
        else
        {   
        
        if(business.getNetworkList().isEmpty()==false)
        {   
            for (Network n: business.getNetworkList())
            {
                if(n.getNetworkName().matches(nameTextField.getText()))
                {
                  JOptionPane.showMessageDialog(null, "This Network already exists. Please use some other name...!!", "Warning", JOptionPane.WARNING_MESSAGE); 
                  x=0;
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
        Network n= business.createAndAddNetwork();
        
        n.setNetworkID(business.getNetworkList().size());
        n.setNetworkName(nameTextField.getText());
        JOptionPane.showMessageDialog(null, "Network has been created!!!", "Information", JOptionPane.INFORMATION_MESSAGE);
        nameTextField.setText("");
        populateTable();
        }
        }
    }//GEN-LAST:event_addNetworkButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNetworkButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTable networkTable;
    // End of variables declaration//GEN-END:variables
}