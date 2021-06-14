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
public class StudentT127 extends Student implements Academic{
    private double [] grades;
    private double credits;
    private boolean graduate;

    public StudentT127(double [] grades, int studentID, String firstName, String lastName) {
        super(studentID, firstName, lastName);
        this.grades = grades;
        this.credits = 0;
        this.graduate = false;
    }

    public double [] getGrades() {
        return grades;
    }

    public void setGrades(double [] grades) {
        this.grades = grades;
    }
    
    @Override
    public double getAverage(){
        double sum = 0;
        for(int i = 0; i < grades.length; i++){
            sum += this.grades[i];
        }
        return sum/grades.length;
    }

    @Override
    public double getCredits(){
        double credits = 0.0;
        for(int i = 0; i < grades.length; i++){
            if(this.grades[i] >= 50){
                credits += 1;
            }
        }
        return credits;         
    }

    @Override
    public boolean getGraduate(){
        if(this.getCredits() >= 10){
            return true;
        }
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
