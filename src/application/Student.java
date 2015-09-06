/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

/**
 *
 * @author Evilguy
 */
public class Student extends Person {
    private int groupID[];
    private int examID[];
    private int result[];

    Student(){

    }


    //set methods

        public void addGroup(String val){
            groupID[groupID.length] = Integer.parseInt(val);

        }

        public void removeGroup(int val){
            groupID[val] = 0;
        }

        public void addExamResult(String val1, String val2){
            examID[examID.length] = Integer.parseInt(val1);
            result[result.length] = Integer.parseInt(val2);
        }

        public void removeExamResult(int val){
            examID[val] = 0;
            result[val] = 0;
        }



    //get methods

        public int[] getExamID(){
            return examID;
        }

        public int[] getResultID(){
            return result;
        }

        public int[] getGroup(){
            return groupID;
        }
}
