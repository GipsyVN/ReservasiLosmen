package reservasilosmen;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import static reservasilosmen.koneksi.con;



/**
 *
 * @author 26072021
 */
public class f_login extends javax.swing.JFrame {
    public static String id;
    public static String nama;
    public static String pass;
    /**
     * Creates new form f_login
     */
    public f_login() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtUname.requestFocus();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jbinfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservasilosmen/images (1)_n68OISPY5j.png"))); // NOI18N
        jLabel4.setText("gambar2");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservasilosmen/images_8J4BvQNt4U.png"))); // NOI18N
        jLabel5.setText("gambar1");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Password");

        txtUname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnameKeyPressed(evt);
            }
        });

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        jbinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservasilosmen/1176_9SZlFuky2i.png"))); // NOI18N
        jbinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbinfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUname)
                                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jbinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String level = "";
        String username = txtUname.getText();
        String Pass = txtPass.getText();
                
        if(username.isEmpty() && Pass.isEmpty()){
            JOptionPane.showMessageDialog(null, "Username dan Password Tidak Boleh Kosong");
            txtUname.requestFocus();
        }else if(username.isEmpty()){
            JOptionPane.showMessageDialog(null, "Username Tidak Boleh Kosong");
            txtUname.requestFocus();
        }else if(Pass.isEmpty()){
            JOptionPane.showMessageDialog(null, "Password Tidak Boleh Kosong");
            txtPass.requestFocus();
        }else{
            try{
            koneksi.dbkoneksi();
            Statement stm = con.createStatement(); 
            String sql= "select * from login where User_Name ='" + username + "' and Password = '" + Pass + "'";
            ResultSet rs = stm.executeQuery(sql);
            if(rs.next()){
                level = rs.getString("Level");
                id = rs.getString("ID");
                nama = rs.getString("User_Name");
                pass = rs.getString("Password");
                }switch (level) {
                    case "Admin":
                        userSession.set_id(id);
                        userSession.set_Uname(nama);
                        userSession.set_pass(pass);
                        new f_admin().setVisible(true);
                        dispose();
                        break;
                    case "Resepsionis":
                        userSession.set_id(id);
                        userSession.set_Uname(nama);
                        userSession.set_pass(pass);
                        new f_resepsionis().setVisible(true);
                        dispose();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Username atau password Salah...");
                        txtUname.setText("");
                        txtPass.setText("");
                        txtUname.requestFocus();
                        break;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Login Gagal\n(" + e.getMessage() + ")");
            }   
        }
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnameKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnLoginActionPerformed(null);
        }else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            txtPass.requestFocus();
        }
    }//GEN-LAST:event_txtUnameKeyPressed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnLoginActionPerformed(null);
        }else if(evt.getKeyCode() == KeyEvent.VK_UP){
            txtUname.requestFocus();
        }else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btnLogin.requestFocus();
        }
    }//GEN-LAST:event_txtPassKeyPressed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            txtPass.requestFocus();
        }else if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnLoginActionPerformed(null);
        }
    }//GEN-LAST:event_btnLoginKeyPressed

    private void jbinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbinfoActionPerformed
        new credits().setVisible(true);
    }//GEN-LAST:event_jbinfoActionPerformed

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
            java.util.logging.Logger.getLogger(f_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbinfo;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}
