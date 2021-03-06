/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentprogresstracking.classes;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.awt.Color;
import javax.swing.JOptionPane;
//import javax.swing.JOptiimport import javax.swing.JOptionPane;
//studentprogresstracking.main;
//onPane;

/**
 *
 * @author overlord_96
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    private String password,paswdcurrent;
    private long username;
    public long usrcurrent;
    
    public Login() {
        initComponents();
        jPanel2.setBackground(new Color(102,0,0,120));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        studentusername = new javax.swing.JTextField();
        studentloginbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        signupbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        studentpassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Login");
        setResizable(false);
        setSize(new java.awt.Dimension(640, 480));

        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentprogresstracking/student_login.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(290, 40, 330, 99);

        jLabel3.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USERNAME");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(230, 190, 160, 17);

        studentusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentusernameActionPerformed(evt);
            }
        });
        jPanel1.add(studentusername);
        studentusername.setBounds(410, 180, 190, 40);

        studentloginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentprogresstracking/loginButton.png"))); // NOI18N
        studentloginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentloginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentloginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(studentloginbtn);
        studentloginbtn.setBounds(470, 320, 130, 40);

        jLabel5.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PASSWORD");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(230, 250, 170, 32);

        signupbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentprogresstracking/signupbutton.png"))); // NOI18N
        signupbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });
        jPanel1.add(signupbtn);
        signupbtn.setBounds(470, 390, 130, 40);

        jLabel6.setFont(new java.awt.Font("URW Palladio L", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New User?");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(380, 400, 100, 26);
        jPanel1.add(studentpassword);
        studentpassword.setBounds(410, 250, 190, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentprogresstracking/back.jpg"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 10, 90, 50);

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));

        jLabel4.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("(Your Rollno)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(391, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(220, 160, 510, 290);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentprogresstracking/abstract_texture_by_sparxs89-d31illq.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 920, 520);

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

    private void studentusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentusernameActionPerformed

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        //this.setVisible(false);
        new SignUp().setVisible(true);
    }//GEN-LAST:event_signupbtnActionPerformed

    private void studentloginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentloginbtnActionPerformed
        try{
            username = Long.parseLong(studentusername.getText());
            password = studentpassword.getText();
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Please enter valid data","Invalid Entry",JOptionPane.ERROR_MESSAGE);
        }
        
        
        try{
            MongoClient client = new MongoClient("localhost", 27017);
            DB db = client.getDB("StudentProgressTracking");
            DBCollection student = db.getCollection("student");
            
            DBCursor cursor;
            cursor = student.find(new BasicDBObject("_id",username));
            
            for(DBObject obj:cursor){
                usrcurrent = (long)obj.get("_id");
                paswdcurrent = (String)obj.get("Password");
            }
            
            if(!password.equals(paswdcurrent)){
                JOptionPane.showMessageDialog(this,"Please check your username or password","Wrong Credentials",JOptionPane.ERROR_MESSAGE);
                studentpassword.setText("");
            }
            else{
                this.setVisible(false);
                //new StudentPage().setVisible(true);
                new StudentPage(this).setVisible(true);

            }
        }
        catch(Exception e){
            
        }
        
    }//GEN-LAST:event_studentloginbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new main().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton signupbtn;
    private javax.swing.JButton studentloginbtn;
    private javax.swing.JPasswordField studentpassword;
    private javax.swing.JTextField studentusername;
    // End of variables declaration//GEN-END:variables
}
