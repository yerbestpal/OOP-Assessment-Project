/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import models.Customer;
import models.DBManager;
import models.Product;

/**
 *
 * @author ross
 */
public class ViewProducts extends javax.swing.JFrame {
    private Customer loggedInCustomer;
    private HashMap<Integer, Product> products; 

    /**
     * Creates new form ViewProducts
     */
    public ViewProducts(Customer customer) {
        loggedInCustomer = customer;
        initComponents();
        
        DBManager db = new DBManager();
        products = db.loadProducts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back_btn = new javax.swing.JButton();
        viewBasket_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        products_lst = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        categories_lst = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quantity_combo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        addToBasket_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        viewBasket_btn.setText("View Basket");

        jLabel1.setText("All Available Products");

        products_lst.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                products_lstValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(products_lst);

        categories_lst.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Clothing", "Footwear" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        categories_lst.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                categories_lstValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(categories_lst);

        jLabel2.setText("Products");

        jLabel3.setText("Product Categories");

        quantity_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantity_comboActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantity:");

        addToBasket_btn.setText("Add to Basket");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)
                        .addComponent(viewBasket_btn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(quantity_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addToBasket_btn, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_btn)
                    .addComponent(viewBasket_btn)
                    .addComponent(jLabel1))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantity_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(addToBasket_btn)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        CustomerHome customerHome = new CustomerHome(loggedInCustomer);
        customerHome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void categories_lstValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_categories_lstValueChanged
        DefaultListModel productList = new DefaultListModel();
        String selectedCategory = categories_lst.getSelectedValue();
        
        for (Map.Entry<Integer, Product> productEntry : products.entrySet()) {
            Product product = productEntry.getValue();
            
            if (product.getClass().getName().equals("models." + selectedCategory)) {
                if (product.getStockLevel() > 0) {
                    productList.addElement(product);
                }
            }
        }
        products_lst.setModel(productList);
    }//GEN-LAST:event_categories_lstValueChanged

    private void quantity_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantity_comboActionPerformed
        
    }//GEN-LAST:event_quantity_comboActionPerformed

    private void products_lstValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_products_lstValueChanged
        if (products_lst.getSelectedIndex() != -1) {
            Object listProduct = (Object)products_lst.getSelectedValue();
            Product selectedObject = (Product)listProduct;
            int stockLevel = selectedObject.getStockLevel();

            DefaultComboBoxModel quantityModel = new DefaultComboBoxModel();

            for (int i = 1; i <=  stockLevel; i++) {
                quantityModel.addElement(i);
            }
            
            quantity_combo.setModel(quantityModel);
        }
    }//GEN-LAST:event_products_lstValueChanged

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
            java.util.logging.Logger.getLogger(ViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ViewProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToBasket_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JList<String> categories_lst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> products_lst;
    private javax.swing.JComboBox<String> quantity_combo;
    private javax.swing.JButton viewBasket_btn;
    // End of variables declaration//GEN-END:variables
}
