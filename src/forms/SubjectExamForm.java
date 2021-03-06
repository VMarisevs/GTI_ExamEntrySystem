/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SubjectExamForm.java
 *
 * Created on 28-Feb-2013, 15:15:54
 */

package forms;
import application.Subjects;
import application.Exam;
import application.Conn;
import javax.swing.DefaultListModel;
import java.util.ArrayList;

/**
 *
 * @author Evilguy
 */
public class SubjectExamForm extends javax.swing.JInternalFrame {
    private Conn newConnection = new Conn();
    DefaultListModel lstBox = new DefaultListModel();
    ArrayList<Subjects> subjectList = new ArrayList<Subjects>();
    ArrayList<Exam> examList = new ArrayList<Exam>();
    /** Creates new form SubjectExamForm */
    public SubjectExamForm() {
        initComponents();
    }


    private void eraseInfo(boolean lsbox,boolean cbbox){
        //method that cleans boxes in this form
                txtExamID.setText("");
                txtExamName.setText("");
                txtSubjectID.setText("");
                txtSubjectName.setText("");
                if (cbbox){
                cbGroup.removeAllItems();
                }
               
                if (lsbox){
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

        txtExamID = new javax.swing.JTextField();
        txtExamName = new javax.swing.JTextField();
        txtSubjectID = new javax.swing.JTextField();
        lblExamID = new javax.swing.JLabel();
        lblExamName = new javax.swing.JLabel();
        lblSubjectID = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPersons = new javax.swing.JList(lstBox);
        btnNew = new javax.swing.JButton();
        btnSaveNew = new javax.swing.JButton();
        cbGroup = new javax.swing.JComboBox();
        txtSubjectName = new javax.swing.JTextField();
        lblSubjectName1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        lblExamName1 = new javax.swing.JLabel();

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

        txtExamID.setEnabled(false);
        getContentPane().add(txtExamID);
        txtExamID.setBounds(90, 80, 100, 20);
        getContentPane().add(txtExamName);
        txtExamName.setBounds(90, 140, 320, 20);

        txtSubjectID.setEnabled(false);
        getContentPane().add(txtSubjectID);
        txtSubjectID.setBounds(310, 80, 100, 20);

        lblExamID.setText("Exam ID:");
        lblExamID.setMaximumSize(new java.awt.Dimension(30, 50));
        lblExamID.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblExamID);
        lblExamID.setBounds(10, 80, 80, 20);

        lblExamName.setText("Exam name:");
        lblExamName.setMaximumSize(new java.awt.Dimension(30, 50));
        lblExamName.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblExamName);
        lblExamName.setBounds(10, 40, 80, 20);

        lblSubjectID.setText("Subject ID:");
        lblSubjectID.setMaximumSize(new java.awt.Dimension(30, 50));
        lblSubjectID.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblSubjectID);
        lblSubjectID.setBounds(230, 80, 80, 20);

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
        cbGroup.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbGroupItemStateChanged(evt);
            }
        });
        getContentPane().add(cbGroup);
        cbGroup.setBounds(90, 40, 320, 20);

        txtSubjectName.setEnabled(false);
        getContentPane().add(txtSubjectName);
        txtSubjectName.setBounds(90, 110, 320, 20);

        lblSubjectName1.setText("Subject name:");
        lblSubjectName1.setMaximumSize(new java.awt.Dimension(30, 50));
        lblSubjectName1.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblSubjectName1);
        lblSubjectName1.setBounds(10, 110, 80, 20);

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete-file-icon.png"))); // NOI18N
        btnDelete.setText("Del");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(110, 440, 100, 40);

        lblExamName1.setText("Exam name:");
        lblExamName1.setMaximumSize(new java.awt.Dimension(30, 50));
        lblExamName1.setMinimumSize(new java.awt.Dimension(30, 50));
        getContentPane().add(lblExamName1);
        lblExamName1.setBounds(10, 140, 80, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // getting a list of all modules
        subjectList = newConnection.getSubjectList(STARTME.TESTING);
        
        lstBox.removeAllElements();
        for (int i=0; i < subjectList.size(); i++){
         
        lstBox.addElement(""+subjectList.get(i).getSubjectName());
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // Saves changes in exam table
         if (!(txtExamID.getText().isEmpty())){
            examList.get(cbGroup.getSelectedIndex()).setExamName(txtExamName.getText());

            newConnection.saveExam(examList.get(cbGroup.getSelectedIndex()), STARTME.TESTING);
            
            eraseInfo(false,true);
            lstPersons.clearSelection();
         }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        

                this.setVisible(false);
                eraseInfo(true,true);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void lstPersonsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPersonsValueChanged
        // Updating combo box with information about exams
        eraseInfo(false,true);
        if (!(lstPersons.isSelectionEmpty())){
            examList = newConnection.getExamList(subjectList.get(lstPersons.getSelectedIndex()), STARTME.TESTING);
            for (int i=0; i< examList.size(); i++){
                cbGroup.addItem("" + examList.get(i).getExamName());
            }
        }
       
    }//GEN-LAST:event_lstPersonsValueChanged

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // disables some buttons and selections
        eraseInfo(false,false);
        btnSave.setEnabled(false);
        btnClose.setEnabled(false);
        lstPersons.setEnabled(false);
        btnDelete.setEnabled(false);
        btnSaveNew.setVisible(true);
        btnNew.setVisible(false);


    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveNewActionPerformed
        // saving new exam into table, and adding new exam into list
        if (!(txtExamName.getText().isEmpty())){
            examList.add(new Exam());
            examList.get(examList.size()-1).setExamName(txtExamName.getText());
            examList.get(examList.size()-1).setExamSubjectID(""+subjectList.get(lstPersons.getSelectedIndex()).getSubjectID());
            System.out.println();
            System.out.print("" + subjectList.get(lstPersons.getSelectedIndex()).getSubjectID());

            cbGroup.addItem("" + examList.get(examList.size()-1).getExamName());
            cbGroup.setSelectedIndex(cbGroup.getItemCount()-1);

            newConnection.insertNewExam(examList.get(examList.size()-1), STARTME.TESTING);


                btnSave.setEnabled(true);
                btnClose.setEnabled(true);
                lstPersons.setEnabled(true);
                btnDelete.setEnabled(true);
                btnSaveNew.setVisible(false);
                btnNew.setVisible(true);
        }
       
    }//GEN-LAST:event_btnSaveNewActionPerformed

    private void cbGroupItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbGroupItemStateChanged
        // updating some boxes with selected information from combo box
        if (cbGroup.getSelectedIndex()>=0){
       txtExamID.setText(""+examList.get(cbGroup.getSelectedIndex()).getExamID());
       txtExamName.setText(examList.get(cbGroup.getSelectedIndex()).getExamName());
       txtSubjectID.setText(""+examList.get(cbGroup.getSelectedIndex()).getExamSubjectID());
       txtSubjectName.setText(subjectList.get(lstPersons.getSelectedIndex()).getSubjectName());
        }      
    }//GEN-LAST:event_cbGroupItemStateChanged

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // deleting exam from table
        if (!(txtExamID.getText().isEmpty())){
            examList.get(cbGroup.getSelectedIndex()).setExamName(txtExamName.getText());

            newConnection.removeExam(examList.get(cbGroup.getSelectedIndex()), STARTME.TESTING);
           
            eraseInfo(false,true);
            lstPersons.clearSelection();
         }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveNew;
    private javax.swing.JComboBox cbGroup;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExamID;
    private javax.swing.JLabel lblExamName;
    private javax.swing.JLabel lblExamName1;
    private javax.swing.JLabel lblSubjectID;
    private javax.swing.JLabel lblSubjectName1;
    private javax.swing.JList lstPersons;
    private javax.swing.JTextField txtExamID;
    private javax.swing.JTextField txtExamName;
    private javax.swing.JTextField txtSubjectID;
    private javax.swing.JTextField txtSubjectName;
    // End of variables declaration//GEN-END:variables

}
