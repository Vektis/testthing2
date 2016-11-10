package com.company;

/**
 * Created by vr834 on 11/10/16.
 */
public class HighSchoolClass {
    private Student [] students;
    public Student getValedictorian() {
        double arr[] = new double[5000];
        int counter = 0;
        for (Student s : students) {
            arr[counter] = s.getGPA();
            counter++;

        }

        return students[counter];
    }
        public double getHonorsPercent(){
        int  tot = 0;
        int tr = 0;
        for (Student s : students){
            tr++;
            if(s.isHonors()){
                tot++;
            }

        }
        double b = (tot/tr) * 100;
            return b;
    }


}
