/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminalmini;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Priyang
 */
public class Useraccountdetails extends javax.swing.JFrame {
     Connection cn;
    Statement st;
    ResultSet rs;
    String pc,uc;
    public Useraccountdetails() {
        initComponents();
        this.setLocationRelativeTo(null);
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/criminalmini?zeroDateTimeBehavior=convertToNull","root","");
            st=(Statement)cn.createStatement();
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, "Not Connected"); 
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userdetails = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstnametext = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        middlenametext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lastnametext = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        aadharnotext = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        phonenotext = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        uoffidtext = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        thanenametext = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        postcombo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adresstext = new javax.swing.JTextArea();
        accountdetails = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        usernametext = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rolecombo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        passwordtext = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        logoutb = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(214, 69, 65));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/criminalmini/criminalminipic1.png"))); // NOI18N
        jLabel1.setText("Mumbai Police Criminal Database");

        userdetails.setBackground(new java.awt.Color(31, 58, 147));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(214, 69, 65));
        jLabel2.setText("User Details");

        jLabel3.setForeground(new java.awt.Color(214, 69, 65));
        jLabel3.setText("First Name*");

        firstnametext.setBackground(new java.awt.Color(232, 236, 241));
        firstnametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnametextActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(214, 69, 65));
        jLabel4.setText("Middle Name");

        middlenametext.setBackground(new java.awt.Color(232, 236, 241));

        jLabel5.setForeground(new java.awt.Color(214, 69, 65));
        jLabel5.setText("Last Name");

        lastnametext.setBackground(new java.awt.Color(232, 236, 241));

        jLabel6.setForeground(new java.awt.Color(214, 69, 65));
        jLabel6.setText("Aaadhar No.*");

        aadharnotext.setBackground(new java.awt.Color(232, 236, 241));

        jLabel7.setForeground(new java.awt.Color(214, 69, 65));
        jLabel7.setText("Phone no.");

        phonenotext.setBackground(new java.awt.Color(232, 236, 241));

        jLabel8.setForeground(new java.awt.Color(214, 69, 65));
        jLabel8.setText("Officer ID*");

        uoffidtext.setBackground(new java.awt.Color(232, 236, 241));

        jLabel9.setForeground(new java.awt.Color(214, 69, 65));
        jLabel9.setText("Thane Name*");

        thanenametext.setBackground(new java.awt.Color(232, 236, 241));

        jLabel10.setForeground(new java.awt.Color(214, 69, 65));
        jLabel10.setText("Post*");
        jLabel10.setToolTipText("");

        postcombo.setBackground(new java.awt.Color(232, 236, 241));
        postcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Constable", "Inspector", "Sub-Inspector", "Assistant Sub-Inspector", "Superitendant of Police", "Additional Police Commissioner", "Assistant Commissioner", "Commissioner", "Deputy Commisiioner", "Director General" }));
        postcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postcomboActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(214, 69, 65));
        jLabel11.setText("Address");

        adresstext.setBackground(new java.awt.Color(232, 236, 241));
        adresstext.setColumns(20);
        adresstext.setRows(5);
        jScrollPane1.setViewportView(adresstext);

        javax.swing.GroupLayout userdetailsLayout = new javax.swing.GroupLayout(userdetails);
        userdetails.setLayout(userdetailsLayout);
        userdetailsLayout.setHorizontalGroup(
            userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userdetailsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(userdetailsLayout.createSequentialGroup()
                        .addGroup(userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(middlenametext)
                            .addComponent(lastnametext)
                            .addComponent(firstnametext)
                            .addComponent(aadharnotext)
                            .addComponent(phonenotext)
                            .addComponent(uoffidtext)
                            .addComponent(thanenametext)
                            .addComponent(postcombo, 0, 256, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        userdetailsLayout.setVerticalGroup(
            userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userdetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstnametext)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(middlenametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastnametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userdetailsLayout.createSequentialGroup()
                        .addComponent(aadharnotext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phonenotext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userdetailsLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(uoffidtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(thanenametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(postcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        firstnametext.getAccessibleContext().setAccessibleName("firstnametext");
        middlenametext.getAccessibleContext().setAccessibleName("middlenametext");
        lastnametext.getAccessibleContext().setAccessibleName("lastnametext");
        aadharnotext.getAccessibleContext().setAccessibleName("aadharnotext");

        accountdetails.setBackground(new java.awt.Color(31, 58, 147));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(214, 69, 65));
        jLabel12.setText("Account Details");

        jLabel13.setForeground(new java.awt.Color(214, 69, 65));
        jLabel13.setText("Username*");

        usernametext.setBackground(new java.awt.Color(232, 236, 241));

        jLabel14.setForeground(new java.awt.Color(214, 69, 65));
        jLabel14.setText("User Role*");

        rolecombo.setBackground(new java.awt.Color(232, 236, 241));
        rolecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low Level Officer", "High Level Officer ", "Admin Level Officer" }));
        rolecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolecomboActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(214, 69, 65));
        jLabel15.setText("Password*");

        passwordtext.setBackground(new java.awt.Color(232, 236, 241));

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accountdetailsLayout = new javax.swing.GroupLayout(accountdetails);
        accountdetails.setLayout(accountdetailsLayout);
        accountdetailsLayout.setHorizontalGroup(
            accountdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountdetailsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(accountdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(accountdetailsLayout.createSequentialGroup()
                        .addGroup(accountdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(accountdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submit)
                            .addGroup(accountdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usernametext)
                                .addComponent(rolecombo, 0, 256, Short.MAX_VALUE)
                                .addComponent(passwordtext)))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        accountdetailsLayout.setVerticalGroup(
            accountdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountdetailsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(accountdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(usernametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accountdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(rolecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accountdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(passwordtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("X");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        logoutb.setText("Logout");
        logoutb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("~");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(accountdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logoutb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutb)
                    .addComponent(jButton3))
                .addGap(33, 33, 33)
                .addComponent(accountdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstnametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnametextActionPerformed

    private void postcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postcomboActionPerformed
        pc=postcombo.getSelectedItem().toString();
        System.out.println(pc);        // TODO add your handling code here:
    }//GEN-LAST:event_postcomboActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        System.exit(0);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Operationpage o=new Operationpage(); 
        o.setVisible(true);    
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       String fname,lname,mname,offid,thanename,post,address,username,userrole,password,aadhar,phone,mpassword;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/criminalmini?zeroDateTimeBehavior=convertToNull","root","");
            Statement st =(Statement) con.createStatement();
             password=passwordtext.getText();
            if(firstnametext.equals("") ||pc.equals("")||uc.equals("")||aadharnotext.equals("")|| uoffidtext.equals("")|| thanenametext.equals("") || usernametext.equals("")||passwordtext.equals("")) {
              JOptionPane.showMessageDialog(null,"Necessary Details Incomplete");                  
           }
            else if(password.length()<5)
            {
                JOptionPane.showMessageDialog(null,"Password needs to be atleast 5 characters"); 
            }
            else {
                String sal;
                fname=firstnametext.getText();
                mname=middlenametext.getText();
                lname=lastnametext.getText();
                aadhar=aadharnotext.getText();
                phone=phonenotext.getText();
                offid=uoffidtext.getText();
                thanename=thanenametext.getText();
                post=pc;
                address=adresstext.getText();
                username=usernametext.getText();
                userrole=uc;
               password=passwordtext.getText();
               MD5 m=new MD5();
               mpassword=m.getMd5(password);
sal="INSERT INTO useraccountdetails(First_name, Middle_name, Last_name,Aadhar_no,Phone_no,Officer_id,Thane_name,post,address,username,password,user_role) VALUES ('"+fname+"','"+mname+"','"+lname+"','"+aadhar+"','"+phone+"','"+offid+"','"+thanename+"','"+post+"','"+address+"','"+username+"','"+mpassword+"','"+userrole+"')";
                st.executeUpdate(sal);
                JOptionPane.showMessageDialog(null,"Account Creation Successful");
                st.close();
                con.close();
            }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
    }//GEN-LAST:event_submitActionPerformed

    private void rolecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolecomboActionPerformed
        uc=rolecombo.getSelectedItem().toString();  
        System.out.println(uc);// TODO add your handling code here:
    }//GEN-LAST:event_rolecomboActionPerformed

    private void logoutbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbActionPerformed
        Login l=new Login();
        l.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_logoutbActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setState(JFrame.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(Useraccountdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Useraccountdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Useraccountdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Useraccountdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Useraccountdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadharnotext;
    private javax.swing.JPanel accountdetails;
    private javax.swing.JTextArea adresstext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField firstnametext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastnametext;
    private javax.swing.JButton logoutb;
    private javax.swing.JTextField middlenametext;
    private javax.swing.JPasswordField passwordtext;
    private javax.swing.JTextField phonenotext;
    private javax.swing.JComboBox<String> postcombo;
    private javax.swing.JComboBox<String> rolecombo;
    private javax.swing.JButton submit;
    private javax.swing.JTextField thanenametext;
    private javax.swing.JTextField uoffidtext;
    private javax.swing.JPanel userdetails;
    private javax.swing.JTextField usernametext;
    // End of variables declaration//GEN-END:variables
}
