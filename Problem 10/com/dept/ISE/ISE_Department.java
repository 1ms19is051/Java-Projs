package com.dept.ISE;
import java.util.*;
interface Department{
    public void readData();
    public void printData(int i);
    public void printDesignations();
    public void reserachProjs();
}
class AgeException extends Exception{
    AgeException(String e){
        super(e);
    }
}
public class ISE_Department implements Department{
    public Faculty faculty[];
    public int n;
    public ISE_Department(){

    }
    public void readData(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of faculty:");
            n = sc.nextInt(); sc.nextLine();
            faculty = new Faculty[n];
            for(int i = 0; i < n; i ++){
                System.out.println("Enter the details of faculty " + (i + 1));
                faculty[i] = new Faculty();
                try{
                    if (faculty[i].age > 58){
                        throw new AgeException("You are nearing your retirement");
                    }
                }catch(Exception e){System.out.println("Error :" + e);}
            } 
    }
    public void printData(int i){
        Faculty p = faculty[i];
        System.out.println("Name : " + p.name + "\n Age : " + p.age + "\n Role: " + p.role + "\n YOE : " + p.yoe + "\n YOJ : " + p.year_ofjoining + "\n Subjects: " + p.subjects);
    }
    public void printDesignations(){
        for (int i = 0; i < n; i++) {
            System.out.println("Faculty " + (i + 1) + " works as " + faculty[i].role);
        }
    }
    public void reserachProjs(){
        int ct = 0;
        for (int i = 0; i < n; i++) {
            ct += faculty[i].projs;
        }
        System.out.println("The number of projects being done by faculty are " + ct);
    }
}