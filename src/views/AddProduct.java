/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerListModel;
import models.Clothing;
import models.DBManager;
import models.Footwear;
import models.Staff;

/**
 *
 * @author ross
 */
public class AddProduct extends javax.swing.JFrame {

    /**
     * Creates new form AddProduct
     */
    
    private Staff loggedInStaff;
    private ButtonGroup bg;
    
    // constructor
    public AddProduct(Staff staff) {
        loggedInStaff = staff;
        bg = new ButtonGroup();
        
        initComponents();
        
        // populate stock level spinner with values
        populateStockSpinner();
        
        // hide extra attribute widgets by default
        extraAttribute_lbl.setVisible(false);
        extraAttribute_combo.setVisible(false);
    }
    
    // clears any values in the various widgets
    private void clearInputs() {
        name_txt.setText("");
        price_txt.setText("");
        errorMessage_lbl.setText("");
        
        extraAttribute_combo.setVisible(false);
        extraAttribute_lbl.setVisible(false);
        
        // sets value of stock level spinner to 0
        stockLevel_spin.setValue(Integer.toString(0));
        
        bg.clearSelection();
        
    }
    
    
    // populate stock level spinner with values
    private void populateStockSpinner() {
        ArrayList<String> array = new ArrayList<String>();
        
        for (int i = 0; i < 1001; i++) {
            array.add(Integer.toString(i));
        }
        
        SpinnerListModel model = new SpinnerListModel(array);
        stockLevel_spin.setModel(model);
                
        // populate button group
        bg.add(clothing_rdo);
        bg.add(footwear_rdo);
    }
    
    
    // populates the extra combobox with items based in input
    private void populateExtrasCombo(String input) {
        if (input.equals("measurements")) {
            
            /* no need to set a model for clothing since it would require more code
            and adds no advantages that I can see */
            
            extraAttribute_combo.addItem("small");
            extraAttribute_combo.addItem("medium");
            extraAttribute_combo.addItem("large");
            extraAttribute_combo.addItem("extra large");
        }
        else if (input.equals("sizes")) {
            DefaultComboBoxModel sizes = new DefaultComboBoxModel();
            for (int i = 1; i < 15; i++) {
                sizes.addElement(i);
            }
            
            extraAttribute_combo.setModel(sizes);
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
        jLabel2 = new javax.swing.JLabel();
        clothing_rdo = new javax.swing.JRadioButton();
        footwear_rdo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        price_txt = new javax.swing.JTextField();
        submit_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        extraAttribute_lbl = new javax.swing.JLabel();
        errorMessage_lbl = new javax.swing.JLabel();
        extraAttribute_combo = new javax.swing.JComboBox<>();
        stockLevel_spin = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add New Product");

        jLabel2.setText("Type of Product:");

        clothing_rdo.setText("Clothing");
        clothing_rdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clothing_rdoActionPerformed(evt);
            }
        });

        footwear_rdo.setText("Footwear");
        footwear_rdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                footwear_rdoActionPerformed(evt);
            }
        });

        jLabel3.setText("Name:");

        jLabel4.setText("Price:");

        jLabel5.setText("Stock Level:");

        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        clear_btn.setText("Clear");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        extraAttribute_lbl.setText("extra attribute:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(clothing_rdo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(footwear_rdo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(price_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(stockLevel_spin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(extraAttribute_lbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(extraAttribute_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(submit_btn)))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(errorMessage_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(footwear_rdo)
                        .addComponent(clothing_rdo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(price_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(stockLevel_spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(extraAttribute_lbl)
                    .addComponent(extraAttribute_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit_btn)
                    .addComponent(clear_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(errorMessage_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(back_btn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clothing_rdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clothing_rdoActionPerformed
        // make extras widgets visible
        extraAttribute_lbl.setVisible(true);
        extraAttribute_combo.setVisible(true);
        
        // clear the extra combobox of items
        extraAttribute_combo.removeAllItems();
        
        // populate the combobox with measurements
        populateExtrasCombo("measurements");
        
        // give label appropriate text
        extraAttribute_lbl.setText("Measurement:");
    }//GEN-LAST:event_clothing_rdoActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        clearInputs();
    }//GEN-LAST:event_clear_btnActionPerformed

    private void footwear_rdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_footwear_rdoActionPerformed
        // make extras widgets visible
        extraAttribute_lbl.setVisible(true);
        extraAttribute_combo.setVisible(true);
        
        // clear the extra combobox of items
        extraAttribute_combo.removeAllItems();
        
        // populate the combobox with measurements
        populateExtrasCombo("sizes");
        
        // give label appropriate text
        extraAttribute_lbl.setText("Size:");
    }//GEN-LAST:event_footwear_rdoActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        String name = name_txt.getText();
        String price = price_txt.getText();
        String stockLevel = (String)stockLevel_spin.getValue();
        String extraAttribute_item = (String)extraAttribute_combo.getSelectedItem().toString();  // holds value from combobox
        
        if (!clothing_rdo.isSelected() || !footwear_rdo.isSelected()) {
            errorMessage_lbl.setText("Error: Please select a category");
        }
        else if (name.equals("") || price.equals("")) {
            errorMessage_lbl.setText("All fields are mandatory");
        }
        else {
            try {
                double doublePrice = Double.parseDouble(price);
                
                try {
                    int doubleStockLevel = Integer.parseInt(stockLevel);
                    
                    if (clothing_rdo.isSelected()) {
                        Clothing clothing = new Clothing(name, doublePrice, doubleStockLevel, extraAttribute_item);
                        DBManager db = new DBManager();
                        db.addProduct(clothing);
                        clearInputs();
                    }
                    else {
                        Footwear footwear = new Footwear(name, doublePrice, doubleStockLevel, Integer.parseInt(extraAttribute_item));
                        DBManager db = new DBManager();
                        db.addProduct(footwear);
                        clearInputs();
                    }
                } 
                catch (Exception ex) {
                    errorMessage_lbl.setText("Error: Stock level must be a decimal number");
                    System.out.println("Exception: " + ex);
                }
            }
            catch (Exception ex) {
                errorMessage_lbl.setText("Error: Price must be a decimal number");
                System.out.println("Exception: " + ex);
            }

        }
    }//GEN-LAST:event_submit_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        ModifyProducts view = new ModifyProducts(loggedInStaff);
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new AddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JRadioButton clothing_rdo;
    private javax.swing.JLabel errorMessage_lbl;
    private javax.swing.JComboBox<String> extraAttribute_combo;
    private javax.swing.JLabel extraAttribute_lbl;
    private javax.swing.JRadioButton footwear_rdo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTextField price_txt;
    private javax.swing.JSpinner stockLevel_spin;
    private javax.swing.JButton submit_btn;
    // End of variables declaration//GEN-END:variables
}
