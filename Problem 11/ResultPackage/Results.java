package ResultPackage;
import java.util.*;
import StudentPackage.*;
class SGPAException extends Exception{
    SGPAException(String s){
        super(s);
    }
}
public class Results {
    static String grader(int n){
        if (n == 9 || n == 10)return "S";
        if (n == 8) return "B";
        if (n == 7) return "C";
        if (n == 6) return "D";
        if (n == 5) return "E";
        return "F";
    }
    public static void main(String[] args) {
        int n; Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            RegisterStudent stud = new RegisterStudent();
            stud.getData();
            if (stud.cgpa[0] == 0) {
                // System.out.println("OH NO");
                continue;
            }
            try{
                if (stud.sgpa > 10) {
                    throw new SGPAException("SGPA Higher than the limit");
                }
            }catch(Exception e){System.out.println("Error " + e.getMessage()); continue;}
            System.out.println("Grades for subject 1 in each semester are:");
            for(int j = 0; j < 4; j ++){
                System.out.println(grader(stud.sub1[j]/10));
            }
            System.out.println("Grades for subject 2 in each semester are:");
            for(int j = 0; j < 4; j ++){
                System.out.println(grader(stud.sub2[j]/10));
            }
            System.out.println("Grades for subject 3 in each semester are:");
            for(int j = 0; j < 4; j ++){
                System.out.println(grader(stud.sub3[j]/10));
            }
            System.out.println("Grades for subject 4 in each semester are:");
            for(int j = 0; j < 4; j ++){
                System.out.println(grader(stud.sub4[j]/10));
            }
            System.out.println("CGPA in the four sems are:");
            for(int j = 0; j < 4; j ++){
                System.out.println(stud.cgpa[j]);
            }
            System.out.println("SGPA is : " + stud.sgpa);
        }
        sc.close();
    }
}
