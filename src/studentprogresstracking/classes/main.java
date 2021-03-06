package studentprogresstracking.classes;

import studentprogresstracking.classes.Login;
import studentprogresstracking.classes.MentorLogin;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author overlord_96
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
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
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rmentor = new javax.swing.JRadioButton();
        rstudent = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentprogresstracking/icon_500x500.png_480_480_0_64000_0_1_0.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(340, 340, 100, 70);

        jLabel2.setFont(new java.awt.Font("Nimbus Roman No9 L", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STUDENT PROGRESS TRACKING SYSTEM");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 20, 810, 80);

        rmentor.setBackground(new Color(0,0,0,10));
        buttonGroup1.add(rmentor);
        rmentor.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        rmentor.setForeground(new java.awt.Color(255, 255, 255));
        rmentor.setText("MENTOR");
        rmentor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(rmentor);
        rmentor.setBounds(330, 260, 220, 50);

        rstudent.setBackground(new Color(0,0,0,5));
        buttonGroup1.add(rstudent);
        rstudent.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        rstudent.setForeground(new java.awt.Color(255, 255, 255));
        rstudent.setText("STUDENT");
        rstudent.setBorder(null);
        rstudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstudentActionPerformed(evt);
            }
        });
        jPanel1.add(rstudent);
        rstudent.setBounds(330, 200, 210, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentprogresstracking/w.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(rstudent.isSelected()){
            this.setVisible(false);
            new Login().setVisible(true);
        }
        else if(rmentor.isSelected()){
            this.setVisible(false);
            new MentorLogin().setVisible(true);
        }
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rstudentActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rmentor;
    private javax.swing.JRadioButton rstudent;
    // End of variables declaration//GEN-END:variables
}
