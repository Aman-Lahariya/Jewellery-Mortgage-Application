import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aman Lahariya
 */
public class Home_Screen extends javax.swing.JFrame {

    /**
     * Creates new form Home_Screen
     */
    public Home_Screen() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        sm_Add = new javax.swing.JMenuItem();
        sm_Edit = new javax.swing.JMenuItem();
        sm_Search = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        sm_Entry = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        sm_Exit = new javax.swing.JMenuItem();
        sm_search_exit = new javax.swing.JMenuItem();
        mReport = new javax.swing.JMenu();
        sm_cust_ac_details = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mUser = new javax.swing.JMenu();
        sm_AddUser = new javax.swing.JMenuItem();
        sm_RemoveUser = new javax.swing.JMenuItem();
        sm_ChangePassword = new javax.swing.JMenuItem();
        sm_ViewUser = new javax.swing.JMenuItem();
        sm_Backup = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        sm_restore = new javax.swing.JMenuItem();
        mLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome To KMK Jewellers");
        setName("Home Screen Frame"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gold-necklaces-set-for-woman-jewellery-wallpapers final.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jMenu1.setForeground(new java.awt.Color(255, 0, 0));
        jMenu1.setText("Customer");
        jMenu1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        sm_Add.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        sm_Add.setText("Add Details");
        sm_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_AddActionPerformed(evt);
            }
        });
        jMenu1.add(sm_Add);

        sm_Edit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        sm_Edit.setText("Edit Details");
        sm_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_EditActionPerformed(evt);
            }
        });
        jMenu1.add(sm_Edit);

        sm_Search.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        sm_Search.setText("Search Details");
        sm_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_SearchActionPerformed(evt);
            }
        });
        jMenu1.add(sm_Search);

        jMenuBar1.add(jMenu1);

        jMenu4.setForeground(new java.awt.Color(255, 0, 0));
        jMenu4.setText("Mortgage");
        jMenu4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jMenu2.setText("Inward (Entry)");

        sm_Entry.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        sm_Entry.setText("Add Details");
        sm_Entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_EntryActionPerformed(evt);
            }
        });
        jMenu2.add(sm_Entry);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Search Details");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenu4.add(jMenu2);

        jMenu6.setText("Outward (Exit)");

        sm_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        sm_Exit.setText("Add Details");
        sm_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_ExitActionPerformed(evt);
            }
        });
        jMenu6.add(sm_Exit);

        sm_search_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        sm_search_exit.setText("Search Details");
        sm_search_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_search_exitActionPerformed(evt);
            }
        });
        jMenu6.add(sm_search_exit);

        jMenu4.add(jMenu6);

        jMenuBar1.add(jMenu4);

        mReport.setForeground(new java.awt.Color(255, 0, 0));
        mReport.setText("Report");
        mReport.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        sm_cust_ac_details.setText("Customer Account Details");
        sm_cust_ac_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_cust_ac_detailsActionPerformed(evt);
            }
        });
        mReport.add(sm_cust_ac_details);

        jMenuItem2.setText("Customer Interest Details");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mReport.add(jMenuItem2);

        jMenuBar1.add(mReport);

        mUser.setForeground(new java.awt.Color(255, 0, 0));
        mUser.setText("User");
        mUser.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        sm_AddUser.setText("Add User");
        sm_AddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_AddUserActionPerformed(evt);
            }
        });
        mUser.add(sm_AddUser);

        sm_RemoveUser.setText("Remove User");
        sm_RemoveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_RemoveUserActionPerformed(evt);
            }
        });
        mUser.add(sm_RemoveUser);

        sm_ChangePassword.setText("Change Password");
        sm_ChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_ChangePasswordActionPerformed(evt);
            }
        });
        mUser.add(sm_ChangePassword);

        sm_ViewUser.setText("View User Details");
        sm_ViewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_ViewUserActionPerformed(evt);
            }
        });
        mUser.add(sm_ViewUser);

        jMenuBar1.add(mUser);

        sm_Backup.setForeground(new java.awt.Color(255, 0, 0));
        sm_Backup.setText("Database");
        sm_Backup.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jMenuItem1.setText("Backup");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        sm_Backup.add(jMenuItem1);

        sm_restore.setText("Restore");
        sm_restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_restoreActionPerformed(evt);
            }
        });
        sm_Backup.add(sm_restore);

        jMenuBar1.add(sm_Backup);

        mLogout.setBackground(new java.awt.Color(0, 0, 0));
        mLogout.setForeground(new java.awt.Color(255, 0, 0));
        mLogout.setText("Logout ");
        mLogout.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        mLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mLogoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(mLogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1430, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sm_AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_AddUserActionPerformed
        // TODO add your handling code here:
        Add_User au = new Add_User();
        au.show();
    }//GEN-LAST:event_sm_AddUserActionPerformed

    private void sm_RemoveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_RemoveUserActionPerformed
        // TODO add your handling code here:
        Remove_User ru = new Remove_User();
        ru.show();
    }//GEN-LAST:event_sm_RemoveUserActionPerformed

    private void sm_ChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_ChangePasswordActionPerformed
        // TODO add your handling code here:
        Change_Password cp = new Change_Password();
        cp.show();
    }//GEN-LAST:event_sm_ChangePasswordActionPerformed

    private void sm_ViewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_ViewUserActionPerformed
        // TODO add your handling code here:
        View_UserDetails vud = new View_UserDetails();
        vud.show();
    }//GEN-LAST:event_sm_ViewUserActionPerformed

    private void mLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mLogoutMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"You are now logged out ....");
        System.exit(0);
    }//GEN-LAST:event_mLogoutMouseClicked

    private void sm_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_AddActionPerformed
        // TODO add your handling code here:
        Add_Customer ac = new Add_Customer();
        ac.show();
    }//GEN-LAST:event_sm_AddActionPerformed

    private void sm_EntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_EntryActionPerformed
        // TODO add your handling code here:
        Mortgage_Entry entry = new Mortgage_Entry();
        entry.show();
    }//GEN-LAST:event_sm_EntryActionPerformed

    private void sm_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_ExitActionPerformed
        // TODO add your handling code here:
        Mortgage_Exit exit = new Mortgage_Exit();
        exit.show();
    }//GEN-LAST:event_sm_ExitActionPerformed

    private void sm_cust_ac_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_cust_ac_detailsActionPerformed
        // TODO add your handling code here:
        Customer_Account ca = new Customer_Account();
        ca.show();
    }//GEN-LAST:event_sm_cust_ac_detailsActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Customer_Interest ci = new Customer_Interest();
        ci.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Backup b = new Backup();
        b.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void sm_restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_restoreActionPerformed
        // TODO add your handling code here:
        Restore r = new Restore();
        r.show();
    }//GEN-LAST:event_sm_restoreActionPerformed

    private void sm_search_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_search_exitActionPerformed
        // TODO add your handling code here:
        Search_Mortgage_Exit smex = new Search_Mortgage_Exit();
        smex.show();
    }//GEN-LAST:event_sm_search_exitActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Search_Mortgage_Entry smen = new Search_Mortgage_Entry();
        smen.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void sm_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_EditActionPerformed
        // TODO add your handling code here:
        Edit_Customer ec = new Edit_Customer();
        ec.show();
    }//GEN-LAST:event_sm_EditActionPerformed

    private void sm_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_SearchActionPerformed
        // TODO add your handling code here:
        Search_Customer sc = new Search_Customer();
        sc.show();
    }//GEN-LAST:event_sm_SearchActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setExtendedState(Home_Screen.MAXIMIZED_BOTH);
        
        //lbl_Welcome.setText("Welcome Mr. " + Login.user);
        
        String utype = Login.utype;
        if(utype.equals("Employee"))
        {
            mUser.setVisible(false);
            sm_restore.setVisible(false);
            mReport.setVisible(false);
        }
    }//GEN-LAST:event_formWindowOpened

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu mLogout;
    private javax.swing.JMenu mReport;
    private javax.swing.JMenu mUser;
    private javax.swing.JMenuItem sm_Add;
    private javax.swing.JMenuItem sm_AddUser;
    private javax.swing.JMenu sm_Backup;
    private javax.swing.JMenuItem sm_ChangePassword;
    private javax.swing.JMenuItem sm_Edit;
    private javax.swing.JMenuItem sm_Entry;
    private javax.swing.JMenuItem sm_Exit;
    private javax.swing.JMenuItem sm_RemoveUser;
    private javax.swing.JMenuItem sm_Search;
    private javax.swing.JMenuItem sm_ViewUser;
    private javax.swing.JMenuItem sm_cust_ac_details;
    private javax.swing.JMenuItem sm_restore;
    private javax.swing.JMenuItem sm_search_exit;
    // End of variables declaration//GEN-END:variables
}
