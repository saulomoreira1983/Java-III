/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice17.review;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Practice17Review extends javax.swing.JFrame 
{
    DefaultListModel<Flight> modelFlightsList = new DefaultListModel<>();
    DefaultListModel<Weekday> modelWeekdayList = new DefaultListModel<>();
    /**
     * Creates new form Practice17Review
     */
    public Practice17Review() 
    {
        initComponents();
        
        // Call method to load data from file
        try
        {
            loadFromFile();
        }
        catch(IllegalArgumentException ex)
        {
            JOptionPane.showMessageDialog(this, "Impossible to load from file.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        // to load the weekday list in the lstWeekday (from enum)
        for(Weekday weekday: Weekday.values())
        {
            modelWeekdayList.addElement(weekday);
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

        dlgSetFlight = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dlgSetFlight_tfAirlines = new javax.swing.JTextField();
        dlgSetFlight_tfFlightNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dlgSetFlight_lstWeekday = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dlgSetFlight_tfCity = new javax.swing.JTextField();
        dlgSetFlight_tfDate = new javax.swing.JTextField();
        dlgSetFlight_btAddUpdate = new javax.swing.JButton();
        dlgSetFlight_btCancel = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFlights = new javax.swing.JList<>();
        lblNoOfFlights = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        miAdd = new javax.swing.JMenu();
        miSortBy = new javax.swing.JMenu();
        miSortByDate = new javax.swing.JRadioButtonMenuItem();
        miSortByAirlines = new javax.swing.JRadioButtonMenuItem();
        miSortByCity = new javax.swing.JRadioButtonMenuItem();
        miSortByFLightNo = new javax.swing.JRadioButtonMenuItem();
        miUpdate = new javax.swing.JMenu();
        miDelete = new javax.swing.JMenu();
        miClearAll = new javax.swing.JMenu();

        dlgSetFlight.setTitle("Flight Setup");
        dlgSetFlight.setModal(true);

        jLabel1.setText("Airlines:");

        jLabel2.setText("Flight №:");

        jLabel3.setText("Departure days:");

        dlgSetFlight_lstWeekday.setModel(modelWeekdayList);
        jScrollPane2.setViewportView(dlgSetFlight_lstWeekday);

        jLabel4.setText("City:");

        jLabel5.setText("Date:");

        dlgSetFlight_btAddUpdate.setText("Add/Update");
        dlgSetFlight_btAddUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgSetFlight_btAddUpdateActionPerformed(evt);
            }
        });

        dlgSetFlight_btCancel.setText("Cancel");
        dlgSetFlight_btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgSetFlight_btCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgSetFlightLayout = new javax.swing.GroupLayout(dlgSetFlight.getContentPane());
        dlgSetFlight.getContentPane().setLayout(dlgSetFlightLayout);
        dlgSetFlightLayout.setHorizontalGroup(
            dlgSetFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgSetFlightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgSetFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(dlgSetFlightLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dlgSetFlight_tfCity))
                    .addGroup(dlgSetFlightLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dlgSetFlight_tfDate))
                    .addGroup(dlgSetFlightLayout.createSequentialGroup()
                        .addGroup(dlgSetFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlgSetFlightLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dlgSetFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dlgSetFlightLayout.createSequentialGroup()
                                        .addComponent(dlgSetFlight_tfAirlines, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dlgSetFlight_tfFlightNo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(dlgSetFlightLayout.createSequentialGroup()
                                .addComponent(dlgSetFlight_btAddUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dlgSetFlight_btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dlgSetFlightLayout.setVerticalGroup(
            dlgSetFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgSetFlightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgSetFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dlgSetFlight_tfAirlines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(dlgSetFlight_tfFlightNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dlgSetFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dlgSetFlight_tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dlgSetFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dlgSetFlight_tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlgSetFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgSetFlight_btAddUpdate)
                    .addComponent(dlgSetFlight_btCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flights Manager");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lstFlights.setModel(modelFlightsList);
        lstFlights.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstFlights);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        lblNoOfFlights.setText("Number of flights: 0");
        getContentPane().add(lblNoOfFlights, java.awt.BorderLayout.PAGE_END);

        miAdd.setText("Add");
        miAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miAddMouseClicked(evt);
            }
        });
        jMenuBar1.add(miAdd);

        miSortBy.setBackground(new java.awt.Color(204, 204, 255));
        miSortBy.setText("Sort by");

        buttonGroup1.add(miSortByDate);
        miSortByDate.setSelected(true);
        miSortByDate.setText("Date");
        miSortByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSortByDateActionPerformed(evt);
            }
        });
        miSortBy.add(miSortByDate);

        buttonGroup1.add(miSortByAirlines);
        miSortByAirlines.setText("Airlines");
        miSortByAirlines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSortByAirlinesActionPerformed(evt);
            }
        });
        miSortBy.add(miSortByAirlines);

        buttonGroup1.add(miSortByCity);
        miSortByCity.setText("City");
        miSortByCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSortByCityActionPerformed(evt);
            }
        });
        miSortBy.add(miSortByCity);

        buttonGroup1.add(miSortByFLightNo);
        miSortByFLightNo.setText("Flight number");
        miSortByFLightNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSortByFLightNoActionPerformed(evt);
            }
        });
        miSortBy.add(miSortByFLightNo);

        jMenuBar1.add(miSortBy);

        miUpdate.setText("Update");
        miUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miUpdateMouseClicked(evt);
            }
        });
        jMenuBar1.add(miUpdate);

        miDelete.setBackground(new java.awt.Color(204, 204, 255));
        miDelete.setText("Delete");
        miDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miDeleteMouseClicked(evt);
            }
        });
        jMenuBar1.add(miDelete);

        miClearAll.setText("Clear all");
        miClearAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miClearAllMouseClicked(evt);
            }
        });
        jMenuBar1.add(miClearAll);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miAddMouseClicked
        //display "Add" in AddUpdate button
        dlgSetFlight_btAddUpdate.setText("Add");                
        //cleanup the dialog before showing it
        dlgSetFlight_tfAirlines.setText("");
        dlgSetFlight_tfFlightNo.setText("");
        dlgSetFlight_tfCity.setText("");
        dlgSetFlight_tfDate.setText("");
        dlgSetFlight_lstWeekday.setSelectedIndex(-1);
        
        // SHOW THE DIALOG
        //to resize window to fit components
        dlgSetFlight.pack();
        //set location relative to parent, so dialog shows in the center of parent(JFrame)
        dlgSetFlight.setLocationRelativeTo(this);
        //set dialog visible
        dlgSetFlight.setVisible(true);
    }//GEN-LAST:event_miAddMouseClicked

    private void miUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miUpdateMouseClicked
        // If the list is empty (there's nothing to update)
        if(modelFlightsList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "There's no flights to update.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(lstFlights.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this, "Select a flight to update first.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //display "Update" in AddUpdate button
        dlgSetFlight_btAddUpdate.setText("Update");                
        
        // SHOW THE DIALOG
        //to resize window to fit components
        dlgSetFlight.pack();
        //set location relative to parent, so dialog shows in the center of parent(JFrame)
        dlgSetFlight.setLocationRelativeTo(this);
        //set dialog visible
        dlgSetFlight.setVisible(true);
    }//GEN-LAST:event_miUpdateMouseClicked

    private void miDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miDeleteMouseClicked
        // If it's empty or if nothing is selected
        if(modelFlightsList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "There's no flights to delete.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(lstFlights.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this, "Select a flight to delete first.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        // remove the selected index from model
        modelFlightsList.removeElementAt(lstFlights.getSelectedIndex());
        // Update the information at the bottom (label)
        lblNoOfFlights.setText("Number of flights: " + modelFlightsList.getSize());
    }//GEN-LAST:event_miDeleteMouseClicked

    private void dlgSetFlight_btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgSetFlight_btCancelActionPerformed
        // If cancel button is clicked dialog will be again invisible
        dlgSetFlight.setVisible(false);
    }//GEN-LAST:event_dlgSetFlight_btCancelActionPerformed

    
    private Flight getFlightFromInput() throws IllegalArgumentException
    {
        // No need to try/catch, we're just storing the string in the var here
        // Airlines
        String airlines = dlgSetFlight_tfAirlines.getText();
        
        // mandatory try/catch due to parseInt
        // Flight number
        int number;
        try
        {
          number = Integer.parseInt(dlgSetFlight_tfFlightNo.getText());  
        }
        catch(NumberFormatException ex)
        {
            throw new IllegalArgumentException("Flight number field must be filled and be a number");
        }
        
        // for the HashSet, if nothing is selected we might throw exception
        // Days of the week
        if(dlgSetFlight_lstWeekday.getSelectedIndex() == -1)
        {
            throw new IllegalArgumentException("At least one day must be selected.");
        }       
        HashSet<Weekday> weekday = new HashSet<>(dlgSetFlight_lstWeekday.getSelectedValuesList());
        
        // no need to throw/catch, just storing info
        // City
        String city = dlgSetFlight_tfCity.getText();
        
        // Date of flight
        Date date;
        try
        {
            date = Flight.dateFormat.parse(dlgSetFlight_tfDate.getText());
        }
        catch(ParseException ex)
        {
            throw new IllegalArgumentException("Invalid date format. Correct format: yyyy-mm-dd");
        }
        
        // Will gather all the collected information and store in the object
        Flight flight1 = null;
        try
        {
            flight1 = new Flight(airlines, number, weekday, date, city);  //throws IllegalArgumentException 
        }
        catch(IllegalArgumentException ex)
        {
           throw new IllegalArgumentException (ex.getMessage()); 
           // getMessage in the very last one (invoking the object)                                 
        } 
        return flight1;
    }
    
    private void dlgSetFlight_btAddUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgSetFlight_btAddUpdateActionPerformed
        // to use the method above to get the flight information
        Flight flight1 = null;
        try
        {
            flight1 = getFlightFromInput();
        }
        catch(IllegalArgumentException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE); // the final catch, sb with getMessage
            return;
        }
        
        // If button is set to Add or Update will do accordingly
        if(dlgSetFlight_btAddUpdate.getText().equals("Add"))        
        {
            modelFlightsList.addElement(flight1);
        }
        else if (dlgSetFlight_btAddUpdate.getText().equals("Update"))
        {
            modelFlightsList.setElementAt(flight1, lstFlights.getSelectedIndex());
        }
                
        // to hide after adding the new element
        dlgSetFlight.setVisible(false);
        
        // Updating the bottom label
        lblNoOfFlights.setText("Number of flights: " + modelFlightsList.getSize());
    }//GEN-LAST:event_dlgSetFlight_btAddUpdateActionPerformed
    
    public void loadFromFile() throws IllegalArgumentException
    {
        // loading info from a file
        try(Scanner fileInput = new Scanner(new File("Flights.txt"))) //try to read from file
        {
            //while there is next line, keep loading
            while(fileInput.hasNextLine())
            {
                String dataLine = fileInput.nextLine();
                
                if(!dataLine.equals("")) // To prevent error in case of empty spaces in .txt
                {
                    String[] dataToRead = dataLine.split(";"); // will split and separate by ;
                
                    String airlines = dataToRead[0];

                    int number = Integer.parseInt(dataToRead[1]);

                    String cleanWeekdaysLine = dataToRead[2].substring(1, dataToRead[2].length()-1);
                    String[] weekDayList = cleanWeekdaysLine.split(",");
                    HashSet<Weekday> weekHash = new HashSet<Weekday>();
                 
                    for(String weekdayStr : weekDayList )
                    {
                        Weekday weekday = Weekday.valueOf(weekdayStr.trim());
                        weekHash.add(weekday);
                    }

                    Date date = null;
                    try
                    {
                        date = Flight.dateFormat.parse(dataToRead[3]);
                    }
                    catch(ParseException ex)
                    {
                        throw new IllegalArgumentException("Invalid date format. Correct format: yyyy-mm-dd ");
                    }            
                
                    String city = dataToRead[4];
                
                    Flight flight1 = null;
                    try
                    {
                    
                        flight1 = new Flight(airlines, number, weekHash, date, city);  //throws IllegalArgumentException 
                    }
                    catch(IllegalArgumentException ex)
                    {
                        // getMessage in the very last one (invoking the object) 
                        throw new IllegalArgumentException (ex.getMessage());                                                         
                    } 
                
                    modelFlightsList.addElement(flight1);
                }                                
            }                                
        }// end of try
        catch (IOException ex)
        {
            //if file is not found or any problem, display error message
            JOptionPane.showMessageDialog(this,"Unable to read from file: \n" + ex.getMessage(),"fatal error - file access error: ",
                       JOptionPane.ERROR_MESSAGE);
            //since file is not found and it is a fatal error then close program
            System.exit(1);  //1 if there was a problem and 0 if there was none
        }// end of catch        
    }// end of method
    
    public void saveToFile()
    {
        // the statement HAS to be in the first line, between parentheses, to work properly.
        
        try(PrintWriter printWriter = new PrintWriter(new FileWriter (new File("Flights.txt"), false)))
        // false means that the file will be overriden. If true, it's going to append each time
        {        
            for(int i=0; i < modelFlightsList.size(); i++)
            {
                printWriter.println(modelFlightsList.getElementAt(i).toDataString());
            }
            JOptionPane.showMessageDialog(this, "Saved as 'Flights.txt'", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            catch(IOException ex)
            {
                JOptionPane.showMessageDialog(this, "Error writing to file", "Error",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // If the model isn't empty, it saves to file before exiting
        if(!modelFlightsList.isEmpty())
        {
            saveToFile();
        }                       
    }//GEN-LAST:event_formWindowClosing

    private void miSortByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSortByDateActionPerformed
        // Creates a list called date to sort it by date. Uses method created in class
        List<Flight> date = new ArrayList<>();
        for(int i = 0; i < modelFlightsList.size(); i++)
        {
            date.add(modelFlightsList.get(i));
        }
        Collections.sort(date, Flight.compareByDate);
        // clears the present list and add a new list, created with the above criteria
        modelFlightsList.clear();
        modelFlightsList.addAll(date);
    }//GEN-LAST:event_miSortByDateActionPerformed

    private void miSortByAirlinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSortByAirlinesActionPerformed
        // Creates a list called airlines to sort it alphabetically. Uses method created in class
        List<Flight> airlines = new ArrayList<>();
        for(int i = 0; i < modelFlightsList.size(); i++)
        {
            airlines.add(modelFlightsList.getElementAt(i));
        }        
        Collections.sort(airlines, Flight.compareByAirlines);
        // clears the present list and add a new list, created with the above criteria
        modelFlightsList.clear();
        modelFlightsList.addAll(airlines);
    }//GEN-LAST:event_miSortByAirlinesActionPerformed

    private void miSortByCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSortByCityActionPerformed
        // Creates a list called city to sort it alphabetically. Uses method created in class
        List<Flight> city = new ArrayList<>();
        for(int i = 0; i < modelFlightsList.size(); i++)
        {
            city.add(modelFlightsList.getElementAt(i));
        }        
        Collections.sort(city, Flight.compareByName);
        // clears the present list and add a new list, created with the above criteria
        modelFlightsList.clear();
        modelFlightsList.addAll(city);
    }//GEN-LAST:event_miSortByCityActionPerformed

    private void miSortByFLightNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSortByFLightNoActionPerformed
        // Creates a list called flightNo to sort it from smaller to greater number. 
        // Uses method created in class
        List<Flight> flightNo = new ArrayList<>();
        for(int i=0; i < modelFlightsList.size(); i++)
        {
            flightNo.add(modelFlightsList.get(i));
        }        
        Collections.sort(flightNo, Flight.compareByFlightNo);
        // clears the present list and add a new list, created with the above criteria
        modelFlightsList.clear();
        modelFlightsList.addAll(flightNo);
    }//GEN-LAST:event_miSortByFLightNoActionPerformed

    private void miClearAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miClearAllMouseClicked
        // Will ask for confirmation if user wants to delete all
        int result = JOptionPane.showConfirmDialog(this, "This will remove all elements in the list. Would you like to proceed?", "Warning",
                JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION)
        {
            // if so, remove all
            modelFlightsList.removeAllElements();
        }    
    }//GEN-LAST:event_miClearAllMouseClicked

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
            java.util.logging.Logger.getLogger(Practice17Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practice17Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practice17Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practice17Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practice17Review().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDialog dlgSetFlight;
    private javax.swing.JButton dlgSetFlight_btAddUpdate;
    private javax.swing.JButton dlgSetFlight_btCancel;
    private javax.swing.JList<Weekday> dlgSetFlight_lstWeekday;
    private javax.swing.JTextField dlgSetFlight_tfAirlines;
    private javax.swing.JTextField dlgSetFlight_tfCity;
    private javax.swing.JTextField dlgSetFlight_tfDate;
    private javax.swing.JTextField dlgSetFlight_tfFlightNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNoOfFlights;
    private javax.swing.JList<Flight> lstFlights;
    private javax.swing.JMenu miAdd;
    private javax.swing.JMenu miClearAll;
    private javax.swing.JMenu miDelete;
    private javax.swing.JMenu miSortBy;
    private javax.swing.JRadioButtonMenuItem miSortByAirlines;
    private javax.swing.JRadioButtonMenuItem miSortByCity;
    private javax.swing.JRadioButtonMenuItem miSortByDate;
    private javax.swing.JRadioButtonMenuItem miSortByFLightNo;
    private javax.swing.JMenu miUpdate;
    // End of variables declaration//GEN-END:variables
}
