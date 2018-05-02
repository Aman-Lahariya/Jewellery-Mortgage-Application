
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class Mortgage_Exit extends javax.swing.JFrame {

    /**
     * Creates new form Mortgage_Exit
     */
    public Mortgage_Exit() {
        initComponents();
    }

    int cid,mid;
    void fillCustomer()
    {
        cb_customer.removeAllItems();
        cb_customer.addItem("Select");
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
    
    void calculate_Interest()
    {
        try
        {
            int amt_given = 0;
            float rate , interest = 0,tamt = 0;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date receipt_date = sdf.parse(sdf.format(jDateChooser_receiptDate.getDate()));         //start date
            Date entry_date = sdf.parse(sdf.format(jDateChooser_entryDate.getDate()));           //end date
            float diff = entry_date.getTime() - receipt_date.getTime();                  //end date - start date
            float hours = diff/(60*60*1000);
            float days = hours/24;
            amt_given = Integer.parseInt(txt_amt_given.getText());
            rate = Float.parseFloat(txt_interest_rate.getText());
            interest = amt_given * (rate/100)*(days/365);
            tamt = amt_given + interest;
            txt_interest_due.setText(""+interest);
            txt_total_amt.setText(""+tamt);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    
    void clearAll()
    {
        txt_rno.setText("");
        jDateChooser_receiptDate.setDate(null);
        jDateChooser_entryDate.setDate(null);
        cb_customer.setSelectedIndex(0);
        txt_Ornament_type.setText("");
        txt_Other_info.setText("");
        txt_Purity.setText("");
        txt_Weight.setText("");
        txt_amt_given.setText("");
        txt_interest_due.setText("");
        txt_interest_rate.setText("");
        txt_jewellery_type.setText("");
        txt_total_amt.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_rno = new javax.swing.JTextField();
        jDateChooser_receiptDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        cmd_search = new javax.swing.JButton();
        cb_customer = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser_entryDate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txt_interest_due = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_jewellery_type = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_Ornament_type = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_Weight = new javax.swing.JTextField();
        txt_Purity = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_Other_info = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_amt_given = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_total_amt = new javax.swing.JTextField();
        cmd_save = new javax.swing.JButton();
        cmd_clear = new javax.swing.JButton();
        cmd_back = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txt_interest_rate = new javax.swing.JTextField();
        lbl_refresh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mortgage Exit");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        jLabel3.setText("Mortage Exit");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Record"));

        jLabel1.setText("Enter Receipt No:");

        jLabel4.setText("Customer Name:");

        jLabel2.setText("Receipt Date:");

        cmd_search.setText("Search");
        cmd_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_searchActionPerformed(evt);
            }
        });

        cb_customer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_customer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_rno, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addGap(95, 95, 95)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmd_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser_receiptDate, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jDateChooser_receiptDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cb_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cmd_search))))
                    .addComponent(txt_rno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));

        jLabel6.setText("Date of entry:");

        jDateChooser_entryDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser_entryDateMouseClicked(evt);
            }
        });

        jLabel5.setText("Interest Due:");

        txt_interest_due.setEditable(false);

        jLabel8.setText("Jewellery Type:");

        txt_jewellery_type.setEditable(false);

        jLabel9.setText("Ornament Type:");

        txt_Ornament_type.setEditable(false);

        jLabel10.setText("Weight:");

        jLabel11.setText("Purity:");

        txt_Weight.setEditable(false);

        txt_Purity.setEditable(false);

        jLabel12.setText("Other Info:");

        txt_Other_info.setEditable(false);

        jLabel13.setText("Amount Given:");

        txt_amt_given.setEditable(false);

        jLabel14.setText("Total Amount:");

        txt_total_amt.setEditable(false);

        cmd_save.setText("Save");
        cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_saveActionPerformed(evt);
            }
        });

        cmd_clear.setText("Clear");
        cmd_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_clearActionPerformed(evt);
            }
        });

        cmd_back.setText("Back");
        cmd_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_backActionPerformed(evt);
            }
        });

        jLabel15.setText("Interest Rate:");

        txt_interest_rate.setEditable(false);

        lbl_refresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_refresh.setForeground(new java.awt.Color(51, 255, 0));
        lbl_refresh.setText("Refresh");
        lbl_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_refreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(49, 49, 49)
                        .addComponent(txt_Other_info))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(cmd_save, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_Weight, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                            .addComponent(txt_jewellery_type)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_amt_given, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_interest_due, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Ornament_type)
                                    .addComponent(txt_Purity, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(cmd_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(87, 87, 87)
                                        .addComponent(cmd_back, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_interest_rate, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                        .addComponent(txt_total_amt))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(35, 35, 35)
                        .addComponent(jDateChooser_entryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_refresh)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(187, 187, 187)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_jewellery_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_Ornament_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(txt_Weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Purity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_Other_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_amt_given, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txt_interest_rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_total_amt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_interest_due, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_refresh)
                    .addComponent(jDateChooser_entryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_back)
                    .addComponent(cmd_clear)
                    .addComponent(cmd_save))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        fillCustomer();
        Date date = new Date();
        jDateChooser_receiptDate.setDate(date);
        jDateChooser_entryDate.setDate(date);
        jDateChooser_receiptDate.setMaxSelectableDate(date);
        jDateChooser_entryDate.setMaxSelectableDate(date);
    }//GEN-LAST:event_formWindowOpened

    private void cmd_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_searchActionPerformed
        // TODO add your handling code here:
        try
            {
                String name="";
                int amt_given = 0;
                float rate , interest = 0,tamt = 0;
                
                MyFunctions mf = new MyFunctions();
                Connection cn = mf.myConnection();
                Statement stmt = cn.createStatement();
                name = cb_customer.getSelectedItem().toString();
                cid = mf.retreive_cid(name);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                String receipt_date = sdf.format(jDateChooser_receiptDate.getDate());
                String query2 = "Select * from mortgage_entry where cid = "+ cid +" AND rno = '"+txt_rno.getText()+"' AND entry_date = '"+receipt_date+"' ";
                ResultSet rs2 = stmt.executeQuery(query2);
                
                Date receipt_date2 = sdf.parse(sdf.format(jDateChooser_receiptDate.getDate()));         //start date
                Date entry_date = sdf.parse(sdf.format(jDateChooser_entryDate.getDate()));           //end date
                float diff = entry_date.getTime() - receipt_date2.getTime();                 //end date - start date
                float hours = diff/(60*60*1000);
                float days = hours/24;
                if(rs2.next())
                {
                     mid = Integer.parseInt(rs2.getString("mid"));
                     txt_jewellery_type.setText(rs2.getString("jewellery_type"));
                     txt_Ornament_type.setText(rs2.getString("ornament_type"));
                     txt_Weight.setText(String.valueOf(rs2.getFloat("weight")));
                     txt_Purity.setText(String.valueOf(rs2.getFloat("purity")));
                     txt_Other_info.setText(rs2.getString("other_info"));
                     txt_interest_rate.setText(String.valueOf(rs2.getFloat("interest_rate")));
                     txt_amt_given.setText(String.valueOf(rs2.getInt("amt_given")));
                     amt_given = rs2.getInt("amt_given");
                     rate = rs2.getFloat("interest_rate");
                     interest = amt_given * (rate/100)*(days/365);
                     tamt = amt_given + interest;
                     txt_interest_due.setText(""+interest);
                     txt_total_amt.setText(""+tamt);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"No matching record found!!");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
    }//GEN-LAST:event_cmd_searchActionPerformed

    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_clearActionPerformed
        // TODO add your handling code here:
        clearAll();
    }//GEN-LAST:event_cmd_clearActionPerformed

    private void jDateChooser_entryDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser_entryDateMouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this,"Called!!");
        calculate_Interest();
    }//GEN-LAST:event_jDateChooser_entryDateMouseClicked

    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String receipt_date = sdf.format(jDateChooser_receiptDate.getDate());
         if(txt_rno.getText().equals("") || receipt_date.equals("") || cb_customer.getSelectedItem().equals("Select")  || txt_total_amt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please select/enter data in all fields !");
        }
        else
        {
            try
            {
                MyFunctions mf = new MyFunctions();
                Connection cn = mf.myConnection();
                Statement stmt = cn.createStatement();
                String entryDate = sdf.format(jDateChooser_entryDate.getDate());
                int debit_id = mf.debit_mid();
                String query = "Insert into mortgage_exit values("+debit_id+","+mid+","+cid+",'"+ entryDate +"','"+ txt_interest_due.getText() +"')";
                int r = stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(this,"Details added !");
                int cnf = JOptionPane.showConfirmDialog(this,"Do you want to clear all the fields ?","Confirm",JOptionPane.YES_NO_OPTION);
                if(cnf == 0)
                {
                  clearAll();  
                }
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
        }
    }//GEN-LAST:event_cmd_saveActionPerformed

    private void cmd_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cmd_backActionPerformed

    private void lbl_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_refreshMouseClicked
        // TODO add your handling code here:
        calculate_Interest();
    }//GEN-LAST:event_lbl_refreshMouseClicked

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
            java.util.logging.Logger.getLogger(Mortgage_Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mortgage_Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mortgage_Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mortgage_Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-        //</editor-fold>
//</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mortgage_Exit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_customer;
    private javax.swing.JButton cmd_back;
    private javax.swing.JButton cmd_clear;
    private javax.swing.JButton cmd_save;
    private javax.swing.JButton cmd_search;
    private com.toedter.calendar.JDateChooser jDateChooser_entryDate;
    private com.toedter.calendar.JDateChooser jDateChooser_receiptDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_refresh;
    private javax.swing.JTextField txt_Ornament_type;
    private javax.swing.JTextField txt_Other_info;
    private javax.swing.JTextField txt_Purity;
    private javax.swing.JTextField txt_Weight;
    private javax.swing.JTextField txt_amt_given;
    private javax.swing.JTextField txt_interest_due;
    private javax.swing.JTextField txt_interest_rate;
    private javax.swing.JTextField txt_jewellery_type;
    private javax.swing.JTextField txt_rno;
    private javax.swing.JTextField txt_total_amt;
    // End of variables declaration//GEN-END:variables
}
