
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aman Lahariya
 */
public class Customer_Account extends javax.swing.JFrame {

    
    public Customer_Account() {
        initComponents();
    }

    void fillCustomer()
    {
        cb_customer.removeAllItems();
        cb_customer.addItem("Select  ");
        String cname;
        try
            {
                MyFunctions mf = new MyFunctions();
                Connection cn = mf.myConnection();
                Statement stmt = cn.createStatement();
                String query = "Select * from customer order by fname";
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next())
                {   
                    cname = rs.getString("fname")+" " + rs.getString("lname");
                    cb_customer.addItem(cname);
                }
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
    }
    
    void clear()
    {
        int rows = 0;
        DefaultTableModel model_tc=(DefaultTableModel)table_credit.getModel();
        DefaultTableModel model_td=(DefaultTableModel)table_debit.getModel();
        cb_customer.setSelectedItem("Select");
        rows = model_tc.getRowCount();
        if(rows > 0)
        {
            for(int i=0; i<rows; i++)
            {
                model_tc.removeRow(0);
            }
        }
        
        rows = model_td.getRowCount();
        if(rows > 0)
        {
            for(int i=0; i<rows; i++)
            {
                model_td.removeRow(0);
            }
        }
        lbl_Title.setText("    Customer Account's Details");
        txt_Total_credit.setText("");
        txt_Total_debit.setText("");    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_debit = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_Total_debit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_credit = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_Total_credit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bt_show = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cb_customer = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Account Details");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbl_Title.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        lbl_Title.setText("    Customer Account's Details");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Debit (dr.)"));

        table_debit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Particulars", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_debit);

        jLabel1.setText("Total Amount:");

        txt_Total_debit.setEditable(false);
        txt_Total_debit.setBackground(new java.awt.Color(255, 51, 51));

        jLabel5.setText("Rs.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Total_debit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Total_debit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Credit (cr.)"));

        table_credit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Particulars", "Amount"
            }
        ));
        jScrollPane2.setViewportView(table_credit);

        jLabel2.setText("Total Amount:");

        txt_Total_credit.setEditable(false);
        txt_Total_credit.setBackground(new java.awt.Color(102, 255, 51));

        jLabel6.setText("Rs.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Total_credit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Total_credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        bt_show.setText("Show");
        bt_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_showActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Select Customer Name:");

        cb_customer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cb_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_customerActionPerformed(evt);
            }
        });

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addComponent(cb_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(bt_show, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_show)
                    .addComponent(jLabel4)
                    .addComponent(cb_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbl_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_showActionPerformed
        // TODO add your handling code here:
        clear();
        String name = cb_customer.getSelectedItem().toString();
        lbl_Title.setText(name+"'s Account Details");
        MyFunctions mf = new MyFunctions();
        int cid = mf.retreive_cid(name);
        try
        {
            // FOR CREDIT SIDE
            
            DefaultTableModel model_credit = (DefaultTableModel) table_credit.getModel();
            //SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Connection cn = mf.myConnection();
            Statement stmt1 = cn.createStatement();
            String query1 = "Select * from mortgage_entry where cid ="+cid+"";
            ResultSet rs1 = stmt1.executeQuery(query1);
            boolean noRecord1 = true;
            while(rs1.next())
            {
               noRecord1 = false;
               
               Date doe = rs1.getDate(4);
               int amount = rs1.getInt(10);
               String particulars = rs1.getString(5)+ " - " + rs1.getString(6);
               
               model_credit.addRow(new Object[]{doe,particulars,amount});
            }
           
            if(noRecord1)
            {
                JOptionPane.showMessageDialog(this,"No Record found !");
            }
           
            
            //FOR DEBIT SIDE
            
            DefaultTableModel model_debit = (DefaultTableModel) table_debit.getModel();
            Statement stmt2 = cn.createStatement();
            String query2 = "Select mid,debit_date from mortgage_exit where cid ="+cid+"";
            ResultSet rs2 = stmt2.executeQuery(query2);
            //boolean noRecord2 = true;
            while(rs2.next())
            {
               //noRecord2 = false;
               Date me_date = rs2.getDate(2);
               Statement stmt3 = cn.createStatement();
               String query3 = "Select * from mortgage_entry where mid ="+rs2.getString(1)+"";
               ResultSet rs3 = stmt3.executeQuery(query3);
               
               rs3.next();
               
                    int amount = rs3.getInt(10);                                         // MOVE THIS LINE ABOVE QUERY3 //
                    String particulars = rs3.getString(5)+ " - " + rs3.getString(6);
               
                    model_debit.addRow(new Object[]{me_date,particulars,amount});
               
               
            }
            /*if(noRecord2)
            {
                JOptionPane.showMessageDialog(this,"No Record found !");
            }*/
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
        
        //FOR CALCULATION OF TOTAL AMOUNT
        
         int tcramt = 0; int cramt;
         int tdramt = 0; int dramt;
            
             for (int rows = 0; rows < table_credit.getModel().getRowCount(); rows++) 
             {
                cramt = new Integer( table_credit.getModel().getValueAt(rows,2).toString());       
                tcramt = tcramt+cramt;
             }
             
             for (int rows = 0; rows < table_debit.getModel().getRowCount(); rows++) 
             {
                dramt = new Integer( table_debit.getModel().getValueAt(rows,2).toString());       
                tdramt = tdramt+dramt;
             }
             
             txt_Total_credit.setText(String.valueOf(tcramt));
             txt_Total_debit.setText(String.valueOf(tdramt));
    }//GEN-LAST:event_bt_showActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        fillCustomer();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_customerActionPerformed
        // TODO add your handling code here:
        clear();
        /*String name = null;
        name = cb_customer.getSelectedItem().toString();
        if(name == "Select" || name == null )
        {
            lbl_Title.setText("Customers Account Details");
        }
        else
        {
            lbl_Title.setText(cb_customer.getSelectedItem().toString()+"'s Account Details");
        }*/
    }//GEN-LAST:event_cb_customerActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_show;
    private javax.swing.JComboBox<String> cb_customer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JTable table_credit;
    private javax.swing.JTable table_debit;
    private javax.swing.JTextField txt_Total_credit;
    private javax.swing.JTextField txt_Total_debit;
    // End of variables declaration//GEN-END:variables
}
