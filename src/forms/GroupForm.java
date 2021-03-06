/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GroupForm.java
 *
 * Created on 23-Feb-2013, 15:09:53
 */

package forms;
import application.Group;
import application.Course;
import application.Conn;
import javax.swing.DefaultListModel;
import java.util.ArrayList;

import validation.*;
/**
 *
 * @author Evilguy
 */
public class GroupForm extends javax.swing.JInternalFrame {
    private Conn newConnection = new Conn();
    DefaultListModel lstBox = new DefaultListModel();
    ArrayList<Course> courseList = new ArrayList<Course>();
    ArrayList<Group> groupList = new ArrayList<Group>();
    /** Creates new form GroupForm */
    public GroupForm() {
        initComponents();
    }


    private void eraseInfo(boolean close){
                txtCourseID.setText("");
                txtGroupID.setText("");
                txtCourseName.setText("");
                txtYear.setText("");

                if (close){
                    lstBox.removeAllElements();
                }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCourseID = new javax.swing.JTextField();
        txtGroupID = new javax.swing.JTextField();
        txtCourseName = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        lblCourseID = new javax.swing.JLabel();
        lblPPS = new javax.swing.JLabel();
        lblCourseName = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPersons = new javax.swing.JList(lstBox);
        btnNew = new javax.swing.JButton();
        btnSaveNew = new javax.swing.JButton();
        cbGroup = new javax.swing.JComboBox();
        btnSelectGroup = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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
            }
        });
        getContentPane().setLayout(null);

        txtCourseID.setEnabled(false);
        getContentPane().add(txtCourseID);
        txtCourseID.setBounds(90, 90, 80, 20);

        txtGroupID.setEnabled(false);
        getContentPane().add(txtGroupID);
        txtGroupID.setBounds(310, 90, 80, 20);

        txtCourseName.setEnabled(false);
        getContentPane().add(txtCourseName);
        txtCourseName.setBounds(90, 120, 300, 20);

        txtYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtYearKeyTyped(evt);
            }
        });
        getContentPane().add(txtYear);
        txtYear.setBounds(90, 150, 50, 20);

        lblCourseID.setText("Course ID:");
        lblCourseID.setMaximumSize(new java.awt.Dimension(30, 50));
        lblCourseID.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblCourseID);
        lblCourseID.setBounds(10, 90, 80, 20);

        lblPPS.setText("Group ID:");
        lblPPS.setMaximumSize(new java.awt.Dimension(30, 50));
        lblPPS.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblPPS);
        lblPPS.setBounds(250, 90, 60, 20);

        lblCourseName.setText("Course name:");
        lblCourseName.setMaximumSize(new java.awt.Dimension(30, 50));
        lblCourseName.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblCourseName);
        lblCourseName.setBounds(10, 120, 80, 20);

        lblYear.setText("Year:");
        lblYear.setMaximumSize(new java.awt.Dimension(30, 50));
        lblYear.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblYear);
        lblYear.setBounds(10, 150, 80, 20);

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/floppy-icon.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(110, 490, 100, 40);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close-icon.png"))); // NOI18N
        btnClose.setBorder(null);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose);
        btnClose.setBounds(470, 0, 30, 30);

        lstPersons.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPersons.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPersonsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPersons);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 170, 270, 360);

        btnNew.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-file-icon.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnNew);
        btnNew.setBounds(10, 490, 100, 40);

        btnSaveNew.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        btnSaveNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/floppy-icon.png"))); // NOI18N
        btnSaveNew.setText("Save New");
        btnSaveNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaveNew);
        btnSaveNew.setBounds(10, 490, 100, 40);

        cbGroup.setFont(new java.awt.Font("Tahoma", 0, 10));
        getContentPane().add(cbGroup);
        cbGroup.setBounds(10, 60, 380, 20);

        btnSelectGroup.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        btnSelectGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hd-search-icon.png"))); // NOI18N
        btnSelectGroup.setText("Select");
        btnSelectGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectGroupActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelectGroup);
        btnSelectGroup.setBounds(400, 50, 100, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // getting a list of all courses
        courseList = newConnection.getCourseList(STARTME.TESTING);
        cbGroup.removeAllItems();
        for (int i=0; i < courseList.size(); i++){      
            cbGroup.addItem(""+courseList.get(i).getCourseName());
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // updating group table
        if (!(txtGroupID.getText().isEmpty()) &&
                         !(txtCourseName.getText().isEmpty()) &&
                         !(txtYear.getText().isEmpty()))
                         {

                
                groupList.get(lstPersons.getSelectedIndex()).setYear(txtYear.getText());

                newConnection.saveGroup(groupList.get(lstPersons.getSelectedIndex()), STARTME.TESTING);
                this.setVisible(false);
                eraseInfo(true);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
            // close button
                this.setVisible(false);
                eraseInfo(true);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void lstPersonsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPersonsValueChanged
        // updating screen with group information
       if (!(lstPersons.isSelectionEmpty())){

            txtCourseID.setText(""+ groupList.get(lstPersons.getSelectedIndex()).getCourseID());
            txtGroupID.setText(""+ groupList.get(lstPersons.getSelectedIndex()).getGroupID());
            txtCourseName.setText(""+ groupList.get(lstPersons.getSelectedIndex()).getCourseName());
            txtYear.setText(""+ groupList.get(lstPersons.getSelectedIndex()).getYear());

         }

    }//GEN-LAST:event_lstPersonsValueChanged

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // disable several buttons and selections
        eraseInfo(false);
        btnSave.setEnabled(false);
        btnClose.setEnabled(false);
        lstPersons.setEnabled(false);
        btnSaveNew.setVisible(true);
        btnNew.setVisible(false);


    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveNewActionPerformed

        //add to object if all fields are not empty
         if (!(txtYear.getText().isEmpty())){

             groupList.add(new Group());

             groupList.get(groupList.size()-1).setYear(txtYear.getText());
             groupList.get(groupList.size()-1).setCourseID(""+courseList.get(cbGroup.getSelectedIndex()).getCourseID());
    
             lstBox.addElement(groupList.get(groupList.size()-1).getYear());

             newConnection.insertNewGroup(groupList.get(groupList.size()-1), courseList.get(cbGroup.getSelectedIndex()), STARTME.TESTING);

       
        btnSave.setEnabled(true);
        btnClose.setEnabled(true);
        lstPersons.setEnabled(true);
        btnSaveNew.setVisible(false);
        btnNew.setVisible(true);

        }
    }//GEN-LAST:event_btnSaveNewActionPerformed

    private void btnSelectGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectGroupActionPerformed
        
         
        eraseInfo(true);
        //courseList.get(cbGroup.getSelectedIndex()).getCourseID();// retuns the id of selected course
        groupList = newConnection.getCourseGroups(courseList.get(cbGroup.getSelectedIndex()).getCourseID(), STARTME.TESTING);
        
        for (int i=0; i < groupList.size(); i++){

         lstBox.addElement(groupList.get(i).getYear().toString());
        }
         
    }//GEN-LAST:event_btnSelectGroupActionPerformed

    private void txtYearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearKeyTyped
        // TODO add your handling code here:
        datavalidation.yearValidation(evt, txtYear);
    }//GEN-LAST:event_txtYearKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveNew;
    private javax.swing.JButton btnSelectGroup;
    private javax.swing.JComboBox cbGroup;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCourseID;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblPPS;
    private javax.swing.JLabel lblYear;
    private javax.swing.JList lstPersons;
    private javax.swing.JTextField txtCourseID;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtGroupID;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

}
