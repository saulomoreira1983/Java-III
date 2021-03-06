/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day01icecream;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Day01IceCream extends javax.swing.JFrame {

    /**
     * Creates new form Day01IceCream
     */
    public Day01IceCream() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbFlavourVanilla = new javax.swing.JRadioButton();
        rbFlavourStrawberry = new javax.swing.JRadioButton();
        rbFlavourChocolate = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        cbToppingSprinkles = new javax.swing.JCheckBox();
        cbToppingPeanuts = new javax.swing.JCheckBox();
        cbToppingFudge = new javax.swing.JCheckBox();
        btCalculate = new javax.swing.JButton();
        btResetForm = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfSubtotal = new javax.swing.JTextField();
        tfTax = new javax.swing.JTextField();
        tfTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("Arsenio's Ice Cream");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Flavours"));

        buttonGroup1.add(rbFlavourVanilla);
        rbFlavourVanilla.setSelected(true);
        rbFlavourVanilla.setText("Vanilla $1.00");
        rbFlavourVanilla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rbFlavourVanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFlavourVanillaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbFlavourStrawberry);
        rbFlavourStrawberry.setText("Strawberry $1.50");
        rbFlavourStrawberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFlavourStrawberryActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbFlavourChocolate);
        rbFlavourChocolate.setText("Chocolate $2.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbFlavourChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbFlavourStrawberry, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbFlavourVanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbFlavourVanilla)
                .addGap(18, 18, 18)
                .addComponent(rbFlavourStrawberry)
                .addGap(18, 18, 18)
                .addComponent(rbFlavourChocolate)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Toppings"));

        cbToppingSprinkles.setText("Sprinkles $0.25");

        cbToppingPeanuts.setText("Peanuts $0.50");

        cbToppingFudge.setText("Fudge $0.75");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbToppingFudge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbToppingSprinkles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbToppingPeanuts)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbToppingSprinkles)
                .addGap(18, 18, 18)
                .addComponent(cbToppingPeanuts)
                .addGap(18, 18, 18)
                .addComponent(cbToppingFudge)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btCalculate.setText("Calculate");
        btCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalculateActionPerformed(evt);
            }
        });

        btResetForm.setText("Reset Form");
        btResetForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetFormActionPerformed(evt);
            }
        });

        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Subtotal");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tax");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Total");

        tfSubtotal.setEditable(false);

        tfTax.setEditable(false);

        tfTotal.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCalculate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btResetForm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTotal)
                            .addComponent(tfTax)
                            .addComponent(tfSubtotal))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCalculate)
                    .addComponent(jLabel2)
                    .addComponent(tfSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btResetForm)
                    .addComponent(jLabel3)
                    .addComponent(tfTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExit)
                    .addComponent(jLabel4)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbFlavourVanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFlavourVanillaActionPerformed
        if(rbFlavourVanilla.isSelected())
        {
            rbFlavourChocolate.setSelected(false);
            rbFlavourStrawberry.setSelected(false);
        }
    }//GEN-LAST:event_rbFlavourVanillaActionPerformed

    private void rbFlavourStrawberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFlavourStrawberryActionPerformed
        if(rbFlavourStrawberry.isSelected())
        {
            rbFlavourChocolate.setSelected(false);
            rbFlavourVanilla.setSelected(false);
        }
    }//GEN-LAST:event_rbFlavourStrawberryActionPerformed
    final double SALES_TAX = 0.15;
    private void btCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalculateActionPerformed
        double price = 0;
        if (rbFlavourVanilla.isSelected())
        {
            price += 1.00;
        }
        else if (rbFlavourStrawberry.isSelected())
        {
            price += 1.50;
        }
        else if (rbFlavourChocolate.isSelected())
        {
            price += 2.00;
        }
        else // internal error
        {
            JOptionPane.showMessageDialog(this, "Internal error: no radio button selected");
        }
        
        if (cbToppingSprinkles.isSelected())
        {
            price += 0.25;
        }
        if (cbToppingPeanuts.isSelected())
        {
            price += 0.50;
        }
        if (cbToppingFudge.isSelected())
        {
            price += 0.75;
        }
        double subtotal = price;
        double tax = subtotal * SALES_TAX;
        double total = subtotal + tax;
        tfSubtotal.setText(String.format("%.2f", subtotal));
        tfTax.setText(String.format("%.2f", tax));
        tfTotal.setText(String.format("%.2f", total));
    }//GEN-LAST:event_btCalculateActionPerformed

    private void btResetFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetFormActionPerformed
        rbFlavourVanilla.setSelected(true);
        
        cbToppingFudge.setSelected(false);
        cbToppingPeanuts.setSelected(false);
        cbToppingSprinkles.setSelected(false);
        
        tfSubtotal.setText("");
        tfTax.setText("");
        tfTotal.setText("");
    }//GEN-LAST:event_btResetFormActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // NEVER USE System.exit(0); unless it's fatal error
        dispose(); // use this one instead
    }//GEN-LAST:event_btExitActionPerformed

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
            java.util.logging.Logger.getLogger(Day01IceCream.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Day01IceCream.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Day01IceCream.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Day01IceCream.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Day01IceCream().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalculate;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btResetForm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbToppingFudge;
    private javax.swing.JCheckBox cbToppingPeanuts;
    private javax.swing.JCheckBox cbToppingSprinkles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbFlavourChocolate;
    private javax.swing.JRadioButton rbFlavourStrawberry;
    private javax.swing.JRadioButton rbFlavourVanilla;
    private javax.swing.JTextField tfSubtotal;
    private javax.swing.JTextField tfTax;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
