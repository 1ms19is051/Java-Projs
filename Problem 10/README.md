## Problem 10
### Statement: 
Define an interface ‘Department’ with methods to readdata() and printdata(), print_number_designations(), number_research_consultancy_projs(). Define a ‘Faculty’ class with members name, designation, age, years of experience, joining_date and subjects_handled.

a. In package ISE define the ‘ISE_department’ class that implements the ‘Department’ interface, accepts n faculty details and define all the methods. Raise a user defined exception ‘AgeException’ if the age of the faculty is > 58.

b. In the default package define a ‘MainClass’ which uses the methods of the above classes and also displays those faculty details whose years of experience is greater than or equal to 20.

### Output :
```
---- READ DATA ----
Enter the number of faculty:
2
Enter the details of faculty 1
Enter name:
abc
Enter age:
25
Enter role:
prof
Enter subjects handled:
phy, chem
Enter YOE:
5
Enter YOJ:
2016
Enter projs:
4
Enter the details of faculty 2
Enter name:
hehe
Enter age:
65
Enter role:
head
Enter subjects handled:
all
Enter YOE:
1980
Enter YOJ:
5000
Enter projs:
5800
Error :com.dept.ISE.AgeException: You are nearing your retirement
---- PRINT ROLES ----
Faculty 1 works as prof
Faculty 2 works as head
---- TOTAL PROJS ----
The number of projects being done by faculty are 5804
---- YOE > 20 ----
Name : hehe
 Age : 65
 Role: head
 YOE : 1980
 YOJ : 5000
 Subjects: all
 ```
 ### Output Image On Terminal:
![Output image on Terminal](https://github.com/1ms19is051/Java-Projs/blob/main/Problem%2010/Problem%2010%20Screenshot.png)
