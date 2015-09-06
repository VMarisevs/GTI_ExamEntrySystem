/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 *
 * @author Evilguy
 */
public class Group extends Course {

    private int groupID;
    private Date year;

    public Group(){
        groupID = 0;
        setYear("2000");
    }


    public void setYear(String val){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        year = null;
        try{
           year = sdf.parse("01/09/"+val);
        } catch (Exception e){
            //Error parsing date
        }
    }

    public void setGroupID(String val){
        groupID = Integer.parseInt(val);
    }

    public String getYear(){
        Calendar returnYear = Calendar.getInstance();

        returnYear.setTime(year);

        int dyear = returnYear.get(Calendar.YEAR);

        return String.valueOf(dyear);
    }

    public int getGroupID(){
    return groupID;
    }



}
