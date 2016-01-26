/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Enterprise.Enterprise;
import Business.Item.ShelfItem;
import Business.Product.Product;
import Business.Shelf.Shelf;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Prasad
 */
public class ProductDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProductDetailsPanel
     */
    JPanel userProcessContainer;
    Product product;
    Enterprise enterprise;

    ProductDetailsPanel(JPanel userProcessContainer, Product pd, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.product = pd;
        this.enterprise = enterprise;
        
        productIDText.setText(String.valueOf(product.getId()));
        nameText.setText(product.getName());
        priceText.setText(String.valueOf(product.getPrice()));
        supplierText.setText(product.getSupplier());
        searchCountText.setText(String.valueOf(product.getSearchCount()));
        
        for(Shelf s:enterprise.getShelfDirectory().getShelfDirectory())
        {
            for(ShelfItem si: s.getShelfList())
            {
              if(si.getProduct().getId()==product.getId()) 
              {
                  int x = 0;
                  
                  x = si.getQuantity() + product.getQuantity();
                  quantityText.setText(String.valueOf(x));
                  locationText.setText(String.valueOf(s.getShelfID()));
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

        jLabel1 = new javax.swing.JLabel();
        productIDlabel = new javax.swing.JLabel();
        productIDText = new javax.swing.JLabel();
        productNameLabel = new javax.swing.JLabel();
        costLlabel = new javax.swing.JLabel();
        nameText = new javax.swing.JLabel();
        priceText = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        quantityText = new javax.swing.JLabel();
        manufacturerLabel = new javax.swing.JLabel();
        supplierText = new javax.swing.JLabel();
        locLabel = new javax.swing.JLabel();
        locationText = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        sideLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchCountText = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Product Details");

        productIDlabel.setText("Product ID");

        productIDText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        productIDText.setText("jLabel3");

        productNameLabel.setText("Name of the Product");

        costLlabel.setText("How much it will cost you??");

        nameText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nameText.setText("jLabel4");

        priceText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        priceText.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("$");

        quantityLabel.setText("How many are there to pick ?? ");

        quantityText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        quantityText.setText("jLabel8");

        manufacturerLabel.setText("Who is the manufacturer??");

        supplierText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        supplierText.setText("jLabel10");

        locLabel.setText("Where you can find it??");

        locationText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        locationText.setText("jlabel");

        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        sideLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sideLabel.setText("Shelf no");

        jLabel2.setText("How many people Searched for Same Product");

        searchCountText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchCountText.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productIDlabel)
                            .addComponent(productNameLabel)
                            .addComponent(costLlabel)
                            .addComponent(quantityLabel)
                            .addComponent(manufacturerLabel)
                            .addComponent(locLabel)))
                    .addComponent(jLabel2))
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchCountText)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sideLabel)
                        .addGap(26, 26, 26)
                        .addComponent(locationText))
                    .addComponent(quantityText)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(priceText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addComponent(nameText)
                    .addComponent(productIDText)
                    .addComponent(supplierText))
                .addGap(225, 225, 225))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productIDText)
                    .addComponent(productIDlabel))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText)
                    .addComponent(productNameLabel))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceText)
                    .addComponent(jLabel6)
                    .addComponent(costLlabel))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityText)
                    .addComponent(quantityLabel))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierText)
                    .addComponent(manufacturerLabel))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationText)
                    .addComponent(sideLabel)
                    .addComponent(locLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchCountText)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addComponent(backButton)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel costLlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel locLabel;
    private javax.swing.JLabel locationText;
    private javax.swing.JLabel manufacturerLabel;
    private javax.swing.JLabel nameText;
    private javax.swing.JLabel priceText;
    private javax.swing.JLabel productIDText;
    private javax.swing.JLabel productIDlabel;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JLabel quantityText;
    private javax.swing.JLabel searchCountText;
    private javax.swing.JLabel sideLabel;
    private javax.swing.JLabel supplierText;
    // End of variables declaration//GEN-END:variables
}
