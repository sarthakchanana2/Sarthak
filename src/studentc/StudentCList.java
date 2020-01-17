/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentC;

/**
 * A class that creates an array of Students,
 * iterates over the array and prints each student's
 * name.
 * @author dancye, 2020
 */
public class StudentCList 
{
    public static void main(String[] args)
    {
        StudentC[] studentList = new StudentC[5];
        //make up 5 students to put inside
        studentList[0] = new StudentC("Superman", "007");
        studentList[1] = new StudentC("James Bond", "700");
        studentList[2] = new StudentC("Wonder Woman", "100");
        studentList[3] = new StudentC("Batman", "001");
        studentList[4] = new StudentC("Joker", "002");
        //the for each loop iterates over a list of Objects
        for(StudentC s : studentList)
        {
            System.out.println(s.getName());
        }
    }   
    
    
}
