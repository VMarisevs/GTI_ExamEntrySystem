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
public class Tutor extends Person {
    private String login;
    private String password;
    private boolean admin;
    private ArrayList<Group> tutorGroups = new ArrayList<Group>();
    private ArrayList<Subjects> tutorSubjects = new ArrayList<Subjects>();

    public Tutor(){
        login = "";
        password = "";
        admin = false;
    }

    //set methods

        public void setLogin(String val){
            login = val;
        }

        public void setPassword(String val){
            password = val;
        }

        public void setAdmin(String val){
            admin = Boolean.parseBoolean(val);
        }

        public void addGroupSubject(Group val1, Subjects val2){
            tutorGroups.add(val1);
            tutorSubjects.add(val2);
        }

        public void removeGroupSubject(int val){
            tutorGroups.remove(val);
            tutorSubjects.remove(val);
        }

    //get methods

        public String getLogin(){
            return login;
        }

        public String getPassword(){
            return password;
        }

        public boolean getAdmin(){
            return admin;
        }

        public ArrayList<Group> getGroupID(){
            return tutorGroups;
        }

        public ArrayList<Subjects> getSubjectID(){
            return tutorSubjects;
        }
}
