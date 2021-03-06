/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Practice5 extends javax.swing.JFrame {

    DefaultListModel<String> modelFlavoursList = new DefaultListModel<>();
    DefaultListModel<String> modelAvailableFlavoursList = new DefaultListModel<>();
    
    /**
     * Creates new form Practice5
     */
    
    public Practice5() {
        initComponents();
    
        // loading info from a file
        try(Scanner fileInput = new Scanner(new File("AvailableFlavours.txt"))) //try to read from file
        {
            //while there is next line, keep loading
            /*while(fileInput.hasNextLine())
            {
                String flavour = fileInput.nextLine();
                modelAvailableFlavoursList.addElement(flavour); //add loaded elements to model of left list
            }*/            
            // the above option is also valid, but with a .txt with each flavour in one line
            while(fileInput.hasNextLine())
            {
                String fl = fileInput.nextLine();
                String[] flavours = fl.split(";");
                int i;
                for(i = 0; i < flavours.length; i++)
                {
                modelAvailableFlavoursList.addElement(flavours[i]);
                }
            }
                        
        }
        catch (IOException ex)
        {
            //if file is not found or any problem, display error message
            JOptionPane.showMessageDialog(this,"Unable to read from file: \n" + ex.getMessage(),"fatal error - file access error: ",
                       JOptionPane.ERROR_MESSAGE);
            //since file is not found and it is a fatal error then close program
            System.exit(1);  //1 if there was a problem and 0 if there was none
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
        lstSelected = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstFlavours = new javax.swing.JList<>();
        btAdd = new javax.swing.JButton();
        btDeleteScoop = new javax.swing.JButton();
        btClearAll = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btSaveSelected1 = new javax.swing.JButton();
        btSaveSelected2 = new javax.swing.JButton();
        tfNewFlavour = new javax.swing.JTextField();
        btUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cabrivers Ice Cream");

        lstSelected.setModel(modelFlavoursList);
        lstSelected.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstSelected);

        lstFlavours.setModel(modelAvailableFlavoursList);
        jScrollPane2.setViewportView(lstFlavours);

        btAdd.setText("Add >>");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btDeleteScoop.setText("Delete scoop");
        btDeleteScoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteScoopActionPerformed(evt);
            }
        });

        btClearAll.setText("Clear all");
        btClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearAllActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jLabel2.setText("Flavours:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jLabel3.setText("Selected:");

        btSaveSelected1.setText("Save Selected to File (1)");
        btSaveSelected1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveSelected1ActionPerformed(evt);
            }
        });

        btSaveSelected2.setText("Save Selected to File (2)");
        btSaveSelected2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveSelected2ActionPerformed(evt);
            }
        });

        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btSaveSelected1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btDeleteScoop))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAdd))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNewFlavour)
                            .addComponent(btSaveSelected2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btClearAll, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(btUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btAdd)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btDeleteScoop)
                    .addComponent(btSaveSelected1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClearAll)
                    .addComponent(btSaveSelected2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNewFlavour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btUpdate))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        /*if(lstFlavours.getSelectedIndex() < 0) // returns always -1 if it's empty
        {
            JOptionPane.showMessageDialog(this, "Please select a flavour.", "No selected flavour", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        modelFlavoursList.addElement(lstFlavours.getSelectedValue());
        
        lstFlavours.clearSelection();*/
        
        /* For multiple selection: */
        List<String> selectedList = lstFlavours.getSelectedValuesList();
        if(selectedList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please select a flavour.", "No selected flavour", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        modelFlavoursList.addAll(selectedList);
        
        lstFlavours.clearSelection();
        
    }//GEN-LAST:event_btAddActionPerformed

    private void btDeleteScoopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteScoopActionPerformed
        if(lstSelected.getSelectedIndex() == -1) // returns always -1 if it's empty
        {
            JOptionPane.showMessageDialog(this, "You should pick a flavour to delete.", "No flavour selected",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        modelFlavoursList.remove(lstSelected.getSelectedIndex());
        
        // Multiple:
        /*int[] selectedIndicesArray = lstSelected.getSelectedIndices();
        if(selectedIndicesArray.length == 0)
        {
            JOptionPane.showMessageDialog(this, "You should pick a flavour to delete.", "No flavour selected",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        //modelFlavoursList.removeAll(selectedList);
        for(int i = selectedIndicesArray.length - 1; i >= 0; i--)
        {
            int toDelete = selectedIndicesArray[i];
            modelFlavoursList.remove(toDelete);
        }*/
    }//GEN-LAST:event_btDeleteScoopActionPerformed

    private void btClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearAllActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete all selected flavours?", "Please confirm",
                JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION)
        {
            modelFlavoursList.removeAllElements();
        }        
    }//GEN-LAST:event_btClearAllActionPerformed

    private void btSaveSelected1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveSelected1ActionPerformed
        if(modelFlavoursList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Your list of flavours is empty.", "No have, madame",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // the statement HAS to be in the first line, between parentheses, to work properly.
        try(PrintWriter printWriter = new PrintWriter(new FileWriter (new File("ChosenFlavours.txt"), true)))
        {        
        for(int i=0; i < modelFlavoursList.size(); i++)
        {
            printWriter.println(modelFlavoursList.getElementAt(i));
        }
        JOptionPane.showMessageDialog(this, "Saved as 'ChosenFlavours.txt'", "Success",
                    JOptionPane.INFORMATION_MESSAGE);        
       }
       catch(IOException ex)
       {
           JOptionPane.showMessageDialog(this, "Error writing to file", "No have, madame",
                    JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btSaveSelected1ActionPerformed

    private void btSaveSelected2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveSelected2ActionPerformed
        if(modelFlavoursList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Your list of flavours is empty.", "No have, madame",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // the statement HAS to be in the first line, between parentheses, to work properly.
        try(PrintWriter printWriter = new PrintWriter(new FileWriter (new File("ChosenFlavours.txt"), true)))
        {        
        for(int i=0; i < modelFlavoursList.size(); i++)
        {
            printWriter.print(modelFlavoursList.getElementAt(i)+";");
        }
        JOptionPane.showMessageDialog(this, "Saved as 'ChosenFlavours.txt'", "Success",
                    JOptionPane.INFORMATION_MESSAGE);        
       }
       catch(IOException ex)
       {
           JOptionPane.showMessageDialog(this, "Error writing to file", "No have, madame",
                    JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btSaveSelected2ActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        if(lstSelected.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this, "You should pick a flavour to update.", "No flavour selected",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if("".equals(tfNewFlavour.getText()))
        {
            JOptionPane.showMessageDialog(this, "Please type a flavour.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        modelFlavoursList.setElementAt(tfNewFlavour.getText(), lstSelected.getSelectedIndex());
    }//GEN-LAST:event_btUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Practice5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practice5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practice5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practice5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practice5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btClearAll;
    private javax.swing.JButton btDeleteScoop;
    private javax.swing.JButton btSaveSelected1;
    private javax.swing.JButton btSaveSelected2;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstFlavours;
    private javax.swing.JList<String> lstSelected;
    private javax.swing.JTextField tfNewFlavour;
    // End of variables declaration//GEN-END:variables
}
