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
public class F19_lab_Test2_ManandharSudeep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student [] student = new Student[4];
        
        double [] s1Grades = {88.3,93.7,73.4,23.8,44.6,55.4,65.7,76.4,76.4,64.5,93.4,83,5};
        double [] s2Grades = {55.6,64.6,23.6,76.4,84.2,55.2};
        double [] s3Grades = {84.4,65.3,56.1,98.3,84.0,58.4,88.4,54.0,68.0,86.5,92.3,83.0};
        double [] s4Grades = {84.3,29.4,74.8,92.3,57.3,65.4};
           
        student[0] = new StudentT127(s1Grades,1111,"Rajesh","Bista");
        student[1] = new StudentT177(s2Grades,2222,"Fahima","Chowdhury");
        student[2] = new StudentT127(s3Grades,1112,"Sudeep","Manandhar");
        student[3] = new StudentT177(s4Grades,2224,"Saba","Negatu");

        for(int i = 0; i < 4; i++){
            System.out.println(student[i].toString());
        }
    }
    
}
