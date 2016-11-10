package com.company;

/**
 * Created by vr834 on 11/10/16.
 */
public class Student {
    public String person;
    public boolean isHonors;
    public double GPA;
    public Student(String s,boolean b, double g){
        person = s;
        isHonors = b;
        GPA =g;

    }
    public double getGPA(){
        return GPA;

    }
    public boolean isHonors(){
        return isHonors;
    }

}
