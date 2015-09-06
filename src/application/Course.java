/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

/**
 *
 * @author Evilguy
 */
public class Course {

    private int courseID;
    private String courseName;
    private String courseDescription;

    public Course(){
        courseID = 0;
        courseName = "Unnamed Course";
        courseDescription = "No description";
    }

    //set methods

    public void setCourseID(String val){
        courseID = Integer.parseInt(val);
    }

    public void setCourseName(String val){
        courseName = val;
    }

    public void setCourseDescription(String val){
        courseDescription = val;
    }

    //get methods

    public int getCourseID(){
    return courseID;
    }

    public String getCourseName(){
    return courseName;
    }
    
    public String getCourseDescription(){
    return courseDescription;
    }
}
