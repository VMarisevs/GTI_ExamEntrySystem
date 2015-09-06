/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

/**
 *
 * @author Admin
 */
public class ExamResult {

       private int examResult;
       private int studentID;
       private int examID;
       
       public ExamResult(){
            examResult = -1;
            studentID = 0;
            examID = 0;
            
       }
        
        public void setExamResult(String val){
            examResult = Integer.parseInt(val);
        }

        public void setStudentID(String val){
            studentID = Integer.parseInt(val);
        }

        public void setExamID(String val){
            examID = Integer.parseInt(val);
        }

        public int getExamResult(){
            return examResult;
        }

        public int getStudentID(){
            return studentID;
        }

        public int getExamID(){
            return examID;
        }


}
