
package projectmedidemo1;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author shati
 */
public class UserInfoUpdate extends javax.swing.JFrame {
    private ResultSet rs;

    /**
     * Creates new form UserInfo
     */
    public void passUserName(String name)
        {
        jLabelUN.setText(name);
        
        try
            {
            DBConnectUserInfo DBC = new DBConnectUserInfo();
            ResultSet rs=DBC.getResultSet(name);
            //System.out.println(rs);
            while(rs.next())
                {
                String uName=rs.getString("name");
                String uAge=rs.getString("age");
                String uGender=rs.getString("gender");
                String uBloodGroup=rs.getString("bloodgroup");
                jTextFieldUserAge.setText(uAge);
                if(uGender.equals("Male"))
                    {
                    jRadioButtonMale.setSelected(true);
                    }
                else 
                    {
                    jRadioButtonFemale.setSelected(true);
                    }
                jTextFieldBloodGroup.setText(uBloodGroup);                                             
                }
            }
            catch(Exception e)
                    {
                System.out.println("Error:" +e);
                e.printStackTrace();                    
                    }
        
        
        
        
        }
    public UserInfoUpdate() {
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

        buttonGroupGender = new javax.swing.ButtonGroup();
        jLabelName = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelBG = new javax.swing.JLabel();
        jTextFieldUserAge = new javax.swing.JTextField();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jButtonUserInfoUpdate = new javax.swing.JButton();
        jTextFieldBloodGroup = new javax.swing.JTextField();
        jLabelUN = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelName.setText("Name:");

        jLabelAge.setText("Age:");

        jLabelGender.setText("Gender:");

        jLabelBG.setText("Blood Group:");

        buttonGroupGender.add(jRadioButtonMale);
        jRadioButtonMale.setText("Male");

        buttonGroupGender.add(jRadioButtonFemale);
        jRadioButtonFemale.setText("Female");

        jButtonUserInfoUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/update_1.png"))); // NOI18N
        jButtonUserInfoUpdate.setText("Update");
        jButtonUserInfoUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUserInfoUpdateActionPerformed(evt);
            }
        });

        jTextFieldBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBloodGroupActionPerformed(evt);
            }
        });

        jLabelUN.setText("User Name");

        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelBG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonUserInfoUpdate)
                            .addGap(112, 112, 112)
                            .addComponent(jButtonBack)
                            .addGap(14, 14, 14))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelName)
                                .addComponent(jLabelAge)
                                .addComponent(jLabelGender))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButtonMale)
                                    .addGap(32, 32, 32)
                                    .addComponent(jRadioButtonFemale))
                                .addComponent(jTextFieldUserAge, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                .addComponent(jLabelUN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelName)
                    .addComponent(jLabelUN, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAge)
                    .addComponent(jTextFieldUserAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGender)
                    .addComponent(jRadioButtonMale)
                    .addComponent(jRadioButtonFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBG)
                    .addComponent(jTextFieldBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUserInfoUpdate)
                    .addComponent(jButtonBack))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUserInfoUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserInfoUpdateActionPerformed
        // TODO add your handling code here:
        ArrayList uInfo = new ArrayList();
        uInfo.add(jLabelUN.getText());
        uInfo.add(jTextFieldUserAge.getText());
        if(jRadioButtonMale.isSelected())
            {
            uInfo.add("Male");
            }
        else if(jRadioButtonFemale.isSelected())
            {
            uInfo.add("Female");
            }
        uInfo.add(jTextFieldBloodGroup.getText());        
        DBConnectUserInfo db = new DBConnectUserInfo();
        db.updateDB(uInfo);
        FirstInfoFrame FI = new FirstInfoFrame();
        FI.setVisible(true);
        FI.loadDoClick();
        dispose();
    }//GEN-LAST:event_jButtonUserInfoUpdateActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        FirstInfoFrame F = new FirstInfoFrame();
        F.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTextFieldBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBloodGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBloodGroupActionPerformed

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
            java.util.logging.Logger.getLogger(UserInfoUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInfoUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInfoUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInfoUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInfoUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonUserInfoUpdate;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelBG;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelUN;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JTextField jTextFieldBloodGroup;
    private javax.swing.JTextField jTextFieldUserAge;
    // End of variables declaration//GEN-END:variables
}
