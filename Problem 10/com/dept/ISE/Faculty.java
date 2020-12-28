package com.dept.ISE;
import java.util.*;
public class Faculty {
    public String name,role,subjects;
    public int age,yoe,year_ofjoining,projs;
    public Faculty(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");name = sc.nextLine();
        System.out.println("Enter age:");age = sc.nextInt(); sc.nextLine();
        System.out.println("Enter role:");role = sc.nextLine();
        System.out.println("Enter subjects handled:");subjects = sc.nextLine();
        System.out.println("Enter YOE:");yoe = sc.nextInt();
        System.out.println("Enter YOJ:");year_ofjoining = sc.nextInt();
        System.out.println("Enter projs:");projs = sc.nextInt();
    }
}
