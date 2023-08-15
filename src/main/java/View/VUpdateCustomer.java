/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Control.CUpdateCustomer;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author DELL
 */
public class VUpdateCustomer extends javax.swing.JFrame {

    /**
     * Creates new form VUpdateCustomer
     */
    public VUpdateCustomer() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_iname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_age = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmb_gender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_tp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_nic = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        lbl_back2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Customer");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("EDIT CUSTOMER");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 310, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Customer ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        txt_id.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 225, -1));

        txt_address.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 753, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Address");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        txt_iname.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(txt_iname, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 225, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Name with Initials");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, -1, -1));

        txt_fname.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(txt_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 225, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Full Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        txt_dob.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 225, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Date od Birth");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, -1));

        txt_age.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(txt_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 225, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Age");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        cmb_gender.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cmb_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));
        cmb_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_genderActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 225, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, -1, -1));

        txt_tp.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(txt_tp, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 225, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Telephone Number");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, -1, -1));

        txt_email.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 225, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Email");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("NIC");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));
        jPanel1.add(txt_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 316, -1));

        btn_update.setBackground(new java.awt.Color(204, 0, 0));
        btn_update.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 590, 146, 40));

        btn_search.setBackground(new java.awt.Color(153, 153, 153));
        btn_search.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, -1, -1));

        btn_clear.setBackground(new java.awt.Color(153, 153, 153));
        btn_clear.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 146, 40));

        lbl_back2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_back2.setText("<< Back");
        lbl_back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_back2MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_genderActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        String id,fname,ininame,nic,gender,dob,age,address,tpno,email;

        if(txt_id.getText().equals(""))
        {   JOptionPane.showMessageDialog(null,"Please Enter UserID","Error",0);
        }
        else if(txt_fname.getText().equals(""))
        {   JOptionPane.showMessageDialog(null,"Please Fill the First Name","Error",0);
        }
        else if(txt_fname.getText().matches("[0-9]+")|| txt_iname.getText().matches("[0-9]+"))
        {   JOptionPane.showMessageDialog(null,"Full Name & Name with Initials Cannot Have Numbers","Error",0);
        }
        else if(txt_iname.getText().equals(""))
        {JOptionPane.showMessageDialog(null,"Please Fill Name with Initials","Error",0);
        }
        else if(txt_address.getText().equals(""))
        {JOptionPane.showMessageDialog(null,"Please Fill Address","Error",0);
        }
        else if(txt_nic.getText().equals(""))
        {JOptionPane.showMessageDialog(null,"Please Fill NIC","Error",0);
        }
        else if(cmb_gender.getSelectedIndex()==0)
        {JOptionPane.showMessageDialog(null,"Please Select Gender","Error",0);
        }
        else if(txt_dob.getText().equals(""))
        {JOptionPane.showMessageDialog(null,"Date of Birth Cannot be Blank","Error",0);
        }
        else if(txt_age.getText().equals("")||txt_age.getText().matches("^[a-zA-Z]*$"))
        {JOptionPane.showMessageDialog(null,"Please Check the Age Again","Error",0);
        }
        else if(!txt_email.getText().matches("^(.+)@(.+)$"))
        {JOptionPane.showMessageDialog(null,"Please Check the Email Again","Error",0);
        }
        else if(txt_tp.getText().equals("")||txt_tp.getText().matches("^[a-zA-Z]*$"))
        {JOptionPane.showMessageDialog(null,"Please Check the Telephone Number Again","Error",0);
        }
        else
        {
            id=txt_id.getText();
            fname=txt_fname.getText();
            ininame=txt_iname.getText();
            nic=txt_nic.getText();
            gender=(String)cmb_gender.getSelectedItem();
            dob=txt_dob.getText();
            age=txt_age.getText();
            address=txt_address.getText();
            tpno=txt_tp.getText();
            email=txt_email.getText();

            CUpdateCustomer c=new CUpdateCustomer();
            c.updateCusData(id,fname,ininame,nic,gender,dob,age,address,tpno,email);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        String nic=txt_nic.getText();
        if(txt_nic.getText().equals(""))
        {   JOptionPane.showMessageDialog(null,"Please Enter NIC","Error",0);
        }
        else
        {
            CUpdateCustomer b = new CUpdateCustomer();
            ResultSet rs;
            rs=b.getDetails(nic);
            try
            {   while(rs.next())
                {   txt_id.setText(rs.getString("CustomerID"));
                    txt_fname.setText(rs.getString("CFullname"));
                    txt_iname.setText(rs.getString("CInitialtName"));
                    cmb_gender.setSelectedItem(rs.getString("Gender"));
                    txt_dob.setText(rs.getString("DOB"));
                    txt_age.setText(rs.getString("Age"));
                    txt_address.setText(rs.getString("CustomerAddress"));
                    txt_tp.setText(rs.getString("TpNo"));
                    txt_email.setText(rs.getString("Email"));
                }
            }
            catch(SQLException e)
            {   JOptionPane.showMessageDialog(null,e.getMessage());
            }
            catch(Exception e)
            {   JOptionPane.showMessageDialog(null,e.getMessage());
            }
    }//GEN-LAST:event_btn_searchActionPerformed
}
    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_id.setText("");
        txt_fname.setText("");
        txt_iname.setText("");
        txt_nic.setText("");
        cmb_gender.setSelectedIndex(0);
        txt_dob.setText("");
        txt_age.setText("");
        txt_address.setText("");
        txt_tp.setText("");
        txt_email.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void lbl_back2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back2MouseClicked
        try{
            int result;
            FileReader reader1 = new FileReader("UserDetails.txt");
            while ((result=reader1.read())!=-1)
            {   String id;
                id=String.valueOf(result);
                char code=id.charAt(0);
                if(code=='6')
                {   
                    VAdminDashboard adash = new VAdminDashboard();
                    adash.show();
                    this.dispose();

                }
                else
                {
                    VStaffDashboard adash = new VStaffDashboard();
                    adash.show();
                    this.dispose();
                }
                break;
            }
        }

        catch(FileNotFoundException e)
        {	JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(IOException e)
        {	JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_lbl_back2MouseClicked

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
            java.util.logging.Logger.getLogger(VUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VUpdateCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cmb_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_back2;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_iname;
    private javax.swing.JTextField txt_nic;
    private javax.swing.JTextField txt_tp;
    // End of variables declaration//GEN-END:variables
}