/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CourseForm.java
 *
 * Created on 25-Feb-2013, 15:09:53
 */

package forms;
import application.Course;
import application.Conn;
import javax.swing.DefaultListModel;
import java.util.ArrayList;

/**
 *
 * @author Evilguy
 */
public class CourseForm extends javax.swing.JInternalFrame {
    private Conn newConnection = new Conn();
    DefaultListModel lstBox = new DefaultListModel();
    ArrayList<Course> courseList = new ArrayList<Course>();
    /** Creates new form CourseForm */
    public CourseForm() {
        initComponents();
    }


    private void eraseInfo(boolean close){
                txtCourseID.setText("");
                txtCourseName.setText("");
                txtDesc.setText("");
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
        txtCourseName = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        lblCourseID = new javax.swing.JLabel();
        lblCourseName = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPersons = new javax.swing.JList(lstBox);
        btnNew = new javax.swing.JButton();
        btnSaveNew = new javax.swing.JButton();

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
        txtCourseID.setBounds(100, 50, 390, 20);
        getContentPane().add(txtCourseName);
        txtCourseName.setBounds(100, 80, 390, 20);
        getContentPane().add(txtDesc);
        txtDesc.setBounds(100, 110, 390, 20);

        lblCourseID.setText("Course ID:");
        lblCourseID.setMaximumSize(new java.awt.Dimension(30, 50));
        lblCourseID.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblCourseID);
        lblCourseID.setBounds(20, 50, 80, 20);

        lblCourseName.setText("Course name:");
        lblCourseName.setMaximumSize(new java.awt.Dimension(30, 50));
        lblCourseName.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblCourseName);
        lblCourseName.setBounds(20, 80, 80, 20);

        lblDesc.setText("Description:");
        lblDesc.setMaximumSize(new java.awt.Dimension(30, 50));
        lblDesc.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblDesc);
        lblDesc.setBounds(20, 110, 80, 20);

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/floppy-icon.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        jScrollPane1.setBounds(220, 150, 270, 380);

        btnNew.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-file-icon.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnNew);
        btnNew.setBounds(10, 490, 100, 40);

        btnSaveNew.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        btnSaveNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/floppy-icon.png"))); // NOI18N
        btnSaveNew.setText("Save");
        btnSaveNew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSaveNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaveNew);
        btnSaveNew.setBounds(10, 490, 100, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // getting list of all courses
        courseList = newConnection.getCourseList(STARTME.TESTING);

        lstBox.removeAllElements();
        for (int i=0; i < courseList.size(); i++){      

        lstBox.addElement(""+courseList.get(i).getCourseName());
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // updating fields in database
     
        if (!(txtCourseID.getText().isEmpty()) &&
                         !(txtCourseName.getText().isEmpty()) &&
                         !(txtDesc.getText().isEmpty()))
                         {

                courseList.get(lstPersons.getSelectedIndex()).setCourseName(txtCourseName.getText());
                courseList.get(lstPersons.getSelectedIndex()).setCourseDescription(txtDesc.getText());

                newConnection.saveCourse(courseList.get(lstPersons.getSelectedIndex()), STARTME.TESTING);

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
        // update screen infomation about course
        if (!(lstPersons.isSelectionEmpty())){
            txtCourseID.setText("" + courseList.get(lstPersons.getSelectedIndex()).getCourseID());
            txtCourseName.setText("" + courseList.get(lstPersons.getSelectedIndex()).getCourseName());
            txtDesc.setText("" + courseList.get(lstPersons.getSelectedIndex()).getCourseDescription());
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
    //inserting new field into course table
        if (!(txtCourseName.getText().isEmpty()) &&
                !(txtDesc.getText().isEmpty())){

                courseList.add(new Course());

                courseList.get(courseList.size()-1).setCourseName(txtCourseName.getText());
                courseList.get(courseList.size()-1).setCourseDescription(txtDesc.getText());

                lstBox.addElement(courseList.get(courseList.size()-1).getCourseName());

                newConnection.insertNewCourse(courseList.get(courseList.size()-1), STARTME.TESTING);

                btnSave.setEnabled(true);
                btnClose.setEnabled(true);
                lstPersons.setEnabled(true);
                btnSaveNew.setVisible(false);
                btnNew.setVisible(true);
        }
    }//GEN-LAST:event_btnSaveNewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveNew;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCourseID;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JList lstPersons;
    private javax.swing.JTextField txtCourseID;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtDesc;
    // End of variables declaration//GEN-END:variables

}
