package com.company.lab3;

/**
 * Created by User on 07.10.2015.
 */
public class Dish {

    public static void main(String[] args){
        Student[] Student = new Student[6];
        Student[0] = new Student(12, 0, 400);
        Student[1] = new Student(7, 0, 250);
        Student[2] = new Student(10, 1, 370);
        Student[3] = new Student(18, 2, 280);
        Student[4] = new Student(15, 3, 150);
        Student[5] = new Student(8, 3, 100);





        for (int i = 0;i < Student.length;i ++){
            System.out.println(Student[i]);
        }
    }







}
