/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * STARTME.java
 *
 * Created on 25-Feb-2013, 14:55:05
 */

package forms;

import application.Tutor;
/**
 *
 * @author Evilguy
 */
public class STARTME extends javax.swing.JFrame {
    // this variable disables or enables the NetBeans console messages
   public static final boolean TESTING = true; // STARTME.TESTING

   // this is a global user variable, or user who is logged in
   public static Tutor glUser = new Tutor();
   // this is a temporary user variable, to apply new chages for user
   public static Tutor tmpUser = new Tutor();
   //this is a user login form initialization
   public UserLogin UL = new UserLogin();
   
   //this is a Admin Menu form initialization
   public static AdminMenu AM = new AdminMenu();
   //this is a User Menu form initialization
   public static UserMenu UM = new UserMenu();

   //this is a Personal Details Menu form initialization
   public static PersonalDetails PD = new PersonalDetails();
   //this is a Personal Details List form initialization
   public static PersonalDetailsList PDL = new PersonalDetailsList();

   //this is a Student Details List form initialization
   public static StudentDetailsList SDL = new StudentDetailsList();

   public static GroupForm GF = new GroupForm();

   public static TeachersGroupModules TGM = new TeachersGroupModules();

   public static CourseForm CF = new CourseForm();

   public static ModuleForm MF = new ModuleForm();

   public static SubjectExamForm SEF = new SubjectExamForm();

   public static StudentResults SR = new StudentResults();

   public static StudentToGroup STG = new StudentToGroup();

   public static StudentResultsForTutor SRFT = new StudentResultsForTutor();
    /** Creates new form STARTME */
    public STARTME() {
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

        DesktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(DesktopPane);
        DesktopPane.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        DesktopPane.add(UL);
        UL.setVisible(true);
        UL.setBounds(1, 1, 280, 130);

        DesktopPane.add(AM);
        AM.setVisible(false);
        AM.setBounds(1, 131, 280, 440);
        DesktopPane.add(UM);
        UM.setVisible(false);
        UM.setBounds(1, 131, 280, 440);

        DesktopPane.add(PD);
        PD.setVisible(false);
        PD.setBounds(282, 1, 510, 570);

        DesktopPane.add(PDL);
        PDL.setVisible(false);
        PDL.setBounds(282, 1, 510, 570);

        DesktopPane.add(SDL);
        SDL.setVisible(false);
        SDL.setBounds(282, 1, 510, 570);

        DesktopPane.add(GF);
        GF.setVisible(false);
        GF.setBounds(282, 1, 510, 570);

        DesktopPane.add(TGM);
        TGM.setVisible(false);
        TGM.setBounds(282, 1, 510, 570);

        DesktopPane.add(CF);
        CF.setVisible(false);
        CF.setBounds(282, 1, 510, 570);

        DesktopPane.add(MF);
        MF.setVisible(false);
        MF.setBounds(282, 1, 510, 570);
        
        DesktopPane.add(SEF);
        SEF.setVisible(false);
        SEF.setBounds(282, 1, 510, 570);

        DesktopPane.add(SR);
        SR.setVisible(false);
        SR.setBounds(282, 1, 510, 570);

        DesktopPane.add(STG);
        STG.setVisible(false);
        STG.setBounds(282, 1, 510, 570);

        DesktopPane.add(SRFT);
        SRFT.setVisible(false);
        SRFT.setBounds(282, 1, 510, 570);
    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new STARTME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane DesktopPane;
    // End of variables declaration//GEN-END:variables

}
