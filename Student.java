package com.company.lab3;

/**
 * Created by User on 07.10.2015.
 */
public class Student {

    int price;
    int day;
    int calories;


    public Student (int price, int day, int calories){
        this.price = price;
        this.day = day;
        this.calories = calories;



    }
    public String toString  (){
        return String.format(
             "%s-%s,%d гривень,%d дні,%d скільки калоріїв",
             this.price, this.day, this.calories

        );
    }
}
