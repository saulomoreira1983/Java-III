/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice7;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Practice7 extends javax.swing.JFrame {

    /**
     * Creates new form Practice7
     */
    
    
    
    DefaultListModel<String> modelGuestsList = new DefaultListModel<>();       
    
    public Practice7() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfFirstName = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        btDelete = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstGuests = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guests List");

        jLabel1.setText("First Name:");

        jLabel2.setText("Last Name:");

        btDelete.setText("Delete");
        btDelete.setEnabled(false);
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btUpdate.setText("Update");
        btUpdate.setEnabled(false);
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btAdd.setText("Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        lstGuests.setModel(modelGuestsList);
        lstGuests.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstGuests.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstGuestsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstGuests);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfFirstName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfLastName))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btUpdate)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDelete)
                    .addComponent(btUpdate)
                    .addComponent(btAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        String firstName = tfFirstName.getText();
        if(!firstName.matches("^[a-zA-Z- ]{1,20}$"))
        {
            JOptionPane.showMessageDialog(this, "This name was not validated. Please review", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String lastName = tfLastName.getText();
        if(!lastName.matches("^[a-zA-Z- ]{1,20}$"))
        {
            JOptionPane.showMessageDialog(this, "This name was not validated. Please review", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        modelGuestsList.addElement(firstName + " " + lastName);
        tfFirstName.setText("");
        tfLastName.setText("");
    }//GEN-LAST:event_btAddActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        /* SINCE THE DELETE AND UPDATE BUTTONS ARE GREY, NO NEED FOR THE FOLLOWING CODE:
        if(lstGuests.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this, "You should pick a guest to remove.", "No guest selected",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        */
        modelGuestsList.remove(lstGuests.getSelectedIndex());
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        modelGuestsList.setElementAt((tfFirstName.getText() + " " + tfLastName.getText()), lstGuests.getSelectedIndex());
    }//GEN-LAST:event_btUpdateActionPerformed

    private void lstGuestsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstGuestsValueChanged
        btDelete.setEnabled(true);
        btUpdate.setEnabled(true);
        
        if(modelGuestsList.isEmpty())
        {
            btDelete.setEnabled(false);
            btUpdate.setEnabled(false);
        }
        
        if(lstGuests.getSelectedIndex() == -1)
        {
            btDelete.setEnabled(false);
            btUpdate.setEnabled(false);
        }
    }//GEN-LAST:event_lstGuestsValueChanged

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
            java.util.logging.Logger.getLogger(Practice7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practice7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practice7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practice7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practice7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstGuests;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    // End of variables declaration//GEN-END:variables
}