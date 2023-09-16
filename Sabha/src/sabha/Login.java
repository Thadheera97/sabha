/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sabha;

import java.sql.Connection;
import java.sql.ResultSet;        
import java.sql.PreparedStatement;     
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    
    

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public static String un;
    public static String ps;
    private String variable;
    
    public Login() {
        initComponents();
        
       
        con = db.myCon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(625, 425));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(285, 106, 92, 32);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 160, 132, 28);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(99, 204, 132, 28);
        getContentPane().add(txtUserName);
        txtUserName.setBounds(249, 156, 169, 34);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(237, 271, 190, 51);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("I haven't a Account. Register");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(390, 350, 200, 16);

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtPass);
        txtPass.setBounds(249, 202, 169, 34);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled-123.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 610, 100);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lock.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 106, 610, 280);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //login code
        
         un = txtUserName.getText();
         ps = txtPass.getText();
        
        try {
            
            String sql = " SELECT * FROM login WHERE User_Name=? AND Password=? ";
            pst = con.prepareCall(sql);
            
            pst.setString(1, un); //user Name
            pst.setString(2, ps); // password
            
            rs = pst.executeQuery();
            
            if (rs.next()){
                
                JOptionPane.showMessageDialog(rootPane, "Your login success");
                
                new Home(un).setVisible(true); //pass user name to home
                
                this.setVisible(false);
                
                
            }else {
            
                JOptionPane.showMessageDialog(rootPane, "Your login Fail");
            }
            
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
   
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // login form show

        this.setVisible(false);
        new Admin().setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

   
    public static void main(String args[]) {
       
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
