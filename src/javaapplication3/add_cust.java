/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

import dao.Config;
import dao.connection;
import java.sql.*;
import java.awt.Toolkit;
import dao.dbcon;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author lenovo
 */
public class add_cust extends javax.swing.JFrame{
    Connection con ;
    ResultSet rs;
    
    PreparedStatement pst=null;
    
connection cn = new connection();
    
    public add_cust() {
    
  try
        {
            cn.openDb();
            
        }
        catch(Exception ee)
        {
        
            System.out.println(ee);
        }
        
        this.setAlwaysOnTop(false);
        this.setResizable(false);
        this.setVisible(true);
        
        initComponents();
    
        Toolkit tk=Toolkit.getDefaultToolkit();
        int xsize=(int) tk.getScreenSize().getWidth();
        int ysize=(int) tk.getScreenSize().getHeight();
        
this.setSize(xsize, ysize);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cnametxt = new javax.swing.JTextField();
        snametxt = new javax.swing.JTextField();
        notxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        citytxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addresstxt = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Customer Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 200, 99, 27);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Shop Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 260, 99, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Address");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 320, 99, 24);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Number");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 420, 99, 24);

        cnametxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnametxtActionPerformed(evt);
            }
        });
        getContentPane().add(cnametxt);
        cnametxt.setBounds(580, 200, 140, 30);

        snametxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(snametxt);
        snametxt.setBounds(580, 260, 140, 30);

        notxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(notxt);
        notxt.setBounds(580, 420, 140, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication3/Add.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 460, 100, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication3/Reset.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(450, 460, 100, 50);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication3/Back.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(620, 460, 100, 50);

        citytxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(citytxt);
        citytxt.setBounds(580, 370, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("City");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 370, 99, 24);

        addresstxt.setColumns(20);
        addresstxt.setRows(5);
        jScrollPane1.setViewportView(addresstxt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(580, 310, 140, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication3/PicsArt_05-05-03.13.00-6830x3840-1366x768.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnametxtActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new main_frm().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cnametxt.setText(null);
        snametxt.setText(null);
        addresstxt.setText(null);
        
        citytxt.setText(null);
        notxt.setText(null);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        try {
 
            if(cnametxt.getText().equals("") || snametxt.getText().equals("") || addresstxt.getText().equals("") || citytxt.getText().equals("") || notxt.getText().equals(""))
            {
                  JOptionPane.showMessageDialog(null, "Please Fill All Details");
            }
            else
            {
                          rs=cn.selectQuery("select * from customer where shop_name='"+snametxt.getText()+"'");
            rs.first();
            String str=rs.getString("shop_name");

            if(str.equals(snametxt.getText()))
            {
                JOptionPane.showMessageDialog(null, "Shop Name Already Exist");
            }
            else
            {
                
        String s2="insert into customer(cust_name,shop_name,address,city,cnumber) values('"+cnametxt.getText()+"','"+snametxt.getText()+"','"+addresstxt.getText()+"','"+citytxt.getText()+"','"+notxt.getText()+"')";
        JOptionPane.showMessageDialog(null, "Customer Added");
        cnametxt.setText(null);
        snametxt.setText(null);
        citytxt.setText(null);
        addresstxt.setText(null);
        notxt.setText(null);
        cn.closeDb();
            }
 
            }
        } catch (SQLException ex) {
            Logger.getLogger(add_cust.class.getName()).log(Level.SEVERE, null, ex);
        
            System.out.println(ex);
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
            java.util.logging.Logger.getLogger(add_cust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_cust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_cust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_cust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_cust().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addresstxt;
    private javax.swing.JTextField citytxt;
    private javax.swing.JTextField cnametxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField notxt;
    private javax.swing.JTextField snametxt;
    // End of variables declaration//GEN-END:variables
}
