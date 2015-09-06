/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TeachersGroupModules.java
 *
 * Created on 28-Feb-2013, 15:10:53
 */

package forms;
import application.Group;
import application.Subjects;
import application.Tutor;
import application.Conn;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import validation.*;


/**
 *
 * @author Evilguy
 */
public class TeachersGroupModules extends javax.swing.JInternalFrame {
    private Conn newConnection = new Conn();
    DefaultListModel lstBox = new DefaultListModel();
    ArrayList<Tutor> tutorList = new ArrayList<Tutor>();
    /** Creates new form TeachersGroupModules */
    public TeachersGroupModules() {
        initComponents();
    }


    private void eraseInfo(boolean cbBox,boolean listBox){
           //method that cleans boxes in this form
                txtGroupID.setText("");
                txtCourseID.setText("");
                txtYear.setText("");
                txtCourseName.setText("");
                txtSubjectID.setText("");
                txtSubjectName.setText("");
                
                


                if (listBox){
                    lstBox.removeAllElements();
                }
                
                if (cbBox){
                    cbTutor.removeAllItems();
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

        txtSubjectID = new javax.swing.JTextField();
        txtGroupID = new javax.swing.JTextField();
        txtCourseName = new javax.swing.JTextField();
        lblSubjectID = new javax.swing.JLabel();
        lblGroup = new javax.swing.JLabel();
        lblCourseName = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPersons = new javax.swing.JList(lstBox);
        btnNew = new javax.swing.JButton();
        btnSaveNew = new javax.swing.JButton();
        cbTutor = new javax.swing.JComboBox();
        btnSelectGroup = new javax.swing.JButton();
        lblTutor = new javax.swing.JLabel();
        txtCourseID = new javax.swing.JTextField();
        lblCourseID = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        txtSubjectName = new javax.swing.JTextField();
        lblSubjectName = new javax.swing.JLabel();
        cbGroup = new javax.swing.JComboBox();
        cbSubject = new javax.swing.JComboBox();

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

        txtSubjectID.setEnabled(false);
        getContentPane().add(txtSubjectID);
        txtSubjectID.setBounds(380, 150, 70, 20);

        txtGroupID.setEnabled(false);
        getContentPane().add(txtGroupID);
        txtGroupID.setBounds(80, 150, 70, 20);

        txtCourseName.setEnabled(false);
        getContentPane().add(txtCourseName);
        txtCourseName.setBounds(80, 90, 320, 20);

        lblSubjectID.setText("Subject ID:");
        lblSubjectID.setMaximumSize(new java.awt.Dimension(30, 50));
        lblSubjectID.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblSubjectID);
        lblSubjectID.setBounds(300, 150, 80, 20);

        lblGroup.setText("Group ID:");
        lblGroup.setMaximumSize(new java.awt.Dimension(30, 50));
        lblGroup.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblGroup);
        lblGroup.setBounds(0, 150, 80, 20);

        lblCourseName.setText("Course name:");
        lblCourseName.setMaximumSize(new java.awt.Dimension(30, 50));
        lblCourseName.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblCourseName);
        lblCourseName.setBounds(0, 90, 80, 20);

        btnRemove.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete-file-icon.png"))); // NOI18N
        btnRemove.setText("Del");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemove);
        btnRemove.setBounds(110, 490, 100, 40);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close-icon.png"))); // NOI18N
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
        jScrollPane1.setBounds(230, 180, 260, 350);

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

        cbTutor.setFont(new java.awt.Font("Tahoma", 0, 10));
        getContentPane().add(cbTutor);
        cbTutor.setBounds(80, 60, 320, 20);

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

        lblTutor.setText("Tutor:");
        getContentPane().add(lblTutor);
        lblTutor.setBounds(10, 60, 70, 20);

        txtCourseID.setEnabled(false);
        getContentPane().add(txtCourseID);
        txtCourseID.setBounds(220, 150, 70, 20);

        lblCourseID.setText("Course ID:");
        lblCourseID.setMaximumSize(new java.awt.Dimension(30, 50));
        lblCourseID.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblCourseID);
        lblCourseID.setBounds(160, 150, 60, 20);

        txtYear.setEnabled(false);
        txtYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtYearKeyTyped(evt);
            }
        });
        getContentPane().add(txtYear);
        txtYear.setBounds(80, 180, 70, 20);

        lblYear.setText("Year:");
        lblYear.setMaximumSize(new java.awt.Dimension(30, 50));
        lblYear.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblYear);
        lblYear.setBounds(0, 180, 80, 20);

        txtSubjectName.setEnabled(false);
        getContentPane().add(txtSubjectName);
        txtSubjectName.setBounds(80, 120, 320, 20);

        lblSubjectName.setText("Subject name:");
        lblSubjectName.setMaximumSize(new java.awt.Dimension(30, 50));
        lblSubjectName.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblSubjectName);
        lblSubjectName.setBounds(0, 120, 80, 20);

        getContentPane().add(cbGroup);
        cbGroup.setBounds(10, 210, 210, 20);

        getContentPane().add(cbSubject);
        cbSubject.setBounds(10, 240, 210, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // Getting list of teachers on loading time

        tutorList = newConnection.getUserLst(STARTME.TESTING);
        cbTutor.removeAllItems();
        for (int i=0; i < tutorList.size(); i++){
        cbTutor.addItem(""+tutorList.get(i).getPPSNumber()+" " 
                + tutorList.get(i).getFirstName()+" "
                + tutorList.get(i).getLastName());
        }

        cbGroup.setVisible(false);
        cbSubject.setVisible(false);
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // Deleting teachers group and module
            if (!(lstPersons.isSelectionEmpty())){
                newConnection.removeFromGTS(tutorList.get(cbTutor.getSelectedIndex()).getbdId(),
                                                tutorList.get(cbTutor.getSelectedIndex()).getGroupID().get(lstPersons.getSelectedIndex()).getGroupID(), 
                                                    tutorList.get(cbTutor.getSelectedIndex()).getSubjectID().get(lstPersons.getSelectedIndex()).getSubjectID(),
                                                    STARTME.TESTING);
                tutorList.get(cbTutor.getSelectedIndex()).removeGroupSubject(lstPersons.getSelectedIndex());
                btnSelectGroup.doClick();
            }
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        //close this form
                this.setVisible(false);
                eraseInfo(true,true);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // disable several buttons and selections
        // getting list of all groups and list of all subjects
        eraseInfo(false,false);
        btnRemove.setEnabled(false);
        btnClose.setEnabled(false);
        lstPersons.setEnabled(false);
        cbTutor.setEnabled(false);
        btnSelectGroup.setEnabled(false);

        cbGroup.setVisible(true);
        ArrayList<Group> grpList = new ArrayList<Group>();
        grpList = newConnection.getGroupList(STARTME.TESTING);
            for (int i=0; i< grpList.size(); i++){
                cbGroup.addItem("" + grpList.get(i).getCourseName() + " " + grpList.get(i).getYear());
            }
        cbSubject.setVisible(true);
        ArrayList<Subjects> sbjctList = new ArrayList<Subjects>();
        sbjctList = newConnection.getSubjectList(STARTME.TESTING);
            for (int i=0; i< sbjctList.size(); i++){
                cbSubject.addItem("" + sbjctList.get(i).getSubjectName());
            }

        btnSaveNew.setVisible(true);
        btnNew.setVisible(false);


    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveNewActionPerformed

        //inserting a field into teacher group modules table
 
       newConnection.insertIntoGTS(tutorList.get(cbTutor.getSelectedIndex()).getbdId(),
                                    cbGroup.getSelectedIndex()+1,
                                        cbSubject.getSelectedIndex()+1,
                                            STARTME.TESTING);

         
        btnRemove.setEnabled(true);
        btnClose.setEnabled(true);
        lstPersons.setEnabled(true);
        cbTutor.setEnabled(true);
        btnSelectGroup.setEnabled(true);

        btnSaveNew.setVisible(false);
        btnNew.setVisible(true);

        cbGroup.setVisible(false);
        cbGroup.removeAllItems();
        cbSubject.setVisible(false);
        cbSubject.removeAllItems();

        btnSelectGroup.doClick();
    }//GEN-LAST:event_btnSaveNewActionPerformed

    private void btnSelectGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectGroupActionPerformed
        // getting a list of teachers modules

        eraseInfo(false,true);
        tutorList.get(cbTutor.getSelectedIndex()).getbdId();//returns the id of selected tutor

        tutorList.set(cbTutor.getSelectedIndex(), newConnection.getTutorFromGTS(tutorList.get(cbTutor.getSelectedIndex()), STARTME.TESTING));

        for (int i=0; i < tutorList.get(cbTutor.getSelectedIndex()).getGroupID().size(); i++){
            lstBox.addElement(tutorList.get(cbTutor.getSelectedIndex()).getGroupID().get(i).getCourseName() + " " +
                    "" + tutorList.get(cbTutor.getSelectedIndex()).getGroupID().get(i).getYear() + " " +
                    "" + tutorList.get(cbTutor.getSelectedIndex()).getSubjectID().get(i).getSubjectName());
        }

    }//GEN-LAST:event_btnSelectGroupActionPerformed

    private void lstPersonsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPersonsValueChanged
        // updating the boxes with information about selected module
        if (!(lstPersons.isSelectionEmpty())){
            //tutorList.get(cbTutor.getSelectedIndex()).getSubjectID().get(lstPersons.getSelectedIndex())
            txtGroupID.setText(""+tutorList.get(cbTutor.getSelectedIndex()).getGroupID().get(lstPersons.getSelectedIndex()).getGroupID());
            txtCourseID.setText(""+tutorList.get(cbTutor.getSelectedIndex()).getGroupID().get(lstPersons.getSelectedIndex()).getCourseID());
            txtYear.setText(""+tutorList.get(cbTutor.getSelectedIndex()).getGroupID().get(lstPersons.getSelectedIndex()).getYear());
            txtCourseName.setText(""+tutorList.get(cbTutor.getSelectedIndex()).getGroupID().get(lstPersons.getSelectedIndex()).getCourseName());
            txtSubjectID.setText(""+tutorList.get(cbTutor.getSelectedIndex()).getSubjectID().get(lstPersons.getSelectedIndex()).getSubjectID());
            txtSubjectName.setText(""+tutorList.get(cbTutor.getSelectedIndex()).getSubjectID().get(lstPersons.getSelectedIndex()).getSubjectName());



        }
    }//GEN-LAST:event_lstPersonsValueChanged

    private void txtYearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearKeyTyped
        // validation
        datavalidation.yearValidation(evt, txtYear);
    }//GEN-LAST:event_txtYearKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSaveNew;
    private javax.swing.JButton btnSelectGroup;
    private javax.swing.JComboBox cbGroup;
    private javax.swing.JComboBox cbSubject;
    private javax.swing.JComboBox cbTutor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCourseID;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblGroup;
    private javax.swing.JLabel lblSubjectID;
    private javax.swing.JLabel lblSubjectName;
    private javax.swing.JLabel lblTutor;
    private javax.swing.JLabel lblYear;
    private javax.swing.JList lstPersons;
    private javax.swing.JTextField txtCourseID;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtGroupID;
    private javax.swing.JTextField txtSubjectID;
    private javax.swing.JTextField txtSubjectName;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

}
