/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UserLogin.java
 *
 * Created on 25-Feb-2013, 15:18:10
 */

package forms;
import application.Conn;
import application.Tutor;
/**
 *
 * @author Evilguy
 */
public class UserLogin extends javax.swing.JInternalFrame {
    private Tutor user = new Tutor();
    private Conn newConnection = new Conn();
    
    /** Creates new form UserLogin */
    public UserLogin() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogin = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtWelcome = new javax.swing.JTextPane();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        setMinimumSize(new java.awt.Dimension(280, 130));
        setPreferredSize(new java.awt.Dimension(280, 130));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLogin.setText("Login:");
        getContentPane().add(lblLogin);
        lblLogin.setBounds(10, 10, 80, 20);

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password:");
        getContentPane().add(lblPassword);
        lblPassword.setBounds(10, 40, 80, 20);
        getContentPane().add(txtLogin);
        txtLogin.setBounds(90, 10, 110, 20);

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        getContentPane().add(txtPass);
        txtPass.setBounds(90, 40, 111, 20);

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(10, 70, 90, 30);

        btnLogOut.setText("Log out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut);
        btnLogOut.setBounds(10, 70, 90, 30);

        txtWelcome.setEditable(false);
        jScrollPane1.setViewportView(txtWelcome);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 270, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Tries to login into system, by looking for login and password in teacher table

        if (!(txtLogin.getText().isEmpty()) && !(txtPass.getText().isEmpty())) {
            
            user = newConnection.getUser(txtLogin.getText(), txtPass.getText(),STARTME.TESTING);
            
            if (user.getbdId()>0){
                txtLogin.setVisible(false);
                lblLogin.setVisible(false);
                lblPassword.setVisible(false);
                txtPass.setVisible(false);
                btnLogin.setVisible(false);

                btnLogOut.setVisible(true);
                
                txtWelcome.setVisible(true);
                txtWelcome.setText("Welcome, " + user.getFirstName() +
                        " " + user.getLastName() +
                        " .\nYou are now authorized to GTI Exam Entry System");

                        if (user.getAdmin()){
                            
                            STARTME.AM.setVisible(true);
                        } else if (!user.getAdmin()){
                           
                            STARTME.UM.setVisible(true);
                        }
                STARTME.glUser = user;
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // Logout method, closes all forms
        txtLogin.setText("");
        txtPass.setText("");
        btnLogOut.setVisible(false);
        btnLogin.setVisible(true);
        txtWelcome.setVisible(false);


        if (STARTME.UM.isVisible()){STARTME.UM.setVisible(false);}
        if (STARTME.AM.isVisible()){STARTME.AM.setVisible(false);}

        if (STARTME.PD.isVisible()){STARTME.PD.setVisible(false);}
        if (STARTME.PDL.isVisible()){STARTME.PDL.setVisible(false);}
        if (STARTME.SDL.isVisible()){STARTME.SDL.setVisible(false);}
        if (STARTME.GF.isVisible()){STARTME.GF.setVisible(false);}
        if (STARTME.TGM.isVisible()){STARTME.TGM.setVisible(false);}
        if (STARTME.CF.isVisible()){STARTME.CF.setVisible(false);}
        if (STARTME.MF.isVisible()){STARTME.MF.setVisible(false);}
        if (STARTME.SEF.isVisible()){STARTME.SEF.setVisible(false);}
        if (STARTME.SR.isVisible()){STARTME.SR.setVisible(false);}
        if (STARTME.STG.isVisible()){STARTME.STG.setVisible(false);}
        if (STARTME.SRFT.isVisible()){STARTME.SRFT.setVisible(false);}
        

       

        txtLogin.setVisible(true);
        lblLogin.setVisible(true);
        lblPassword.setVisible(true);
        txtPass.setVisible(true);  
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // On form loading action
        btnLogOut.setVisible(false);
        txtWelcome.setVisible(false);
       
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // Does a quick login by pressing enter in password field
        btnLogin.doClick();
    }//GEN-LAST:event_txtPassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnLogin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextPane txtWelcome;
    // End of variables declaration//GEN-END:variables

}
