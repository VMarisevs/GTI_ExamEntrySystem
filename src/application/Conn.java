/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

import java.sql.*;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;

import java.util.Calendar;
import javax.swing.JOptionPane;
/**
 *
 * @author Evilguy
 */
public class Conn {
   // private static final boolean TESTING = true;
    
    private void writeToLogFile(String val){
    try{
        Calendar now = Calendar.getInstance();
        val = now.getTime().toString() + "  " + val + "\n";
        PrintWriter filewriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream("log/log.txt", true), "UTF-8"));
        filewriter.print(val);
        filewriter.flush();
        filewriter.close();
       // BufferedReader fileBReader = new BufferedReader (new FileReader("log/log.txt"));
       // FileWriter fileWriter =new FileWriter("log/log.txt");
       // fileBReader.
    }catch (Exception e){
    e.printStackTrace();
    }
    }

    public Tutor getUser(String lgn,String psswrd,boolean testing){
    Tutor usr = new Tutor();
        
        String lgnpsswrd[][] = new String[3][14];
        lgnpsswrd[1][1] = "0";
        int i = 1;
        try{
             Class.forName("jstels.jdbc.mdb.MDBDriver2");
             Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
             Statement stmt = conn.createStatement();

             ResultSet rs = stmt.executeQuery("SELECT " +
                     "ID" +        // 1 array id
                     ",Login" +     // 2 array id
                     ",Password" +  // 3 array id
                     ",Admin" +      // 4 array id
                     ",PPS" +       // 5 array id
                     ",FirstName" + // 6 array id
                     ",LastName" +  // 7 array id
                     ",Address" +   // 8 array id
                     ",City" +      // 9 array id
                     ",Phone" +     // 10 array id
                     ",DateOfBirth" +//11 array id
                     ",Gender" +    // 12 array id
                     ",Email" +      // 13 array id
                     " FROM Teachers WHERE Login='"+lgn+"' AND Password='"+psswrd+"'");

             while (rs.next()) {

            for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {
            lgnpsswrd[i][j] = rs.getObject(j).toString();

                if (testing){
                System.out.print(rs.getObject(j) + "\t");
                }

            }
            i++;

                if(testing){
                System.out.println();
                }

          }


             if (Integer.parseInt(lgnpsswrd[1][1])>0){
             usr.setdbID(lgnpsswrd[1][1]);
             usr.setLogin(lgnpsswrd[1][2]);
             usr.setPassword(lgnpsswrd[1][3]);
             usr.setAdmin(lgnpsswrd[1][4]);
             usr.setPPSNumber(lgnpsswrd[1][5]);
             usr.setFirstName(lgnpsswrd[1][6]);
             usr.setLastName(lgnpsswrd[1][7]);
             usr.setAddress(lgnpsswrd[1][8]);
             usr.setCity(lgnpsswrd[1][9]);
             usr.setPhone(lgnpsswrd[1][10]);
             usr.setDateOfBirth(lgnpsswrd[1][11]);
             usr.setGender(lgnpsswrd[1][12]);
             usr.setEmail(lgnpsswrd[1][13]);
             }
             

    //         writeToLogFile("Login " + rs.getObject(2) + " ID " + rs.getObject(1) + " opened the system.");
                

          rs.close();

          stmt.close();

          conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }


            if (usr.getbdId()>0){
                writeToLogFile(""+usr.getLogin()+" was logged in." +
                        "(ID = " + usr.getbdId() + " " +
                        usr.getFirstName() + " " + usr.getLastName() + " " + usr.getPhone() + ")");

            } else {
                writeToLogFile("Wrong login or password!!!");
            }
        
        if (testing){
            if (usr.getbdId()>0){
                JOptionPane.showMessageDialog(null, "User " + usr.getLogin() +" is successfully logged in.");

            } else {
                JOptionPane.showMessageDialog(null, "Please check Your username and password.");
            }
        }
    return usr;
    }

    public void saveUser(Tutor usr, int userID){
        //user id = 0 adding new user
        if (userID == 0){
        //inserting new tutor into database
            try{
                 Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                 stmt.executeQuery("INSERT INTO Teachers " +
                         "(PPS, FirstName, " +
                         "LastName, Address, " +
                         "City, Phone, " +
                         "DateOfBirth, Gender, " +
                         "Email, Login, " +
                         "Password, Admin) " +
                         "VALUES (" +
                         usr.getPPSNumber() + ", "+usr.getFirstName() + ", " +
                         usr.getLastName() + ", "+usr.getAddress() + ", " +
                         usr.getCity() + ", " + usr.getPhone() + ", " +
                         usr.getDoB() + ", " + usr.getGender() + ", " +
                         usr.getEmail() + ", " + usr.getLogin() + ", " +
                         usr.getPassword() + ", " + usr.getAdmin() +")");

                 stmt.close();
                 conn.close();

            } catch (Exception e){
                e.printStackTrace();
            }
        } else if (userID >0){
        //update existing tutor in database
            try{
            Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                 stmt.executeUpdate("UPDATE Teachers SET "+
                         "PPS = '" + usr.getPPSNumber() + "', " +
                         "FirstName = '" + usr.getFirstName() + "', " +
                         "LastName = '" + usr.getLastName() + "', " +
                         "Address = '" + usr.getAddress() + "', " +
                         "City = '" + usr.getCity() + "', " +
                         "Phone = '" + usr.getPhone() + "', " +
                         "DateOfBirth = '" + usr.getDoB() + "', " +
                         "Gender = " + usr.getGender() + ", " +
                         "Email = '" + usr.getEmail() + "', " +
                         "Login = '" + usr.getLogin() + "', " +
                         "Password = '" + usr.getPassword() + "', " +
                         "Admin =  " + usr.getAdmin() + " " +
                         "WHERE  id =" + usr.getbdId());

                 /*
                 stmt.executeQuery("UPDATE Teachers SET"+
                         "PPS = '" + usrtmp.getPPSNumber() + "', " +
                         "FirstName = '" + usrtmp.getFirstName() + "', " +
                         "LastName = '" + usrtmp.getLastName() + "', " +
                         "Address = '" + usrtmp.getAddress() + "', " +
                         "City = '" + usrtmp.getCity() + "', " +
                         "Phone = '" + usrtmp.getPhone() + "', " +
                         "DateOfBirth = '" + usrtmp.getDoB() + "', " +
                         "Gender = '" + usrtmp.getGender() + "', " +
                         "Email = '" + usrtmp.getEmail() + "', " +
                         "Login = '" + usrtmp.getLogin() + "', " +
                         "Password = '" + usrtmp.getPassword() + "', " +
                         "Admin =  '" + usrtmp.getAdmin() + "' " +
                         "WHERE  id =" + usrtmp.getbdId());
                         */
                 stmt.close();
                 conn.close();

            } catch (Exception e){
                e.printStackTrace();

            }

        }

    }

    public ArrayList<Tutor> getUserLst(boolean testing){
        ArrayList<Tutor> usrLst = new ArrayList<Tutor>();
        //usrLst.add(new Tutor());
     
        try{
             Class.forName("jstels.jdbc.mdb.MDBDriver2");
             Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
             Statement stmt = conn.createStatement();

             ResultSet rs = stmt.executeQuery("SELECT " +
                     "Id" +        // 1 array id
                     ",Login" +     // 2 array id
                     ",Password" +  // 3 array id
                     ",Admin" +      // 4 array id
                     ",PPS" +       // 5 array id
                     ",FirstName" + // 6 array id
                     ",LastName" +  // 7 array id
                     ",Address" +   // 8 array id
                     ",City" +      // 9 array id
                     ",Phone" +     // 10 array id
                     ",DateOfBirth" +//11 array id
                     ",Gender" +    // 12 array id
                     ",Email " +    //13 array id
                     "FROM Teachers");

            int i=1;
            while (rs.next()) {

            usrLst.add(new Tutor());
            for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {

                if (testing){
                System.out.print(rs.getObject(j) + "\t");
                }

            }

                usrLst.get(i-1).setdbID(rs.getObject(1).toString());
                usrLst.get(i-1).setLogin(rs.getObject(2).toString());
                usrLst.get(i-1).setPassword(rs.getObject(3).toString());
                usrLst.get(i-1).setAdmin(rs.getObject(4).toString());
                usrLst.get(i-1).setPPSNumber(rs.getObject(5).toString());
                usrLst.get(i-1).setFirstName(rs.getObject(6).toString());
                usrLst.get(i-1).setLastName(rs.getObject(7).toString());
                usrLst.get(i-1).setAddress(rs.getObject(8).toString());
                usrLst.get(i-1).setCity(rs.getObject(9).toString());
                usrLst.get(i-1).setPhone(rs.getObject(10).toString());
                usrLst.get(i-1).setDateOfBirth(rs.getObject(11).toString());
                usrLst.get(i-1).setGender(rs.getObject(12).toString());
                usrLst.get(i-1).setEmail(rs.getObject(13).toString());
                usrLst.get(i-1).setPhone(rs.getObject(10).toString());




            i++;
            if(testing){
                System.out.println();
            }
          }




          rs.close();

          stmt.close();

          conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
            if (testing){
                writeToLogFile("An error in adding a users into list");
            }
        }


            
        
    return usrLst;
    }

    public void insertNewUser(Tutor usr,boolean testing){

        try{
             Class.forName("jstels.jdbc.mdb.MDBDriver2");
             Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
             Statement stmt = conn.createStatement();

                stmt.execute("INSERT INTO Teachers (" +
                        "pps,lastname,firstname,address,city,phone" +
                        ",dateofbirth,gender,email,login,password,admin" +
                        ") VALUES (" +
                        "'"+ usr.getPPSNumber() +"','" + usr.getLastName() +"'," +
                        "'"+ usr.getFirstName() +"','" +usr.getAddress() +"'," +
                        "'"+ usr.getCity() + "','" + usr.getPhone() +"'," +
                        "'"+ usr.getDoB() +"','" + usr.getGender() +"'," +
                        "'"+usr.getEmail() +"','" + usr.getLogin() +"'," +
                        "'"+usr.getPassword() +"','" + usr.getAdmin() +
                        "')");


             stmt.close();

             conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
            if (testing){
                writeToLogFile("Error adding new tutor into database!");
            }
        }



        
        

    }

    public ArrayList<Group> getGroupList(boolean testing){
        ArrayList<Group> grpLst = new ArrayList<Group>();

            try{
             Class.forName("jstels.jdbc.mdb.MDBDriver2");
             Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT " +
                                                 "course.coursename, " +
                                                 "groups.year, " +
                                                 "groups.id " +
                                                 "FROM groups " +
                                                 "INNER JOIN course ON groups.courseid = course.id" +
                                                 "");

                int i=1;
                while (rs.next()) {

                grpLst.add(new Group());
                for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {

                    if (testing){
                    System.out.print(rs.getObject(j) + "\t");
                    }

                }

                grpLst.get(i-1).setCourseName(rs.getObject(1).toString());
                grpLst.get(i-1).setYear(rs.getObject(2).toString());
                grpLst.get(i-1).setGroupID(rs.getObject(3).toString());



                i++;
                if(testing){
                    System.out.println();
                }
              }


             rs.close();

              stmt.close();

              conn.close();
            }
            catch (Exception e){
                e.printStackTrace();
                if (testing){
                    writeToLogFile("An error in adding groups into list");
                }
            }



            

        return grpLst;
    }

    public ArrayList<Group> getTutorGroupList(Tutor ttr,boolean testing){
        ArrayList<Group> grpLst = new ArrayList<Group>();

            try{
             Class.forName("jstels.jdbc.mdb.MDBDriver2");
             Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT Course.CourseName, " +
                     "Groups.Year, " +
                     "Groups.ID " +
                     "FROM Teachers INNER JOIN ((Course INNER JOIN Groups ON Course.ID = Groups.CourseID) " +
                     "INNER JOIN GroupTeacherSubjects ON Groups.ID = GroupTeacherSubjects.GroupID) " +
                     "ON Teachers.ID = GroupTeacherSubjects.TeacherID " +
                     "WHERE GroupTeacherSubjects.TeacherID= "
                     + ttr.getbdId()
                     +" GROUP BY Course.CourseName, Groups.Year, Groups.ID"
                     );

                int i=1;
                while (rs.next()) {

                grpLst.add(new Group());
                for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {

                    if (testing){
                    System.out.print(rs.getObject(j) + "\t");
                    }

                }

                grpLst.get(i-1).setCourseName(rs.getObject(1).toString());
                grpLst.get(i-1).setYear(rs.getObject(2).toString());
                grpLst.get(i-1).setGroupID(rs.getObject(3).toString());



                i++;
                if(testing){
                    System.out.println();
                }
              }


             rs.close();

              stmt.close();

              conn.close();
            }
            catch (Exception e){
                e.printStackTrace();
                if (testing){
                    writeToLogFile("An error in adding groups into list");
                }
            }





        return grpLst;
    }

    public ArrayList<Group> getStudentGroupList(Person stdnt,boolean testing){
        ArrayList<Group> grpLst = new ArrayList<Group>();

            try{
             Class.forName("jstels.jdbc.mdb.MDBDriver2");
             Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT Course.CourseName, Groups.Year, Groups.ID " +
                                                "FROM Students INNER JOIN ((Course INNER JOIN Groups ON Course.ID = Groups.CourseID) " +
                                                "INNER JOIN GroupStudents ON Groups.ID = GroupStudents.GroupID) " +
                                                "ON Students.ID = GroupStudents.StudentID WHERE Students.id =" + stdnt.getbdId());

                int i=1;
                while (rs.next()) {

                grpLst.add(new Group());
                for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {

                    if (testing){
                    System.out.print(rs.getObject(j) + "\t");
                    }

                }

                grpLst.get(i-1).setCourseName(rs.getObject(1).toString());
                grpLst.get(i-1).setYear(rs.getObject(2).toString());
                grpLst.get(i-1).setGroupID(rs.getObject(3).toString());



                i++;
                if(testing){
                    System.out.println();
                }
              }


             rs.close();

              stmt.close();

              conn.close();
            }
            catch (Exception e){
                e.printStackTrace();
                if (testing){
                    writeToLogFile("An error in adding groups into list");
                }
            }





        return grpLst;
    }

    public ArrayList<Course> getCourseList(boolean testing){
        ArrayList<Course> crsLst = new ArrayList<Course>();

            try{
             Class.forName("jstels.jdbc.mdb.MDBDriver2");
             Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT " +
                                                 "course.id, " +
                                                 "course.coursename," +
                                                 "course.description " +
                                                 "FROM course " +
                                                 "");

                int i=1;
                while (rs.next()) {

                crsLst.add(new Course());
                for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {

                    if (testing){
                    System.out.print(rs.getObject(j) + "\t");
                    }

                }

                crsLst.get(i-1).setCourseID(rs.getObject(1).toString());
                crsLst.get(i-1).setCourseName(rs.getObject(2).toString());
                crsLst.get(i-1).setCourseDescription(rs.getObject(3).toString());

                i++;
                if(testing){
                    System.out.println();
                }
              }


             rs.close();

              stmt.close();

              conn.close();
            }
            catch (Exception e){
                e.printStackTrace();
                if (testing){
                    writeToLogFile("An error in adding course into list(group form)");
                }
            }





        return crsLst;
    }

    public ArrayList<Group> getCourseGroups(int courseID,boolean testing){
    ArrayList<Group> grpLst = new ArrayList<Group>();

            try{
             Class.forName("jstels.jdbc.mdb.MDBDriver2");
             Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT " +
                                                 "course.coursename, " +
                                                 "groups.year, " +
                                                 "groups.id, " +
                                                 "course.id " +
                                                 "FROM groups " +
                                                 "INNER JOIN course ON groups.courseid = course.id" +
                                                 " WHERE course.id=" +courseID);

                int i=1;
                while (rs.next()) {

                grpLst.add(new Group());
                for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {

                    if (testing){
                    System.out.print(rs.getObject(j) + "\t");
                    }

                }

                grpLst.get(i-1).setCourseName(rs.getObject(1).toString());
                grpLst.get(i-1).setYear(rs.getObject(2).toString());
                grpLst.get(i-1).setGroupID(rs.getObject(3).toString());
                grpLst.get(i-1).setCourseID(rs.getObject(4).toString());



                i++;
                if(testing){
                    System.out.println();
                }
              }


             rs.close();

              stmt.close();

              conn.close();
            }
            catch (Exception e){
                e.printStackTrace();
                if (testing){
                    writeToLogFile("An error in adding groups into list");
                }
            }





        return grpLst;
    }

    public ArrayList<Subjects> getSubjectList(boolean testing){
        ArrayList<Subjects> sbjLst = new ArrayList<Subjects>();

            try{
             Class.forName("jstels.jdbc.mdb.MDBDriver2");
             Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT " +
                                                 "id, " +
                                                 "subjectname, " +
                                                 "description " +
                                                 "FROM subjects ");

                int i=1;
                while (rs.next()) {

                sbjLst.add(new Subjects());
                for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {

                    if (testing){
                    System.out.print(rs.getObject(j) + "\t");
                    }

                }

                sbjLst.get(i-1).setSubjectID(rs.getObject(1).toString());
                sbjLst.get(i-1).setSubjectName(rs.getObject(2).toString());
                sbjLst.get(i-1).setSubjectDescription(rs.getObject(3).toString());



                i++;
                if(testing){
                    System.out.println();
                }
              }


             rs.close();

              stmt.close();

              conn.close();
            }
            catch (Exception e){
                e.printStackTrace();
                if (testing){
                    writeToLogFile("An error in adding subjects into list");
                }
            }





        return sbjLst;
    }

    public ArrayList<Subjects> getSubjectListFromGTS(Group grp, Tutor ttr,boolean testing){
        ArrayList<Subjects> sbjLst = new ArrayList<Subjects>();
        String stmtsql = "";
        if (ttr == null){
            stmtsql ="SELECT subjects.id, subjects.subjectname, subjects.description " +
                    "FROM Subjects INNER JOIN GroupTeacherSubjects " +
                    "ON Subjects.ID = GroupTeacherSubjects.SubjectID " +
                    "WHERE GroupTeacherSubjects.GroupID = '"+ grp.getGroupID() +"'";
        } else {
            stmtsql ="SELECT subjects.id, subjects.subjectname, subjects.description " +
                    "FROM Subjects INNER JOIN GroupTeacherSubjects " +
                    "ON Subjects.ID = GroupTeacherSubjects.SubjectID " +
                    "WHERE GroupTeacherSubjects.GroupID = '"+ grp.getGroupID() +"' " +
                    "AND GroupTeacherSubjects.TeacherID = '"+ ttr.getbdId()+"'";
        }

            try{
             Class.forName("jstels.jdbc.mdb.MDBDriver2");
             Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(stmtsql);

                int i=1;
                while (rs.next()) {

                sbjLst.add(new Subjects());
                for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {

                    if (testing){
                    System.out.print(rs.getObject(j) + "\t");
                    }

                }

                sbjLst.get(i-1).setSubjectID(rs.getObject(1).toString());
                sbjLst.get(i-1).setSubjectName(rs.getObject(2).toString());
                sbjLst.get(i-1).setSubjectDescription(rs.getObject(3).toString());



                i++;
                if(testing){
                    System.out.println();
                }
              }


             rs.close();

              stmt.close();

              conn.close();
            }
            catch (Exception e){
                e.printStackTrace();
                if (testing){
                    writeToLogFile("An error in adding subjects into list");
                }
            }





        return sbjLst;
    }

    public ExamResult getExamResult(Person stdnt,Exam exm,boolean testing){
        ExamResult exmrslt = new ExamResult();
        String stmtsql = "";

        exmrslt.setExamID(""+exm.getExamID());
        exmrslt.setStudentID(""+stdnt.getbdId());

                

            stmtsql ="SELECT studentresults.result " +
                            //",studentresults.studentid " +
                            //",studentresults.examid  " +
                    "FROM  Students INNER JOIN " +
                    "(SubjectExam INNER JOIN StudentResults ON SubjectExam.ID = StudentResults.ExamID) " +
                    "ON Students.ID = StudentResults.StudentID " +
                    "WHERE studentresults.studentid ='" +stdnt.getbdId() +"' " +
                    "AND studentresults.examid = '" + exm.getExamID() +"'";

            try{
             Class.forName("jstels.jdbc.mdb.MDBDriver2");
             Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(stmtsql);

                int i=1;
                while (rs.next()) {
                for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {

                    if (testing){
                    System.out.print(rs.getObject(j) + "\t");
                    }
                        exmrslt.setExamResult(rs.getObject(1).toString());
                       // exmrslt.setStudentID(rs.getObject(2).toString());
                       // exmrslt.setExamID(rs.getObject(3).toString());
                }

                




                i++;
                if(testing){
                    System.out.println();
                }
              }


             rs.close();

              stmt.close();

              conn.close();
            }
            catch (Exception e){
                e.printStackTrace();
                if (testing){
                    writeToLogFile("An error in adding subjects into list");
                }
            }





        return exmrslt;
    }

    public Person getStudent(Person stdnt,boolean testing){

        String stmtsql = "";





            stmtsql ="SELECT Students.ID, " +
                    "Students.FirstName, " +
                    "Students.LastName, " +
                    "Students.Address, " +
                    "Students.City, " +
                    "Students.Phone, " +
                    "Students.DateOfBirth, " +
                    "Students.Gender, " +
                    "Students.email " +
                    "FROM Students WHERE Students.PPS ='"+stdnt.getPPSNumber()+"'";

            try{
             Class.forName("jstels.jdbc.mdb.MDBDriver2");
             Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(stmtsql);

                int i=1;
                while (rs.next()) {
                for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {

                    if (testing){
                    System.out.print(rs.getObject(j) + "\t");
                    }
                    stdnt.setdbID(rs.getObject(1).toString());
                    stdnt.setFirstName(rs.getObject(2).toString());
                    stdnt.setLastName(rs.getObject(3).toString());
                    stdnt.setAddress(rs.getObject(4).toString());
                    stdnt.setCity(rs.getObject(5).toString());
                    stdnt.setPhone(rs.getObject(6).toString());
                    stdnt.setDateOfBirth(rs.getObject(7).toString());
                    stdnt.setGender(rs.getObject(8).toString());
                    stdnt.setEmail(rs.getObject(9).toString());

                }






                i++;
                if(testing){
                    System.out.println();
                }
              }


             rs.close();

              stmt.close();

              conn.close();
            }
            catch (Exception e){
                e.printStackTrace();
                if (testing){
                    writeToLogFile("An error in adding subjects into list");
                }
            }





        return stdnt;
    }

    public ArrayList<Exam> getExamList(Subjects sbj,boolean testing){
        ArrayList<Exam> exmLst = new ArrayList<Exam>();

            try{
             Class.forName("jstels.jdbc.mdb.MDBDriver2");
             Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT " +
                                                 "subjectexam.id, " +
                                                 "subjectexam.examname, " +
                                                 "subjectexam.subjectid " +
                                                 "FROM subjects INNER JOIN subjectexam " +
                                                 "ON subjects.id = subjectexam.subjectid " +
                                                 "WHERE subjects.id = '" + sbj.getSubjectID() +"'");

                int i=1;
                while (rs.next()) {

                exmLst.add(new Exam());
                for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {

                    if (testing){
                    System.out.print(rs.getObject(j) + "\t");
                    }

                }
                exmLst.get(i-1).setExamID(rs.getObject(1).toString());
                exmLst.get(i-1).setExamName(rs.getObject(2).toString());
                exmLst.get(i-1).setExamSubjectID(rs.getObject(3).toString());
                

                i++;
                if(testing){
                    System.out.println();
                }
              }


             rs.close();

              stmt.close();

              conn.close();
            }
            catch (Exception e){
                e.printStackTrace();
                if (testing){
                    writeToLogFile("An error in adding subjects into list");
                }
            }





        return exmLst;
    }

    public void insertNewGroup(Group grp,Course crs, boolean testing){
    try{
                 Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                    stmt.execute("INSERT INTO groups (" +
                            "courseid,year" +
                            ") VALUES (" +
                            "'"+ grp.getCourseID() +"','" + grp.getYear() +"-09-01'" +
                            ")");


                 stmt.close();

                 conn.close();
        }
            catch (Exception e){
                    e.printStackTrace();
                if (testing){
                    writeToLogFile("Error adding new group into database!");
                }
            }
    }

    public void insertStudentIntoGroup(Group grp,Person stdnt, boolean testing){
    try{
                 Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                    stmt.execute("INSERT INTO groupstudents (" +
                            "groupid,studentid" +
                            ") VALUES (" +
                            "'"+ grp.getGroupID() +"','" + stdnt.getbdId() +"'" +
                            ")");


                 stmt.close();

                 conn.close();
        }
            catch (Exception e){
                    e.printStackTrace();
                if (testing){
                    writeToLogFile("Error adding new group into database!");
                }
            }
    }

    public void saveGroup(Group grp, boolean testing){
        try{
            Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                 stmt.executeUpdate("UPDATE groups SET "+
                         "year = '" + grp.getYear() + "-09-01' " +
                         "WHERE  id =" + grp.getGroupID());
                 if (testing){
                         System.out.println();
                         System.out.print("the group " + grp.getCourseName() +" year was sucessfully updated" );
                 }
                 stmt.close();
                 conn.close();

            } catch (Exception e){
                e.printStackTrace();
            }
    }

    public void insertNewCourse(Course crs, boolean testing){
    try{
                 Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                    stmt.execute("INSERT INTO course (" +
                            "coursename,description" +
                            ") VALUES (" +
                            "'"+ crs.getCourseName() +"','" + crs.getCourseDescription() +"'" +
                            ")");


                 stmt.close();

                 conn.close();
        }
            catch (Exception e){
                    e.printStackTrace();
                if (testing){
                    writeToLogFile("Error adding new course into database!");
                }
            }
    }

    public void insertNewExam(Exam exm, boolean testing){
    try{
                 Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                    stmt.execute("INSERT INTO subjectexam (" +
                            "examname,subjectid" +
                            ") VALUES (" +
                            "'"+ exm.getExamName() +"','" + exm.getExamSubjectID() +"'" +
                            ")");


                 stmt.close();

                 conn.close();
        }
            catch (Exception e){
                    e.printStackTrace();
                if (testing){
                    writeToLogFile("Error adding new exam into database!");
                }
            }
    }

    public void saveCourse(Course crs, boolean testing){
        try{
            Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                 stmt.executeUpdate("UPDATE course SET "+
                         "coursename = '" + crs.getCourseName() + "', " +
                         "description = '" + crs.getCourseDescription() + "' " +
                         "WHERE  id =" + crs.getCourseID());
                 if (testing){
                         System.out.println();
                         System.out.print("the course " + crs.getCourseName() +" was sucessfully updated" );
                 }
                 stmt.close();
                 conn.close();

            } catch (Exception e){
                e.printStackTrace();
            }
    }

    public void saveExamResult(ExamResult exmrslt, boolean testing){
        try{
            Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                 stmt.executeUpdate("UPDATE studentresults SET "+
                         "result = '" + exmrslt.getExamResult() + "' " +
                         "WHERE  studentid =" + exmrslt.getStudentID() + " " +
                         "AND examid =" + exmrslt.getExamID());
                 if (testing){
                         System.out.println();
                         System.out.print("the result was sucessfully updated" );
                 }
                 stmt.close();
                 conn.close();

            } catch (Exception e){
                e.printStackTrace();
            }
    }

    public void insertNewExamResult(ExamResult exmrslt, boolean testing){
    try{
                 Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                    stmt.execute("INSERT INTO studentresults (" +
                            "result,studentid,examid" +
                            ") VALUES (" +
                            "'"+ exmrslt.getExamResult() +"','" + exmrslt.getStudentID() +"','" + exmrslt.getExamID() +"'" +
                            ")");


                 stmt.close();

                 conn.close();
        }
            catch (Exception e){
                    e.printStackTrace();
                if (testing){
                    writeToLogFile("Error adding new exam result into database!");
                }
            }
    }

    public void saveExam(Exam exm, boolean testing){
        try{
            Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                 stmt.executeUpdate("UPDATE subjectexam SET "+
                         "examname = '" + exm.getExamName() + "' " +
                         "WHERE  id =" + exm.getExamID());
                 if (testing){
                         System.out.println();
                         System.out.print("the exam " + exm.getExamName() +" was sucessfully updated" );
                 }
                 stmt.close();
                 conn.close();

            } catch (Exception e){
                e.printStackTrace();
            }
    }

    public void removeExam(Exam exm, boolean testing){
        try{
            Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                 stmt.executeUpdate("DELETE FROM subjectexam "+
                         "WHERE  id =" + exm.getExamID());
                 if (testing){
                         System.out.println();
                         System.out.print("the exam " + exm.getExamName() +" was sucessfully deleted" );
                 }
                 stmt.close();
                 conn.close();

            } catch (Exception e){
                e.printStackTrace();
            }
    }

    public void removeStudentFromGroup(Group grp,Person stdnt, boolean testing){
        try{
            Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                 stmt.executeUpdate("DELETE FROM groupstudents "+
                         "WHERE  groupid =" + grp.getGroupID() +" " +
                         "AND studentid ="+stdnt.getbdId());
                 if (testing){
                         System.out.println();
                         System.out.print("the student was sucessfully deleted from group" );
                 }
                 stmt.close();
                 conn.close();

            } catch (Exception e){
                e.printStackTrace();
            }
    }

    public void saveSubject(Subjects sbj, boolean testing){
        try{
            Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                 stmt.executeUpdate("UPDATE subjects SET "+
                         "subjectname = '" + sbj.getSubjectName() + "', " +
                         "description = '" + sbj.getSubjectDescription() + "' " +
                         "WHERE  id =" + sbj.getSubjectID());
                 if (testing){
                         System.out.println();
                         System.out.print("the course " + sbj.getSubjectName() +" was sucessfully updated" );
                 }
                 stmt.close();
                 conn.close();

            } catch (Exception e){
                e.printStackTrace();
            }
    }

    public void insertNewSubject(Subjects sbj, boolean testing){
    try{
                 Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                    stmt.execute("INSERT INTO subjects (" +
                            "subjectname,description" +
                            ") VALUES (" +
                            "'"+ sbj.getSubjectName() +"','" + sbj.getSubjectDescription() +"'" +
                            ")");


                 stmt.close();

                 conn.close();
        }
            catch (Exception e){
                    e.printStackTrace();
                if (testing){
                    writeToLogFile("Error adding new subject into database!");
                }
            }
    }

    public ArrayList<Person> getStudentsInGroup(int groupID,boolean testing){
        ArrayList<Person> stdntLst = new ArrayList<Person>();

             try{
             Class.forName("jstels.jdbc.mdb.MDBDriver2");
             Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT " +
                     "  students.id" +
                     ", students.pps" +
                     ", students.firstname" +
                     ", students.lastname" +
                     ", students.address" +
                     ", students.city" +
                     ", students.phone" +
                     ", students.dateofbirth" +
                     ", students.gender" +
                     ", students.email" +
                     " FROM students" +
                     " INNER JOIN groupstudents " +
                     " ON students.id = groupstudents.studentid " +
                     " WHERE groupstudents.groupid = " + String.valueOf(groupID) +
                                                 "");

                int i=1;
                while (rs.next()) {

                stdntLst.add(new Person());
                for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {

                    if (testing){
                    System.out.print(rs.getObject(j) + "\t");
                    }

                }

                stdntLst.get(i-1).setdbID(rs.getObject(1).toString());
                stdntLst.get(i-1).setPPSNumber(rs.getObject(2).toString());
                stdntLst.get(i-1).setFirstName(rs.getObject(3).toString());
                stdntLst.get(i-1).setLastName(rs.getObject(4).toString());
                stdntLst.get(i-1).setAddress(rs.getObject(5).toString());
                stdntLst.get(i-1).setCity(rs.getObject(6).toString());
                stdntLst.get(i-1).setPhone(rs.getObject(7).toString());
                stdntLst.get(i-1).setDateOfBirth(rs.getObject(8).toString());
                stdntLst.get(i-1).setGender(rs.getObject(9).toString());
                stdntLst.get(i-1).setEmail(rs.getObject(10).toString());




                i++;
                if(testing){
                    System.out.println();
                }
              }


             rs.close();

              stmt.close();

              conn.close();
            }
            catch (Exception e){
                e.printStackTrace();
                if (testing){
                    writeToLogFile("An error in adding students from groups into list");
                }
            }



            


        return stdntLst;
    }

    public void insertNewStudent(Person stdnt,Group grp, boolean testing){

        //validating student pps number
            boolean studentExists = false;
                    try{
                             Class.forName("jstels.jdbc.mdb.MDBDriver2");
                             Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                             Statement stmt = conn.createStatement();
                             ResultSet rs = stmt.executeQuery("SELECT id FROM students " +
                                     "WHERE pps = '" +stdnt.getPPSNumber() +"'");

                        int i=1;
                        while (rs.next()) {

                        for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {

                            if (testing){
                            System.out.print(rs.getObject(j) + "\t");
                            }

                        }
                         if(Integer.parseInt(rs.getObject(1).toString())>0){
                            studentExists = true;
                         }
                        //stdnt.setdbID(rs.getObject(1).toString());
                        i++;
                        if(testing){
                            System.out.println();
                        }
                      }


                     rs.close();

                      stmt.close();

                      conn.close();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                        if (testing){
                            writeToLogFile("An error in adding students from groups into list (getting new generated id)");
                        }
                    }
    //***************************************************************
            if (!studentExists){
    try{
           //trying to add new sttudent to database
            try{
                 Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                    stmt.execute("INSERT INTO students (" +
                            "pps,lastname,firstname,address,city,phone" +
                            ",dateofbirth,gender,email" +
                            ") VALUES (" +
                            "'"+ stdnt.getPPSNumber() +"','" + stdnt.getLastName() +"'," +
                            "'"+ stdnt.getFirstName() +"','" +stdnt.getAddress() +"'," +
                            "'"+ stdnt.getCity() + "','" + stdnt.getPhone() +"'," +
                            "'"+ stdnt.getDoB() +"','" + stdnt.getGender() +"'," +
                            "'"+stdnt.getEmail() +"'" +
                            ")");


                 stmt.close();

                 conn.close();
        }
            catch (Exception e){
                    e.printStackTrace();
                if (testing){
                    writeToLogFile("Error adding new student into database!");
                }
            }
    //*************************************************************************
    //trying to get automaticly generated id from ms access
                    try{
                             Class.forName("jstels.jdbc.mdb.MDBDriver2");
                             Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                             Statement stmt = conn.createStatement();
                             ResultSet rs = stmt.executeQuery("SELECT id FROM students " +
                                     "WHERE pps = '" +stdnt.getPPSNumber() +"' AND " +
                                     "firstname ='" +stdnt.getFirstName() +"' AND " +
                                     "lastname ='"+ stdnt.getLastName()+"'");

                        int i=1;
                        while (rs.next()) {

                        for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {

                            if (testing){
                            System.out.print(rs.getObject(j) + "\t");
                            }

                        }
                        stdnt.setdbID(rs.getObject(1).toString());
                        i++;
                        if(testing){
                            System.out.println();
                        }
                      }


                     rs.close();

                      stmt.close();

                      conn.close();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                        if (testing){
                            writeToLogFile("An error in adding students from groups into list (getting new generated id)");
                        }
                    }
                //*************
                //trying to add a student to selected group
                try{
                     Class.forName("jstels.jdbc.mdb.MDBDriver2");
                     Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                     Statement stmt = conn.createStatement();

                        stmt.execute("INSERT INTO groupstudents (" +
                                "groupid,studentid" +
                                ") VALUES (" +
                                "'"+ grp.getGroupID() +"','" + stdnt.getbdId() +"'" +
                                ")");


                     stmt.close();

                     conn.close();

                     }
                    catch (Exception e){
                        e.printStackTrace();
                    if (testing){
                        writeToLogFile("Error adding new student into database!");
                    }
                }

    //*************************************************************************

    }
        catch (Exception e){
                e.printStackTrace();
            if (testing){
                writeToLogFile("Error adding new student into database!");
            }
        }

    } else
        {JOptionPane.showMessageDialog(null, "Student with this pps number already exists in database");}
    }

    public void saveStudent(Person stdnt,boolean testing){
        try{
            Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                 stmt.executeUpdate("UPDATE students SET "+
                         "PPS = '" + stdnt.getPPSNumber() + "', " +
                         "FirstName = '" + stdnt.getFirstName() + "', " +
                         "LastName = '" + stdnt.getLastName() + "', " +
                         "Address = '" + stdnt.getAddress() + "', " +
                         "City = '" + stdnt.getCity() + "', " +
                         "Phone = '" + stdnt.getPhone() + "', " +
                         "DateOfBirth = '" + stdnt.getDoB() + "', " +
                         "Gender = " + stdnt.getGender() + ", " +
                         "Email = '" + stdnt.getEmail() + "' " +
                         "WHERE  id =" + stdnt.getbdId());
                 if (testing){
                         System.out.println();
                         System.out.print("the student with id "+stdnt.getbdId()+" was updated.("+
                                 stdnt.getFirstName()+" "+stdnt.getLastName()+")");
                 }
                 stmt.close();
                 conn.close();

            } catch (Exception e){
                e.printStackTrace();
            }
    }

    public Tutor getTutorFromGTS(Tutor ttr, boolean testing){

        ttr.getGroupID().clear();
        ttr.getSubjectID().clear();
                try{
                 Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT " +
                                                    "GroupTeacherSubjects.GroupID," +   //1
                                                    "Groups.CourseID, " +               //2
                                                    "Groups.Year, " +                   //3
                                                    "Course.CourseName, " +             //4
                                                    "GroupTeacherSubjects.SubjectID, " +//5
                                                    "Subjects.SubjectName " +          //6
                                                    "FROM Course INNER JOIN " +
                                                    "(Subjects INNER JOIN " +
                                                    "(Groups INNER JOIN GroupTeacherSubjects " +
                                                    "ON Groups.ID = GroupTeacherSubjects.GroupID) " +
                                                    "ON Subjects.ID = GroupTeacherSubjects.SubjectID) " +
                                                    "ON Course.ID = Groups.CourseID " +
                                                    "WHERE GroupTeacherSubjects.teacherid = " +ttr.getbdId());

                    int i=1;
                    while (rs.next()) {

                        ttr.getGroupID().add(new Group());
                        ttr.getSubjectID().add(new Subjects());

                    for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {

                        if (testing){
                        System.out.print(rs.getObject(j) + "\t");
                        }

                    }

                        

                        ttr.getGroupID().get(i-1).setGroupID(rs.getObject(1).toString());
                        ttr.getGroupID().get(i-1).setCourseID(rs.getObject(2).toString());
                        ttr.getGroupID().get(i-1).setYear(rs.getObject(3).toString());
                        ttr.getGroupID().get(i-1).setCourseName(rs.getObject(4).toString());
                        ttr.getSubjectID().get(i-1).setSubjectID(rs.getObject(5).toString());
                        ttr.getSubjectID().get(i-1).setSubjectName(rs.getObject(6).toString());

                    //ttr.addGroupSubject(rs.getObject(1).toString(), rs.getObject(2).toString());
                    //grpLst.get(i-1).setCourseName(rs.getObject(1).toString());
                    //grpLst.get(i-1).setYear(rs.getObject(2).toString());
                    //grpLst.get(i-1).setGroupID(rs.getObject(3).toString());
                    //grpLst.get(i-1).setCourseID(rs.getObject(4).toString());



                    i++;
                    if(testing){
                        System.out.println();
                    }
                  }


                 rs.close();

                  stmt.close();

                  conn.close();
                }
                catch (Exception e){
                    e.printStackTrace();
                    if (testing){
                        writeToLogFile("An error in adding groups into list");
                    }
                }

        return ttr;
    }

    public void insertIntoGTS(int tutorID, int groupID, int subjectID, boolean testing){
        //validating student pps number
            boolean GTSExists = false;
                    try{
                             Class.forName("jstels.jdbc.mdb.MDBDriver2");
                             Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                             Statement stmt = conn.createStatement();
                             ResultSet rs = stmt.executeQuery("SELECT teacherid,groupid,subjectid " +
                                     "FROM groupteachersubjects " +
                                     "WHERE teacherid = '" +tutorID+"' AND " +
                                     "groupid = '" + groupID + "' AND subjectid = '" + subjectID +"'");

                        int i=1;
                        while (rs.next()) {

                        for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {

                            if (testing){
                            System.out.print(rs.getObject(j) + "\t");
                            }

                        }
                         if(Integer.parseInt(rs.getObject(1).toString())>0){
                            GTSExists = true;
                         }
                        //stdnt.setdbID(rs.getObject(1).toString());
                        i++;
                        if(testing){
                            System.out.println();
                        }
                      }


                     rs.close();

                      stmt.close();

                      conn.close();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                        if (testing){
                            writeToLogFile("An error in adding students from groups into list (getting new generated id)");
                        }
                    }


       if (!GTSExists){
        try{
                 Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                    stmt.execute("INSERT INTO groupteachersubjects (" +
                            "teacherid,groupid,subjectid" +
                            ") VALUES (" +
                            "'"+ tutorID +"','" + groupID +"','" + subjectID + "')");


                 stmt.close();

                 conn.close();
        }
            catch (Exception e){
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "this tutor does selected subject for particular group already");
                if (testing){
                    writeToLogFile("Error adding new group into database!");
                }
            }
       }
     }

    public void removeFromGTS(int tutorID, int groupID, int subjectID, boolean testing){
        try{
                 Class.forName("jstels.jdbc.mdb.MDBDriver2");
                 Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + System.getProperty("user.dir")+"/db/ExamEntrySystem.mdb");
                 Statement stmt = conn.createStatement();

                    stmt.execute("DELETE FROM groupteachersubjects " +
                            " WHERE " +
                            "teacherID ='"+ tutorID +"' AND groupID = '" + groupID +"' AND subjectID = '" + subjectID + "'");


                 stmt.close();

                 conn.close();
        }
            catch (Exception e){
                    e.printStackTrace();
                if (testing){
                    writeToLogFile("Error adding new group into database!");
                }
            }
    }
}
