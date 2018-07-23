/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boarding.brdrsbllsys.view;

import com.boarding.brdrsbllsys.dao.BoarderDao;
import com.boarding.brdrsbllsys.dto.BoarderDto;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author student
 */
public class Bills extends javax.swing.JFrame {

    BoarderDao dao = new BoarderDao();
    List<JTextField> listOfTextFields1 = new ArrayList<JTextField>();
    List<JTextField> listOfTextFields2 = new ArrayList<JTextField>();
    double water = 0;
    double light = 0;
    int noOfBoarders = 0;

    public Bills() {
        initComponents();
        getBoarders();
        setLocationRelativeTo(null);
        setTitle("Utility Bills");
        this.setLayout(new BorderLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlList = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtWater = new javax.swing.JTextField();
        txtLight = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlList.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Water and Electricity Bills");

        jLabel2.setText("Water Bill (Rs.) : ");

        jLabel3.setText("Light Bill (Rs.) : ");

        txtWater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWaterActionPerformed(evt);
            }
        });

        txtLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtWater, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLight, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(txtWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlList, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtWaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWaterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWaterActionPerformed

    private void txtLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLightActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed

        try {
            water = Double.parseDouble(txtWater.getText());
            light = Double.parseDouble(txtLight.getText());
            int waterTotalDays = 0;
            int lightTotalDays = 0;

            waterTotalDays = calculateTotalWaterDays();
            lightTotalDays = calculateTotalLightDays();

            displayOutput(waterTotalDays,lightTotalDays);
            

        } catch (RuntimeException ex) {
            Logger.getLogger(Bills.class.getName()).log(Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(this, "Error Occured!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(Bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bills().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlList;
    private javax.swing.JTextField txtLight;
    private javax.swing.JTextField txtWater;
    // End of variables declaration//GEN-END:variables

    private void getBoarders() {
        try {
            System.out.println("getting data");
            ArrayList<BoarderDto> selectAll = dao.selectAll();
            noOfBoarders = selectAll.size();
            if (0 == selectAll.size()) {
                JOptionPane.showMessageDialog(this, "No Boarders", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("no data");
            } else {
                System.out.println("got data");
//                pnlList.removeAll();

                // Create constraints
                GridBagConstraints textFieldConstraints = new GridBagConstraints();
                GridBagConstraints textFieldConstraints2 = new GridBagConstraints();
                GridBagConstraints labelConstraints = new GridBagConstraints();

                //setting column headers to the panel
                String headers[] = {"Boarder's Name", "Days for Water-Bill", "Days for Light-Bill"};
                for (int i = 0; i < headers.length; i++) {
                    labelConstraints.gridx = i;
                    labelConstraints.gridy = 0;
                    pnlList.add(new JLabel(headers[i]), labelConstraints);
                }

                for (int i = 0; i < selectAll.size(); i++) {
                    System.out.println("iterating");
                    // Label constraints
                    labelConstraints.gridx = 0;
                    labelConstraints.gridy = i + 1;

                    // Text field constraints
                    textFieldConstraints.gridx = 1;
                    textFieldConstraints.gridy = i + 1;

                    textFieldConstraints2.gridx = 2;
                    textFieldConstraints2.gridy = i + 1;

                    JTextField txt = new JTextField();
                    txt.setName("txt" + selectAll.get(i).getName() + "_water");
                    txt.setColumns(5);
                    listOfTextFields1.add(txt);

                    JTextField txt2 = new JTextField();
                    txt2.setName("txt" + selectAll.get(i).getName() + "_light");
                    txt2.setColumns(5);
                    listOfTextFields2.add(txt2);

                    // Add labels and text fields to panel
                    pnlList.add(new JLabel(selectAll.get(i).getName()), labelConstraints);
                    pnlList.add(listOfTextFields1.get(i), textFieldConstraints);
                    pnlList.add(listOfTextFields2.get(i), textFieldConstraints2);
                    System.out.println("addded to panel");

                    // Align components top-to-bottom
                    GridBagConstraints c = new GridBagConstraints();
                    c.gridx = 0;
                    c.gridy = selectAll.size() + 1;
                    c.weighty = 1;
                    pnlList.add(new JLabel(), c);
                }

            }

        } catch (Exception ex) {
            Logger.getLogger(Bills.class.getName()).log(Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(this, "Error Occured!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void displayOutput(int waterdays,int lightdays) {
        System.out.println("display");
        JPanel newPanel = new JPanel(new GridBagLayout());
        GridBagLayout layout = (GridBagLayout) pnlList.getLayout();
        Component[] components = pnlList.getComponents();
        System.out.println("got components");
        GridBagConstraints bagConstraints = new GridBagConstraints();

        String headers[] = {"Boarder's Name", "Days-Water", "Days-Light", "Water", "Light", "Water+Light"};
        for (int i = 0; i < headers.length; i++) {
            bagConstraints.gridx = i;
            bagConstraints.gridy = 0;
            newPanel.add(new JLabel(headers[i]), bagConstraints);

        }

        System.out.println("added headings");
        GridBagConstraints textConstraints = new GridBagConstraints();
        for (int i = 0; i < noOfBoarders; i++) {
            for (Component component : components) {
                GridBagConstraints gbc = layout.getConstraints(component);
                if (gbc.gridx == 0 && gbc.gridy == i + 1) {
                    GridBagConstraints labelConstraints = new GridBagConstraints();
                    labelConstraints.gridx = 0;
                    labelConstraints.gridy = i + 1;
                    newPanel.add(component, labelConstraints);
                    System.out.println("add name label"+((JLabel)component).getText());
                }

                if (gbc.gridx == 1 && gbc.gridy == i + 1) {
                    textConstraints.gridx = 1;
                    textConstraints.gridy = i + 1;
                    newPanel.add(new JLabel(((JTextField) component).getText()), textConstraints);
                    int days = Integer.parseInt(((JTextField) component).getText().trim());
                    System.out.println("add num of days");

                    DecimalFormat df = new DecimalFormat("#.##");

                    textConstraints.gridx = 3;
                    double a=water / waterdays * days*1.0;
                    double boarderWater = Double.valueOf(df.format(a));
                    newPanel.add(new JLabel(boarderWater + ""), textConstraints);
                    continue;

                }

                if (gbc.gridx == 2 && gbc.gridy == i + 1) {
                    textConstraints.gridx = 2;
                    textConstraints.gridy = i + 1;
                    newPanel.add(new JLabel(((JTextField) component).getText()), textConstraints);
                    int days = Integer.parseInt(((JTextField) component).getText().trim());
                    System.out.println("add num of days");

                    DecimalFormat df = new DecimalFormat("#.##");
                    textConstraints.gridx = 4;
                    double b=light / lightdays * days*1.0;
                    double boarderLight = Double.valueOf(df.format(b));
                    newPanel.add(new JLabel(boarderLight + ""), textConstraints);

                }
            }

        }

        Component[] components1 = newPanel.getComponents();
        for (int i = 0; i < noOfBoarders; i++) {
            double water = 0;
            double light = 0;
            for (Component component : components1) {
                GridBagConstraints gbc = layout.getConstraints(component);
                if (gbc.gridx == 3 && gbc.gridy == i + 1) {
                    textConstraints.gridx = 3;
                    textConstraints.gridy = i + 1;

                    water = Double.parseDouble(((JTextField) component).getText().trim());
                    continue;
                }

                if (gbc.gridx == 4 && gbc.gridy == i + 1) {
                    textConstraints.gridx = 4;
                    textConstraints.gridy = i + 1;

                    light = Double.parseDouble(((JTextField) component).getText().trim());
                }
            }

            DecimalFormat df = new DecimalFormat("#.##");

            textConstraints.gridx = 5;
            
            newPanel.add(new JLabel((df.format(water + light)) + ""), textConstraints);
            System.out.println("added calculations");
        }
//        this.remove(pnlList);
//        this.remove(btnConfirm);
//        System.out.println("removed old panel and button");
//        this.add(newPanel,BorderLayout.CENTER);
//        System.out.println("assign new panel");
//        newPanel.setVisible(true);
        System.out.println("old : " + components.length);
        pnlList.removeAll();
        Component[] components2 = newPanel.getComponents();
        System.out.println("new : " + components1.length);
        layout = (GridBagLayout) newPanel.getLayout();
        for (Component component : components2) {
            GridBagConstraints gbc = layout.getConstraints(component);
            pnlList.add(component, gbc);
        }
    }

    private int calculateTotalWaterDays() {
        Component[] components = pnlList.getComponents();
        GridBagLayout layout = (GridBagLayout) pnlList.getLayout();

        int totalDays = 0;
        for (Component component : components) {
            if (component instanceof JTextField) {
                GridBagConstraints constraints = layout.getConstraints(component);
                if (constraints.gridx == 3) {
                    totalDays += Integer.parseInt(((JTextField) component).getText().trim());
                }

            }

        }
        System.out.println(totalDays);
        return totalDays;
    }

    private int calculateTotalLightDays() {
        Component[] components = pnlList.getComponents();
        GridBagLayout layout = (GridBagLayout) pnlList.getLayout();

        int totalDays = 0;
        for (Component component : components) {
            if (component instanceof JTextField) {
                GridBagConstraints constraints = layout.getConstraints(component);
                if (constraints.gridx == 4) {
                    totalDays += Integer.parseInt(((JTextField) component).getText().trim());
                }

            }

        }
        System.out.println(totalDays);
        return totalDays;
    }
}
