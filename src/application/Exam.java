/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

/**
 *
 * @author Evilguy
 */
public class Exam extends Subjects {
    //private int examID[];
    //private String examName[];

    private int examID = 0;
    private String examName = "";
    private int examSubjectID = 0;

    //set methods
    public void setExam(String val1,String val2){
        examID = Integer.parseInt(val1);
        examName = val2;
    }

    public void setExamID(String val){
        examID = Integer.parseInt(val);
    }

    public void setExamName(String val){
        examName = val;
    }

    public void setExamSubjectID(String val){
        examSubjectID = Integer.parseInt(val);
    }



    //get methods

    public int getExamID(){
        return examID;
    }

    public String getExamName(){
        return examName;
    }

    public int getExamSubjectID(){
        return examSubjectID;
    }
}
