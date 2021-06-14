/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f19_lab_test2_manandharsudeep;

/**
 *
 * @author Admin
 */
public class Student implements Academic {
    protected int studentID;
    protected String firstName;
    protected String lastName;
    
    public Student(int studentID, String firstName, String lastName){
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Override
    public double getAverage(){
        return 0;
    }
    
    @Override
    public double getCredits(){
        return 0;
    }

    @Override
    public boolean getGraduate(){
        return false;
    }

    @Override
    public String toString(){
        String s="";
        s+="\nStudent Id: " + this.studentID;
        s+="\nFirst Name: " + this.firstName;
        s+="\nLast Name: " + this.lastName;
        s+="\nAverage: " + this.getAverage();
        s+="\nCredits: " + this.getCredits();
        s+="\nGraduate: " + this.getGraduate();
        return s;
    }
}
