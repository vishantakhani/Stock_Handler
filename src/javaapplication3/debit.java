/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

import dao.Config;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.*;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author lenovo
 */
public class debit extends javax.swing.JFrame {
Connection con ;
    ResultSet rs;
    PreparedStatement pst;
    Statement st;
    Config c = new Config();
        dao.connection cn=new dao.connection();
    /**
     * Creates new form debit
     */
    public debit() {
    
        cn.openDb();
        
         try
        {
            Class.forName(c.driver);
             con=DriverManager.getConnection(c.url);
            
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
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        quantitytxt = new javax.swing.JTextField();
        pricetxt = new javax.swing.JTextField();
        pnametxt = new javax.swing.JTextField();
        datetxt = new javax.swing.JTextField();
        snametxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Shop Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(440, 180, 100, 32);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Date");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 260, 100, 32);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Product Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 340, 100, 32);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 420, 100, 32);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(440, 500, 100, 32);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication3/sales.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(490, 630, 100, 50);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication3/Back.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(810, 630, 100, 50);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication3/Reset.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(650, 630, 100, 50);

        quantitytxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(quantitytxt);
        quantitytxt.setBounds(640, 500, 140, 40);

        pricetxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(pricetxt);
        pricetxt.setBounds(640, 420, 140, 40);

        pnametxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(pnametxt);
        pnametxt.setBounds(640, 340, 140, 40);

        datetxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(datetxt);
        datetxt.setBounds(640, 260, 140, 40);

        snametxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(snametxt);
        snametxt.setBounds(640, 190, 140, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication3/PicsArt_05-05-03.13.00-6830x3840-1366x768.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
new main_frm().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        snametxt.setText(null);
        datetxt.setText(null);
        pnametxt.setText(null);
        pricetxt.setText(null);
        quantitytxt.setText(null);
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     
        try {
         if(snametxt.getText().equals("") || pnametxt.getText().equals("") || pricetxt.getText().equals("") || quantitytxt.getText().equals("") || datetxt.getText().equals(""))
         {
               JOptionPane.showMessageDialog(null, "Please Fill All Detail");
         }
         else
         {
             
             rs=cn.selectQuery("select * from stock where product_name='"+pnametxt.getText()+"'");
             int qun=0;
             rs.first();
             qun=rs.getInt("quantity");
             int sale=Integer.parseInt(quantitytxt.getText());
           
             if(sale <= qun)
               {
                    
                          int price=Integer.parseInt(pricetxt.getText());
                          int total=price*sale;         
                           int newquan=qun-sale;
            rs=cn.selectQuery("select * from balanceheet where shop_name='"+snametxt.getText()+"'");
           rs.first();
           int oldamount=0;
           oldamount=rs.getInt("amount");
           int newamount=oldamount+total;
       
           
                 String s2="insert into sales(shop_name,product_name,price,quantity,total,s_date) values('"+snametxt.getText()+"','"+pnametxt.getText()+"',"+Integer.parseInt(pricetxt.getText())+","+Integer.parseInt(quantitytxt.getText())+",'"+Integer.toString(total)+"','"+datetxt.getText()+"'); update stock set quantity="+newquan+" where product_name='"+pnametxt.getText()+"'; update balanceheet set amount="+newamount+" where shop_name='"+snametxt.getText()+"'";
      String n= cn.exMyQuery(s2);
       
    
                      JOptionPane.showMessageDialog(null, "Successfully Sale");
               
                           
                cn.closeDb();
                  }
                 else
                 {
                 JOptionPane.showMessageDialog(null,"Stock Is Not Available");
                 
                snametxt.setText(null);
                datetxt.setText(null);
                     pnametxt.setText(null);
                        pricetxt.setText(null);
                            quantitytxt.setText(null);    
                 }
         }

                      
            
             } catch (Exception e) {
        }
        
          
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new debit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField datetxt;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField pnametxt;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTextField quantitytxt;
    private javax.swing.JTextField snametxt;
    // End of variables declaration//GEN-END:variables
}
