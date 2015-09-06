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
public class Person {
    private int dbId;
    private String ppsNumber;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String phone;
    private boolean gender;
    private Date dateOfBirth;
    private String email;


    public Person(){
        dbId = 0;
        ppsNumber = "0000000AA";
        firstName = "Noname";
        lastName = "Nosurname";
        address = "No Address";
        city = "No city";
        phone = "0850000000";
        gender = true;
        email = "noemail@nomail.no";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        try{
           dateOfBirth = sdf.parse("2000-01-01");
        } catch (Exception e){
            //Error parsing date
        }
    }

    //set methods

    public void setdbID(String val){
        dbId = Integer.parseInt(val);
    }

    public void setPPSNumber(String val){
        ppsNumber = val;
    }

    public void setFirstName(String val){
        firstName = val;
    }

    public void setLastName(String val){
        lastName = val;
    }

    public void setAddress(String val){
        address = val;
    }

    public void setCity(String val){
        city = val;
    }

    public void setPhone(String val){
        phone = val;
    }

    public void setGender(String val){
        gender = Boolean.parseBoolean(val);
    }

        public void setDateOfBirth(String val){
            //String year = val.substring(6);
            //String month = val.substring(3,6);
            //String day = val.substring(0,3);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        dateOfBirth = null;
        try{
            dateOfBirth = sdf.parse(val);
            //dateOfBirth = sdf.parse(year + "-" + month + "-" + day);
        } catch (Exception e){
            System.out.println("Error parsing date. " + val);
            //Error parsing date
        }
    }

    public boolean checkDob(String val){
        boolean answer = true;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        dateOfBirth = null;
        try{
           dateOfBirth = sdf.parse(val);
           answer = true;
        } catch (Exception e){
            answer = false;
        }
        return answer;
    }

    public void setEmail(String val){
        email = val;
    }

    //get methods

    public int getbdId(){
        return dbId;
    }

    public String getPPSNumber(){
        return ppsNumber;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getAddress(){
        return address;
    }

    public String getCity(){
        return city;
    }

    public String getPhone(){
        return phone;
    }

    public boolean getGender(){
        return gender;
    }

    public String getDoB(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        String dob = "";
        try{
           dob = sdf.format(dateOfBirth);
        } catch (Exception e){
            //Error parsing date
        }
    return dob;
    }

    public String getAge(){
        Calendar now = Calendar.getInstance();
        Calendar dob = Calendar.getInstance();

        dob.setTime(dateOfBirth);

        if (dob.after(now)){
            //Error parsing date
        }
        int age = now.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

        if (now.get(Calendar.DAY_OF_YEAR)<=dob.get(Calendar.DAY_OF_YEAR)){
            age--;
        }

        return String.valueOf(age);
    }

    public String getEmail(){
        return email;
    }

}
