/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sabha;

import java.sql.Statement;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


public class Register extends javax.swing.JFrame {

   Connection con = null;
   ResultSet rs = null;
   PreparedStatement pst = null;
   
    public Register() {
        initComponents();
        
    con = db.myCon();
    
    }

    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        txtPass1 = new javax.swing.JPasswordField();
        txtPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(590, 575));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Register");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 110, 131, 56);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("User Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 290, 124, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 360, 124, 25);
        getContentPane().add(txtUName);
        txtUName.setBounds(300, 290, 160, 30);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 460, 148, 32);

        jLabel7.setText("I have a account, login");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 480, 150, 16);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Conform Password");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(90, 400, 170, 25);
        getContentPane().add(txtPass);
        txtPass.setBounds(300, 350, 160, 30);
        getContentPane().add(txtPass1);
        txtPass1.setBounds(300, 400, 160, 30);
        getContentPane().add(txtPhone);
        txtPhone.setBounds(300, 240, 160, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Phone");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 240, 124, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 190, 124, 25);
        getContentPane().add(txtName);
        txtName.setBounds(300, 190, 160, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/registerTop.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 570, 100);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/RegisterBottom.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 520, 570, 16);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/RegisterMid.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 570, 560);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // login form show
        
        new Login().setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // register btn
        
        
        String na = txtName.getText();
        String pho = txtPhone.getText();
        String un = txtUName.getText();
        String pass = txtPass.getText();  // first password
        String pass1 = txtPass1.getText(); // conform password

        if(pass.equals(pass1)) {
        
            try {
            Statement s = db.myCon().createStatement();
            s.executeUpdate("INSERT INTO login (`Name`, `Telephone`, `User_Name`, `Password`) VALUES ('"+na+"','"+pho+"','"+un+"','"+pass+"')");
            
            JOptionPane.showMessageDialog(rootPane, "You account created");
            
            this.setVisible(false);
            new Login().setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
            
        txtName.setText("");
        txtPhone.setText("");
        txtUName.setText("");
        txtPass.setText("");
        txtPass1.setText("");
            
        }else {
        
            JOptionPane.showMessageDialog(rootPane, "Your password not matched...Please RE enter");
        }
        
        
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPass1;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUName;
    // End of variables declaration//GEN-END:variables
}
