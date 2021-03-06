/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinesManagementSystem;

import java.beans.PropertyVetoException;

/**
 *
 * @author MD Rakibur Khan
 */
public class MainMenu
        extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        //For opening this frame in fullscreen
        setExtendedState(MAXIMIZED_BOTH);
        MainMenuHome mainMenuHome = new MainMenuHome();
         
         mainDesktopPane.add(mainMenuHome);
         mainMenuHome.setVisible(true);
         
         try {
            mainMenuHome.setMaximum(true);
         } catch (PropertyVetoException e) {
            
         }
        try {
            mainMenuHome.setSelected(true);
            
        } catch (java.beans.PropertyVetoException e) {
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

        mainDesktopPane = new javax.swing.JDesktopPane();
        journeyDetailsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        addCustomerButton = new javax.swing.JButton();
        flightDetailsButton = new javax.swing.JButton();
        paymentButton = new javax.swing.JButton();
        cancleReservationButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        javax.swing.GroupLayout mainDesktopPaneLayout = new javax.swing.GroupLayout(mainDesktopPane);
        mainDesktopPane.setLayout(mainDesktopPaneLayout);
        mainDesktopPaneLayout.setHorizontalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );
        mainDesktopPaneLayout.setVerticalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        journeyDetailsButton.setText("Journey Details");
        journeyDetailsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        journeyDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                journeyDetailsButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        addCustomerButton.setText("Add Customer");
        addCustomerButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });

        flightDetailsButton.setText("Flight Details");
        flightDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightDetailsButtonActionPerformed(evt);
            }
        });

        paymentButton.setText("Payment");
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });

        cancleReservationButton.setText("Cancle Ticket");
        cancleReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleReservationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(journeyDetailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(flightDetailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paymentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancleReservationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainDesktopPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(addCustomerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(journeyDetailsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(flightDetailsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paymentButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancleReservationButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                        .addComponent(exitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainDesktopPane)))
                .addContainerGap())
        );

        setBounds(0, 0, 703, 542);
    }// </editor-fold>//GEN-END:initComponents

    private void journeyDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_journeyDetailsButtonActionPerformed
         JourneyDetails journeyDetails = new JourneyDetails();
         mainDesktopPane.removeAll();
         mainDesktopPane.add(journeyDetails);
         journeyDetails.setVisible(true);
         
         try {
            journeyDetails.setMaximum(true);
         } catch (PropertyVetoException e) {
            
         }
        try {
            journeyDetails.setSelected(true);
            
        } catch (java.beans.PropertyVetoException e) {
        }
               
    }//GEN-LAST:event_journeyDetailsButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButtonActionPerformed
       AddCustomer addCustomer = new AddCustomer();
         mainDesktopPane.removeAll();
         mainDesktopPane.add(addCustomer);
         addCustomer.setVisible(true);
         
         try {
            addCustomer.setMaximum(true);
         } catch (PropertyVetoException e) {
            
         }
        try {
            addCustomer.setSelected(true);
            
        } catch (java.beans.PropertyVetoException e) {
        }
    }//GEN-LAST:event_addCustomerButtonActionPerformed

    private void flightDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightDetailsButtonActionPerformed
        FlightDetails flightDetails = new FlightDetails();
         mainDesktopPane.removeAll();
         mainDesktopPane.add(flightDetails);
         flightDetails.setVisible(true);
         
         try {
            flightDetails.setMaximum(true);
         } catch (PropertyVetoException e) {
            
         }
        try {
            flightDetails.setSelected(true);
            
        } catch (java.beans.PropertyVetoException e) {
        }
    }//GEN-LAST:event_flightDetailsButtonActionPerformed

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
        Payment payment = new Payment();
         mainDesktopPane.removeAll();
         mainDesktopPane.add(payment);
         payment.setVisible(true);
         
         try {
            payment.setMaximum(true);
         } catch (PropertyVetoException e) {
            
         }
        try {
            payment.setSelected(true);
            
        } catch (java.beans.PropertyVetoException e) {
        }
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void cancleReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleReservationButtonActionPerformed
        CancleTicket cancleTicket = new CancleTicket();
         mainDesktopPane.removeAll();
         mainDesktopPane.add(cancleTicket);
         cancleTicket.setVisible(true);
         
         try {
            cancleTicket.setMaximum(true);
         } catch (PropertyVetoException e) {
            
         }
        try {
            cancleTicket.setSelected(true);
            
        } catch (java.beans.PropertyVetoException e) {
        }
    }//GEN-LAST:event_cancleReservationButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JButton cancleReservationButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton flightDetailsButton;
    private javax.swing.JButton journeyDetailsButton;
    private javax.swing.JDesktopPane mainDesktopPane;
    private javax.swing.JButton paymentButton;
    // End of variables declaration//GEN-END:variables
}
