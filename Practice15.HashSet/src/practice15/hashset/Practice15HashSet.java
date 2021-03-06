/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice15.hashset;

import java.util.HashSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Practice15HashSet extends javax.swing.JFrame {
        DefaultListModel<Cat> modelCatsList = new DefaultListModel<>();
        DefaultListModel<Season> modelSeasonsList = new DefaultListModel<>();

    /**
     * Creates new form Practice15HashSet
     */
    public Practice15HashSet() {
        initComponents();
        
        /*
        ADD ENUM ELEMENTS TO THE MODELSEASONLIST
        One by one...
        modelSeasonsList.addElement(Season.Winter);
        modelSeasonsList.addElement(Season.Spring);
        modelSeasonsList.addElement(Season.Summer);
        modelSeasonsList.addElement(Season.Autumn);
        OR:
        */        
        for(Season season: Season.values())
        {
            modelSeasonsList.addElement(season);
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

        dlgNAS = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dlgNAS_tfName = new javax.swing.JTextField();
        dlgNAS_sliderAge = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dlgNAS_lstSeasons = new javax.swing.JList<>();
        dlgNAS_btAddUpdate = new javax.swing.JButton();
        lblNumberOfCats = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCats = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        miAdd = new javax.swing.JMenu();
        miUpdate = new javax.swing.JMenu();
        miDelete = new javax.swing.JMenu();

        dlgNAS.setModal(true);

        jLabel1.setText("Name:");

        jLabel2.setText("Age:");

        dlgNAS_sliderAge.setMajorTickSpacing(5);
        dlgNAS_sliderAge.setMaximum(20);
        dlgNAS_sliderAge.setMinorTickSpacing(1);
        dlgNAS_sliderAge.setPaintLabels(true);
        dlgNAS_sliderAge.setPaintTicks(true);
        dlgNAS_sliderAge.setSnapToTicks(true);
        dlgNAS_sliderAge.setValue(0);

        jLabel3.setText("Preffered seasons:");

        dlgNAS_lstSeasons.setModel(modelSeasonsList);
        jScrollPane2.setViewportView(dlgNAS_lstSeasons);

        dlgNAS_btAddUpdate.setText("Add/Update");
        dlgNAS_btAddUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgNAS_btAddUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgNASLayout = new javax.swing.GroupLayout(dlgNAS.getContentPane());
        dlgNAS.getContentPane().setLayout(dlgNASLayout);
        dlgNASLayout.setHorizontalGroup(
            dlgNASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgNASLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgNASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgNASLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dlgNAS_tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dlgNASLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dlgNAS_sliderAge, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(dlgNAS_btAddUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(dlgNASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        dlgNASLayout.setVerticalGroup(
            dlgNASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgNASLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgNASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dlgNAS_tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dlgNASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgNASLayout.createSequentialGroup()
                        .addGroup(dlgNASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dlgNAS_sliderAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(dlgNAS_btAddUpdate)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNumberOfCats.setText("Number of cats:");
        getContentPane().add(lblNumberOfCats, java.awt.BorderLayout.PAGE_END);

        lstCats.setModel(modelCatsList);
        lstCats.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstCats);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        miAdd.setText("Add");
        miAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miAddMouseClicked(evt);
            }
        });
        miAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddActionPerformed(evt);
            }
        });
        jMenuBar1.add(miAdd);

        miUpdate.setText("Update");
        miUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miUpdateMouseClicked(evt);
            }
        });
        jMenuBar1.add(miUpdate);

        miDelete.setText("Delete");
        miDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miDeleteMouseClicked(evt);
            }
        });
        jMenuBar1.add(miDelete);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddActionPerformed
        // THIS IS THE WRONG OPTION. IT SB MOUSE CLICKED EVT.
    }//GEN-LAST:event_miAddActionPerformed

    private void miAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miAddMouseClicked
        // reset all information
        dlgNAS_btAddUpdate.setText("Add");
        dlgNAS_tfName.setText("");
        dlgNAS_sliderAge.setValue(0);        
        
        // pack whatever is specified to dialog
        dlgNAS.pack();
        
        // where to display
        dlgNAS.setLocationRelativeTo(this); // "this" means the button Add from the first frame
        
        // set visible
        dlgNAS.setVisible(true);
        
        
    }//GEN-LAST:event_miAddMouseClicked

    private void dlgNAS_btAddUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgNAS_btAddUpdateActionPerformed
        String name = dlgNAS_tfName.getText();
        int age = dlgNAS_sliderAge.getValue();
        HashSet<Season> seasons = new HashSet<>(dlgNAS_lstSeasons.getSelectedValuesList());
        // From example: Set<Foo> foo = new HashSet<Foo>(myList);
               
        if((dlgNAS_btAddUpdate.getText()).equals("Add"))
        {
            Cat cat1 = new Cat(name, age, seasons);
            modelCatsList.addElement(cat1);
        }
        if((dlgNAS_btAddUpdate.getText()).equals("Update"))
        {
            Cat cat1 = new Cat(name, age, seasons);
            modelCatsList.setElementAt(cat1, lstCats.getSelectedIndex());
        }
               
        lblNumberOfCats.setText("Number of cats: " + modelCatsList.size());
        dlgNAS.setVisible(false);
    }//GEN-LAST:event_dlgNAS_btAddUpdateActionPerformed

    private void miUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miUpdateMouseClicked
        if(modelCatsList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "The cats list is empty.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(lstCats.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this, "Select a field to update.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        // Set the text for the button
        dlgNAS_btAddUpdate.setText("Update");
        
        // Get the values from the Season enum and add them in the list
        for(Season season: Season.values())
        {
            modelSeasonsList.addElement(season);
        }
        
        // pack whatever is specified to dialog
        dlgNAS.pack();
        
        // where to display
        dlgNAS.setLocationRelativeTo(this); // "this" means the button Add from the first frame
        
        // set visible
        dlgNAS.setVisible(true);
    }//GEN-LAST:event_miUpdateMouseClicked

    private void miDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miDeleteMouseClicked
        if(modelCatsList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "The cats list is empty.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(lstCats.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this, "Select a field to delete.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        modelCatsList.removeElementAt(lstCats.getSelectedIndex());
        lblNumberOfCats.setText("Number of cats: " + modelCatsList.size());
    }//GEN-LAST:event_miDeleteMouseClicked

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
            java.util.logging.Logger.getLogger(Practice15HashSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practice15HashSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practice15HashSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practice15HashSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practice15HashSet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog dlgNAS;
    private javax.swing.JButton dlgNAS_btAddUpdate;
    private javax.swing.JList<Season> dlgNAS_lstSeasons;
    private javax.swing.JSlider dlgNAS_sliderAge;
    private javax.swing.JTextField dlgNAS_tfName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNumberOfCats;
    private javax.swing.JList<Cat> lstCats;
    private javax.swing.JMenu miAdd;
    private javax.swing.JMenu miDelete;
    private javax.swing.JMenu miUpdate;
    // End of variables declaration//GEN-END:variables
}
