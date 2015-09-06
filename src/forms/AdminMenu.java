/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdminMenu.java
 *
 * Created on 25-Feb-2013, 15:16:01
 */

package forms;

/**
 *
 * @author Evilguy
 */
public class AdminMenu extends javax.swing.JInternalFrame {

    /** Creates new form AdminMenu */
    public AdminMenu() {
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

        btnPersonalDetails = new javax.swing.JButton();
        btnAddEditTutors = new javax.swing.JButton();
        btnAddEditStudents = new javax.swing.JButton();
        btnAddEditGroups = new javax.swing.JButton();
        btnAddEditModules = new javax.swing.JButton();
        btnAddEditCourse = new javax.swing.JButton();
        AddEditStudentResults = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btnAddEditExam = new javax.swing.JButton();
        btnAddStudentToGroup = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setAlignmentX(200.0F);
        setMinimumSize(new java.awt.Dimension(280, 460));
        setPreferredSize(new java.awt.Dimension(280, 460));
        getContentPane().setLayout(null);

        btnPersonalDetails.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnPersonalDetails.setText("Personal Details");
        btnPersonalDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnPersonalDetails);
        btnPersonalDetails.setBounds(10, 10, 200, 30);

        btnAddEditTutors.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnAddEditTutors.setText("Add/Edit Tutors");
        btnAddEditTutors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEditTutorsActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddEditTutors);
        btnAddEditTutors.setBounds(10, 50, 200, 30);

        btnAddEditStudents.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnAddEditStudents.setText("Add/Edit Student");
        btnAddEditStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEditStudentsActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddEditStudents);
        btnAddEditStudents.setBounds(10, 90, 200, 30);

        btnAddEditGroups.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnAddEditGroups.setText("Add/Edit Group");
        btnAddEditGroups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEditGroupsActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddEditGroups);
        btnAddEditGroups.setBounds(10, 170, 200, 30);

        btnAddEditModules.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnAddEditModules.setText("Add/Edit Modules");
        btnAddEditModules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEditModulesActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddEditModules);
        btnAddEditModules.setBounds(10, 290, 200, 30);

        btnAddEditCourse.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnAddEditCourse.setText("Add/Edit Course");
        btnAddEditCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEditCourseActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddEditCourse);
        btnAddEditCourse.setBounds(10, 250, 200, 30);

        AddEditStudentResults.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        AddEditStudentResults.setText("Add/Edit Student Results");
        AddEditStudentResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEditStudentResultsActionPerformed(evt);
            }
        });
        getContentPane().add(AddEditStudentResults);
        AddEditStudentResults.setBounds(10, 370, 200, 30);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton8.setText("Add/Edit Teachers Group Modules");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(10, 210, 200, 30);

        btnAddEditExam.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnAddEditExam.setText("Add/Edit Exams");
        btnAddEditExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEditExamActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddEditExam);
        btnAddEditExam.setBounds(10, 330, 200, 30);

        btnAddStudentToGroup.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnAddStudentToGroup.setText("Add Student To Group");
        btnAddStudentToGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentToGroupActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddStudentToGroup);
        btnAddStudentToGroup.setBounds(10, 130, 200, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeForms(){
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

    }

    private void btnPersonalDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalDetailsActionPerformed
        // TODO add your handling code here:
        closeForms();
        STARTME.PD.setVisible(true);
    }//GEN-LAST:event_btnPersonalDetailsActionPerformed

    private void btnAddEditTutorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEditTutorsActionPerformed
        // TODO add your handling code here:
        closeForms();
        STARTME.PDL.setVisible(true);
    }//GEN-LAST:event_btnAddEditTutorsActionPerformed

    private void btnAddEditStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEditStudentsActionPerformed
        // TODO add your handling code here:
        closeForms();
        STARTME.SDL.setVisible(true);
    }//GEN-LAST:event_btnAddEditStudentsActionPerformed

    private void btnAddEditGroupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEditGroupsActionPerformed
        // TODO add your handling code here:
        closeForms();
        STARTME.GF.setVisible(true);
    }//GEN-LAST:event_btnAddEditGroupsActionPerformed

    private void AddEditStudentResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEditStudentResultsActionPerformed
        // TODO add your handling code here:
        closeForms();
        STARTME.SR.setVisible(true);
    }//GEN-LAST:event_AddEditStudentResultsActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        closeForms();
        STARTME.TGM.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnAddEditCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEditCourseActionPerformed
        // TODO add your handling code here:
        closeForms();
        STARTME.CF.setVisible(true);
    }//GEN-LAST:event_btnAddEditCourseActionPerformed

    private void btnAddEditModulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEditModulesActionPerformed
        // TODO add your handling code here:
        closeForms();
        STARTME.MF.setVisible(true);
    }//GEN-LAST:event_btnAddEditModulesActionPerformed

    private void btnAddEditExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEditExamActionPerformed
        // TODO add your handling code here:
        closeForms();
        STARTME.SEF.setVisible(true);
    }//GEN-LAST:event_btnAddEditExamActionPerformed

    private void btnAddStudentToGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentToGroupActionPerformed
        // TODO add your handling code here:
        closeForms();
        STARTME.STG.setVisible(true);
    }//GEN-LAST:event_btnAddStudentToGroupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEditStudentResults;
    private javax.swing.JButton btnAddEditCourse;
    private javax.swing.JButton btnAddEditExam;
    private javax.swing.JButton btnAddEditGroups;
    private javax.swing.JButton btnAddEditModules;
    private javax.swing.JButton btnAddEditStudents;
    private javax.swing.JButton btnAddEditTutors;
    private javax.swing.JButton btnAddStudentToGroup;
    private javax.swing.JButton btnPersonalDetails;
    private javax.swing.JButton jButton8;
    // End of variables declaration//GEN-END:variables

}