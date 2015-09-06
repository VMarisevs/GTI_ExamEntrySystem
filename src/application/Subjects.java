/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application;
import java.util.ArrayList;
/**
 *
 * @author Evilguy
 */
public class Subjects {
    private int subjectID;
    private String subjectName;
    private String subjectDescription;
    private ArrayList<Exam> examList = new ArrayList<Exam>();


    public Subjects(){
        subjectID = 0;
        subjectName = "Unnamed Subject";
        subjectDescription = "No description";
    }

    //set methods

    public void setSubjectID(String val){
        subjectID = Integer.parseInt(val);
    }

    public void setSubjectName(String val){
        subjectName = val;
    }

    public void setSubjectDescription(String val){
        subjectDescription = val;
    }

    //get methods

    public int getSubjectID(){
        return subjectID;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public String getSubjectDescription(){
        return subjectDescription;
    }

    public ArrayList<Exam> getExamList(){
        return examList;
    }
}
