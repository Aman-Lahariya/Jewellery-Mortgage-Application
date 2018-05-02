import java.sql.*;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aman Lahariya
 */
public class Search_Mortgage_Exit extends javax.swing.JFrame {

    /**
     * Creates new form Interest_Income
     */
    public Search_Mortgage_Exit() {
        initComponents();
    }
    
    void clear()
    {
        int rows = 0;
        DefaultTableModel model_interest=(DefaultTableModel)table_Mortgage.getModel();
        rows = model_interest.getRowCount();
        if(rows > 0)
        {
            for(int i=0; i<rows; i++)
            {
                model_interest.removeRow(0);
            }
        }
        
        txt_Total_amount.setText("                  ---");
        txt_Total_interest.setText("                  ---");
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        bt_Search = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_Mortgage = new javax.swing.JTable();
        jPanel_DateRange = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel_SearchBy = new javax.swing.JPanel();
        rb_Cust_Name = new javax.swing.JRadioButton();
        rd_All = new javax.swing.JRadioButton();
        rb_Date = new javax.swing.JRadioButton();
        cb_customer = new javax.swing.JComboBox();
        lbl_Select = new javax.swing.JLabel();
        jPanel_Total = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_Total_amount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Total_interest = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search Mortgage Exit");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        jLabel3.setText("Search Mortgage Exit");

        bt_Search.setText("Search");
        bt_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SearchActionPerformed(evt);
            }
        });

        table_Mortgage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Customer Name", "Particulars", "Amount", "Interest"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_Mortgage);

        jPanel_DateRange.setBorder(javax.swing.BorderFactory.createTitledBorder("Select Date Range"));
        jPanel_DateRange.setEnabled(false);

        jLabel2.setText("From:");

        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });

        jLabel7.setText("To:");

        javax.swing.GroupLayout jPanel_DateRangeLayout = new javax.swing.GroupLayout(jPanel_DateRange);
        jPanel_DateRange.setLayout(jPanel_DateRangeLayout);
        jPanel_DateRangeLayout.setHorizontalGroup(
            jPanel_DateRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DateRangeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel_DateRangeLayout.setVerticalGroup(
            jPanel_DateRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DateRangeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_DateRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_SearchBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Record by :"));

        buttonGroup1.add(rb_Cust_Name);
        rb_Cust_Name.setText("Customer Name");
        rb_Cust_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_Cust_NameActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd_All);
        rd_All.setText("View All");
        rd_All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_AllActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_Date);
        rb_Date.setText("Date");
        rb_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_DateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_SearchByLayout = new javax.swing.GroupLayout(jPanel_SearchBy);
        jPanel_SearchBy.setLayout(jPanel_SearchByLayout);
        jPanel_SearchByLayout.setHorizontalGroup(
            jPanel_SearchByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SearchByLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rb_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(rb_Cust_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(rd_All, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_SearchByLayout.setVerticalGroup(
            jPanel_SearchByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SearchByLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_SearchByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_Cust_Name)
                    .addComponent(rd_All)
                    .addComponent(rb_Date))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        cb_customer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        cb_customer.setEnabled(false);
        cb_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_customerMouseClicked(evt);
            }
        });

        lbl_Select.setText("Select Customer Name:");

        jPanel_Total.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Amount (INR)");

        txt_Total_amount.setBackground(new java.awt.Color(204, 204, 255));
        txt_Total_amount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_Total_amount.setText("                    ---");
        txt_Total_amount.setEnabled(false);

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Interest (INR)");

        txt_Total_interest.setBackground(new java.awt.Color(153, 255, 153));
        txt_Total_interest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_Total_interest.setText("                  ---");
        txt_Total_interest.setEnabled(false);

        javax.swing.GroupLayout jPanel_TotalLayout = new javax.swing.GroupLayout(jPanel_Total);
        jPanel_Total.setLayout(jPanel_TotalLayout);
        jPanel_TotalLayout.setHorizontalGroup(
            jPanel_TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TotalLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(65, 65, 65))
            .addGroup(jPanel_TotalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txt_Total_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_Total_interest, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel_TotalLayout.setVerticalGroup(
            jPanel_TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TotalLayout.createSequentialGroup()
                .addGroup(jPanel_TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Total_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Total_interest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton1.setText("Clear");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel_DateRange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_Select, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jPanel_SearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel_Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(12, 12, 12)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(311, 311, 311))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Select)
                            .addComponent(cb_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Search))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_SearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_DateRange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(10, 10, 10))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SearchActionPerformed
        // TODO add your handling code here:
        try
        {
            clear();
            String query =null;
            MyFunctions mf = new MyFunctions();
            Connection cn = mf.myConnection();
            Statement stmt1 = cn.createStatement();
            DefaultTableModel model_debit = (DefaultTableModel) table_Mortgage.getModel();
            
            if(rb_Cust_Name.isSelected())
            {
                String name = cb_customer.getSelectedItem().toString();
                int cid = mf.retreive_cid(name);
                query = "Select mid,cid,debit_date,interest_amount from mortgage_exit where cid = '"+ cid +"'";
            }
            
            else if(rb_Date.isSelected())
            {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            
                Date start = jDateChooser1.getDate();
                Date end = jDateChooser2.getDate();
           
                String sd = sdf.format(jDateChooser1.getDate());
                String ed = sdf.format(jDateChooser2.getDate());
           
                int ans = start.compareTo(end);
                if(ans > 0)
                {
                    JOptionPane.showMessageDialog(this,"Starting date must be less than end date!\nPlease enter correct date range!");  
                    
                }
                else
                {
                    query = "Select mid,cid,debit_date,interest_amount from mortgage_exit where debit_date between '"+ sd +"' and '"+ ed +"' ";
                }  
            }
            else
            {
                query = "Select mid,cid,debit_date,interest_amount from mortgage_exit";
            }
            
            if(query!=null)
            {
                ResultSet rs1 = stmt1.executeQuery(query);
                boolean noRecord = true;
                while(rs1.next())
                {
                    noRecord = false;
                    Date me_date = rs1.getDate("debit_date");
                    int interest = rs1.getInt("interest_amount");
                    
                    //RETREIVING DETAILS FROM MORTGAGE_ENTRY
                    Statement stmt2 = cn.createStatement();
                    String query2 = "Select * from mortgage_entry where mid = "+rs1.getString("mid")+"";
                    ResultSet rs2 = stmt2.executeQuery(query2);
                    rs2.next();
                    String particulars = rs2.getString(5)+ " - " + rs2.getString(6);
                    int amount = rs2.getInt(10);                                         
                    
                    //RETREIVING CUSTOMER NAME
                    Statement stmt3 = cn.createStatement();
                    String query3 = "Select fullname from customer where cid = "+rs1.getString("cid")+"";
                    ResultSet rs3 = stmt3.executeQuery(query3);
                    rs3.next();
                    String name = rs3.getString("fullname");
                    
                    model_debit.addRow(new Object[]{me_date,name,particulars,amount,interest});
                }
                if(noRecord)
                {
                    JOptionPane.showMessageDialog(this,"No Record found !");
                }
                else
                {
                    //CALCULATION OF TOTAL
                    long tamt = 0; long amt;
                    long tinterest = 0; long interest;
                    for (int rows = 0; rows < table_Mortgage.getModel().getRowCount(); rows++) 
                    {
                        amt = new Long( table_Mortgage.getModel().getValueAt(rows,3).toString());      
                        interest = new Long( table_Mortgage.getModel().getValueAt(rows,4).toString());
                        tamt = tamt + amt;
                        tinterest = tinterest + interest;
                    }    
                    txt_Total_amount.setText(String.valueOf(tamt));
                    txt_Total_interest.setText(String.valueOf(tinterest));
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_bt_SearchActionPerformed

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        // TODO add your handling code here:
        Date ed =  jDateChooser2.getDate();
        jDateChooser1.setMaxSelectableDate(ed);
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void rb_Cust_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_Cust_NameActionPerformed
        // TODO add your handling code here:
        clear();
        cb_customer.enable(true);
        jPanel_DateRange.setEnabled(false);
        jDateChooser1.setEnabled(false);
        jDateChooser2.setEnabled(false);
        cb_customer.setSelectedIndex(0);
        cb_customer.setFocusCycleRoot(true);
        //sfield = "model_no";
       
    }//GEN-LAST:event_rb_Cust_NameActionPerformed

    private void rd_AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_AllActionPerformed
        // TODO add your handling code here:
        clear();
        jPanel_DateRange.setEnabled(false);
        jDateChooser1.setEnabled(false);
        jDateChooser2.setEnabled(false);
        cb_customer.enable(false);
        cb_customer.setSelectedIndex(0);
        bt_Search.doClick();
    }//GEN-LAST:event_rd_AllActionPerformed

    private void rb_DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_DateActionPerformed
        // TODO add your handling code here:
        jPanel_DateRange.setEnabled(true);
        jDateChooser1.setEnabled(true);
        jDateChooser2.setEnabled(true);
        cb_customer.enable(false);
        cb_customer.setSelectedIndex(0);
        clear();
    }//GEN-LAST:event_rb_DateActionPerformed

    private void cb_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_customerMouseClicked
        // TODO add your handling code here:

        // Clearing table content
        DefaultTableModel model=(DefaultTableModel)table_Mortgage.getModel();
        int rows=model.getRowCount();
        if(rows > 0)
        {
            for(int i=0; i<rows; i++)
            {
                model.removeRow(0);
            }
        }
    }//GEN-LAST:event_cb_customerMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here: 
        Date date = new Date();
        jDateChooser1.setDate(date);
        jDateChooser2.setDate(date);
        jDateChooser1.setMaxSelectableDate(date);
        jDateChooser2.setMaxSelectableDate(date);
        jDateChooser1.setEnabled(false);
        jDateChooser2.setEnabled(false);
        fillCustomer();
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Search_Mortgage_Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Mortgage_Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Mortgage_Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Mortgage_Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_Mortgage_Exit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Search;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cb_customer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel_DateRange;
    private javax.swing.JPanel jPanel_SearchBy;
    private javax.swing.JPanel jPanel_Total;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Select;
    private javax.swing.JRadioButton rb_Cust_Name;
    private javax.swing.JRadioButton rb_Date;
    private javax.swing.JRadioButton rd_All;
    private javax.swing.JTable table_Mortgage;
    private javax.swing.JTextField txt_Total_amount;
    private javax.swing.JTextField txt_Total_interest;
    // End of variables declaration//GEN-END:variables
}
